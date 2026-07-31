package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes12.dex */
public interface InterstitialAdListener extends AdListener {
    void onInterstitialDismissed(Ad ad);

    void onInterstitialDisplayed(Ad ad);
}
