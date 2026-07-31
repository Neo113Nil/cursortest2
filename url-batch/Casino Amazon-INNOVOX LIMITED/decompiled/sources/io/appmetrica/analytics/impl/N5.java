package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes3.dex */
public abstract class N5 extends BaseRequestConfig.ComponentLoader {

    /* renamed from: a, reason: collision with root package name */
    public final SafePackageManager f964a;

    public N5(Context context, String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: a */
    public O5 load(M5 m5) {
        O5 o5 = (O5) super.load((N5) m5);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f964a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i = applicationInfo.flags;
            o5.f983a = (i & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            o5.b = (i & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            o5.f983a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            o5.b = (getContext().getApplicationInfo().flags & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else {
            o5.f983a = CommonUrlParts.Values.FALSE_INTEGER;
            o5.b = CommonUrlParts.Values.FALSE_INTEGER;
        }
        C0209gm c0209gm = m5.f949a;
        o5.c = c0209gm;
        o5.setRetryPolicyConfig(c0209gm.t);
        return o5;
    }

    public N5(Context context, String str, SafePackageManager safePackageManager) {
        super(context, str);
        this.f964a = safePackageManager;
    }
}
