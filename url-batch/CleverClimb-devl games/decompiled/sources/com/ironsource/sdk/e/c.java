package com.ironsource.sdk.e;

import org.json.JSONObject;

/* compiled from: OnInterstitialListener.java */
/* loaded from: classes2.dex */
public interface c extends a {
    void onInterstitialClick();

    void onInterstitialClose();

    void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject);

    void onInterstitialInitFailed(String str);

    void onInterstitialInitSuccess();

    void onInterstitialLoadFailed(String str);

    void onInterstitialLoadSuccess();

    void onInterstitialOpen();

    void onInterstitialShowFailed(String str);

    void onInterstitialShowSuccess();
}
