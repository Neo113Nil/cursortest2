package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.MaxInterstitialImpl;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class MaxInterstitialAd {

    /* renamed from: a, reason: collision with root package name */
    private final MaxInterstitialImpl f3391a;

    public MaxInterstitialAd(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Activity activity) {
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f3391a = new MaxInterstitialImpl(str, appLovinSdk, activity);
    }

    public void destroy() {
        this.f3391a.destroy();
    }

    public boolean isReady() {
        return this.f3391a.isReady();
    }

    public void loadAd() {
        this.f3391a.loadAd();
    }

    public void setExtraParameter(String str, String str2) {
        this.f3391a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f3391a.setListener(maxAdListener);
    }

    public void showAd() {
        this.f3391a.showAd();
    }
}
