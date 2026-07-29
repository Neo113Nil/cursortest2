package com.aiming.mdt.interstitial;

import com.aiming.mdt.core.AdListener;

/* loaded from: classes.dex */
public interface InterstitialAdListener extends AdListener {
    void onAdClicked();

    void onAdClosed();

    void onAdReady();
}
