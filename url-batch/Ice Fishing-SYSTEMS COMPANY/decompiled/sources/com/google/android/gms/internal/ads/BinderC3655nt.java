package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.InterfaceC4873A;
import q2.InterfaceC4878a0;
import q2.InterfaceC4911r0;
import q2.InterfaceC4916u;
import q2.InterfaceC4921w0;
import q2.InterfaceC4922x;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.nt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3655nt extends q2.J implements s2.l, F8 {

    /* renamed from: A, reason: collision with root package name */
    public final C3165eo f33053A;

    /* renamed from: C, reason: collision with root package name */
    public C3106dj f33055C;

    /* renamed from: D, reason: collision with root package name */
    public C3215fj f33056D;

    /* renamed from: n, reason: collision with root package name */
    public final C3214fi f33057n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f33058u;

    /* renamed from: w, reason: collision with root package name */
    public final String f33060w;

    /* renamed from: x, reason: collision with root package name */
    public final C3493kt f33061x;

    /* renamed from: y, reason: collision with root package name */
    public final C3439jt f33062y;

    /* renamed from: z, reason: collision with root package name */
    public final C5107a f33063z;

    /* renamed from: v, reason: collision with root package name */
    public AtomicBoolean f33059v = new AtomicBoolean();

    /* renamed from: B, reason: collision with root package name */
    public long f33054B = -1;

    public BinderC3655nt(C3214fi c3214fi, Context context, String str, C3493kt c3493kt, C3439jt c3439jt, C5107a c5107a, C3165eo c3165eo) {
        this.f33057n = c3214fi;
        this.f33058u = context;
        this.f33060w = str;
        this.f33061x = c3493kt;
        this.f33062y = c3439jt;
        this.f33063z = c5107a;
        this.f33053A = c3165eo;
        c3439jt.f32216y.set(this);
    }

    @Override // q2.K
    public final synchronized q2.A0 B() {
        return null;
    }

    @Override // s2.l
    public final void D0() {
    }

    @Override // q2.K
    public final synchronized void D1(q2.g1 g1Var) {
        O2.w.d("setAdSize must be called on the main UI thread.");
    }

    @Override // q2.K
    public final synchronized void D2(q2.Y y6) {
    }

    @Override // s2.l
    public final void G2() {
    }

    public final synchronized void G3(int i) {
        try {
            if (this.f33059v.compareAndSet(false, true)) {
                this.f33062y.d();
                C3106dj c3106dj = this.f33055C;
                if (c3106dj != null) {
                    p2.j.f39798C.f39807g.k(c3106dj);
                }
                if (this.f33056D != null) {
                    long j9 = -1;
                    if (this.f33054B != -1) {
                        p2.j.f39798C.f39810k.getClass();
                        j9 = SystemClock.elapsedRealtime() - this.f33054B;
                    }
                    this.f33056D.e(i, j9);
                }
                x();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final synchronized boolean H() {
        boolean z8;
        J3.a aVar = this.f33061x.f32484j;
        if (aVar != null) {
            z8 = aVar.isDone() ? false : true;
        }
        return z8;
    }

    @Override // q2.K
    public final synchronized void I1(C3744pa c3744pa) {
    }

    @Override // q2.K
    public final void I2(String str) {
    }

    @Override // s2.l
    public final void K1() {
    }

    @Override // s2.l
    public final synchronized void K2() {
        C3215fj c3215fj = this.f33056D;
        if (c3215fj != null) {
            p2.j.f39798C.f39810k.getClass();
            c3215fj.e(1, SystemClock.elapsedRealtime() - this.f33054B);
        }
    }

    @Override // q2.K
    public final synchronized boolean L() {
        return false;
    }

    @Override // q2.K
    public final synchronized InterfaceC4921w0 M() {
        return null;
    }

    @Override // q2.K
    public final void P0(long j9) {
    }

    @Override // q2.K
    public final void Q0(boolean z8) {
    }

    @Override // s2.l
    public final void R0(int i) {
        if (i == 0) {
            throw null;
        }
        int i4 = i - 1;
        if (i4 == 0) {
            G3(2);
            return;
        }
        if (i4 == 1) {
            G3(4);
        } else if (i4 != 2) {
            G3(6);
        } else {
            G3(3);
        }
    }

    @Override // q2.K
    public final void W1(M8 m8) {
        this.f33062y.f32212u.set(m8);
    }

    @Override // q2.K
    public final InterfaceC4922x X() {
        return null;
    }

    @Override // s2.l
    public final void Y1() {
    }

    @Override // q2.K
    public final long Z() {
        return 0L;
    }

    @Override // q2.K
    public final V2.a d() {
        return null;
    }

    @Override // q2.K
    public final synchronized void e() {
        O2.w.d("resume must be called on the main UI thread.");
    }

    @Override // q2.K
    public final synchronized void f() {
        O2.w.d("pause must be called on the main UI thread.");
    }

    @Override // q2.K
    public final synchronized boolean f0(q2.d1 d1Var) {
        boolean z8;
        try {
            if (!d1Var.b()) {
                if (((Boolean) AbstractC2598Ia.f25569d.r()).booleanValue()) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                        z8 = true;
                        if (this.f33063z.f41219v >= ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Dc)).intValue() || !z8) {
                            O2.w.d("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z8 = false;
                if (this.f33063z.f41219v >= ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Dc)).intValue()) {
                }
                O2.w.d("loadAd must be called on the main UI thread.");
            }
            t2.G g9 = p2.j.f39798C.f39803c;
            if (t2.G.h(this.f33058u) && d1Var.f40018L == null) {
                int i = t2.C.f40822b;
                u2.i.c("Failed to load the ad because app ID is missing.");
                this.f33062y.v(AbstractC3217fl.M(4, null, null));
                return false;
            }
            if (H()) {
                return false;
            }
            this.f33059v = new AtomicBoolean();
            return this.f33061x.a(d1Var, this.f33060w, new C3547lt(22), new C3562m7(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.l
    public final void f1() {
    }

    @Override // s2.l
    public final synchronized void g() {
        if (this.f33056D != null) {
            p2.j jVar = p2.j.f39798C;
            jVar.f39810k.getClass();
            this.f33054B = SystemClock.elapsedRealtime();
            int i = this.f33056D.f30844m;
            if (i > 0) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f33057n.f30799d.d();
                S2.a aVar = jVar.f39810k;
                C3106dj c3106dj = new C3106dj(scheduledExecutorService, aVar);
                this.f33055C = c3106dj;
                RunnableC3601mt runnableC3601mt = new RunnableC3601mt(this, 0);
                synchronized (c3106dj) {
                    c3106dj.f30187y = runnableC3601mt;
                    aVar.getClass();
                    long j9 = i;
                    c3106dj.f30185w = SystemClock.elapsedRealtime() + j9;
                    c3106dj.f30184v = scheduledExecutorService.schedule(runnableC3601mt, j9, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // q2.K
    public final Bundle j() {
        return new Bundle();
    }

    @Override // q2.K
    public final synchronized void k() {
    }

    @Override // q2.K
    public final synchronized void m() {
    }

    @Override // q2.K
    public final boolean o() {
        return false;
    }

    @Override // s2.l
    public final void o1() {
    }

    @Override // q2.K
    public final synchronized q2.g1 p() {
        return null;
    }

    @Override // q2.K
    public final synchronized String t() {
        return null;
    }

    @Override // q2.K
    public final void t2(q2.j1 j1Var) {
        this.f33061x.i.i = j1Var;
    }

    @Override // q2.K
    public final synchronized String u() {
        return this.f33060w;
    }

    @Override // s2.l
    public final void u0() {
    }

    @Override // q2.K
    public final synchronized void u2(boolean z8) {
    }

    @Override // q2.K
    public final q2.V v() {
        return null;
    }

    @Override // q2.K
    public final synchronized String w() {
        return null;
    }

    @Override // q2.K
    public final synchronized void x() {
        O2.w.d("destroy must be called on the main UI thread.");
        C3215fj c3215fj = this.f33056D;
        if (c3215fj != null) {
            c3215fj.d();
        }
    }

    @Override // q2.K
    public final synchronized void x0(q2.a1 a1Var) {
    }

    @Override // s2.l
    public final void y1() {
    }

    @Override // q2.K
    public final void K() {
    }

    @Override // q2.K
    public final void b0() {
    }

    @Override // q2.K
    public final void n() {
    }

    @Override // q2.K
    public final void r() {
    }

    @Override // q2.K
    public final void s1() {
    }

    @Override // q2.K
    public final void B0(InterfaceC4878a0 interfaceC4878a0) {
    }

    @Override // q2.K
    public final void T2(V2.a aVar) {
    }

    @Override // q2.K
    public final void X2(InterfaceC4916u interfaceC4916u) {
    }

    @Override // q2.K
    public final void p3(InterfaceC4911r0 interfaceC4911r0) {
    }

    @Override // q2.K
    public final void r0(InterfaceC4922x interfaceC4922x) {
    }

    @Override // q2.K
    public final void w1(q2.V v6) {
    }

    @Override // q2.K
    public final void x1(C2823Ve c2823Ve) {
    }

    @Override // q2.K
    public final void C2(q2.d1 d1Var, InterfaceC4873A interfaceC4873A) {
    }
}
