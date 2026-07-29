package com.ironsource.b.f;

import android.app.Activity;
import org.json.JSONObject;

/* compiled from: RewardedVideoAdapterApi.java */
/* loaded from: classes2.dex */
public interface r {
    void fetchRewardedVideo(JSONObject jSONObject);

    void initRewardedVideo(Activity activity, String str, String str2, JSONObject jSONObject, u uVar);

    boolean isRewardedVideoAvailable(JSONObject jSONObject);

    void showRewardedVideo(JSONObject jSONObject, u uVar);
}
