package com.ironsource.b.f;

import android.app.Activity;
import org.json.JSONObject;

/* compiled from: InterstitialAdapterApi.java */
/* loaded from: classes2.dex */
public interface i {
    void initInterstitial(Activity activity, String str, String str2, JSONObject jSONObject, l lVar);

    boolean isInterstitialReady(JSONObject jSONObject);

    void loadInterstitial(JSONObject jSONObject, l lVar);

    void showInterstitial(JSONObject jSONObject, l lVar);
}
