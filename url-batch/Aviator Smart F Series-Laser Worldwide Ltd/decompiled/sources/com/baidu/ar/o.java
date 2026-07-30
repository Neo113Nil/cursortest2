package com.baidu.ar;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class o {
    public static int a() {
        return 6400;
    }

    public static String b() {
        return "6.4.0";
    }

    public static String a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            StringBuilder sb = new StringBuilder(context.getApplicationContext().getPackageName());
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getApplicationContext().getPackageName(), 0);
                if (packageInfo != null) {
                    String str = packageInfo.versionName;
                    if (!TextUtils.isEmpty(str)) {
                        sb.append("_");
                        sb.append(str);
                        h.a("appId = " + sb.toString());
                    }
                }
            } catch (PackageManager.NameNotFoundException e8) {
                e8.printStackTrace();
            }
            return sb.toString();
        } catch (NullPointerException e9) {
            e9.printStackTrace();
            return null;
        }
    }
}
