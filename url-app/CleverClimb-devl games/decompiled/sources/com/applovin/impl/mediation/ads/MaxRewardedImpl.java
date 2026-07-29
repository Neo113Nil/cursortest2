package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.util.Base64;
import com.applovin.impl.mediation.ads.a.b;
import com.applovin.impl.sdk.b.a;
import com.applovin.impl.sdk.e.g;
import com.applovin.impl.sdk.e.l;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MaxRewardedImpl extends b {

    /* renamed from: a, reason: collision with root package name */
    private static WeakReference<Activity> f2684a = new WeakReference<>(null);

    public MaxRewardedImpl(String str, AppLovinSdk appLovinSdk) {
        super(str, "MaxRewardedAd", l.a(appLovinSdk));
        this.logger.a(this.tag, "Created new MaxRewardedAd (" + this + ")");
    }

    public static void updateActivity(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        f2684a = new WeakReference<>(activity);
    }

    @Override // com.applovin.impl.mediation.ads.a.b
    protected Activity getActivity() {
        return f2684a.get();
    }

    public void loadAd() {
        try {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
            if (!isReady()) {
                final Activity activity = f2684a.get();
                if (activity != null) {
                    transitionToState(b.EnumC0302b.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxRewardedImpl.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MaxRewardedImpl.this.sdk.a(activity).loadAd(MaxRewardedImpl.this.adUnitId, MaxRewardedImpl.this.loadRequestBuilder.a(), activity, MaxRewardedImpl.this.listenerWrapper);
                        }
                    });
                    return;
                } else {
                    this.logger.e(this.tag, "Unable to load rewarded ad because Activity reference was null. Call MaxRewardedAd.updateActivity(...) before requesting more rewarded ads");
                    this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxErrorCodes.NO_ACTIVITY);
                    return;
                }
            }
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
            g.a(this.adListener, getLoadedAd(), this.sdk);
        } catch (Throwable th) {
            String encodeToString = Base64.encodeToString(th.toString().getBytes(Charset.defaultCharset()), 2);
            HashMap hashMap = new HashMap(1);
            hashMap.put(com.umeng.analytics.pro.b.ao, encodeToString);
            this.sdk.p().trackEvent("max_rewarded_load_exception", hashMap);
        }
    }

    public void showAd() {
        try {
            if (((Boolean) this.sdk.a(a.J)).booleanValue() && (this.sdk.R().a() || this.sdk.R().b())) {
                this.logger.e(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
                g.a(this.adListener, getLoadedAd(), -23, this.sdk);
                return;
            }
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'...");
            final Activity activity = f2684a.get();
            if (activity != null) {
                transitionToState(b.EnumC0302b.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxRewardedImpl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        MaxAd loadedAd = MaxRewardedImpl.this.getLoadedAd();
                        MaxRewardedImpl.this.logger.a(MaxRewardedImpl.this.tag, "Showing rewarded ad for '" + MaxRewardedImpl.this.adUnitId + "'; loaded ad: " + loadedAd + "...");
                        MaxRewardedImpl.this.sdk.a(activity).showFullscreenAd(loadedAd, activity);
                    }
                });
            } else {
                this.logger.e(this.tag, "Unable to show rewarded ad because Activity reference was null. Call MaxRewardedAd.updateActivity(...) before requesting more rewarded ads");
                this.listenerWrapper.onAdDisplayFailed(getLoadedAd(), MaxErrorCodes.NO_ACTIVITY);
            }
        } catch (Throwable th) {
            String encodeToString = Base64.encodeToString(th.toString().getBytes(Charset.defaultCharset()), 2);
            HashMap hashMap = new HashMap(1);
            hashMap.put(com.umeng.analytics.pro.b.ao, encodeToString);
            this.sdk.p().trackEvent("max_rewarded_show_exception", hashMap);
        }
    }
}
