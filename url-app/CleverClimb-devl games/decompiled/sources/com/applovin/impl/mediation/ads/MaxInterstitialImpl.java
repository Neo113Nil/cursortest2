package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.util.Base64;
import com.applovin.impl.mediation.ads.a.b;
import com.applovin.impl.sdk.b.a;
import com.applovin.impl.sdk.e.g;
import com.applovin.impl.sdk.e.l;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinSdk;
import java.nio.charset.Charset;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MaxInterstitialImpl extends b {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f2681a;

    public MaxInterstitialImpl(String str, AppLovinSdk appLovinSdk, Activity activity) {
        super(str, "MaxInterstitialAd", l.a(appLovinSdk));
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f2681a = activity;
        this.logger.a(this.tag, "Created new MaxInterstitialAd (" + this + ")");
    }

    @Override // com.applovin.impl.mediation.ads.a.b
    protected Activity getActivity() {
        return this.f2681a;
    }

    public void loadAd() {
        try {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
            if (!isReady()) {
                transitionToState(b.EnumC0302b.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxInterstitialImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MaxInterstitialImpl.this.sdk.a(MaxInterstitialImpl.this.f2681a).loadAd(MaxInterstitialImpl.this.adUnitId, MaxInterstitialImpl.this.loadRequestBuilder.a(), MaxInterstitialImpl.this.f2681a, MaxInterstitialImpl.this.listenerWrapper);
                    }
                });
                return;
            }
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
            g.a(this.adListener, getLoadedAd(), this.sdk);
        } catch (Throwable th) {
            String encodeToString = Base64.encodeToString(th.toString().getBytes(Charset.defaultCharset()), 2);
            HashMap hashMap = new HashMap(1);
            hashMap.put(com.umeng.analytics.pro.b.ao, encodeToString);
            this.sdk.p().trackEvent("max_inter_load_exception", hashMap);
        }
    }

    public void showAd() {
        try {
            if (!((Boolean) this.sdk.a(a.J)).booleanValue() || (!this.sdk.R().a() && !this.sdk.R().b())) {
                transitionToState(b.EnumC0302b.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxInterstitialImpl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        MaxAd loadedAd = MaxInterstitialImpl.this.getLoadedAd();
                        MaxInterstitialImpl.this.logger.a(MaxInterstitialImpl.this.tag, "Showing ad for '" + MaxInterstitialImpl.this.adUnitId + "'; loaded ad: " + loadedAd + "...");
                        MaxInterstitialImpl.this.sdk.a(MaxInterstitialImpl.this.f2681a).showFullscreenAd(loadedAd, MaxInterstitialImpl.this.f2681a);
                    }
                });
            } else {
                this.logger.e(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
                g.a(this.adListener, getLoadedAd(), -23, this.sdk);
            }
        } catch (Throwable th) {
            String encodeToString = Base64.encodeToString(th.toString().getBytes(Charset.defaultCharset()), 2);
            HashMap hashMap = new HashMap(1);
            hashMap.put(com.umeng.analytics.pro.b.ao, encodeToString);
            this.sdk.p().trackEvent("max_inter_show_exception", hashMap);
        }
    }
}
