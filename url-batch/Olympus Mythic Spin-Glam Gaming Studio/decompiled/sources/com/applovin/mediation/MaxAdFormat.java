package com.applovin.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.o;
import com.applovin.impl.w3;
import com.applovin.sdk.AppLovinSdkUtils;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes5.dex */
public class MaxAdFormat {
    private final String a;
    private final String b;
    public static final MaxAdFormat BANNER = new MaxAdFormat("BANNER", "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat(BrandSafetyUtils.o, BrandSafetyUtils.o);
    public static final MaxAdFormat LEADER = new MaxAdFormat(BrandSafetyUtils.n, "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat(BrandSafetyUtils.j, "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat(BrandSafetyUtils.l, "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat(BrandSafetyUtils.k, "Rewarded");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", "Native");

    @Deprecated
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");

    private MaxAdFormat(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Nullable
    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase("native")) {
            return NATIVE;
        }
        if (str.equalsIgnoreCase("leaderboard") || str.equalsIgnoreCase("leader")) {
            return LEADER;
        }
        if (str.equalsIgnoreCase("interstitial") || str.equalsIgnoreCase("inter")) {
            return INTERSTITIAL;
        }
        if (str.equalsIgnoreCase("appopen") || str.equalsIgnoreCase("app_open")) {
            return APP_OPEN;
        }
        if (str.equalsIgnoreCase("rewarded") || str.equalsIgnoreCase("reward")) {
            return REWARDED;
        }
        o.h("AppLovinSdk", "Unknown ad format: " + str);
        return null;
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(Context context) {
        return getAdaptiveSize(-1, context);
    }

    @Deprecated
    public String getDisplayName() {
        return this.b;
    }

    public String getLabel() {
        return this.a;
    }

    public AppLovinSdkUtils.Size getSize() {
        return this == BANNER ? new AppLovinSdkUtils.Size(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50) : this == LEADER ? new AppLovinSdkUtils.Size(728, 90) : this == MREC ? new AppLovinSdkUtils.Size(300, POBCommonConstants.DEFAULT_MIN_BITRATE) : new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        return this == BANNER || this == MREC || this == LEADER;
    }

    public boolean isBannerOrLeaderAd() {
        return this == BANNER || this == LEADER;
    }

    public boolean isFullscreenAd() {
        return this == INTERSTITIAL || this == APP_OPEN || this == REWARDED;
    }

    public String toString() {
        return "MaxAdFormat{label='" + this.a + "'}";
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i, Context context) {
        return (this == BANNER || this == LEADER) ? w3.a(i, this, context) : getSize();
    }
}
