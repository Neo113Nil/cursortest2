package com.applovin.sdk;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.e.l;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3400a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3401b;

    /* renamed from: c, reason: collision with root package name */
    private long f3402c;

    /* renamed from: d, reason: collision with root package name */
    private String f3403d;
    private String e;
    private boolean f;
    private final Map<String, Object> localSettings;

    public AppLovinSdkSettings() {
        this(null);
    }

    public AppLovinSdkSettings(Context context) {
        this.localSettings = new HashMap();
        this.f3401b = l.c(context);
        this.f3400a = l.b(context);
        this.f3402c = -1L;
        this.f3403d = AppLovinAdSize.INTERSTITIAL.getLabel() + "," + AppLovinAdSize.BANNER.getLabel() + "," + AppLovinAdSize.MREC.getLabel();
        this.e = AppLovinAdType.INCENTIVIZED.getLabel() + "," + AppLovinAdType.REGULAR.getLabel() + "," + AppLovinAdType.NATIVE.getLabel();
    }

    @Deprecated
    public String getAutoPreloadSizes() {
        return this.f3403d;
    }

    @Deprecated
    public String getAutoPreloadTypes() {
        return this.e;
    }

    public long getBannerAdRefreshSeconds() {
        return this.f3402c;
    }

    public boolean isMuted() {
        return this.f;
    }

    public boolean isTestAdsEnabled() {
        return this.f3400a;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f3401b;
    }

    @Deprecated
    public void setAutoPreloadSizes(String str) {
        this.f3403d = str;
    }

    @Deprecated
    public void setAutoPreloadTypes(String str) {
        this.e = str;
    }

    public void setBannerAdRefreshSeconds(long j) {
        this.f3402c = j;
    }

    public void setMuted(boolean z) {
        this.f = z;
    }

    public void setTestAdsEnabled(boolean z) {
        this.f3400a = z;
    }

    public void setVerboseLogging(boolean z) {
        if (l.a()) {
            Log.e("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already or AppLovinSdkSettings was initialized without a context.");
        } else {
            this.f3401b = z;
        }
    }
}
