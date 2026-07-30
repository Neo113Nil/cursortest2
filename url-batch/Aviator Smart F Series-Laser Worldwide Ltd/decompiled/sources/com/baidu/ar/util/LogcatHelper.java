package com.baidu.ar.util;

import android.content.Context;
import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class LogcatHelper {
    private static LogcatHelper sInatance;
    private static String sPath;
    private a mLogDumper = null;
    private int mPId;

    public class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public Process f3422a;

        /* renamed from: b, reason: collision with root package name */
        public BufferedReader f3423b = null;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3424c = true;

        /* renamed from: d, reason: collision with root package name */
        public String f3425d;

        /* renamed from: e, reason: collision with root package name */
        public String f3426e;

        /* renamed from: f, reason: collision with root package name */
        public FileOutputStream f3427f;

        public a(LogcatHelper logcatHelper, String str, String str2) {
            this.f3425d = null;
            this.f3427f = null;
            this.f3426e = str;
            try {
                this.f3427f = new FileOutputStream(new File(str2, "Log-" + logcatHelper.getDateToString(System.currentTimeMillis()) + ".log"));
            } catch (FileNotFoundException e8) {
                e8.printStackTrace();
            }
            this.f3425d = "logcat *:e *:i -s 'huangyn1' | grep \"(" + logcatHelper.mPId + ")\"";
        }

        public void b() {
            this.f3424c = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            FileOutputStream fileOutputStream;
            String readLine;
            try {
                try {
                    this.f3422a = Runtime.getRuntime().exec(this.f3425d);
                    this.f3423b = new BufferedReader(new InputStreamReader(this.f3422a.getInputStream()), 1024);
                    while (this.f3424c && (readLine = this.f3423b.readLine()) != null && this.f3424c) {
                        if (readLine.length() != 0 && this.f3427f != null && readLine.contains(this.f3426e)) {
                            this.f3427f.write((readLine + "\n").getBytes());
                        }
                    }
                    Process process = this.f3422a;
                    if (process != null) {
                        process.destroy();
                        this.f3422a = null;
                    }
                    BufferedReader bufferedReader = this.f3423b;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            this.f3423b = null;
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    fileOutputStream = this.f3427f;
                    if (fileOutputStream == null) {
                        return;
                    }
                } catch (Throwable th) {
                    Process process2 = this.f3422a;
                    if (process2 != null) {
                        process2.destroy();
                        this.f3422a = null;
                    }
                    BufferedReader bufferedReader2 = this.f3423b;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                            this.f3423b = null;
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                    }
                    FileOutputStream fileOutputStream2 = this.f3427f;
                    if (fileOutputStream2 == null) {
                        throw th;
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    this.f3427f = null;
                    throw th;
                }
            } catch (IOException e11) {
                e11.printStackTrace();
                Process process3 = this.f3422a;
                if (process3 != null) {
                    process3.destroy();
                    this.f3422a = null;
                }
                BufferedReader bufferedReader3 = this.f3423b;
                if (bufferedReader3 != null) {
                    try {
                        bufferedReader3.close();
                        this.f3423b = null;
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                fileOutputStream = this.f3427f;
                if (fileOutputStream == null) {
                    return;
                }
            }
            try {
                fileOutputStream.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            this.f3427f = null;
        }
    }

    private LogcatHelper(Context context) {
        init(context);
        this.mPId = Process.myPid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getDateToString(long j8) {
        return new SimpleDateFormat("yyyy年MM月dd日-HH:mm:ss").format(new Date(j8));
    }

    public static LogcatHelper getInstance(Context context) {
        if (sInatance == null) {
            sInatance = new LogcatHelper(context);
        }
        return sInatance;
    }

    public void init(Context context) {
        String str;
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            str = context.getFilesDir().getAbsolutePath() + File.separator + "Navigation";
        } else {
            str = externalFilesDir.getAbsolutePath() + File.separator + "Navigation";
        }
        sPath = str;
        File file = new File(sPath);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public void start() {
        if (this.mLogDumper == null) {
            this.mLogDumper = new a(this, String.valueOf(this.mPId), sPath);
        }
        this.mLogDumper.start();
    }

    public void stop() {
        a aVar = this.mLogDumper;
        if (aVar != null) {
            aVar.b();
            this.mLogDumper = null;
        }
    }
}
