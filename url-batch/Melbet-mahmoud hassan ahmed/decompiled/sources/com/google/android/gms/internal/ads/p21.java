package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class p21 implements va1, lc1, qb1, yu, mb1 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f10016f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f10017g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f10018h;

    /* renamed from: i, reason: collision with root package name */
    private final ScheduledExecutorService f10019i;

    /* renamed from: j, reason: collision with root package name */
    private final ds2 f10020j;

    /* renamed from: k, reason: collision with root package name */
    private final rr2 f10021k;

    /* renamed from: l, reason: collision with root package name */
    private final zx2 f10022l;

    /* renamed from: m, reason: collision with root package name */
    private final ts2 f10023m;

    /* renamed from: n, reason: collision with root package name */
    private final gb f10024n;

    /* renamed from: o, reason: collision with root package name */
    private final m20 f10025o;

    /* renamed from: p, reason: collision with root package name */
    private final WeakReference<View> f10026p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10027q;

    /* renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f10028r = new AtomicBoolean();

    /* renamed from: s, reason: collision with root package name */
    private final o20 f10029s;

    public p21(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, ds2 ds2Var, rr2 rr2Var, zx2 zx2Var, ts2 ts2Var, View view, gb gbVar, m20 m20Var, o20 o20Var, byte[] bArr) {
        this.f10016f = context;
        this.f10017g = executor;
        this.f10018h = executor2;
        this.f10019i = scheduledExecutorService;
        this.f10020j = ds2Var;
        this.f10021k = rr2Var;
        this.f10022l = zx2Var;
        this.f10023m = ts2Var;
        this.f10024n = gbVar;
        this.f10026p = new WeakReference<>(view);
        this.f10025o = m20Var;
        this.f10029s = o20Var;
    }

    private final void C(final int i7, final int i8) {
        View view;
        if (i7 <= 0 || !((view = this.f10026p.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            z();
        } else {
            this.f10019i.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.m21
                @Override // java.lang.Runnable
                public final void run() {
                    p21.this.y(i7, i8);
                }
            }, i8, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        String c7 = ((Boolean) sw.c().b(m10.f8211h2)).booleanValue() ? this.f10024n.c().c(this.f10016f, this.f10026p.get(), null) : null;
        if (!(((Boolean) sw.c().b(m10.f8217i0)).booleanValue() && this.f10020j.f4313b.f3934b.f12952g) && a30.f2587h.e().booleanValue()) {
            rb3.r((ib3) rb3.o(ib3.E(rb3.i(null)), ((Long) sw.c().b(m10.J0)).longValue(), TimeUnit.MILLISECONDS, this.f10019i), new o21(this, c7), this.f10017g);
            return;
        }
        ts2 ts2Var = this.f10023m;
        zx2 zx2Var = this.f10022l;
        ds2 ds2Var = this.f10020j;
        rr2 rr2Var = this.f10021k;
        ts2Var.a(zx2Var.b(ds2Var, rr2Var, false, c7, null, rr2Var.f11373d));
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void M() {
        if (!(((Boolean) sw.c().b(m10.f8217i0)).booleanValue() && this.f10020j.f4313b.f3934b.f12952g) && a30.f2583d.e().booleanValue()) {
            rb3.r(rb3.f(ib3.E(this.f10025o.a()), Throwable.class, new e43() { // from class: com.google.android.gms.internal.ads.i21
                @Override // com.google.android.gms.internal.ads.e43
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, wo0.f13899f), new n21(this), this.f10017g);
            return;
        }
        ts2 ts2Var = this.f10023m;
        zx2 zx2Var = this.f10022l;
        ds2 ds2Var = this.f10020j;
        rr2 rr2Var = this.f10021k;
        List<String> a7 = zx2Var.a(ds2Var, rr2Var, rr2Var.f11371c);
        y2.t.q();
        ts2Var.c(a7, true == a3.g2.j(this.f10016f) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final void M0(cv cvVar) {
        if (((Boolean) sw.c().b(m10.f8194f1)).booleanValue()) {
            this.f10023m.a(this.f10022l.a(this.f10020j, this.f10021k, zx2.d(2, cvVar.f3954f, this.f10021k.f11393p)));
        }
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void e() {
        ts2 ts2Var = this.f10023m;
        zx2 zx2Var = this.f10022l;
        ds2 ds2Var = this.f10020j;
        rr2 rr2Var = this.f10021k;
        ts2Var.a(zx2Var.a(ds2Var, rr2Var, rr2Var.f11385j));
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void h(mj0 mj0Var, String str, String str2) {
        ts2 ts2Var = this.f10023m;
        zx2 zx2Var = this.f10022l;
        rr2 rr2Var = this.f10021k;
        ts2Var.a(zx2Var.c(rr2Var, rr2Var.f11383i, mj0Var));
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void k() {
        if (this.f10028r.compareAndSet(false, true)) {
            int intValue = ((Integer) sw.c().b(m10.f8235k2)).intValue();
            if (intValue > 0) {
                C(intValue, ((Integer) sw.c().b(m10.f8243l2)).intValue());
                return;
            }
            if (((Boolean) sw.c().b(m10.f8227j2)).booleanValue()) {
                this.f10018h.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.j21
                    @Override // java.lang.Runnable
                    public final void run() {
                        p21.this.r();
                    }
                });
            } else {
                z();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lc1
    public final synchronized void m() {
        ts2 ts2Var;
        List<String> a7;
        if (this.f10027q) {
            ArrayList arrayList = new ArrayList(this.f10021k.f11373d);
            arrayList.addAll(this.f10021k.f11379g);
            ts2Var = this.f10023m;
            a7 = this.f10022l.b(this.f10020j, this.f10021k, true, null, null, arrayList);
        } else {
            ts2 ts2Var2 = this.f10023m;
            zx2 zx2Var = this.f10022l;
            ds2 ds2Var = this.f10020j;
            rr2 rr2Var = this.f10021k;
            ts2Var2.a(zx2Var.a(ds2Var, rr2Var, rr2Var.f11391n));
            ts2Var = this.f10023m;
            zx2 zx2Var2 = this.f10022l;
            ds2 ds2Var2 = this.f10020j;
            rr2 rr2Var2 = this.f10021k;
            a7 = zx2Var2.a(ds2Var2, rr2Var2, rr2Var2.f11379g);
        }
        ts2Var.a(a7);
        this.f10027q = true;
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void o() {
    }

    final /* synthetic */ void r() {
        this.f10017g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.k21
            @Override // java.lang.Runnable
            public final void run() {
                p21.this.z();
            }
        });
    }

    final /* synthetic */ void s(int i7, int i8) {
        C(i7 - 1, i8);
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void t() {
        ts2 ts2Var = this.f10023m;
        zx2 zx2Var = this.f10022l;
        ds2 ds2Var = this.f10020j;
        rr2 rr2Var = this.f10021k;
        ts2Var.a(zx2Var.a(ds2Var, rr2Var, rr2Var.f11381h));
    }

    final /* synthetic */ void y(final int i7, final int i8) {
        this.f10017g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.l21
            @Override // java.lang.Runnable
            public final void run() {
                p21.this.s(i7, i8);
            }
        });
    }
}
