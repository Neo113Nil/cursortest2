package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* loaded from: classes.dex */
public final class mb2 extends mx {

    /* renamed from: f, reason: collision with root package name */
    private final Context f8481f;

    /* renamed from: g, reason: collision with root package name */
    private final zw f8482g;

    /* renamed from: h, reason: collision with root package name */
    private final ks2 f8483h;

    /* renamed from: i, reason: collision with root package name */
    private final t41 f8484i;

    /* renamed from: j, reason: collision with root package name */
    private final ViewGroup f8485j;

    public mb2(Context context, zw zwVar, ks2 ks2Var, t41 t41Var) {
        this.f8481f = context;
        this.f8482g = zwVar;
        this.f8483h = ks2Var;
        this.f8484i = t41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        frameLayout.addView(t41Var.i(), y2.t.r().j());
        frameLayout.setMinimumHeight(e().f10378h);
        frameLayout.setMinimumWidth(e().f10381k);
        this.f8485j = frameLayout;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final boolean B4() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void D2(by byVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void E4(yx yxVar) {
        io0.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final boolean F4(kv kvVar) {
        io0.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void G() {
        this.f8484i.m();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void H() {
        r3.o.e("destroy must be called on the main UI thread.");
        this.f8484i.d().Z0(null);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final boolean K0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void K3(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void L2(sj0 sj0Var) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void L4(vv vvVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void M3(ux uxVar) {
        lc2 lc2Var = this.f8483h.f7617c;
        if (lc2Var != null) {
            lc2Var.C(uxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void N() {
        r3.o.e("destroy must be called on the main UI thread.");
        this.f8484i.a();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void O1(mh0 mh0Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void R3(pv pvVar) {
        r3.o.e("setAdSize must be called on the main UI thread.");
        t41 t41Var = this.f8484i;
        if (t41Var != null) {
            t41Var.n(this.f8485j, pvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void V() {
        r3.o.e("destroy must be called on the main UI thread.");
        this.f8484i.d().U0(null);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void b1(ww wwVar) {
        io0.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void b6(boolean z6) {
        io0.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void c5(x3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void c6(s00 s00Var) {
        io0.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final pv e() {
        r3.o.e("getAdSize must be called on the main UI thread.");
        return os2.a(this.f8481f, Collections.singletonList(this.f8484i.k()));
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final Bundle g() {
        io0.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final zw h() {
        return this.f8482g;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final ux i() {
        return this.f8483h.f7628n;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final zy j() {
        return this.f8484i.c();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void j4(String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final cz k() {
        return this.f8484i.j();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void l1(String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final x3.a m() {
        return x3.b.B3(this.f8485j);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final String p() {
        if (this.f8484i.c() != null) {
            return this.f8484i.c().b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final String q() {
        if (this.f8484i.c() != null) {
            return this.f8484i.c().b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void q5(wp wpVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r2(kv kvVar, dx dxVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r4(i20 i20Var) {
        io0.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r5(wy wyVar) {
        io0.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final String t() {
        return this.f8483h.f7620f;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void v0() {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void v3(zw zwVar) {
        io0.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void x4(hz hzVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void x5(jh0 jh0Var) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void z5(rx rxVar) {
        io0.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }
}
