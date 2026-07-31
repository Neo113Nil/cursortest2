package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class l2 implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p2 f312a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q2 c;

    public l2(q2 q2Var, p2 p2Var, boolean z) {
        this.c = q2Var;
        this.f312a = p2Var;
        this.b = z;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        q2 q2Var = this.c;
        q2Var.o = null;
        q2Var.a(null, this.b);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        a0.b(this.c.f385a, this.f312a, ad, true);
    }
}
