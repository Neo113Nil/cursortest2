package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.impl.c;
import io.appmetrica.analytics.coreutils.impl.d;
import io.appmetrica.analytics.coreutils.impl.e;
import io.appmetrica.analytics.coreutils.impl.f;
import io.appmetrica.analytics.coreutils.impl.g;
import io.appmetrica.analytics.coreutils.impl.h;
import io.appmetrica.analytics.coreutils.impl.i;
import io.appmetrica.analytics.coreutils.impl.j;
import io.appmetrica.analytics.coreutils.impl.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class SafePackageManager {
    private static Object a(Boolean bool, Function0 function0) {
        Object invoke;
        try {
            invoke = function0.invoke();
        } catch (Throwable unused) {
        }
        return invoke == null ? bool : invoke;
    }

    @Nullable
    public final ActivityInfo getActivityInfo(@NotNull Context context, @NotNull ComponentName componentName, int i4) {
        return (ActivityInfo) a(null, new io.appmetrica.analytics.coreutils.impl.a(context, componentName, i4));
    }

    @Nullable
    public final ApplicationInfo getApplicationInfo(@NotNull Context context, @NotNull String str, int i4) {
        return (ApplicationInfo) a(null, new io.appmetrica.analytics.coreutils.impl.b(context, str, i4));
    }

    @Nullable
    public final Bundle getApplicationMetaData(@NotNull Context context) {
        return (Bundle) a(null, new c(this, context));
    }

    @Nullable
    public final String getInstallerPackageName(@NotNull Context context, @NotNull String str) {
        return (String) a(null, new d(context, str));
    }

    @Nullable
    public final PackageInfo getPackageInfo(@NotNull Context context, @NotNull String str) {
        return getPackageInfo(context, str, 0);
    }

    @Nullable
    public final ServiceInfo getServiceInfo(@NotNull Context context, @NotNull ComponentName componentName, int i4) {
        return (ServiceInfo) a(null, new f(context, componentName, i4));
    }

    public final boolean hasSystemFeature(@NotNull Context context, @NotNull String str) {
        return ((Boolean) a(Boolean.FALSE, new g(context, str))).booleanValue();
    }

    @Nullable
    public final ResolveInfo resolveActivity(@NotNull Context context, @NotNull Intent intent, int i4) {
        return (ResolveInfo) a(null, new h(context, intent, i4));
    }

    @Nullable
    public final ProviderInfo resolveContentProvider(@NotNull Context context, @NotNull String str) {
        return (ProviderInfo) a(null, new i(context, str));
    }

    @Nullable
    public final ResolveInfo resolveService(@NotNull Context context, @NotNull Intent intent, int i4) {
        return (ResolveInfo) a(null, new j(context, intent, i4));
    }

    @Nullable
    public final Unit setComponentEnabledSetting(@NotNull Context context, @NotNull ComponentName componentName, int i4, int i5) {
        return (Unit) a(null, new k(context, componentName, i4, i5));
    }

    @Nullable
    public final PackageInfo getPackageInfo(@NotNull Context context, @NotNull String str, int i4) {
        return (PackageInfo) a(null, new e(context, str, i4));
    }
}
