package com.ironsource.sdk.e;

import org.json.JSONObject;

/* compiled from: OnRewardedVideoListener.java */
/* loaded from: classes2.dex */
public interface e extends a {
    void onRVAdClicked();

    void onRVAdClosed();

    void onRVAdCredited(int i);

    void onRVAdOpened();

    void onRVEventNotificationReceived(String str, JSONObject jSONObject);

    void onRVInitFail(String str);

    void onRVInitSuccess(com.ironsource.sdk.data.a aVar);

    void onRVNoMoreOffers();

    void onRVShowFail(String str);
}
