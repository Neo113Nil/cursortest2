package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class v62 implements nb3<t41> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w62 f13146a;

    v62(w62 w62Var) {
        this.f13146a = w62Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* synthetic */ void a(t41 t41Var) {
        t41Var.b();
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        r51 r51Var;
        xa1 xa1Var;
        r51Var = this.f13146a.f13729a;
        cv a7 = r51Var.d().a(th);
        xa1Var = this.f13146a.f13732d;
        xa1Var.d(a7);
        zs2.b(a7.f3954f, th, "DelayedBannerAd.onFailure");
    }
}
