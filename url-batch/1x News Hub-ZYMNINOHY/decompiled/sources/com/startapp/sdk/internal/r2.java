package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public final class r2 implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2 f4378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2 f4380c;

    public r2(w2 w2Var, v2 v2Var, boolean z) {
        this.f4380c = w2Var;
        this.f4378a = v2Var;
        this.f4379b = z;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        w2 w2Var = this.f4380c;
        w2Var.o = null;
        w2Var.a(null, this.f4379b);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        a0.b(this.f4380c.f4646a, this.f4378a, ad, true);
    }
}
