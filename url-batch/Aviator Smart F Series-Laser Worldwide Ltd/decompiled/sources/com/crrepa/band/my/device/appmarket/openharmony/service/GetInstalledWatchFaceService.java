package com.crrepa.band.my.device.appmarket.openharmony.service;

import android.util.Log;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.WatchFaceInfo;
import com.crrepa.band.my.device.appmarket.openharmony.service.GetInstalledWatchFaceService;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class GetInstalledWatchFaceService {
    private static final String TAG = "tagWatchConnectApp";

    public interface GetInstalledWatchFaceCallback {
        void onGetInstalledWatchFaceResult(List<WatchFaceInfo> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getInstalledWatchFace$0(GetInstalledWatchFaceCallback getInstalledWatchFaceCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WatchFaceInfo("200001", "xxx", true, false, "3.2", "1.1.0"));
        arrayList.add(new WatchFaceInfo("200002", "yyy", true, true, "3.2", "1.1.0"));
        arrayList.add(new WatchFaceInfo("200003", "aaa", true, false, "3.2", "1.1.0"));
        getInstalledWatchFaceCallback.onGetInstalledWatchFaceResult(arrayList);
    }

    public void getInstalledWatchFace(JsonObject jsonObject, final GetInstalledWatchFaceCallback getInstalledWatchFaceCallback) {
        Log.i(TAG, "GetInstalledWatchFaceService::getInstalledWatchFace in");
        new Thread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.c
            @Override // java.lang.Runnable
            public final void run() {
                GetInstalledWatchFaceService.lambda$getInstalledWatchFace$0(GetInstalledWatchFaceService.GetInstalledWatchFaceCallback.this);
            }
        }).start();
        Log.i(TAG, "GetInstalledWatchFaceService::getInstalledWatchFace out");
    }
}
