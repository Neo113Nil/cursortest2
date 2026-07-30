package com.crrepa.band.my.device.appmarket.openharmony.service;

import android.util.Log;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.WatchFaceInfo;
import com.google.gson.JsonObject;

/* loaded from: classes2.dex */
public class GetWatchFaceInfoService {
    private static final String TAG = "tagWatchConnectApp";

    public interface GetWatchFaceInfoCallback {
        void onGetWatchFaceInfoResult(WatchFaceInfo watchFaceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$GetWatchFaceInfo$0(JsonObject jsonObject, GetWatchFaceInfoCallback getWatchFaceInfoCallback) {
        getWatchFaceInfoCallback.onGetWatchFaceInfoResult(new WatchFaceInfo(jsonObject.get("uuid").getAsString(), jsonObject.get("name").getAsString(), false, false, "3.2", "1.1.0"));
    }

    public void GetWatchFaceInfo(final JsonObject jsonObject, final GetWatchFaceInfoCallback getWatchFaceInfoCallback) {
        Log.i(TAG, "GetWatchFaceInfoService::GetWatchFaceInfo in");
        new Thread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.e
            @Override // java.lang.Runnable
            public final void run() {
                GetWatchFaceInfoService.lambda$GetWatchFaceInfo$0(JsonObject.this, getWatchFaceInfoCallback);
            }
        }).start();
        Log.i(TAG, "GetWatchFaceInfoService::GetWatchFaceInfo out");
    }
}
