package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes.dex */
public abstract class M5 extends BaseRequestConfig.ComponentLoader {

    /* renamed from: a, reason: collision with root package name */
    public final SafePackageManager f10628a;

    public M5(Context context, String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: a */
    public N5 load(L5 l5) {
        N5 n5 = (N5) super.load((M5) l5);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f10628a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i4 = applicationInfo.flags;
            n5.f10689a = (i4 & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            n5.f10690b = (i4 & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            n5.f10689a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            n5.f10690b = (getContext().getApplicationInfo().flags & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else {
            n5.f10689a = CommonUrlParts.Values.FALSE_INTEGER;
            n5.f10690b = CommonUrlParts.Values.FALSE_INTEGER;
        }
        C0622fm c0622fm = l5.f10564a;
        n5.f10691c = c0622fm;
        n5.setRetryPolicyConfig(c0622fm.f11877t);
        return n5;
    }

    public M5(Context context, String str, SafePackageManager safePackageManager) {
        super(context, str);
        this.f10628a = safePackageManager;
    }
}
