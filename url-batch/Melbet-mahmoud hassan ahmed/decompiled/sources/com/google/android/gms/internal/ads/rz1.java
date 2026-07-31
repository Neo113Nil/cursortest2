package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: classes.dex */
public final class rz1 implements kv3<ApplicationInfo> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f11578a;

    public rz1(yv3<Context> yv3Var) {
        this.f11578a = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo a() {
        ApplicationInfo applicationInfo = this.f11578a.a().getApplicationInfo();
        sv3.b(applicationInfo);
        return applicationInfo;
    }
}
