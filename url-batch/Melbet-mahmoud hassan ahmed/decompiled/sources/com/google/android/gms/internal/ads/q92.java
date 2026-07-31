package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q92 implements a52<hs1> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10622a;

    /* renamed from: b, reason: collision with root package name */
    private final et1 f10623b;

    /* renamed from: c, reason: collision with root package name */
    private final ms1 f10624c;

    /* renamed from: d, reason: collision with root package name */
    private final ks2 f10625d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f10626e;

    /* renamed from: f, reason: collision with root package name */
    private final po0 f10627f;

    /* renamed from: g, reason: collision with root package name */
    private final w70 f10628g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f10629h = ((Boolean) sw.c().b(m10.z6)).booleanValue();

    public q92(Context context, po0 po0Var, ks2 ks2Var, Executor executor, ms1 ms1Var, et1 et1Var, w70 w70Var) {
        this.f10622a = context;
        this.f10625d = ks2Var;
        this.f10624c = ms1Var;
        this.f10626e = executor;
        this.f10627f = po0Var;
        this.f10623b = et1Var;
        this.f10628g = w70Var;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<hs1> a(final ds2 ds2Var, final rr2 rr2Var) {
        final it1 it1Var = new it1();
        cc3<hs1> n7 = rb3.n(rb3.i(null), new xa3() { // from class: com.google.android.gms.internal.ads.k92
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return q92.this.c(rr2Var, ds2Var, it1Var, obj);
            }
        }, this.f10626e);
        n7.b(new Runnable() { // from class: com.google.android.gms.internal.ads.m92
            @Override // java.lang.Runnable
            public final void run() {
                it1.this.b();
            }
        }, this.f10626e);
        return n7;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        wr2 wr2Var = rr2Var.f11397t;
        return (wr2Var == null || wr2Var.f13926a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ cc3 c(final rr2 rr2Var, ds2 ds2Var, it1 it1Var, Object obj) {
        final eu0 a7 = this.f10623b.a(this.f10625d.f7619e, rr2Var, ds2Var.f4313b.f3934b);
        a7.d1(rr2Var.T);
        it1Var.a(this.f10622a, (View) a7);
        bp0 bp0Var = new bp0();
        final is1 f7 = this.f10624c.f(new l71(ds2Var, rr2Var, null), new js1(new p92(this.f10622a, this.f10623b, this.f10625d, this.f10627f, rr2Var, bp0Var, a7, this.f10628g, this.f10629h), a7));
        bp0Var.e(f7);
        k80.b(a7, f7.i());
        f7.b().D0(new qb1() { // from class: com.google.android.gms.internal.ads.i92
            @Override // com.google.android.gms.internal.ads.qb1
            public final void k() {
                eu0 eu0Var = eu0.this;
                if (eu0Var.E0() != null) {
                    eu0Var.E0().l();
                }
            }
        }, wo0.f13899f);
        f7.l().i(a7, true, this.f10629h ? this.f10628g : null);
        f7.l();
        wr2 wr2Var = rr2Var.f11397t;
        return rb3.m(dt1.j(a7, wr2Var.f13927b, wr2Var.f13926a), new e43() { // from class: com.google.android.gms.internal.ads.j92
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj2) {
                eu0 eu0Var = a7;
                rr2 rr2Var2 = rr2Var;
                is1 is1Var = f7;
                if (rr2Var2.J) {
                    eu0Var.g0();
                }
                eu0Var.J0();
                eu0Var.onPause();
                return is1Var.k();
            }
        }, this.f10626e);
    }
}
