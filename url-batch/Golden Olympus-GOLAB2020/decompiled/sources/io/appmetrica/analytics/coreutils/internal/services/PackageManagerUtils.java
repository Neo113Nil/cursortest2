package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class PackageManagerUtils {

    @NotNull
    public static final PackageManagerUtils INSTANCE = new PackageManagerUtils();

    /* renamed from: a, reason: collision with root package name */
    private static final SafePackageManager f37047a = new SafePackageManager();

    private PackageManagerUtils() {
    }

    public static final int getAppVersionCodeInt(@NotNull Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    @NotNull
    public static final String getAppVersionCodeString(@NotNull Context context) {
        return String.valueOf(getAppVersionCodeInt(context));
    }

    @NotNull
    public static final String getAppVersionName(@NotNull Context context) {
        String str;
        PackageInfo packageInfo = getPackageInfo(context);
        return (packageInfo == null || (str = packageInfo.versionName) == null) ? "0.0" : str;
    }

    @Nullable
    public static final PackageInfo getPackageInfo(@NotNull Context context) {
        return f37047a.getPackageInfo(context, context.getPackageName());
    }

    @Nullable
    public static final ServiceInfo getServiceInfo(@NotNull Context context, @NotNull Class<?> cls) {
        return f37047a.getServiceInfo(context, new ComponentName(context, cls), 4);
    }

    public static final boolean hasContentProvider(@NotNull Context context, @NotNull String str) {
        return resolveContentProvider(context, str) != null;
    }

    @Nullable
    public static final ProviderInfo resolveContentProvider(@NotNull Context context, @NotNull String str) {
        return f37047a.resolveContentProvider(context, str);
    }
}
