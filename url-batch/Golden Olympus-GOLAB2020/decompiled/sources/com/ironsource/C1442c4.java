package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.c4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1442c4 {
    public static int a(Activity activity) {
        return activity.getRequestedOrientation();
    }

    public static String b(Context context) {
        try {
            return a(context).versionName;
        } catch (PackageManager.NameNotFoundException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return "";
        }
    }

    public static String c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getPath();
        }
        return null;
    }

    public static long d(Context context) {
        try {
            return a(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return -1L;
        }
    }

    public static String e(Context context) {
        String str;
        try {
            str = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            o9.d().a(th);
            str = null;
        }
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public static long f(Context context) {
        try {
            return a(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return -1L;
        }
    }

    public static String g(Context context) {
        return context.getPackageName();
    }

    static PackageInfo a(Context context) {
        return context.getPackageManager().getPackageInfo(g(context), 0);
    }

    public static String b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e4) {
            o9.d().a(e4);
            return "";
        }
    }

    public static boolean c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean d(Context context, String str) {
        boolean z4 = false;
        int i4 = 0;
        z4 = false;
        z4 = false;
        if (!TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), Base64Utils.IO_BUFFER_SIZE);
                if (packageInfo.requestedPermissions != null) {
                    boolean z5 = false;
                    while (true) {
                        try {
                            String[] strArr = packageInfo.requestedPermissions;
                            if (i4 >= strArr.length || z5) {
                                break;
                            }
                            z5 = str.equals(strArr[i4]);
                            i4++;
                        } catch (Exception e4) {
                            e = e4;
                            z4 = z5;
                            o9.d().a(e);
                            IronLog.INTERNAL.error(e.toString());
                            return z4;
                        }
                    }
                    return z5;
                }
            } catch (Exception e5) {
                e = e5;
            }
        }
        return z4;
    }

    public static String a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (Exception e4) {
            o9.d().a(e4);
            return null;
        }
    }

    public static JSONObject a(Context context, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), Base64Utils.IO_BUFFER_SIZE);
            int i4 = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i4 >= strArr.length) {
                        break;
                    }
                    jSONObject.put(strArr[i4], (packageInfo.requestedPermissionsFlags[i4] & 2) != 0 ? "Granted" : "Rejected");
                    i4++;
                }
            } else {
                List asList = Arrays.asList(packageInfo.requestedPermissions);
                while (i4 < jSONArray.length()) {
                    String string = jSONArray.getString(i4);
                    int indexOf = asList.indexOf(string);
                    if (indexOf != -1) {
                        jSONObject.put(string, (packageInfo.requestedPermissionsFlags[indexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObject.put(string, "notFoundInManifest");
                    }
                    i4++;
                }
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        return jSONObject;
    }

    public static boolean a() {
        return true;
    }
}
