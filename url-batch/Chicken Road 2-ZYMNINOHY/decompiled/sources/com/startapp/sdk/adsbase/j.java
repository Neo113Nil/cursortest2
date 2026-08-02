package com.startapp.sdk.adsbase;

import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class j implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f6429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f6430b;

    public j(StartAppAd startAppAd, i iVar) {
        this.f6430b = startAppAd;
        this.f6429a = iVar;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ExternalConfig u4 = MetaData.E().u();
        if (u4 == null || !u4.getLoadInnerAdIfNoExternal()) {
            this.f6429a.onFailedToReceiveAd(this.f6430b);
        } else {
            StartAppAd.a(this.f6430b, this.f6429a);
        }
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f6429a.onReceiveAd(ad);
    }
}
