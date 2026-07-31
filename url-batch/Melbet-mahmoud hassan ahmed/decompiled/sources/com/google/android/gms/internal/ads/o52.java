package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o52 implements a52<m41> {

    /* renamed from: a, reason: collision with root package name */
    private final h41 f9513a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f9514b;

    /* renamed from: c, reason: collision with root package name */
    private final et1 f9515c;

    /* renamed from: d, reason: collision with root package name */
    private final ks2 f9516d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f9517e;

    /* renamed from: f, reason: collision with root package name */
    private final po0 f9518f;

    /* renamed from: g, reason: collision with root package name */
    private final w70 f9519g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f9520h = ((Boolean) sw.c().b(m10.z6)).booleanValue();

    public o52(h41 h41Var, Context context, Executor executor, et1 et1Var, ks2 ks2Var, po0 po0Var, w70 w70Var) {
        this.f9514b = context;
        this.f9513a = h41Var;
        this.f9517e = executor;
        this.f9515c = et1Var;
        this.f9516d = ks2Var;
        this.f9518f = po0Var;
        this.f9519g = w70Var;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<m41> a(final ds2 ds2Var, final rr2 rr2Var) {
        final it1 it1Var = new it1();
        cc3<m41> n7 = rb3.n(rb3.i(null), new xa3() { // from class: com.google.android.gms.internal.ads.m52
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return o52.this.c(rr2Var, ds2Var, it1Var, obj);
            }
        }, this.f9517e);
        n7.b(new Runnable() { // from class: com.google.android.gms.internal.ads.n52
            @Override // java.lang.Runnable
            public final void run() {
                it1.this.b();
            }
        }, this.f9517e);
        return n7;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        wr2 wr2Var = rr2Var.f11397t;
        return (wr2Var == null || wr2Var.f13926a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ cc3 c(final rr2 rr2Var, ds2 ds2Var, it1 it1Var, Object obj) {
        final eu0 a7 = this.f9515c.a(this.f9516d.f7619e, rr2Var, ds2Var.f4313b.f3934b);
        a7.d1(rr2Var.T);
        it1Var.a(this.f9514b, (View) a7);
        bp0 bp0Var = new bp0();
        final e41 b7 = this.f9513a.b(new l71(ds2Var, rr2Var, null), new nj1(new q52(this.f9518f, bp0Var, rr2Var, a7, this.f9516d, this.f9520h, this.f9519g), a7), new f41(rr2Var.X));
        b7.j().i(a7, false, this.f9520h ? this.f9519g : null);
        bp0Var.e(b7);
        b7.b().D0(new qb1() { // from class: com.google.android.gms.internal.ads.k52
            @Override // com.google.android.gms.internal.ads.qb1
            public final void k() {
                eu0 eu0Var = eu0.this;
                if (eu0Var.E0() != null) {
                    eu0Var.E0().l();
                }
            }
        }, wo0.f13899f);
        b7.j();
        wr2 wr2Var = rr2Var.f11397t;
        return rb3.m(dt1.j(a7, wr2Var.f13927b, wr2Var.f13926a), new e43() { // from class: com.google.android.gms.internal.ads.l52
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj2) {
                eu0 eu0Var = a7;
                rr2 rr2Var2 = rr2Var;
                e41 e41Var = b7;
                if (rr2Var2.J) {
                    eu0Var.g0();
                }
                eu0Var.J0();
                eu0Var.onPause();
                return e41Var.h();
            }
        }, this.f9517e);
    }
}
