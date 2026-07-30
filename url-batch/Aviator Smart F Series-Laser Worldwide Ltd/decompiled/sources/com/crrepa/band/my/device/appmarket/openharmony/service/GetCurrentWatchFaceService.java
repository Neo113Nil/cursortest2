package com.crrepa.band.my.device.appmarket.openharmony.service;

import android.util.Log;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.WatchFaceInfo;
import com.crrepa.band.my.device.appmarket.openharmony.service.GetCurrentWatchFaceService;
import com.google.gson.JsonObject;

/* loaded from: classes2.dex */
public class GetCurrentWatchFaceService {
    private static final String TAG = "tagWatchConnectApp";

    public interface GetCurrentWatchFaceCallback {
        void onGetCurrentWatchFaceResult(WatchFaceInfo watchFaceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCurrentWatchFace$0(GetCurrentWatchFaceCallback getCurrentWatchFaceCallback) {
        WatchFaceInfo watchFaceInfo = new WatchFaceInfo("xxx-yyy-zzz", "xxx", true, true, "3.2", "1.1");
        if (getCurrentWatchFaceCallback != null) {
            getCurrentWatchFaceCallback.onGetCurrentWatchFaceResult(watchFaceInfo);
        }
    }

    public void getCurrentWatchFace(JsonObject jsonObject, final GetCurrentWatchFaceCallback getCurrentWatchFaceCallback) {
        Log.i(TAG, "GetCurrentWatchFaceService::getCurrentWatchFace in");
        new Thread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.b
            @Override // java.lang.Runnable
            public final void run() {
                GetCurrentWatchFaceService.lambda$getCurrentWatchFace$0(GetCurrentWatchFaceService.GetCurrentWatchFaceCallback.this);
            }
        }).start();
        Log.i(TAG, "GetCurrentWatchFaceService::getCurrentWatchFace out");
    }
}
