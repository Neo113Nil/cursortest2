package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c62 implements a52<t41> {

    /* renamed from: a, reason: collision with root package name */
    private final r51 f3741a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3742b;

    /* renamed from: c, reason: collision with root package name */
    private final et1 f3743c;

    /* renamed from: d, reason: collision with root package name */
    private final ks2 f3744d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f3745e;

    /* renamed from: f, reason: collision with root package name */
    private final e43<rr2, a3.x> f3746f;

    public c62(r51 r51Var, Context context, Executor executor, et1 et1Var, ks2 ks2Var, e43<rr2, a3.x> e43Var) {
        this.f3742b = context;
        this.f3741a = r51Var;
        this.f3745e = executor;
        this.f3743c = et1Var;
        this.f3744d = ks2Var;
        this.f3746f = e43Var;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<t41> a(final ds2 ds2Var, final rr2 rr2Var) {
        return rb3.n(rb3.i(null), new xa3() { // from class: com.google.android.gms.internal.ads.z52
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return c62.this.c(ds2Var, rr2Var, obj);
            }
        }, this.f3745e);
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        wr2 wr2Var = rr2Var.f11397t;
        return (wr2Var == null || wr2Var.f13926a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ cc3 c(ds2 ds2Var, rr2 rr2Var, Object obj) {
        View ht1Var;
        pv a7 = os2.a(this.f3742b, rr2Var.f11399v);
        final eu0 a8 = this.f3743c.a(a7, rr2Var, ds2Var.f4313b.f3934b);
        a8.d1(rr2Var.T);
        if (((Boolean) sw.c().b(m10.I5)).booleanValue() && rr2Var.f11376e0) {
            ht1Var = k61.a(this.f3742b, (View) a8, rr2Var);
        } else {
            ht1Var = new ht1(this.f3742b, (View) a8, this.f3746f.apply(rr2Var));
        }
        final u41 a9 = this.f3741a.a(new l71(ds2Var, rr2Var, null), new b51(ht1Var, a8, new t61() { // from class: com.google.android.gms.internal.ads.w52
            @Override // com.google.android.gms.internal.ads.t61
            public final cz zza() {
                return eu0.this.p();
            }
        }, os2.c(a7)));
        a9.j().i(a8, false, null);
        ob1 b7 = a9.b();
        qb1 qb1Var = new qb1() { // from class: com.google.android.gms.internal.ads.x52
            @Override // com.google.android.gms.internal.ads.qb1
            public final void k() {
                eu0 eu0Var = eu0.this;
                if (eu0Var.E0() != null) {
                    eu0Var.E0().l();
                }
            }
        };
        dc3 dc3Var = wo0.f13899f;
        b7.D0(qb1Var, dc3Var);
        a9.j();
        wr2 wr2Var = rr2Var.f11397t;
        cc3<?> j7 = dt1.j(a8, wr2Var.f13927b, wr2Var.f13926a);
        if (rr2Var.J) {
            j7.b(new Runnable() { // from class: com.google.android.gms.internal.ads.a62
                @Override // java.lang.Runnable
                public final void run() {
                    eu0.this.g0();
                }
            }, this.f3745e);
        }
        j7.b(new Runnable() { // from class: com.google.android.gms.internal.ads.b62
            @Override // java.lang.Runnable
            public final void run() {
                c62.this.d(a8);
            }
        }, this.f3745e);
        return rb3.m(j7, new e43() { // from class: com.google.android.gms.internal.ads.y52
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj2) {
                return u41.this.h();
            }
        }, dc3Var);
    }

    final /* synthetic */ void d(eu0 eu0Var) {
        eu0Var.J0();
        bv0 p7 = eu0Var.p();
        s00 s00Var = this.f3744d.f7615a;
        if (s00Var == null || p7 == null) {
            return;
        }
        p7.w6(s00Var);
    }
}
