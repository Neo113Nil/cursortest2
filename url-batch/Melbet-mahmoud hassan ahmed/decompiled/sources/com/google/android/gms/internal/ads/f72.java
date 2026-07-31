package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f72 implements a52<ij1> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5017a;

    /* renamed from: b, reason: collision with root package name */
    private final et1 f5018b;

    /* renamed from: c, reason: collision with root package name */
    private final gk1 f5019c;

    /* renamed from: d, reason: collision with root package name */
    private final ks2 f5020d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f5021e;

    /* renamed from: f, reason: collision with root package name */
    private final po0 f5022f;

    /* renamed from: g, reason: collision with root package name */
    private final w70 f5023g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f5024h = ((Boolean) sw.c().b(m10.z6)).booleanValue();

    public f72(Context context, po0 po0Var, ks2 ks2Var, Executor executor, gk1 gk1Var, et1 et1Var, w70 w70Var) {
        this.f5017a = context;
        this.f5020d = ks2Var;
        this.f5019c = gk1Var;
        this.f5021e = executor;
        this.f5022f = po0Var;
        this.f5018b = et1Var;
        this.f5023g = w70Var;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<ij1> a(final ds2 ds2Var, final rr2 rr2Var) {
        final it1 it1Var = new it1();
        cc3<ij1> n7 = rb3.n(rb3.i(null), new xa3() { // from class: com.google.android.gms.internal.ads.c72
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return f72.this.c(rr2Var, ds2Var, it1Var, obj);
            }
        }, this.f5021e);
        n7.b(new Runnable() { // from class: com.google.android.gms.internal.ads.d72
            @Override // java.lang.Runnable
            public final void run() {
                it1.this.b();
            }
        }, this.f5021e);
        return n7;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        wr2 wr2Var = rr2Var.f11397t;
        return (wr2Var == null || wr2Var.f13926a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ cc3 c(final rr2 rr2Var, ds2 ds2Var, it1 it1Var, Object obj) {
        final eu0 a7 = this.f5018b.a(this.f5020d.f7619e, rr2Var, ds2Var.f4313b.f3934b);
        a7.d1(rr2Var.T);
        it1Var.a(this.f5017a, (View) a7);
        bp0 bp0Var = new bp0();
        final jj1 c7 = this.f5019c.c(new l71(ds2Var, rr2Var, null), new nj1(new e72(this.f5017a, this.f5022f, bp0Var, rr2Var, a7, this.f5020d, this.f5024h, this.f5023g), a7));
        bp0Var.e(c7);
        c7.b().D0(new qb1() { // from class: com.google.android.gms.internal.ads.a72
            @Override // com.google.android.gms.internal.ads.qb1
            public final void k() {
                eu0 eu0Var = eu0.this;
                if (eu0Var.E0() != null) {
                    eu0Var.E0().l();
                }
            }
        }, wo0.f13899f);
        c7.k().i(a7, true, this.f5024h ? this.f5023g : null);
        c7.k();
        wr2 wr2Var = rr2Var.f11397t;
        return rb3.m(dt1.j(a7, wr2Var.f13927b, wr2Var.f13926a), new e43() { // from class: com.google.android.gms.internal.ads.b72
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj2) {
                eu0 eu0Var = a7;
                rr2 rr2Var2 = rr2Var;
                jj1 jj1Var = c7;
                if (rr2Var2.J) {
                    eu0Var.g0();
                }
                eu0Var.J0();
                eu0Var.onPause();
                return jj1Var.i();
            }
        }, this.f5021e);
    }
}
