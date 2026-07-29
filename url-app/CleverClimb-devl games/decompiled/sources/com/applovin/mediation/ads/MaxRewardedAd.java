package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.MaxRewardedImpl;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxRewardedAd {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, MaxRewardedAd> f3392a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f3393b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final MaxRewardedImpl f3394c;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk) {
        this.f3394c = new MaxRewardedImpl(str, appLovinSdk);
    }

    public static MaxRewardedAd getInstance(String str, Activity activity) {
        return getInstance(str, AppLovinSdk.getInstance(activity), activity);
    }

    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Activity activity) {
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
        updateActivity(activity);
        synchronized (f3393b) {
            MaxRewardedAd maxRewardedAd = f3392a.get(str);
            if (maxRewardedAd != null) {
                return maxRewardedAd;
            }
            MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk);
            f3392a.put(str, maxRewardedAd2);
            return maxRewardedAd2;
        }
    }

    public static void updateActivity(Activity activity) {
        MaxRewardedImpl.updateActivity(activity);
    }

    public void destroy() {
        synchronized (f3393b) {
            f3392a.remove(this.f3394c.getAdUnitId());
        }
        this.f3394c.destroy();
    }

    public boolean isReady() {
        return this.f3394c.isReady();
    }

    public void loadAd() {
        this.f3394c.loadAd();
    }

    public void setExtrasParameter(String str, String str2) {
        this.f3394c.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f3394c.setListener(maxRewardedAdListener);
    }

    public void showAd() {
        this.f3394c.showAd();
    }
}
