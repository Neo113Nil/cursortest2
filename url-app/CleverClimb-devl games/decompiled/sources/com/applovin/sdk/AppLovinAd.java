package com.applovin.sdk;

/* loaded from: classes.dex */
public interface AppLovinAd {
    long getAdIdNumber();

    String getAdValue(String str);

    AppLovinAdSize getSize();

    AppLovinAdType getType();

    String getZoneId();

    boolean isVideoAd();
}
