package com.compress.nativelib;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.text.format.Formatter;
import android.util.Log;
import cn.hutool.core.text.l;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public class FileLogger {
    private static final int LOG_MAX_SIZE = 10485760;
    private static final String MY_TAG = "LogToFileUtils";
    private static FileLogger instance;
    private static File logFile;
    private static SimpleDateFormat logSDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    private static Context mContext;
    private static String tag;

    public static File getBitmapFile(String str) {
        File file;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = new File(mContext.getExternalFilesDir("Log").getPath() + "/");
        } else {
            file = new File(mContext.getFilesDir().getPath() + "/Log/");
        }
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file.getPath() + "/" + str + ".png");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (Exception e8) {
                Log.e(MY_TAG, "Create log file failure !!! " + e8.toString());
            }
        }
        return file2;
    }

    public static File getBufferFile(String str) {
        File file;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = new File(mContext.getExternalFilesDir("Log").getPath() + "/");
        } else {
            file = new File(mContext.getFilesDir().getPath() + "/Log/");
        }
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file.getPath() + "/" + str + ".bin");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (Exception e8) {
                Log.e(MY_TAG, "Create log file failure !!! " + e8.toString());
            }
        }
        return file2;
    }

    private static long getFileSize(File file) {
        if (file.exists()) {
            try {
                return new FileInputStream(file).available();
            } catch (Exception e8) {
                Log.e(MY_TAG, e8.toString());
            }
        }
        return 0L;
    }

    private static String getFunctionInfo() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(instance.getClass().getName())) {
                tag = stackTraceElement.getFileName();
                return "[" + logSDF.format(new Date()) + l.SPACE + stackTraceElement.getClassName() + l.SPACE + stackTraceElement.getMethodName() + " Line:" + stackTraceElement.getLineNumber() + "]";
            }
        }
        return null;
    }

    public static File getLogFile() {
        File file;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = new File(mContext.getExternalFilesDir("Log").getPath() + "/");
        } else {
            file = new File(mContext.getFilesDir().getPath() + "/Log/");
        }
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file.getPath() + "/logs.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (Exception e8) {
                Log.e(MY_TAG, "Create log file failure !!! " + e8.toString());
            }
        }
        return file2;
    }

    public static File getLogFile2() {
        File file;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = new File(mContext.getExternalFilesDir("Log").getPath() + "/");
        } else {
            file = new File(mContext.getFilesDir().getPath() + "/Log/");
        }
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file.getPath() + "/logs2.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (Exception e8) {
                Log.e(MY_TAG, "Create log file failure !!! " + e8.toString());
            }
        }
        return file2;
    }

    public static void init(Context context) {
        File file;
        Log.i(MY_TAG, "init ...");
        if (mContext != null && instance != null && (file = logFile) != null && file.exists()) {
            Log.i(MY_TAG, "LogToFileUtils has been init ...");
            return;
        }
        mContext = context;
        instance = new FileLogger();
        logFile = getLogFile();
        Log.i(MY_TAG, "LogFilePath is: " + logFile.getPath());
        long fileSize = getFileSize(logFile);
        Log.d(MY_TAG, "Log max size is: " + Formatter.formatFileSize(context, 10485760L));
        Log.i(MY_TAG, "log now size is: " + Formatter.formatFileSize(context, fileSize));
        CrashHandler.getInstance().init(context);
        if (10485760 < fileSize) {
            resetLogFile();
        }
    }

    private static void resetLogFile() {
        Log.i(MY_TAG, "Reset Log File ... ");
        File file = new File(logFile.getParent() + "/lastLog.txt");
        if (file.exists()) {
            file.delete();
        }
        logFile.renameTo(file);
        try {
            logFile.createNewFile();
        } catch (Exception e8) {
            Log.e(MY_TAG, "Create log file failure !!! " + e8.toString());
        }
    }

    public static void saveBitmap(Bitmap bitmap) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(getBufferFile("DecompressedFile")));
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public static void write(Object obj) {
        File file;
        if (mContext == null || instance == null || (file = logFile) == null || !file.exists()) {
            Log.e(MY_TAG, "Initialization failure !!!");
            return;
        }
        String str = getFunctionInfo() + " - " + obj.toString();
        Log.i(tag, str);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(logFile, true));
            bufferedWriter.write(str);
            bufferedWriter.write("\r\n");
            bufferedWriter.flush();
        } catch (Exception e8) {
            Log.e(tag, "Write failure !!! " + e8.toString());
        }
    }

    public static File writeBuffer(String str, byte[] bArr, int i8, int i9) {
        File bufferFile = getBufferFile(str);
        try {
            new FileOutputStream(bufferFile).write(bArr, 0, i9);
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        return bufferFile;
    }
}
