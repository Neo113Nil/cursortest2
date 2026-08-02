package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.d7;

/* loaded from: classes.dex */
public final class k implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f3341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f3342c;

    public k(StartAppAd startAppAd, i iVar, AdPreferences adPreferences) {
        this.f3342c = startAppAd;
        this.f3340a = iVar;
        this.f3341b = adPreferences;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        StartAppAd.AdMode adMode;
        String adTag = this.f3341b.getAdTag();
        adMode = this.f3342c.f3233g;
        if (d7.a(true, adTag, false, adMode == StartAppAd.AdMode.REWARDED_VIDEO)) {
            this.f3342c.b(this.f3340a, 2);
        } else {
            this.f3340a.onFailedToReceiveAd(ad);
        }
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f3340a.onReceiveAd(ad);
    }
}
