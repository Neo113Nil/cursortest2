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
import b2.C0195i;
import io.appmetrica.analytics.coreutils.impl.c;
import io.appmetrica.analytics.coreutils.impl.d;
import io.appmetrica.analytics.coreutils.impl.e;
import io.appmetrica.analytics.coreutils.impl.f;
import io.appmetrica.analytics.coreutils.impl.g;
import io.appmetrica.analytics.coreutils.impl.h;
import io.appmetrica.analytics.coreutils.impl.i;
import io.appmetrica.analytics.coreutils.impl.j;
import io.appmetrica.analytics.coreutils.impl.k;

/* loaded from: classes.dex */
public final class SafePackageManager {
    private static Object a(Boolean bool, l2.a aVar) {
        Object invoke;
        try {
            invoke = aVar.invoke();
        } catch (Throwable unused) {
        }
        return invoke == null ? bool : invoke;
    }

    public final ActivityInfo getActivityInfo(Context context, ComponentName componentName, int i3) {
        return (ActivityInfo) a(null, new io.appmetrica.analytics.coreutils.impl.a(context, componentName, i3));
    }

    public final ApplicationInfo getApplicationInfo(Context context, String str, int i3) {
        return (ApplicationInfo) a(null, new io.appmetrica.analytics.coreutils.impl.b(context, str, i3));
    }

    public final Bundle getApplicationMetaData(Context context) {
        return (Bundle) a(null, new c(this, context));
    }

    public final String getInstallerPackageName(Context context, String str) {
        return (String) a(null, new d(context, str));
    }

    public final PackageInfo getPackageInfo(Context context, String str) {
        return getPackageInfo(context, str, 0);
    }

    public final ServiceInfo getServiceInfo(Context context, ComponentName componentName, int i3) {
        return (ServiceInfo) a(null, new f(context, componentName, i3));
    }

    public final boolean hasSystemFeature(Context context, String str) {
        return ((Boolean) a(Boolean.FALSE, new g(context, str))).booleanValue();
    }

    public final ResolveInfo resolveActivity(Context context, Intent intent, int i3) {
        return (ResolveInfo) a(null, new h(context, intent, i3));
    }

    public final ProviderInfo resolveContentProvider(Context context, String str) {
        return (ProviderInfo) a(null, new i(context, str));
    }

    public final ResolveInfo resolveService(Context context, Intent intent, int i3) {
        return (ResolveInfo) a(null, new j(context, intent, i3));
    }

    public final C0195i setComponentEnabledSetting(Context context, ComponentName componentName, int i3, int i4) {
        return (C0195i) a(null, new k(context, componentName, i3, i4));
    }

    public final PackageInfo getPackageInfo(Context context, String str, int i3) {
        return (PackageInfo) a(null, new e(context, str, i3));
    }
}
