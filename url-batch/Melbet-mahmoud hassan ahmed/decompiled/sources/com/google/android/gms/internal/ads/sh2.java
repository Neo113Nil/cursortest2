package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class sh2 implements kv3<rh2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ApplicationInfo> f11826a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<PackageInfo> f11827b;

    public sh2(yv3<ApplicationInfo> yv3Var, yv3<PackageInfo> yv3Var2) {
        this.f11826a = yv3Var;
        this.f11827b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new rh2(((rz1) this.f11826a).a(), this.f11827b.a());
    }
}
