package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.d7;

/* loaded from: classes.dex */
public final class k implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f6431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f6432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f6433c;

    public k(StartAppAd startAppAd, i iVar, AdPreferences adPreferences) {
        this.f6433c = startAppAd;
        this.f6431a = iVar;
        this.f6432b = adPreferences;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        StartAppAd.AdMode adMode;
        String adTag = this.f6432b.getAdTag();
        adMode = this.f6433c.f6321g;
        if (d7.a(true, adTag, false, adMode == StartAppAd.AdMode.REWARDED_VIDEO)) {
            this.f6433c.b(this.f6431a, 2);
        } else {
            this.f6431a.onFailedToReceiveAd(ad);
        }
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f6431a.onReceiveAd(ad);
    }
}
