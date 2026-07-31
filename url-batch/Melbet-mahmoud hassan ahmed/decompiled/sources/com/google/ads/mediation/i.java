package com.google.ads.mediation;

import c3.n;

/* loaded from: classes.dex */
final class i extends b3.b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f2210a;

    /* renamed from: b, reason: collision with root package name */
    final n f2211b;

    public i(AbstractAdViewAdapter abstractAdViewAdapter, n nVar) {
        this.f2210a = abstractAdViewAdapter;
        this.f2211b = nVar;
    }

    @Override // r2.e
    public final void c(r2.n nVar) {
        this.f2211b.f(this.f2210a, nVar);
    }

    @Override // r2.e
    public final /* bridge */ /* synthetic */ void e(b3.a aVar) {
        b3.a aVar2 = aVar;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f2210a;
        abstractAdViewAdapter.mInterstitialAd = aVar2;
        aVar2.c(new j(abstractAdViewAdapter, this.f2211b));
        this.f2211b.k(this.f2210a);
    }
}
