package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public final class r2 implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2 f7515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2 f7517c;

    public r2(w2 w2Var, v2 v2Var, boolean z) {
        this.f7517c = w2Var;
        this.f7515a = v2Var;
        this.f7516b = z;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        w2 w2Var = this.f7517c;
        w2Var.o = null;
        w2Var.a(null, this.f7516b);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        a0.b(this.f7517c.f7791a, this.f7515a, ad, true);
    }
}
