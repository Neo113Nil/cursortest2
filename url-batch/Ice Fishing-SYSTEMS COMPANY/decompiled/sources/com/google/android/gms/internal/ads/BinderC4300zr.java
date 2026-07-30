package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import q2.InterfaceC4873A;
import q2.InterfaceC4878a0;
import q2.InterfaceC4911r0;
import q2.InterfaceC4916u;
import q2.InterfaceC4921w0;
import q2.InterfaceC4922x;

/* renamed from: com.google.android.gms.internal.ads.zr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4300zr extends q2.J {

    /* renamed from: n, reason: collision with root package name */
    public final Context f35622n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4922x f35623u;

    /* renamed from: v, reason: collision with root package name */
    public final C3226fu f35624v;

    /* renamed from: w, reason: collision with root package name */
    public final C3429jj f35625w;

    /* renamed from: x, reason: collision with root package name */
    public final FrameLayout f35626x;

    /* renamed from: y, reason: collision with root package name */
    public final C3165eo f35627y;

    public BinderC4300zr(Context context, InterfaceC4922x interfaceC4922x, C3226fu c3226fu, C3429jj c3429jj, C3165eo c3165eo) {
        this.f35622n = context;
        this.f35623u = interfaceC4922x;
        this.f35624v = c3226fu;
        this.f35625w = c3429jj;
        this.f35627y = c3165eo;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        t2.G g9 = p2.j.f39798C.f39803c;
        frameLayout.addView(c3429jj.f32158m, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(p().f40058v);
        frameLayout.setMinimumWidth(p().f40061y);
        this.f35626x = frameLayout;
    }

    @Override // q2.K
    public final q2.A0 B() {
        C3429jj c3429jj = this.f35625w;
        c3429jj.getClass();
        try {
            return c3429jj.f32161p.a();
        } catch (C3334hu unused) {
            return null;
        }
    }

    @Override // q2.K
    public final void D1(q2.g1 g1Var) {
        FrameLayout frameLayout;
        InterfaceC3858rh interfaceC3858rh;
        O2.w.d("setAdSize must be called on the main UI thread.");
        C3429jj c3429jj = this.f35625w;
        if (c3429jj == null || (frameLayout = this.f35626x) == null || (interfaceC3858rh = c3429jj.f32159n) == null) {
            return;
        }
        interfaceC3858rh.J0(W2.b.a(g1Var));
        frameLayout.setMinimumHeight(g1Var.f40058v);
        frameLayout.setMinimumWidth(g1Var.f40061y);
        c3429jj.f32166u = g1Var;
    }

    @Override // q2.K
    public final void D2(q2.Y y6) {
        int i = t2.C.f40822b;
        u2.i.e("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final boolean H() {
        return false;
    }

    @Override // q2.K
    public final void I1(C3744pa c3744pa) {
        int i = t2.C.f40822b;
        u2.i.e("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final void I2(String str) {
    }

    @Override // q2.K
    public final boolean L() {
        C3429jj c3429jj = this.f35625w;
        return c3429jj != null && c3429jj.f24804b.f28170q0;
    }

    @Override // q2.K
    public final InterfaceC4921w0 M() {
        return this.f35625w.f24808f;
    }

    @Override // q2.K
    public final void P0(long j9) {
        C3270gk c3270gk = this.f35625w.f24811j;
        if (c3270gk != null) {
            c3270gk.a(j9);
        }
    }

    @Override // q2.K
    public final void Q0(boolean z8) {
    }

    @Override // q2.K
    public final void W1(M8 m8) {
    }

    @Override // q2.K
    public final InterfaceC4922x X() {
        return this.f35623u;
    }

    @Override // q2.K
    public final void X2(InterfaceC4916u interfaceC4916u) {
        int i = t2.C.f40822b;
        u2.i.e("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final long Z() {
        C3270gk c3270gk;
        C3429jj c3429jj = this.f35625w;
        if (c3429jj == null || (c3270gk = c3429jj.f24811j) == null) {
            return 0L;
        }
        return c3270gk.f31098a.get();
    }

    @Override // q2.K
    public final V2.a d() {
        return new V2.b(this.f35626x);
    }

    @Override // q2.K
    public final void e() {
        O2.w.d("destroy must be called on the main UI thread.");
        C2540Ek c2540Ek = this.f35625w.f24805c;
        c2540Ek.getClass();
        c2540Ek.u1(new C2602Ie(null, 1));
    }

    @Override // q2.K
    public final void f() {
        O2.w.d("destroy must be called on the main UI thread.");
        C2540Ek c2540Ek = this.f35625w.f24805c;
        c2540Ek.getClass();
        c2540Ek.u1(new C3314ha(null, 1));
    }

    @Override // q2.K
    public final boolean f0(q2.d1 d1Var) {
        int i = t2.C.f40822b;
        u2.i.e("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // q2.K
    public final Bundle j() {
        int i = t2.C.f40822b;
        u2.i.e("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // q2.K
    public final void k() {
    }

    @Override // q2.K
    public final void m() {
        C2541El c2541El = this.f35625w.f32163r;
        synchronized (c2541El) {
            c2541El.u1(C3431jl.f32172F);
        }
    }

    @Override // q2.K
    public final boolean o() {
        return false;
    }

    @Override // q2.K
    public final q2.g1 p() {
        O2.w.d("getAdSize must be called on the main UI thread.");
        return AbstractC3035cL.i(this.f35622n, Collections.singletonList(this.f35625w.c()));
    }

    @Override // q2.K
    public final void p3(InterfaceC4911r0 interfaceC4911r0) {
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Yc)).booleanValue()) {
            int i = t2.C.f40822b;
            u2.i.e("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        Fr fr = this.f35624v.f30900c;
        if (fr != null) {
            try {
                if (!interfaceC4911r0.f()) {
                    this.f35627y.b();
                }
            } catch (RemoteException e6) {
                int i4 = t2.C.f40822b;
                u2.i.b("Error in making CSI ping for reporting paid event callback", e6);
            }
            fr.f25039v.set(interfaceC4911r0);
        }
    }

    @Override // q2.K
    public final void r0(InterfaceC4922x interfaceC4922x) {
        int i = t2.C.f40822b;
        u2.i.e("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final void s1() {
        int i = t2.C.f40822b;
        u2.i.e("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final String t() {
        BinderC3754pk binderC3754pk = this.f35625w.f24808f;
        if (binderC3754pk != null) {
            return binderC3754pk.f33484n;
        }
        return null;
    }

    @Override // q2.K
    public final String u() {
        return this.f35624v.f30904g;
    }

    @Override // q2.K
    public final void u2(boolean z8) {
        int i = t2.C.f40822b;
        u2.i.e("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final q2.V v() {
        return this.f35624v.f30911o;
    }

    @Override // q2.K
    public final String w() {
        BinderC3754pk binderC3754pk = this.f35625w.f24808f;
        if (binderC3754pk != null) {
            return binderC3754pk.f33484n;
        }
        return null;
    }

    @Override // q2.K
    public final void w1(q2.V v6) {
        Fr fr = this.f35624v.f30900c;
        if (fr != null) {
            fr.o(v6);
        }
    }

    @Override // q2.K
    public final void x() {
        O2.w.d("destroy must be called on the main UI thread.");
        C2540Ek c2540Ek = this.f35625w.f24805c;
        c2540Ek.getClass();
        c2540Ek.u1(new C3042ca(null, false));
    }

    @Override // q2.K
    public final void x0(q2.a1 a1Var) {
        int i = t2.C.f40822b;
        u2.i.e("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
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
