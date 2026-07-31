package com.google.ads.mediation;

import c3.n;
import r2.m;

/* loaded from: classes.dex */
final class j extends m {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f2212a;

    /* renamed from: b, reason: collision with root package name */
    final n f2213b;

    public j(AbstractAdViewAdapter abstractAdViewAdapter, n nVar) {
        this.f2212a = abstractAdViewAdapter;
        this.f2213b = nVar;
    }

    @Override // r2.m
    public final void b() {
        this.f2213b.m(this.f2212a);
    }

    @Override // r2.m
    public final void e() {
        this.f2213b.q(this.f2212a);
    }
}
