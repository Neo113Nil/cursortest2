package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class oe3 extends jd3<th3, qh3> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ pe3 f9626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    oe3(pe3 pe3Var, Class cls) {
        super(cls);
        this.f9626b = pe3Var;
    }

    public static final qh3 g(th3 th3Var) {
        ph3 G = qh3.G();
        G.s(th3Var.K());
        G.r(uo3.J(un3.a(th3Var.F())));
        G.t(0);
        return G.o();
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ th3 a(uo3 uo3Var) {
        return th3.J(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ qh3 c(th3 th3Var) {
        return g(th3Var);
    }

    @Override // com.google.android.gms.internal.ads.jd3
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void e(th3 th3Var) {
        wn3.a(th3Var.F());
        pe3 pe3Var = this.f9626b;
        pe3.m(th3Var.K());
    }
}
