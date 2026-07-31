package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class lc2 implements td1, lc1, ya1, qb1, yu, va1, jd1, fe, mb1, pi1 {

    /* renamed from: n, reason: collision with root package name */
    private final xw2 f7931n;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<zw> f7923f = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<ux> f7924g = new AtomicReference<>();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<wy> f7925h = new AtomicReference<>();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<dx> f7926i = new AtomicReference<>();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference<by> f7927j = new AtomicReference<>();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f7928k = new AtomicBoolean(true);

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f7929l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f7930m = new AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    final BlockingQueue<Pair<String, String>> f7932o = new ArrayBlockingQueue(((Integer) sw.c().b(m10.x6)).intValue());

    public lc2(xw2 xw2Var) {
        this.f7931n = xw2Var;
    }

    @TargetApi(5)
    private final void Q() {
        if (this.f7929l.get() && this.f7930m.get()) {
            Iterator it = this.f7932o.iterator();
            while (it.hasNext()) {
                final Pair pair = (Pair) it.next();
                ro2.a(this.f7924g, new qo2() { // from class: com.google.android.gms.internal.ads.tb2
                    @Override // com.google.android.gms.internal.ads.qo2
                    public final void c(Object obj) {
                        Pair pair2 = pair;
                        ((ux) obj).z0((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.f7932o.clear();
            this.f7928k.set(false);
        }
    }

    public final void C(ux uxVar) {
        this.f7924g.set(uxVar);
        this.f7929l.set(true);
        Q();
    }

    public final void E(by byVar) {
        this.f7927j.set(byVar);
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void M() {
        if (((Boolean) sw.c().b(m10.m7)).booleanValue()) {
            return;
        }
        ro2.a(this.f7923f, ic2.f6605a);
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final void M0(final cv cvVar) {
        ro2.a(this.f7927j, new qo2() { // from class: com.google.android.gms.internal.ads.fc2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((by) obj).C0(cv.this);
            }
        });
    }

    public final synchronized zw a() {
        return this.f7923f.get();
    }

    public final synchronized ux b() {
        return this.f7924g.get();
    }

    @Override // com.google.android.gms.internal.ads.fe
    @TargetApi(5)
    public final synchronized void c(final String str, final String str2) {
        if (!this.f7928k.get()) {
            ro2.a(this.f7924g, new qo2() { // from class: com.google.android.gms.internal.ads.hc2
                @Override // com.google.android.gms.internal.ads.qo2
                public final void c(Object obj) {
                    ((ux) obj).z0(str, str2);
                }
            });
            return;
        }
        if (!this.f7932o.offer(new Pair<>(str, str2))) {
            io0.b("The queue for app events is full, dropping the new event.");
            xw2 xw2Var = this.f7931n;
            if (xw2Var != null) {
                ww2 b7 = ww2.b("dae_action");
                b7.a("dae_name", str);
                b7.a("dae_data", str2);
                xw2Var.a(b7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ya1
    public final void d(final cv cvVar) {
        ro2.a(this.f7923f, new qo2() { // from class: com.google.android.gms.internal.ads.cc2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((zw) obj).w(cv.this);
            }
        });
        ro2.a(this.f7923f, new qo2() { // from class: com.google.android.gms.internal.ads.dc2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((zw) obj).D(cv.this.f3954f);
            }
        });
        ro2.a(this.f7926i, new qo2() { // from class: com.google.android.gms.internal.ads.ec2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((dx) obj).o0(cv.this);
            }
        });
        this.f7928k.set(false);
        this.f7932o.clear();
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void e() {
    }

    public final void f(zw zwVar) {
        this.f7923f.set(zwVar);
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void h(mj0 mj0Var, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void i() {
        ro2.a(this.f7923f, new qo2() { // from class: com.google.android.gms.internal.ads.jc2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((zw) obj).g();
            }
        });
        ro2.a(this.f7927j, new qo2() { // from class: com.google.android.gms.internal.ads.zb2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((by) obj).c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void k() {
        ro2.a(this.f7923f, new qo2() { // from class: com.google.android.gms.internal.ads.kc2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((zw) obj).e();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.lc1
    public final synchronized void m() {
        ro2.a(this.f7923f, new qo2() { // from class: com.google.android.gms.internal.ads.vb2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((zw) obj).h();
            }
        });
        ro2.a(this.f7926i, new qo2() { // from class: com.google.android.gms.internal.ads.xb2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((dx) obj).c();
            }
        });
        this.f7930m.set(true);
        Q();
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void n() {
        ro2.a(this.f7923f, new qo2() { // from class: com.google.android.gms.internal.ads.wb2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((zw) obj).i();
            }
        });
        ro2.a(this.f7927j, new qo2() { // from class: com.google.android.gms.internal.ads.bc2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((by) obj).d();
            }
        });
        ro2.a(this.f7927j, new qo2() { // from class: com.google.android.gms.internal.ads.ac2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((by) obj).b();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void o() {
        ro2.a(this.f7923f, new qo2() { // from class: com.google.android.gms.internal.ads.ub2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((zw) obj).f();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void p0(vi0 vi0Var) {
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void q(ds2 ds2Var) {
        this.f7928k.set(true);
        this.f7930m.set(false);
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void r() {
        if (((Boolean) sw.c().b(m10.m7)).booleanValue()) {
            ro2.a(this.f7923f, ic2.f6605a);
        }
        ro2.a(this.f7927j, new qo2() { // from class: com.google.android.gms.internal.ads.yb2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((by) obj).a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void s(final rv rvVar) {
        ro2.a(this.f7925h, new qo2() { // from class: com.google.android.gms.internal.ads.gc2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((wy) obj).s5(rv.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void t() {
    }

    public final void y(dx dxVar) {
        this.f7926i.set(dxVar);
    }

    public final void z(wy wyVar) {
        this.f7925h.set(wyVar);
    }
}
