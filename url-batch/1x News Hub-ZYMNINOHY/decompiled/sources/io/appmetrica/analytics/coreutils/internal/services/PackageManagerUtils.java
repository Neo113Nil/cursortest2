package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;

/* loaded from: classes.dex */
public final class PackageManagerUtils {
    public static final PackageManagerUtils INSTANCE = new PackageManagerUtils();

    /* renamed from: a, reason: collision with root package name */
    private static final SafePackageManager f5508a = new SafePackageManager();

    private PackageManagerUtils() {
    }

    public static final int getAppVersionCodeInt(Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    public static final String getAppVersionCodeString(Context context) {
        return String.valueOf(getAppVersionCodeInt(context));
    }

    public static final String getAppVersionName(Context context) {
        String str;
        PackageInfo packageInfo = getPackageInfo(context);
        return (packageInfo == null || (str = packageInfo.versionName) == null) ? "0.0" : str;
    }

    public static final PackageInfo getPackageInfo(Context context) {
        return f5508a.getPackageInfo(context, context.getPackageName());
    }

    public static final ServiceInfo getServiceInfo(Context context, Class<?> cls) {
        return f5508a.getServiceInfo(context, new ComponentName(context, cls), 4);
    }

    public static final boolean hasContentProvider(Context context, String str) {
        return resolveContentProvider(context, str) != null;
    }

    public static final ProviderInfo resolveContentProvider(Context context, String str) {
        return f5508a.resolveContentProvider(context, str);
    }
}
