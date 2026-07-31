package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class m82 extends i82<ij1> {

    /* renamed from: a, reason: collision with root package name */
    private final bw0 f8452a;

    /* renamed from: b, reason: collision with root package name */
    private final fa1 f8453b;

    /* renamed from: c, reason: collision with root package name */
    private final ua2 f8454c;

    /* renamed from: d, reason: collision with root package name */
    private final og1 f8455d;

    public m82(bw0 bw0Var, fa1 fa1Var, ua2 ua2Var, og1 og1Var) {
        this.f8452a = bw0Var;
        this.f8453b = fa1Var;
        this.f8454c = ua2Var;
        this.f8455d = og1Var;
    }

    @Override // com.google.android.gms.internal.ads.i82
    protected final cc3<ij1> c(ks2 ks2Var, Bundle bundle) {
        fk1 n7 = this.f8452a.n();
        fa1 fa1Var = this.f8453b;
        fa1Var.f(ks2Var);
        fa1Var.d(bundle);
        n7.t(fa1Var.g());
        n7.j(this.f8455d);
        n7.k(this.f8454c);
        z71<ij1> a7 = n7.d().a();
        return a7.h(a7.i());
    }
}
