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
        com.startapp.sdk.adsbase.e eVar = ja.f4014a;
        if (eVar.f3327e.showAd()) {
            eVar.f3325c = System.currentTimeMillis();
            eVar.f3326d = 0;
        }
    }
}
