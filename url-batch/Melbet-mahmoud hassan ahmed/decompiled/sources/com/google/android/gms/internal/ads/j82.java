package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class j82 extends i82<t41> {

    /* renamed from: a, reason: collision with root package name */
    private final bw0 f7015a;

    /* renamed from: b, reason: collision with root package name */
    private final fa1 f7016b;

    /* renamed from: c, reason: collision with root package name */
    private final ua2 f7017c;

    /* renamed from: d, reason: collision with root package name */
    private final og1 f7018d;

    /* renamed from: e, reason: collision with root package name */
    private final yk1 f7019e;

    /* renamed from: f, reason: collision with root package name */
    private final nd1 f7020f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f7021g;

    public j82(bw0 bw0Var, fa1 fa1Var, ua2 ua2Var, og1 og1Var, yk1 yk1Var, nd1 nd1Var, ViewGroup viewGroup) {
        this.f7015a = bw0Var;
        this.f7016b = fa1Var;
        this.f7017c = ua2Var;
        this.f7018d = og1Var;
        this.f7019e = yk1Var;
        this.f7020f = nd1Var;
        this.f7021g = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.i82
    protected final cc3<t41> c(ks2 ks2Var, Bundle bundle) {
        q51 l7 = this.f7015a.l();
        fa1 fa1Var = this.f7016b;
        fa1Var.f(ks2Var);
        fa1Var.d(bundle);
        l7.p(fa1Var.g());
        l7.s(this.f7018d);
        l7.q(this.f7017c);
        l7.g(this.f7019e);
        l7.m(new p61(this.f7020f));
        l7.h(new q41(this.f7021g));
        z71<t41> d7 = l7.i().d();
        return d7.h(d7.i());
    }
}
