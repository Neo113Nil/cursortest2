package com.google.ads.mediation.testsuite.utils;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AppInfoUtil {
    private static List<ActivityInfo> activities;
    private static List<String> permissions;

    public static void init(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4097);
            permissions = Arrays.asList(packageInfo.requestedPermissions);
            activities = Arrays.asList(packageInfo.activities);
        } catch (Exception unused) {
            Log.e("TESTTOOL", "Failed to load permissions and activities from PackageManager.");
        }
    }

    public static boolean classExists(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean permissionIsRequested(String str) {
        return permissions.contains(str);
    }

    public static boolean activityIsRegistered(String str) {
        Iterator<ActivityInfo> it = activities.iterator();
        while (it.hasNext()) {
            if (it.next().name.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
