package com.compress.nativelib;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread;

/* loaded from: classes2.dex */
class CrashHandler implements Thread.UncaughtExceptionHandler {
    private static final boolean DEBUG = true;
    private static final String FILE_NAME = "crash";
    private static final String FILE_NAME_SUFFIX = ".trace";
    private static final String TAG = "CrashHandler";
    private Context mContext;
    private Thread.UncaughtExceptionHandler mDefaultCrashHandler;
    private static final String PATH = Environment.getExternalStorageDirectory().getPath() + "/ryg_test/log/";
    private static CrashHandler sInstance = new CrashHandler();

    private CrashHandler() {
    }

    private void dumpExceptionToSDCard(Throwable th) {
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(FileLogger.getLogFile2())));
            dumpPhoneInfo(printWriter);
            printWriter.println();
            th.printStackTrace(printWriter);
            printWriter.close();
        } catch (Exception unused) {
            Log.e(TAG, "dump crash info failed");
        }
    }

    private void dumpPhoneInfo(PrintWriter printWriter) {
        PackageInfo packageInfo = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 1);
        printWriter.print("App Version: ");
        printWriter.print(packageInfo.versionName);
        printWriter.print('_');
        printWriter.println(packageInfo.versionCode);
        printWriter.print("OS Version: ");
        printWriter.print(Build.VERSION.RELEASE);
        printWriter.print("_");
        printWriter.println(Build.VERSION.SDK_INT);
        printWriter.print("Vendor: ");
        printWriter.println(Build.MANUFACTURER);
        printWriter.print("Model: ");
        printWriter.println(Build.MODEL);
        printWriter.print("CPU ABI: ");
        printWriter.println(Build.CPU_ABI);
    }

    public static CrashHandler getInstance() {
        return sInstance;
    }

    public void init(Context context) {
        this.mDefaultCrashHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.mContext = context.getApplicationContext();
        FileLogger.write("PATH = " + PATH);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        FileLogger.write("uncaughtException");
        try {
            dumpExceptionToSDCard(th);
        } catch (IOException e8) {
            e8.printStackTrace();
            FileLogger.write("uncaughtException" + e8.getMessage());
        }
        th.printStackTrace();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mDefaultCrashHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
        }
    }
}
