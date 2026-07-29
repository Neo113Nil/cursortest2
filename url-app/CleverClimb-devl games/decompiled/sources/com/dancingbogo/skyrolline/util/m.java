package com.dancingbogo.skyrolline.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;

/* compiled from: PackageUtil.java */
/* loaded from: classes2.dex */
public class m {
    public static boolean a(Context context, String str) {
        if (context == null || str == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 256);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Intent b(Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean a(Context context) {
        return a(context, "com.android.vending") && c(context, "com.google.android.gsf") != null;
    }

    public static PackageInfo c(Context context, String str) {
        if (context == null || str == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int d(Context context, String str) {
        if (context == null || str == null || str.length() <= 0) {
            return -1;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static String b(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void e(Context context, String str) {
        Intent b2 = b(context, str);
        if (b2 != null) {
            d.a(context, b2);
        }
    }
}
