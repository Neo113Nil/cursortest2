package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafePackageManager f9697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f9698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SafePackageManager safePackageManager, Context context) {
        super(0);
        this.f9697a = safePackageManager;
        this.f9698b = context;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        SafePackageManager safePackageManager = this.f9697a;
        Context context = this.f9698b;
        ApplicationInfo applicationInfo = safePackageManager.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }
}
