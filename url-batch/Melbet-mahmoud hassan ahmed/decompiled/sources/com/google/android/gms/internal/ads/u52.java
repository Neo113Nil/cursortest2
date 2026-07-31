package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u52 implements a52<c41> {

    /* renamed from: a, reason: collision with root package name */
    private final v31 f12640a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12641b;

    /* renamed from: c, reason: collision with root package name */
    private final et1 f12642c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f12643d;

    public u52(v31 v31Var, Context context, Executor executor, et1 et1Var) {
        this.f12641b = context;
        this.f12640a = v31Var;
        this.f12643d = executor;
        this.f12642c = et1Var;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<c41> a(final ds2 ds2Var, final rr2 rr2Var) {
        return rb3.n(rb3.i(null), new xa3() { // from class: com.google.android.gms.internal.ads.t52
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return u52.this.c(ds2Var, rr2Var, obj);
            }
        }, this.f12643d);
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        wr2 wr2Var = rr2Var.f11397t;
        return (wr2Var == null || wr2Var.f13926a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ cc3 c(ds2 ds2Var, rr2 rr2Var, Object obj) {
        pv a7 = os2.a(this.f12641b, rr2Var.f11399v);
        final eu0 a8 = this.f12642c.a(a7, rr2Var, ds2Var.f4313b.f3934b);
        final o31 b7 = this.f12640a.b(new l71(ds2Var, rr2Var, null), new p31((View) a8, a8, os2.c(a7), rr2Var.X, rr2Var.f11370b0, rr2Var.L));
        b7.i().i(a8, false, null);
        ob1 b8 = b7.b();
        qb1 qb1Var = new qb1() { // from class: com.google.android.gms.internal.ads.r52
            @Override // com.google.android.gms.internal.ads.qb1
            public final void k() {
                eu0 eu0Var = eu0.this;
                if (eu0Var.E0() != null) {
                    eu0Var.E0().l();
                }
            }
        };
        dc3 dc3Var = wo0.f13899f;
        b8.D0(qb1Var, dc3Var);
        b7.i();
        wr2 wr2Var = rr2Var.f11397t;
        return rb3.m(dt1.j(a8, wr2Var.f13927b, wr2Var.f13926a), new e43() { // from class: com.google.android.gms.internal.ads.s52
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj2) {
                return o31.this.h();
            }
        }, dc3Var);
    }
}
