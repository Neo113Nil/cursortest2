package com.crrepa.band.my.device.appmarket.openharmony.service;

import android.util.Log;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.WatchSystemInfo;
import com.crrepa.band.my.device.appmarket.openharmony.service.GetWatchSystemInfoService;
import com.google.gson.JsonObject;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class GetWatchSystemInfoService {
    private static final String TAG = "tagWatchConnectApp";

    public interface UninstallWatchFaceCallback {
        void onGetWatchSystemInfoResult(WatchSystemInfo watchSystemInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getWatchSystemInfo$0(UninstallWatchFaceCallback uninstallWatchFaceCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("2.0");
        arrayList.add("3.0");
        uninstallWatchFaceCallback.onGetWatchSystemInfoResult(new WatchSystemInfo("hisi", "3321", "openharmony", "5.0.1", "13", arrayList, "466*466"));
    }

    public void getWatchSystemInfo(JsonObject jsonObject, final UninstallWatchFaceCallback uninstallWatchFaceCallback) {
        Log.i(TAG, "GetWatchSystemInfoService::getWatchSystemInfo in");
        new Thread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.f
            @Override // java.lang.Runnable
            public final void run() {
                GetWatchSystemInfoService.lambda$getWatchSystemInfo$0(GetWatchSystemInfoService.UninstallWatchFaceCallback.this);
            }
        }).start();
        Log.i(TAG, "GetWatchSystemInfoService::getWatchSystemInfo out");
    }
}
