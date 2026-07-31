package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class p9 implements AdEventListener {
    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        com.startapp.sdk.adsbase.e eVar = q9.f389a;
        if (eVar.e.showAd()) {
            eVar.c = System.currentTimeMillis();
            eVar.d = 0;
        }
    }
}
