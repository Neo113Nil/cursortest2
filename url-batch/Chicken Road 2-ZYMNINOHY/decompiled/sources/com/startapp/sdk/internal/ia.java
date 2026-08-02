package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public final class ia implements AdEventListener {
    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        com.startapp.sdk.adsbase.e eVar = ja.f7141a;
        if (eVar.f6417e.showAd()) {
            eVar.f6415c = System.currentTimeMillis();
            eVar.f6416d = 0;
        }
    }
}
