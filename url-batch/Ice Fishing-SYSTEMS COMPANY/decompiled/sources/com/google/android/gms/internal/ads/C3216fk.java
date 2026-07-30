package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.fk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3216fk implements InterfaceC3915sk, InterfaceC4024ul, InterfaceC3271gl, InterfaceC2472Ak, InterfaceC3725p8 {

    /* renamed from: B, reason: collision with root package name */
    public final String f30855B;

    /* renamed from: n, reason: collision with root package name */
    public final C2489Bk f30856n;

    /* renamed from: u, reason: collision with root package name */
    public final C2778Sk f30857u;

    /* renamed from: v, reason: collision with root package name */
    public final Ut f30858v;

    /* renamed from: w, reason: collision with root package name */
    public final ScheduledExecutorService f30859w;

    /* renamed from: x, reason: collision with root package name */
    public final SD f30860x;

    /* renamed from: z, reason: collision with root package name */
    public ScheduledFuture f30862z;

    /* renamed from: y, reason: collision with root package name */
    public final ZD f30861y = new ZD();

    /* renamed from: A, reason: collision with root package name */
    public final AtomicBoolean f30854A = new AtomicBoolean();

    public C3216fk(C2489Bk c2489Bk, Ut ut, ScheduledExecutorService scheduledExecutorService, SD sd, String str, C2778Sk c2778Sk) {
        this.f30856n = c2489Bk;
        this.f30858v = ut;
        this.f30859w = scheduledExecutorService;
        this.f30860x = sd;
        this.f30855B = str;
        this.f30857u = c2778Sk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725p8
    public final void A(C3671o8 c3671o8) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Uc)).booleanValue() && this.f30855B.equals("com.google.ads.mediation.admob.AdMobAdapter") && c3671o8.f33111j && this.f30854A.compareAndSet(false, true) && this.f30858v.f28147e != 3) {
            t2.C.k("Full screen 1px impression occurred");
            this.f30856n.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void E() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void F() {
        Ut ut = this.f30858v;
        if (ut.f28147e == 3) {
            return;
        }
        int i = ut.Y;
        if (i == 0 || i == 1) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Uc)).booleanValue() && this.f30855B.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f30856n.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2472Ak
    public final synchronized void b(C4927z0 c4927z0) {
        try {
            ZD zd = this.f30861y;
            if (zd.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f30862z;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zd.e(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4024ul
    public final void e() {
        Ut ut = this.f30858v;
        int i = ut.f28147e;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.f30857u.a();
            return;
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.d2)).booleanValue() && ut.Y == 2) {
            int i4 = ut.f28169q;
            if (i4 == 0) {
                this.f30856n.a();
                return;
            }
            Vx vx = new Vx(this);
            ZD zd = this.f30861y;
            zd.c(new MD(0, zd, vx), this.f30860x);
            this.f30862z = this.f30859w.schedule(new RunnableC3376ij(3, this), i4, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4024ul
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3271gl
    public final synchronized void o() {
        if (this.f30858v.f28147e == 4) {
            this.f30856n.a();
            return;
        }
        ZD zd = this.f30861y;
        if (zd.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f30862z;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zd.d(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3271gl
    public final void t() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void x() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void i(BinderC2772Se binderC2772Se, String str, String str2) {
    }
}
