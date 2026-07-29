package com.cmplay.base.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;

/* compiled from: Commons.java */
/* loaded from: classes.dex */
public class i {
    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo != null ? Integer.toString(packageInfo.versionCode) : "";
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String c(Context context) {
        Locale locale;
        Resources resources = context.getResources();
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            locale = configuration != null ? configuration.locale : null;
            if (locale == null) {
                locale = Locale.getDefault();
            }
        } else {
            locale = Locale.getDefault();
        }
        return locale.getLanguage();
    }

    public static String d(Context context) {
        Locale locale;
        Resources resources = context.getResources();
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            locale = configuration != null ? configuration.locale : null;
            if (locale == null) {
                locale = Locale.getDefault();
            }
        } else {
            locale = Locale.getDefault();
        }
        return locale.getCountry();
    }
}
