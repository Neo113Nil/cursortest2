package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y6;

/* loaded from: classes.dex */
public final class i implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f6427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f6428b;

    public i(StartAppAd startAppAd, AdEventListener adEventListener) {
        this.f6428b = startAppAd;
        this.f6427a = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ((y6) ((x6) this.f6428b.eventTracer.a())).c(this.f6428b, fi.f6935g);
        ((y6) ((x6) this.f6428b.eventTracer.a())).b(this.f6428b, fi.f6929a);
        StartAppAd startAppAd = this.f6428b;
        a0.a(startAppAd.context, this.f6427a, startAppAd, false);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        ((y6) ((x6) this.f6428b.eventTracer.a())).c(this.f6428b, fi.f6934f);
        ((y6) ((x6) this.f6428b.eventTracer.a())).b(this.f6428b, fi.f6929a);
        StartAppAd startAppAd = this.f6428b;
        a0.b(startAppAd.context, this.f6427a, startAppAd, false);
    }
}
