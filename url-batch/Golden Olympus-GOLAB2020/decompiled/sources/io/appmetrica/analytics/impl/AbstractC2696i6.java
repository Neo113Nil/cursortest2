package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.i6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2696i6 extends BaseRequestConfig.ComponentLoader {

    /* renamed from: a, reason: collision with root package name */
    public final SafePackageManager f39180a;

    public AbstractC2696i6(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: a */
    public C2721j6 load(@NonNull C2670h6 c2670h6) {
        C2721j6 c2721j6 = (C2721j6) super.load((AbstractC2696i6) c2670h6);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f39180a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i4 = applicationInfo.flags;
            c2721j6.f39261a = (i4 & 2) != 0 ? "1" : "0";
            c2721j6.f39262b = (i4 & 1) == 0 ? "0" : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            c2721j6.f39261a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : "0";
            c2721j6.f39262b = (getContext().getApplicationInfo().flags & 1) == 0 ? "0" : "1";
        } else {
            c2721j6.f39261a = "0";
            c2721j6.f39262b = "0";
        }
        C2633fm c2633fm = c2670h6.f39126a;
        c2721j6.f39263c = c2633fm;
        c2721j6.setRetryPolicyConfig(c2633fm.f38998t);
        return c2721j6;
    }

    public AbstractC2696i6(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager) {
        super(context, str);
        this.f39180a = safePackageManager;
    }
}
