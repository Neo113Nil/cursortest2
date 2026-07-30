package com.facebook.gamingservices.cloudgaming;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class PlayableAdsLibrary {
    public static void markGameLoaded(Context context, JSONObject jSONObject, DaemonRequest.Callback callback) {
        DaemonRequest.executeAsync(context, jSONObject, callback, SDKMessageEnum.MARK_GAME_LOADED);
    }

    public static void openAppStore(Context context, JSONObject jSONObject, DaemonRequest.Callback callback) {
        DaemonRequest.executeAsync(context, jSONObject, callback, SDKMessageEnum.OPEN_APP_STORE);
    }
}
