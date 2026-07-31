package com.startapp.sdk.adsbase.adlisteners;

import com.startapp.sdk.adsbase.Ad;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public interface AdEventListener {
    void onFailedToReceiveAd(Ad ad);

    void onReceiveAd(Ad ad);
}
