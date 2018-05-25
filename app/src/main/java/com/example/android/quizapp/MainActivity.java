package com.example.android.quizapp;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int q1score = 0;
    int q2score = 0;
    int q3score = 0;
    int q4score = 0;
    int totalscore = 0;

    public void rbclick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        //Check which radio button was clicked
         switch (view.getId()){
            case R.id.radio2:
                if (checked)
                    q1score = +1;
        }
    }
    public void onCheckboxClicked(View view) {
        CheckBox cbJames = findViewById(R.id.james);
        CheckBox cbJohn = findViewById(R.id.john);
        CheckBox cbLilly = findViewById(R.id.lilly);
        CheckBox cbLucinda = findViewById(R.id.lucinda);
        cbJames.setEnabled(true);
        cbJohn.setEnabled(true);
        cbLilly.setEnabled(true);
        cbLucinda.setEnabled(true);
//Check which checkboxes were clicked
        if (cbJames.isChecked() && cbJohn.isChecked()) {
            cbLilly.setEnabled(false);
            cbLucinda.setEnabled(false);
        } else if (cbJames.isChecked() && cbLilly.isChecked()) {
            cbJohn.setEnabled(false);
            cbLucinda.setEnabled(false);
            q2score = 1;
        } else if (cbJames.isChecked() && cbLucinda.isChecked()) {
            cbLilly.setEnabled(false);
            cbJohn.setEnabled(false);
        } else if (cbLilly.isChecked() && cbJohn.isChecked()) {
            cbJames.setEnabled(false);
            cbLucinda.setEnabled(false);
        } else if (cbJohn.isChecked() && cbLucinda.isChecked()) {
            cbJames.setEnabled(false);
            cbLilly.setEnabled(false);
        } else if (cbLilly.isChecked() && cbLucinda.isChecked()) {
            cbJohn.setEnabled(false);
            cbJames.setEnabled(false);
        }
    }
    public void rbclick2(View view) {
        boolean checked1 = ((RadioButton) view).isChecked();
        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio11:
                if (checked1)
                    q4score = +1;
        }
    }
    //Reset score and clear all responses
        public void resetScore (View view){
            RadioButton rB1 = findViewById(R.id.radio1);
            RadioButton rB2=findViewById(R.id.radio2);
            RadioButton rB3=findViewById(R.id.radio3);
            RadioButton rB11=findViewById(R.id.radio11);
            RadioButton rB12=findViewById(R.id.radio12);
            RadioButton rB13=findViewById(R.id.radio13);
            CheckBox cbJames = findViewById(R.id.james);
            CheckBox cbJohn = findViewById(R.id.john);
            CheckBox cbLilly = findViewById(R.id.lilly);
            CheckBox cbLucinda = findViewById(R.id.lucinda);
            EditText hpBirthday =(EditText)findViewById(R.id.birthday);
            hpBirthday.setText("");

            if (rB1.isChecked()){
                rB1.setChecked(false);
            }
            if (rB2.isChecked()){
                rB2.setChecked(false);
            }
            if (rB3.isChecked()){
                rB3.setChecked(false);
            }
            if (rB11.isChecked()){
                rB11.setChecked(false);
            }
            if (rB12.isChecked()){
                rB12.setChecked(false);
            }
            if (rB13.isChecked()){
                rB13.setChecked(false);
            }
            if (cbJames.isChecked()){
                cbJames.setChecked(false);
            }
            if (cbJohn.isChecked()){
                cbJohn.setChecked(false);
            }
            if (cbLilly.isChecked()){
                cbLilly.setChecked(false);
            }
            if (cbLucinda.isChecked()){
                cbLucinda.setChecked(false);
            }
            totalscore = 0;
        }
        public void displayToastMsg (View v){
        //Check the text entered
            EditText hpBirthday =(EditText)findViewById(R.id.birthday);
            String checkHPBirtday = hpBirthday.getText().toString();
            if (checkHPBirtday.equals("07/31/1980")) {
                q3score =+ 1;
            }
            totalscore = q1score + q2score + q3score + q4score;
            Toast.makeText(getBaseContext(), "Congratulations! You scored " + totalscore + " out of 4!", Toast.LENGTH_LONG).show();
    }
    }










