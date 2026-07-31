package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class qb2 extends fx {

    /* renamed from: f, reason: collision with root package name */
    private final xc2 f10638f;

    public qb2(Context context, bw0 bw0Var, is2 is2Var, cn1 cn1Var, zw zwVar) {
        zc2 zc2Var = new zc2(cn1Var, bw0Var.D());
        zc2Var.e(zwVar);
        this.f10638f = new xc2(new jd2(bw0Var, context, zc2Var, is2Var), is2Var.h());
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void Y1(kv kvVar) {
        this.f10638f.d(kvVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final synchronized String b() {
        return this.f10638f.a();
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final synchronized String d() {
        return this.f10638f.b();
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final synchronized boolean h() {
        return this.f10638f.e();
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final synchronized void q1(kv kvVar, int i7) {
        this.f10638f.d(kvVar, i7);
    }
}
