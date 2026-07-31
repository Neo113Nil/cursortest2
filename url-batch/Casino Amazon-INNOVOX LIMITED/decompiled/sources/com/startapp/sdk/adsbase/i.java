package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.mh;
import com.startapp.sdk.internal.w6;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class i implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f144a;
    public final /* synthetic */ StartAppAd b;

    public i(StartAppAd startAppAd, AdEventListener adEventListener) {
        this.b = startAppAd;
        this.f144a = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ((w6) this.b.eventTracer.a()).c(this.b, mh.g);
        ((w6) this.b.eventTracer.a()).b(this.b, mh.f340a);
        StartAppAd startAppAd = this.b;
        a0.a(startAppAd.context, this.f144a, (Ad) startAppAd, false);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        ((w6) this.b.eventTracer.a()).c(this.b, mh.f);
        ((w6) this.b.eventTracer.a()).b(this.b, mh.f340a);
        StartAppAd startAppAd = this.b;
        a0.b(startAppAd.context, this.f144a, startAppAd, false);
    }
}
