package com.ironsource.environment;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ApplicationContext.java */
/* loaded from: classes2.dex */
public class a {
    public static String a(Context context) {
        return context.getPackageName();
    }

    public static boolean a(Context context, String str) {
        boolean z = false;
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions == null) {
                return false;
            }
            boolean z2 = false;
            while (i < packageInfo.requestedPermissions.length && !z2) {
                try {
                    boolean equals = str.equals(packageInfo.requestedPermissions[i]);
                    i++;
                    z2 = equals;
                } catch (Exception e) {
                    e = e;
                    z = z2;
                    e.printStackTrace();
                    return z;
                }
            }
            return z2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static boolean b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static JSONObject a(Context context, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                int i = 0;
                if (jSONArray.length() == 0) {
                    while (i < packageInfo.requestedPermissions.length) {
                        jSONObject.put(packageInfo.requestedPermissions[i], (packageInfo.requestedPermissionsFlags[i] & 2) != 0 ? "Granted" : "Rejected");
                        i++;
                    }
                } else {
                    List asList = Arrays.asList(packageInfo.requestedPermissions);
                    while (i < jSONArray.length()) {
                        String string = jSONArray.getString(i);
                        int indexOf = asList.indexOf(string);
                        if (indexOf != -1) {
                            jSONObject.put(string, (packageInfo.requestedPermissionsFlags[indexOf] & 2) != 0 ? "Granted" : "Rejected");
                        } else {
                            jSONObject.put(string, "notFoundInManifest");
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    static PackageInfo b(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(a(context), 0);
    }

    public static long c(Context context) {
        try {
            return b(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static long d(Context context) {
        try {
            return b(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static String e(Context context) {
        try {
            return b(context).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }
}
