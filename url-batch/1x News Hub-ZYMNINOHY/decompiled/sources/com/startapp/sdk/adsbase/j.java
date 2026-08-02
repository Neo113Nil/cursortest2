package com.startapp.sdk.adsbase;

import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class j implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f3339b;

    public j(StartAppAd startAppAd, i iVar) {
        this.f3339b = startAppAd;
        this.f3338a = iVar;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ExternalConfig u3 = MetaData.E().u();
        if (u3 == null || !u3.getLoadInnerAdIfNoExternal()) {
            this.f3338a.onFailedToReceiveAd(this.f3339b);
        } else {
            StartAppAd.a(this.f3339b, this.f3338a);
        }
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f3338a.onReceiveAd(ad);
    }
}
