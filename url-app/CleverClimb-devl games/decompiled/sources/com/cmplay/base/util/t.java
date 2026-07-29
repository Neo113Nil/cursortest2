package com.cmplay.base.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;

/* compiled from: PackageUtils.java */
/* loaded from: classes.dex */
public class t {
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

    public static PackageInfo b(Context context, String str) {
        if (context == null || str == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 256);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Intent c(Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean d(Context context, String str) {
        Intent c2 = c(context, str);
        if (c2 == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            c2.setFlags(268435456);
        }
        return p.a(context, c2);
    }

    public static boolean a(Context context) {
        return a(context, "com.android.vending") && b(context, "com.google.android.gsf") != null;
    }
}
