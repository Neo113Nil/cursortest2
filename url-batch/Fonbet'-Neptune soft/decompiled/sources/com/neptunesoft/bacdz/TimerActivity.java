package com.neptunesoft.bacdz;

import android.app.DatePickerDialog;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes4.dex */
public class TimerActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String FILE_NAME = "date_bac_exam.txt";
    public static String date_Bac_Exam;
    public static String date_Bac_Exam_inverted;
    Button edit_time_btn;
    public int flag;
    ImageView img_time;
    TextView txtV_timerest_days;
    TextView txtV_timerest_hours;
    TextView txtV_timerest_minute;
    TextView txtV_timerest_mouth;
    TextView txtV_timerest_second;
    TextView txttime_info;
    public int id_img = 1;
    Handler handler = new Handler();
    Runnable changeImage = new Runnable() { // from class: com.neptunesoft.bacdz.TimerActivity.1
        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView = (ImageView) TimerActivity.this.findViewById(R.id.imageViewicon);
            TextView textView = (TextView) TimerActivity.this.findViewById(R.id.txttime_info);
            TimerActivity.this.calculate_time_reste();
            if (TimerActivity.this.flag > 1) {
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_1_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_1);
                }
                TimerActivity.this.handler.removeCallbacks(TimerActivity.this.changeImage);
                textView.setVisibility(4);
                return;
            }
            if (TimerActivity.this.id_img == 1) {
                TimerActivity.this.id_img = 2;
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_2_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_2);
                }
            } else if (TimerActivity.this.id_img == 2) {
                TimerActivity.this.id_img = 3;
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_3_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_3);
                }
            } else if (TimerActivity.this.id_img == 3) {
                TimerActivity.this.id_img = 4;
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_4_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_4);
                }
            } else if (TimerActivity.this.id_img == 4) {
                TimerActivity.this.id_img = 5;
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_5_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_5);
                }
            } else if (TimerActivity.this.id_img == 5) {
                TimerActivity.this.id_img = 6;
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_6_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_6);
                }
            } else if (TimerActivity.this.id_img == 6) {
                TimerActivity.this.id_img = 7;
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_7_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_7);
                }
            } else if (TimerActivity.this.id_img == 7) {
                TimerActivity.this.id_img = 8;
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_8_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_8);
                }
            } else if (TimerActivity.this.id_img == 8) {
                TimerActivity.this.id_img = 9;
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_9_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_9);
                }
            } else if (TimerActivity.this.id_img == 9) {
                TimerActivity.this.id_img = 10;
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_10_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_10);
                }
            } else if (TimerActivity.this.id_img == 10) {
                TimerActivity.this.id_img = 11;
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_11_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_11);
                }
            } else if (TimerActivity.this.id_img == 11) {
                TimerActivity.this.id_img = 12;
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_12_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_12);
                }
            } else if (TimerActivity.this.id_img == 12) {
                TimerActivity.this.id_img = 1;
                if (SplashScreen.darkmode) {
                    imageView.setImageResource(R.drawable.ic_time_1_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_time_1);
                }
            }
            TimerActivity.this.handler.postDelayed(TimerActivity.this.changeImage, 1000L);
        }
    };

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Date date;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.TimerActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return TimerActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.txtV_timerest_mouth = (TextView) findViewById(R.id.txttime_mouth);
        this.txtV_timerest_days = (TextView) findViewById(R.id.txttime_days);
        this.txtV_timerest_hours = (TextView) findViewById(R.id.txttime_hours);
        this.txtV_timerest_minute = (TextView) findViewById(R.id.txttime_minute);
        this.txtV_timerest_second = (TextView) findViewById(R.id.txttime_second);
        this.edit_time_btn = (Button) findViewById(R.id.edit_time_btn);
        this.img_time = (ImageView) findViewById(R.id.imageViewicon);
        this.txttime_info = (TextView) findViewById(R.id.txttime_info);
        if (SplashScreen.darkmode) {
            this.img_time.setImageResource(R.drawable.ic_time_1_dark);
        } else {
            this.img_time.setImageResource(R.drawable.ic_time_1);
        }
        if (file_exist()) {
            String read_date = read_date();
            if (read_date.length() == 10) {
                String str = String.valueOf(read_date.charAt(8)) + String.valueOf(read_date.charAt(9));
                String str2 = String.valueOf(read_date.charAt(5)) + String.valueOf(read_date.charAt(6));
                String str3 = String.valueOf(read_date.charAt(0)) + String.valueOf(read_date.charAt(1)) + String.valueOf(read_date.charAt(2)) + String.valueOf(read_date.charAt(3));
                date_Bac_Exam = read_date;
                date_Bac_Exam_inverted = str + "-" + str2 + "-" + str3;
            } else {
                date_Bac_Exam = "2026-06-07";
                date_Bac_Exam_inverted = "07-06-2026";
            }
        } else {
            save_date("2026-06-07");
            date_Bac_Exam = "2026-06-07";
            date_Bac_Exam_inverted = "07-06-2026";
        }
        this.txttime_info.setText("تاريخ إمتحان شهادة البكالوريا " + date_Bac_Exam_inverted);
        this.txttime_info.setVisibility(0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = new Date();
        try {
            date = simpleDateFormat.parse(date_Bac_Exam);
        } catch (ParseException e) {
            e.printStackTrace();
            date = null;
        }
        try {
            date2 = simpleDateFormat.parse(simpleDateFormat.format(Calendar.getInstance().getTime()));
        } catch (ParseException e2) {
            e2.printStackTrace();
        }
        if (date.compareTo(date2) > 0) {
            this.flag = 0;
            calculate_time_reste();
            this.txttime_info.setText("تاريخ إمتحان شهادة البكالوريا " + date_Bac_Exam_inverted);
            this.txttime_info.setVisibility(0);
        } else {
            this.flag = 2;
            this.txtV_timerest_mouth.setText("");
            this.txtV_timerest_days.setText("");
            this.txtV_timerest_hours.setText("إنتهى الوقت, قم بتحديث التطبيق إلى الإصدار الخاص بالموسم الدراسي الجديد, أو قم بتعديل التاريخ الخاص بإمتحان شهادة البكالوريا");
            this.txtV_timerest_minute.setText("");
            this.txtV_timerest_second.setText("");
            this.txttime_info.setVisibility(4);
        }
        this.handler.postDelayed(this.changeImage, 1000L);
        this.edit_time_btn.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.TimerActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TimerActivity.this.m755lambda$onCreate$1$comneptunesoftbacdzTimerActivity(view);
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets platformInsets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).toPlatformInsets();
            i = platformInsets.left;
            i2 = platformInsets.top;
            i3 = platformInsets.right;
            i4 = platformInsets.bottom;
            view.setPadding(i, i2, i3, i4);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-TimerActivity, reason: not valid java name */
    /* synthetic */ void m755lambda$onCreate$1$comneptunesoftbacdzTimerActivity(View view) {
        Date date;
        if (view.getId() == R.id.edit_time_btn) {
            Date date2 = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date3 = null;
            try {
                date = simpleDateFormat.parse("2024-06-09");
            } catch (ParseException e) {
                e.printStackTrace();
                date = null;
            }
            try {
                date3 = simpleDateFormat.parse("2026-12-31");
            } catch (ParseException e2) {
                e2.printStackTrace();
            }
            try {
                date2 = simpleDateFormat.parse(simpleDateFormat.format(Calendar.getInstance().getTime()));
            } catch (ParseException e3) {
                e3.printStackTrace();
            }
            if (date2.compareTo(date) >= 0 && ((Date) Objects.requireNonNull(date3)).compareTo(date2) > 0) {
                if (file_exist()) {
                    DatePickerFragment datePickerFragment = new DatePickerFragment();
                    String read_date = read_date();
                    String str = String.valueOf(read_date.charAt(8)) + String.valueOf(read_date.charAt(9));
                    String str2 = String.valueOf(read_date.charAt(5)) + String.valueOf(read_date.charAt(6));
                    String str3 = String.valueOf(read_date.charAt(0)) + String.valueOf(read_date.charAt(1)) + String.valueOf(read_date.charAt(2)) + String.valueOf(read_date.charAt(3));
                    if (read_date.length() == 10) {
                        DatePickerFragment.day = Integer.parseInt(str);
                        DatePickerFragment.month = Integer.parseInt(str2);
                        DatePickerFragment.year = Integer.parseInt(str3);
                    } else {
                        DatePickerFragment.day = 13;
                        DatePickerFragment.month = 6;
                        DatePickerFragment.year = 2024;
                    }
                    datePickerFragment.show(getSupportFragmentManager(), "date picker");
                    return;
                }
                return;
            }
            if (date2.compareTo(date) < 0) {
                Toast.makeText(getBaseContext(), "تحقق من الإعدادات الخاصة بالتاريخ على هذا الجهاز", 1).show();
            } else if (date3.compareTo(date2) <= 0) {
                Toast.makeText(getBaseContext(), "قم بتحميل أحدث إصدار لكي تتمكن من إجراء هذه العملية", 1).show();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.flag = 2;
        this.handler.removeCallbacks(this.changeImage);
        finish();
    }

    public void save_date(String date) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    PrintWriter printWriter = new PrintWriter(openFileOutput(FILE_NAME, 0));
                    printWriter.print("");
                    printWriter.close();
                    fileOutputStream = openFileOutput(FILE_NAME, 0);
                    fileOutputStream.write(date.getBytes());
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable th) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public boolean file_exist() {
        return new File(getApplicationContext().getFilesDir(), FILE_NAME).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String read_date() {
        String str;
        FileInputStream fileInputStream = null;
        fileInputStream = null;
        try {
            try {
                fileInputStream = openFileInput(FILE_NAME);
                str = new BufferedReader(new InputStreamReader(fileInputStream)).readLine();
                fileInputStream = fileInputStream;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                        fileInputStream = fileInputStream;
                    } catch (IOException e) {
                        e.printStackTrace();
                        fileInputStream = e;
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                FileInputStream fileInputStream2 = fileInputStream;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                        fileInputStream2 = fileInputStream;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        fileInputStream2 = e3;
                    }
                }
                str = "";
                fileInputStream = fileInputStream2;
            }
            return str;
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public void calculate_time_reste() {
        Date parse;
        Date date;
        long j;
        long j2;
        long j3;
        TimerActivity timerActivity = this;
        String str = "";
        TextView textView = (TextView) timerActivity.findViewById(R.id.txttime_mouth);
        TextView textView2 = (TextView) timerActivity.findViewById(R.id.txttime_days);
        TextView textView3 = (TextView) timerActivity.findViewById(R.id.txttime_hours);
        TextView textView4 = (TextView) timerActivity.findViewById(R.id.txttime_minute);
        TextView textView5 = (TextView) timerActivity.findViewById(R.id.txttime_second);
        TextView textView6 = (TextView) timerActivity.findViewById(R.id.txttime_info);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            timerActivity.flag = 0;
            parse = simpleDateFormat.parse(date_Bac_Exam);
            date = new Date();
            long time = (parse.getTime() - date.getTime()) / 1000;
            j = time / 2592000;
            Long.signum(j);
            long j4 = time - (2592000 * j);
            try {
                j2 = j4 / 86400;
                j3 = j4 - (86400 * j2);
            } catch (ParseException unused) {
            }
        } catch (ParseException unused2) {
        }
        try {
            long j5 = j3 / 3600;
            long j6 = j3 - (3600 * j5);
            long j7 = j6 / 60;
            long j8 = j6 - (60 * j7);
            if (!parse.after(date)) {
                timerActivity = this;
                textView5 = textView5;
                textView6 = textView6;
                try {
                    timerActivity.flag = 2;
                    str = "";
                    textView.setText(str);
                    textView2.setText(str);
                    textView3.setText("إنتهى الوقت, قم بتحديث التطبيق إلى الإصدار الخاص بالموسم الدراسي الجديد, أو قم بتعديل التاريخ الخاص بإمتحان شهادة البكالوريا");
                    textView4.setText(str);
                    textView5.setText(str);
                    textView6.setVisibility(4);
                    return;
                } catch (ParseException unused3) {
                    str = "";
                    timerActivity.flag = 2;
                    textView.setText(str);
                    textView2.setText(str);
                    textView3.setText("عذرا هنالك خطأ ما !");
                    textView4.setText(str);
                    textView5.setText(str);
                    textView6.setVisibility(4);
                }
            }
            try {
                textView.setText("عدد الأشهر : " + j);
                textView2.setText("عدد الأيام : " + j2);
                textView3.setText("عدد الساعات : " + j5);
                textView4.setText("عدد الدقائق : " + j7);
                textView5 = textView5;
            } catch (ParseException unused4) {
                textView5 = textView5;
            }
            try {
                textView5.setText("عدد الثواني : " + j8);
                textView6 = textView6;
                textView6.setVisibility(0);
            } catch (ParseException unused5) {
                textView6 = textView6;
                timerActivity = this;
                str = "";
                timerActivity.flag = 2;
                textView.setText(str);
                textView2.setText(str);
                textView3.setText("عذرا هنالك خطأ ما !");
                textView4.setText(str);
                textView5.setText(str);
                textView6.setVisibility(4);
            }
        } catch (ParseException unused6) {
            timerActivity = this;
            str = "";
            textView5 = textView5;
            textView6 = textView6;
            timerActivity.flag = 2;
            textView.setText(str);
            textView2.setText(str);
            textView3.setText("عذرا هنالك خطأ ما !");
            textView4.setText(str);
            textView5.setText(str);
            textView6.setVisibility(4);
        }
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int dateyear, int datemonth, int dateday) {
        String sb;
        String str;
        TextView textView = (TextView) findViewById(R.id.txttime_info);
        ImageView imageView = (ImageView) findViewById(R.id.imageViewicon);
        if (datemonth >= 9 && dateday >= 10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dateyear);
            sb2.append("-");
            int i = datemonth + 1;
            sb2.append(i);
            sb2.append("-");
            sb2.append(dateday);
            sb = sb2.toString();
            str = dateday + "-" + i + "-" + dateyear;
        } else if (datemonth >= 9) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(dateyear);
            sb3.append("-");
            int i2 = datemonth + 1;
            sb3.append(i2);
            sb3.append("-0");
            sb3.append(dateday);
            sb = sb3.toString();
            str = "0" + dateday + "-" + i2 + "-" + dateyear;
        } else if (dateday >= 10) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(dateyear);
            sb4.append("-0");
            int i3 = datemonth + 1;
            sb4.append(i3);
            sb4.append("-");
            sb4.append(dateday);
            sb = sb4.toString();
            str = dateday + "-0" + i3 + "-" + dateyear;
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(dateyear);
            sb5.append("-0");
            int i4 = datemonth + 1;
            sb5.append(i4);
            sb5.append("-0");
            sb5.append(dateday);
            sb = sb5.toString();
            str = "0" + dateday + "-0" + i4 + "-" + dateyear;
        }
        date_Bac_Exam_inverted = str;
        date_Bac_Exam = sb;
        save_date(sb);
        textView.setText("تاريخ إمتحان شهادة البكالوريا " + date_Bac_Exam_inverted);
        textView.setVisibility(0);
        this.id_img = 1;
        if (SplashScreen.darkmode) {
            imageView.setImageResource(R.drawable.ic_time_1_dark);
        } else {
            imageView.setImageResource(R.drawable.ic_time_1);
        }
        this.flag = 0;
        calculate_time_reste();
        this.handler.removeCallbacks(this.changeImage);
        this.handler.postDelayed(this.changeImage, 1000L);
    }
}
