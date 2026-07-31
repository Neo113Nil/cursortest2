package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class kh2 implements kv3<ih2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<dc3> f7515a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<ks2> f7516b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<PackageInfo> f7517c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<a3.t1> f7518d;

    public kh2(yv3<dc3> yv3Var, yv3<ks2> yv3Var2, yv3<PackageInfo> yv3Var3, yv3<a3.t1> yv3Var4) {
        this.f7515a = yv3Var;
        this.f7516b = yv3Var2;
        this.f7517c = yv3Var3;
        this.f7518d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new ih2(dc3Var, ((ma1) this.f7516b).b(), this.f7517c.a(), ((mt2) this.f7518d).a());
    }
}
