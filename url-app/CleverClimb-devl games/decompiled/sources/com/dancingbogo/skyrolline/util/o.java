package com.dancingbogo.skyrolline.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.tapjoy.TapjoyConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

/* compiled from: SystemUtil.java */
/* loaded from: classes2.dex */
public class o {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        BufferedReader bufferedReader;
        String readLine;
        boolean isEmpty;
        File file = new File("/proc/self/cmdline");
        if (file.exists() && !file.isDirectory()) {
            BufferedReader bufferedReader2 = null;
            bufferedReader2 = null;
            bufferedReader2 = null;
            try {
                try {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                readLine = bufferedReader.readLine();
                isEmpty = TextUtils.isEmpty(readLine);
            } catch (Exception e3) {
                e = e3;
                bufferedReader2 = bufferedReader;
                e.printStackTrace();
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                    bufferedReader2 = bufferedReader2;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    while (r0.hasNext()) {
                    }
                }
                return context.getApplicationInfo().processName;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
            if (isEmpty == 0) {
                String trim = readLine.trim();
                try {
                    bufferedReader.close();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return trim;
            }
            bufferedReader.close();
            bufferedReader2 = isEmpty;
        }
        if (Build.VERSION.SDK_INT >= 21 && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == Process.myPid()) {
                    return runningAppProcessInfo.processName.trim();
                }
            }
        }
        return context.getApplicationInfo().processName;
    }

    public static String b(Context context) {
        try {
            return Settings.System.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
        } catch (Exception unused) {
            return "";
        }
    }
}
