package com.yandex.mobile.ads.unity.wrapper.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoader;

/* loaded from: classes3.dex */
public abstract class c {
    static InterstitialAdLoader a(Context context, InterstitialAdLoadListener interstitialAdLoadListener) {
        InterstitialAdLoader interstitialAdLoader = new InterstitialAdLoader(context);
        interstitialAdLoader.setAdLoadListener(interstitialAdLoadListener);
        return interstitialAdLoader;
    }
}
