package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PackageManagerCompat {

    /* renamed from: a, reason: collision with root package name */
    private static String f14147a = "";

    private static Bundle a(Context context) {
        PackageManager packageManager;
        Bundle bundle = Bundle.EMPTY;
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        if (context != null && (packageManager = context.getPackageManager()) != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
                if (applicationInfo != null) {
                    Bundle bundle2 = applicationInfo.metaData;
                    if (bundle2 != null) {
                        return bundle2;
                    }
                }
            } catch (PackageManager.NameNotFoundException | RuntimeException e4) {
                Logger.w("PackageUtils", "NameNotFoundException:", e4);
            }
        }
        return bundle;
    }

    private static Bundle b(Context context) {
        if (ContextHolder.getKitContext() != null) {
            context = ContextHolder.getKitContext();
        }
        if (context == null) {
            Logger.v("PackageUtils", "the kitContext is null");
            return Bundle.EMPTY;
        }
        if (context.getApplicationInfo() == null) {
            Logger.v("PackageUtils", "the kit applicationInfo is null");
            return Bundle.EMPTY;
        }
        Logger.i("PackageUtils", "kitContext: " + context.getPackageName());
        Bundle bundle = context.getApplicationInfo().metaData;
        return bundle == null ? Bundle.EMPTY : bundle;
    }

    private static Bundle c(Context context) {
        Bundle b4 = b(context);
        return (b4 == null || b4.isEmpty()) ? a(context) : b4;
    }

    public static String getAppPackageName(Context context) {
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            return packageManager.getPackageInfo(context.getPackageName(), 16384).packageName;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.w("PackageUtils", "Failed to get Package managers Package Info");
            return "";
        }
    }

    public static String getAppVersion(Context context) {
        if (!TextUtils.isEmpty(f14147a)) {
            return f14147a;
        }
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return f14147a;
        }
        try {
            f14147a = String.valueOf(packageManager.getPackageInfo(context.getPackageName(), 16384).versionCode);
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.w("PackageUtils", "Failed to get Package managers Package Info");
        }
        return f14147a;
    }

    public static String getMetaDataFromApp(Context context, String str, String str2) {
        Bundle a4 = a(context);
        return a4 != null ? a4.getString(str, str2) : str2;
    }

    public static String getMetaDataFromKit(Context context, String str, String str2) {
        try {
            Bundle b4 = b(context);
            return b4 == null ? str2 : b4.getString(str, str2);
        } catch (RuntimeException unused) {
            Logger.v("PackageUtils", "the kit metaData is runtimeException");
            return str2;
        }
    }

    public static String getMetaDataFromKitOrApp(Context context, String str, String str2) {
        return c(context).getString(str, str2);
    }

    public static Map<String, String> getMetaDataMapFromKitOrApp(Context context, String str) {
        HashMap hashMap = new HashMap();
        Bundle c4 = c(context);
        for (String str2 : c4.keySet()) {
            if (str2.startsWith(str)) {
                String string = c4.getString(str2);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str2.substring(str.length()), string);
                }
            }
        }
        return hashMap;
    }
}
