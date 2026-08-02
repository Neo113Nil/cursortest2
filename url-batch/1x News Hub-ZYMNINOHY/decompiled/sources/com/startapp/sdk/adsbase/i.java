package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y6;

/* loaded from: classes.dex */
public final class i implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f3336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f3337b;

    public i(StartAppAd startAppAd, AdEventListener adEventListener) {
        this.f3337b = startAppAd;
        this.f3336a = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ((y6) ((x6) this.f3337b.eventTracer.a())).c(this.f3337b, fi.f3816g);
        ((y6) ((x6) this.f3337b.eventTracer.a())).b(this.f3337b, fi.f3811a);
        StartAppAd startAppAd = this.f3337b;
        a0.a(startAppAd.context, this.f3336a, startAppAd, false);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        ((y6) ((x6) this.f3337b.eventTracer.a())).c(this.f3337b, fi.f);
        ((y6) ((x6) this.f3337b.eventTracer.a())).b(this.f3337b, fi.f3811a);
        StartAppAd startAppAd = this.f3337b;
        a0.b(startAppAd.context, this.f3336a, startAppAd, false);
    }
}
