package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
import java.util.Collections;
import q2.InterfaceC4873A;
import q2.InterfaceC4878a0;
import q2.InterfaceC4911r0;
import q2.InterfaceC4916u;
import q2.InterfaceC4921w0;
import q2.InterfaceC4922x;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class Cr extends q2.J implements InterfaceC2812Uk {

    /* renamed from: A, reason: collision with root package name */
    public final C3165eo f24253A;

    /* renamed from: B, reason: collision with root package name */
    public C3429jj f24254B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f24255n;

    /* renamed from: u, reason: collision with root package name */
    public final C3763pt f24256u;

    /* renamed from: v, reason: collision with root package name */
    public final String f24257v;

    /* renamed from: w, reason: collision with root package name */
    public final Fr f24258w;

    /* renamed from: x, reason: collision with root package name */
    public q2.g1 f24259x;

    /* renamed from: y, reason: collision with root package name */
    public final C3171eu f24260y;

    /* renamed from: z, reason: collision with root package name */
    public final C5107a f24261z;

    public Cr(Context context, q2.g1 g1Var, String str, C3763pt c3763pt, Fr fr, C5107a c5107a, C3165eo c3165eo) {
        this.f24255n = context;
        this.f24256u = c3763pt;
        this.f24259x = g1Var;
        this.f24257v = str;
        this.f24258w = fr;
        this.f24260y = c3763pt.f33536k;
        this.f24261z = c5107a;
        this.f24253A = c3165eo;
        c3763pt.f33534h.s1(this, c3763pt.f33528b);
    }

    @Override // q2.K
    public final synchronized q2.A0 B() {
        O2.w.d("getVideoController must be called from the main thread.");
        C3429jj c3429jj = this.f24254B;
        q2.A0 a02 = null;
        if (c3429jj == null) {
            return null;
        }
        try {
            a02 = c3429jj.f32161p.a();
        } catch (C3334hu unused) {
        }
        return a02;
    }

    @Override // q2.K
    public final synchronized void D1(q2.g1 g1Var) {
        InterfaceC3858rh interfaceC3858rh;
        O2.w.d("setAdSize must be called on the main UI thread.");
        this.f24260y.f30531b = g1Var;
        this.f24259x = g1Var;
        C3429jj c3429jj = this.f24254B;
        if (c3429jj != null) {
            FrameLayout frameLayout = this.f24256u.f33532f;
            if (frameLayout != null && (interfaceC3858rh = c3429jj.f32159n) != null) {
                interfaceC3858rh.J0(W2.b.a(g1Var));
                frameLayout.setMinimumHeight(g1Var.f40058v);
                frameLayout.setMinimumWidth(g1Var.f40061y);
                c3429jj.f32166u = g1Var;
            }
        }
    }

    @Override // q2.K
    public final synchronized void D2(q2.Y y6) {
        O2.w.d("setCorrelationIdProvider must be called on the main UI thread");
        this.f24260y.f30552x = y6;
    }

    public final synchronized boolean G3(q2.d1 d1Var) {
        try {
            if (H3()) {
                O2.w.d("loadAd must be called on the main UI thread.");
            }
            t2.G g9 = p2.j.f39798C.f39803c;
            Context context = this.f24255n;
            if (!t2.G.h(context) || d1Var.f40018L != null) {
                AbstractC2655Lg.o(context, d1Var.f40034y);
                return this.f24256u.a(d1Var, this.f24257v, null, new Vx(this));
            }
            int i = t2.C.f40822b;
            u2.i.c("Failed to load the ad because app ID is missing.");
            Fr fr = this.f24258w;
            if (fr != null) {
                fr.v(AbstractC3217fl.M(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final synchronized boolean H() {
        return this.f24256u.b();
    }

    public final boolean H3() {
        boolean z8;
        if (((Boolean) AbstractC2598Ia.f25571f.r()).booleanValue()) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                z8 = true;
                return this.f24261z.f41219v >= ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Dc)).intValue() || !z8;
            }
        }
        z8 = false;
        if (this.f24261z.f41219v >= ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Dc)).intValue()) {
        }
    }

    @Override // q2.K
    public final synchronized void I1(C3744pa c3744pa) {
        O2.w.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f24256u.f33533g = c3744pa;
    }

    @Override // q2.K
    public final void I2(String str) {
    }

    @Override // q2.K
    public final synchronized boolean L() {
        C3429jj c3429jj = this.f24254B;
        if (c3429jj != null) {
            if (c3429jj.f24804b.f28170q0) {
                return true;
            }
        }
        return false;
    }

    @Override // q2.K
    public final synchronized InterfaceC4921w0 M() {
        C3429jj c3429jj;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31441F7)).booleanValue() && (c3429jj = this.f24254B) != null) {
            return c3429jj.f24808f;
        }
        return null;
    }

    @Override // q2.K
    public final synchronized void P0(long j9) {
        C3270gk c3270gk;
        this.f24260y.f30549u.set(j9);
        C3429jj c3429jj = this.f24254B;
        if (c3429jj == null || (c3270gk = c3429jj.f24811j) == null) {
            return;
        }
        c3270gk.a(j9);
    }

    @Override // q2.K
    public final void Q0(boolean z8) {
    }

    @Override // q2.K
    public final void W1(M8 m8) {
    }

    @Override // q2.K
    public final InterfaceC4922x X() {
        return this.f24258w.d();
    }

    @Override // q2.K
    public final void X2(InterfaceC4916u interfaceC4916u) {
        if (H3()) {
            O2.w.d("setAdListener must be called on the main UI thread.");
        }
        Hr hr = this.f24256u.f33531e;
        synchronized (hr) {
            hr.f25429n = interfaceC4916u;
        }
    }

    @Override // q2.K
    public final synchronized long Z() {
        C3270gk c3270gk;
        C3429jj c3429jj = this.f24254B;
        return (c3429jj == null || (c3270gk = c3429jj.f24811j) == null) ? this.f24260y.f30549u.get() : c3270gk.f31098a.get();
    }

    @Override // q2.K
    public final V2.a d() {
        if (H3()) {
            O2.w.d("getAdFrame must be called on the main UI thread.");
        }
        return new V2.b(this.f24256u.f33532f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // q2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e() {
        C3429jj c3429jj;
        try {
            if (((Boolean) AbstractC2598Ia.f25573h.r()).booleanValue()) {
                C3151ea c3151ea = AbstractC3368ia.yc;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    if (this.f24261z.f41219v < ((Integer) rVar.f40119c.a(AbstractC3368ia.Ec)).intValue()) {
                    }
                    c3429jj = this.f24254B;
                    if (c3429jj == null) {
                        C2540Ek c2540Ek = c3429jj.f24805c;
                        c2540Ek.getClass();
                        c2540Ek.u1(new C2602Ie(null, 1));
                        return;
                    }
                    return;
                }
            }
            O2.w.d("resume must be called on the main UI thread.");
            c3429jj = this.f24254B;
            if (c3429jj == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // q2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f() {
        C3429jj c3429jj;
        try {
            if (((Boolean) AbstractC2598Ia.f25572g.r()).booleanValue()) {
                C3151ea c3151ea = AbstractC3368ia.Ac;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    if (this.f24261z.f41219v < ((Integer) rVar.f40119c.a(AbstractC3368ia.Ec)).intValue()) {
                    }
                    c3429jj = this.f24254B;
                    if (c3429jj == null) {
                        C2540Ek c2540Ek = c3429jj.f24805c;
                        c2540Ek.getClass();
                        c2540Ek.u1(new C3314ha(null, 1));
                        return;
                    }
                    return;
                }
            }
            O2.w.d("pause must be called on the main UI thread.");
            c3429jj = this.f24254B;
            if (c3429jj == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final synchronized boolean f0(q2.d1 d1Var) {
        q2.g1 g1Var = this.f24259x;
        synchronized (this) {
            C3171eu c3171eu = this.f24260y;
            c3171eu.f30531b = g1Var;
            c3171eu.f30545q = this.f24259x.f40053G;
        }
        return G3(d1Var);
        return G3(d1Var);
    }

    @Override // q2.K
    public final Bundle j() {
        O2.w.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // q2.K
    public final void k() {
    }

    @Override // q2.K
    public final synchronized void m() {
        O2.w.d("recordManualImpression must be called on the main UI thread.");
        C3429jj c3429jj = this.f24254B;
        if (c3429jj != null) {
            C2541El c2541El = c3429jj.f32163r;
            synchronized (c2541El) {
                c2541El.u1(C3431jl.f32172F);
            }
        }
    }

    @Override // q2.K
    public final boolean o() {
        return false;
    }

    @Override // q2.K
    public final synchronized q2.g1 p() {
        O2.w.d("getAdSize must be called on the main UI thread.");
        C3429jj c3429jj = this.f24254B;
        if (c3429jj != null) {
            return AbstractC3035cL.i(this.f24255n, Collections.singletonList(c3429jj.c()));
        }
        return this.f24260y.f30531b;
    }

    @Override // q2.K
    public final void p3(InterfaceC4911r0 interfaceC4911r0) {
        if (H3()) {
            O2.w.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!interfaceC4911r0.f()) {
                this.f24253A.b();
            }
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.b("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f24258w.f25039v.set(interfaceC4911r0);
    }

    @Override // q2.K
    public final void r0(InterfaceC4922x interfaceC4922x) {
        if (H3()) {
            O2.w.d("setAdListener must be called on the main UI thread.");
        }
        this.f24258w.f25037n.set(interfaceC4922x);
    }

    @Override // q2.K
    public final void s1() {
        O2.w.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // q2.K
    public final synchronized String t() {
        BinderC3754pk binderC3754pk;
        C3429jj c3429jj = this.f24254B;
        if (c3429jj == null || (binderC3754pk = c3429jj.f24808f) == null) {
            return null;
        }
        return binderC3754pk.f33484n;
    }

    @Override // q2.K
    public final synchronized String u() {
        return this.f24257v;
    }

    @Override // q2.K
    public final synchronized void u2(boolean z8) {
        try {
            if (H3()) {
                O2.w.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f24260y.f30534e = z8;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final q2.V v() {
        q2.V v6;
        Fr fr = this.f24258w;
        synchronized (fr) {
            v6 = (q2.V) fr.f25038u.get();
        }
        return v6;
    }

    @Override // q2.K
    public final synchronized String w() {
        BinderC3754pk binderC3754pk;
        C3429jj c3429jj = this.f24254B;
        if (c3429jj == null || (binderC3754pk = c3429jj.f24808f) == null) {
            return null;
        }
        return binderC3754pk.f33484n;
    }

    @Override // q2.K
    public final void w1(q2.V v6) {
        if (H3()) {
            O2.w.d("setAppEventListener must be called on the main UI thread.");
        }
        this.f24258w.o(v6);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // q2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void x() {
        C3429jj c3429jj;
        try {
            if (((Boolean) AbstractC2598Ia.f25570e.r()).booleanValue()) {
                C3151ea c3151ea = AbstractC3368ia.zc;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    if (this.f24261z.f41219v < ((Integer) rVar.f40119c.a(AbstractC3368ia.Ec)).intValue()) {
                    }
                    c3429jj = this.f24254B;
                    if (c3429jj == null) {
                        C2540Ek c2540Ek = c3429jj.f24805c;
                        c2540Ek.getClass();
                        c2540Ek.u1(new C3042ca(null, false));
                        return;
                    }
                    return;
                }
            }
            O2.w.d("destroy must be called on the main UI thread.");
            c3429jj = this.f24254B;
            if (c3429jj == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final synchronized void x0(q2.a1 a1Var) {
        try {
            if (H3()) {
                O2.w.d("setVideoOptions must be called on the main UI thread.");
            }
            this.f24260y.f30533d = a1Var;
        } catch (Throwable th) {
            throw th;
        }
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
    public final void B0(InterfaceC4878a0 interfaceC4878a0) {
    }

    @Override // q2.K
    public final void T2(V2.a aVar) {
    }

    @Override // q2.K
    public final void t2(q2.j1 j1Var) {
    }

    @Override // q2.K
    public final void x1(C2823Ve c2823Ve) {
    }

    @Override // q2.K
    public final void C2(q2.d1 d1Var, InterfaceC4873A interfaceC4873A) {
    }
}
