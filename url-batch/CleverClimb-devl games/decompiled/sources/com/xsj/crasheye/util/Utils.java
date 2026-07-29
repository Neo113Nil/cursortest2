package com.xsj.crasheye.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.xsj.crasheye.Crasheye;
import com.xsj.crasheye.CrasheyeLogLevel;
import com.xsj.crasheye.Properties;
import com.xsj.crasheye.log.Logger;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public class Utils {
    protected static final String CONNECTION = "connection";
    private static final int Debug = 20;
    private static final int Error = 60;
    private static final int Info = 30;
    protected static final String STATE = "state";
    private static final int Verbose = 10;
    private static final int Warning = 50;

    public static final String getCarrier(Context context) {
        return "NA";
    }

    public static String getRandomSessionNumber() {
        String valueOf = String.valueOf(System.currentTimeMillis());
        return (valueOf == null || valueOf.isEmpty()) ? "" : valueOf.length() < 8 ? valueOf : valueOf.substring(valueOf.length() - 8, valueOf.length());
    }

    public static String getScreenOrientation(Context context) {
        if (context == null) {
            return "NA";
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            if (defaultDisplay == null) {
                return "NA";
            }
            switch (defaultDisplay.getRotation()) {
            }
            return "NA";
        } catch (Exception e) {
            Logger.logError(e.getMessage());
            return "NA";
        }
    }

    public static String getScreenSize(Context context) {
        if (context == null) {
            return "NA";
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return displayMetrics == null ? "NA" : String.format("%d * %d", Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        } catch (Exception e) {
            Logger.logError(e.getMessage());
            return "NA";
        }
    }

    public static int convertLoggingLevelToInt(CrasheyeLogLevel crasheyeLogLevel) {
        if (crasheyeLogLevel.equals(CrasheyeLogLevel.Debug)) {
            return 20;
        }
        if (crasheyeLogLevel.equals(CrasheyeLogLevel.Error)) {
            return 60;
        }
        if (crasheyeLogLevel.equals(CrasheyeLogLevel.Info)) {
            return 30;
        }
        return (!crasheyeLogLevel.equals(CrasheyeLogLevel.Verbose) && crasheyeLogLevel.equals(CrasheyeLogLevel.Warning)) ? 50 : 10;
    }

    public static HashMap<String, String> getConnectionInfo(Context context) {
        HashMap<String, String> hashMap = new HashMap<>(2);
        hashMap.put(CONNECTION, "NA");
        hashMap.put(STATE, "NA");
        if (context == null) {
            if (Crasheye.DEBUG) {
                Logger.logError("Context in getConnection is null!");
            }
        } else {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    if (Crasheye.DEBUG) {
                        Logger.logError("PackageManager in CheckNetworkConnection is null!");
                    }
                } else if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", Properties.APP_PACKAGE) == 0) {
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        if (activeNetworkInfo.getSubtypeName() != null && activeNetworkInfo.getSubtypeName().length() != 0) {
                            hashMap.put(CONNECTION, activeNetworkInfo.getSubtypeName());
                            hashMap.put(STATE, activeNetworkInfo.getState().toString());
                        }
                        hashMap.put(CONNECTION, activeNetworkInfo.getTypeName());
                        hashMap.put(STATE, activeNetworkInfo.getState().toString());
                    } else {
                        hashMap.put(CONNECTION, "No connection");
                    }
                }
            } catch (Exception e) {
                Logger.logError(e.getMessage());
            }
        }
        return hashMap;
    }

    public static synchronized boolean shouldSendPing(Context context) {
        boolean z;
        synchronized (Utils.class) {
            z = System.currentTimeMillis() - Properties.lastPingTime > ((long) (Properties.RemoteSettingsProps.sessionTime.intValue() * 1000));
        }
        return z;
    }

    public static EnumStateStatus isGPSOn(Context context) {
        return EnumStateStatus.NA;
    }

    public static final String getTime() {
        try {
            return String.valueOf(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis() / 1000);
        } catch (Exception unused) {
            return String.valueOf(System.currentTimeMillis());
        }
    }

    public static final long getTimeForLong() {
        return System.currentTimeMillis();
    }

    public static boolean checkForRoot() {
        for (String str : new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"}) {
            if (new File(String.valueOf(str) + "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static String MD5(String str) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes(), 0, str.length());
        return new BigInteger(1, messageDigest.digest()).toString(16);
    }

    public static String MD5(byte[] bArr) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(bArr, 0, bArr.length);
        return new BigInteger(1, messageDigest.digest()).toString(16);
    }

    public static String MD5(ByteBuffer byteBuffer) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(byteBuffer);
        return new BigInteger(1, messageDigest.digest()).toString(16);
    }

    public static final String getMilisFromStart() {
        return String.valueOf(System.currentTimeMillis() - Properties.TIMESTAMP);
    }

    public static String readFile(String str) throws Exception {
        if (str == null) {
            throw new IllegalArgumentException("filePath Argument is null");
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                            sb.append('\n');
                        } else {
                            String sb2 = sb.toString();
                            try {
                                bufferedReader2.close();
                                return sb2;
                            } catch (IOException e) {
                                throw e;
                            }
                        }
                    } catch (Exception e2) {
                        throw e2;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                throw e3;
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            throw e4;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0030 -> B:11:0x0033). Please report as a decompilation issue!!! */
    public static void writeFile(String str, String str2) {
        BufferedWriter bufferedWriter;
        if (str == null || str2 == null) {
            Logger.logError("Crasheye write file: filepath is null or content is null!");
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(str));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        try {
            bufferedWriter.append((CharSequence) str2);
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedWriter.close();
        } catch (IOException e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                bufferedWriter2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static void deleteFile(String str) {
        if (str == null) {
            return;
        }
        try {
            deleteFile(new File(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile(File file) {
        if (file != null && file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isRunningService(Context context) {
        if (context == null) {
            return false;
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            String str = context.getApplicationInfo().packageName;
            if (str == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == Process.myPid() && runningAppProcessInfo.processName.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static byte[] toByteArray(String str) {
        if (str == null) {
            throw new IllegalArgumentException("filePath Argument is null");
        }
        try {
            File file = new File(str);
            int length = (int) file.length();
            if (length == 0) {
                return null;
            }
            byte[] bArr = new byte[length];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            bufferedInputStream.read(bArr, 0, bArr.length);
            bufferedInputStream.close();
            return bArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final String readLogs() {
        int i = Properties.LOG_LINES;
        if (i < 0) {
            i = 100;
        }
        String str = Properties.LOG_FILTER;
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d " + str).getInputStream()));
            ArrayList arrayList = new ArrayList();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            if (arrayList.size() == 0) {
                return "You must add the android.permission.READ_LOGS permission to your manifest file!";
            }
            int size = arrayList.size() - i;
            if (size < 0) {
                size = 0;
            }
            while (size < arrayList.size()) {
                sb.append(String.valueOf((String) arrayList.get(size)) + "\n");
                size++;
            }
            return sb.toString().replaceAll(Pattern.quote("}{^"), "}{ ^");
        } catch (Exception e) {
            Logger.logError("Error reading logcat output!");
            return e.getMessage();
        }
    }

    public static final HashMap<String, String> getMemoryInfo() {
        HashMap<String, String> hashMap = new HashMap<>(2);
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/proc/meminfo").start().getInputStream();
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[1024];
            while (true) {
                if (inputStream.read(bArr) == -1) {
                    break;
                }
                sb.append(new String(bArr));
                String[] split = sb.toString().split("kB");
                if (split.length >= 2) {
                    boolean z = false;
                    boolean z2 = false;
                    for (String str : split) {
                        if (!z && str.contains("MemTotal:")) {
                            hashMap.put("memTotal", String.valueOf(Float.valueOf(str.substring(str.indexOf(" "), str.lastIndexOf(" ")).trim()).floatValue() / 1024.0f));
                            z = true;
                        }
                        if (!z2 && str.contains("MemFree:")) {
                            hashMap.put("memFree", String.valueOf(Float.valueOf(str.substring(str.indexOf(" "), str.lastIndexOf(" ")).trim()).floatValue() / 1024.0f));
                            z2 = true;
                        }
                    }
                }
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    public static boolean allowedToSendData() {
        return !Properties.flushOnlyOverWiFi || Properties.CONNECTION.equals("WIFI");
    }

    public static boolean isMatch(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] != bArr2[i + i2]) {
                return false;
            }
        }
        return true;
    }

    public static List<byte[]> byteSplit(byte[] bArr, byte[] bArr2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < bArr2.length) {
            if (isMatch(bArr, bArr2, i)) {
                arrayList.add(Arrays.copyOfRange(bArr2, i2, i));
                i += bArr.length;
                i2 = i;
            }
            i++;
        }
        if (i2 < bArr2.length) {
            arrayList.add(Arrays.copyOfRange(bArr2, i2, bArr2.length));
        }
        return arrayList;
    }

    public static String getChannelIdByConfig(Context context, String str) {
        if (str != null && !str.equals("NA") && !str.isEmpty()) {
            return str;
        }
        if (context == null) {
            Logger.logError("Context is null!");
            return "NA";
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("CRASHEYE_CHANNEL");
        } catch (Exception unused) {
            return "NA";
        }
    }

    public static byte[] getGZipString(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(str.getBytes());
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused) {
                    }
                    try {
                        gZIPOutputStream.close();
                        return byteArray;
                    } catch (IOException unused2) {
                        return byteArray;
                    }
                } catch (Exception unused3) {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream2 = gZIPOutputStream;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    if (gZIPOutputStream2 != null) {
                        try {
                            gZIPOutputStream2.close();
                            throw th;
                        } catch (IOException unused7) {
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Exception unused8) {
                gZIPOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused9) {
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public static String getSendReportUrl() {
        return "http://rp" + ((Properties.RemoteSettingsProps.actionHost == null || Properties.RemoteSettingsProps.actionHost.intValue() < 0 || Properties.RemoteSettingsProps.actionHost.intValue() > 99) ? "" : String.valueOf(Properties.RemoteSettingsProps.actionHost)) + ".crasheye.cn";
    }

    public static String getAbsolutePath(Context context) {
        String absolutePath;
        if (context == null) {
            return null;
        }
        try {
            if (context.getFilesDir() == null || (absolutePath = context.getFilesDir().getAbsolutePath()) == null) {
                return null;
            }
            if (new File(absolutePath).isDirectory()) {
                return absolutePath;
            }
            return null;
        } catch (Exception e) {
            if (Crasheye.DEBUG) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public static String getParentFilePath(Context context) {
        File parentFile;
        String absolutePath;
        if (context == null) {
            return null;
        }
        try {
            if (context.getFilesDir() == null || (parentFile = context.getFilesDir().getParentFile()) == null || (absolutePath = parentFile.getAbsolutePath()) == null || !new File(absolutePath).isDirectory()) {
                return null;
            }
            return String.valueOf(absolutePath) + "/lib/libmono.so";
        } catch (Exception e) {
            if (Crasheye.DEBUG) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
