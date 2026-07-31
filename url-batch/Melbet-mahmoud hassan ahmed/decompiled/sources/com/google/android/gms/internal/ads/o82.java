package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class o82 extends i82<hs1> {

    /* renamed from: a, reason: collision with root package name */
    private final bw0 f9564a;

    /* renamed from: b, reason: collision with root package name */
    private final fa1 f9565b;

    /* renamed from: c, reason: collision with root package name */
    private final og1 f9566c;

    public o82(bw0 bw0Var, fa1 fa1Var, og1 og1Var) {
        this.f9564a = bw0Var;
        this.f9565b = fa1Var;
        this.f9566c = og1Var;
    }

    @Override // com.google.android.gms.internal.ads.i82
    protected final cc3<hs1> c(ks2 ks2Var, Bundle bundle) {
        ls1 p7 = this.f9564a.p();
        fa1 fa1Var = this.f9565b;
        fa1Var.f(ks2Var);
        fa1Var.d(bundle);
        p7.a(fa1Var.g());
        p7.c(this.f9566c);
        z71<hs1> a7 = p7.b().a();
        return a7.h(a7.i());
    }
}
