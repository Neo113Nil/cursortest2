package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class g82 extends i82<d71> {

    /* renamed from: a, reason: collision with root package name */
    private final bw0 f5486a;

    /* renamed from: b, reason: collision with root package name */
    private final yk1 f5487b;

    /* renamed from: c, reason: collision with root package name */
    private final fa1 f5488c;

    /* renamed from: d, reason: collision with root package name */
    private final og1 f5489d;

    public g82(bw0 bw0Var, yk1 yk1Var, fa1 fa1Var, og1 og1Var) {
        this.f5486a = bw0Var;
        this.f5487b = yk1Var;
        this.f5488c = fa1Var;
        this.f5489d = og1Var;
    }

    @Override // com.google.android.gms.internal.ads.i82
    protected final cc3<d71> c(ks2 ks2Var, Bundle bundle) {
        cl1 o7 = this.f5486a.o();
        fa1 fa1Var = this.f5488c;
        fa1Var.f(ks2Var);
        fa1Var.d(bundle);
        o7.n(fa1Var.g());
        o7.r(this.f5489d);
        o7.g(this.f5487b);
        o7.h(new q41(null));
        z71<d71> a7 = o7.e().a();
        return a7.h(a7.i());
    }
}
