package com.moyoung.dafit.module.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import java.util.List;

/* loaded from: classes4.dex */
public class f {
    public static String getAppName(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static boolean isAppInstalled(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            try {
                context.getPackageManager().getApplicationInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static boolean isAppStarted(Context context) {
        int myPid = Process.myPid();
        String packageName = context.getPackageName();
        com.orhanobut.logger.f.d(packageName + ": pid = " + myPid);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        while (true) {
            boolean z7 = false;
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(packageName)) {
                    com.orhanobut.logger.f.d("running pid: " + runningAppProcessInfo.pid);
                    if (myPid != runningAppProcessInfo.pid) {
                        z7 = true;
                    }
                }
            }
            return z7;
        }
    }

    public static void startApp(Context context, String str) {
        try {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
