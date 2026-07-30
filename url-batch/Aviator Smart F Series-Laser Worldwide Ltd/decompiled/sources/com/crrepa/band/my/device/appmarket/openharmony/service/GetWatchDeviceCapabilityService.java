package com.crrepa.band.my.device.appmarket.openharmony.service;

import android.util.Log;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.WatchDeviceCapability;
import com.crrepa.band.my.device.appmarket.openharmony.service.GetWatchDeviceCapabilityService;
import com.google.gson.JsonObject;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class GetWatchDeviceCapabilityService {
    private static final String TAG = "tagWatchConnectApp";

    public interface GetDeviceWatchFaceCapabilityCallback {
        void onGetWatchDeviceCapabilityResult(WatchDeviceCapability watchDeviceCapability);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$GetWatchDeviceCapability$0(GetDeviceWatchFaceCapabilityCallback getDeviceWatchFaceCapabilityCallback) {
        WatchDeviceCapability watchDeviceCapability = new WatchDeviceCapability();
        watchDeviceCapability.setAbilityKaleidoscope(1);
        watchDeviceCapability.setAbility3D(0);
        watchDeviceCapability.setAbilityVideo(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add("mjpeg");
        arrayList.add("h264");
        watchDeviceCapability.setVideoFormatList(arrayList);
        getDeviceWatchFaceCapabilityCallback.onGetWatchDeviceCapabilityResult(watchDeviceCapability);
    }

    public String GetWatchDeviceCapability(JsonObject jsonObject, final GetDeviceWatchFaceCapabilityCallback getDeviceWatchFaceCapabilityCallback) {
        Log.i(TAG, "GetWatchDeviceCapabilityService::GetWatchDeviceCapability in");
        new Thread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.d
            @Override // java.lang.Runnable
            public final void run() {
                GetWatchDeviceCapabilityService.lambda$GetWatchDeviceCapability$0(GetWatchDeviceCapabilityService.GetDeviceWatchFaceCapabilityCallback.this);
            }
        }).start();
        Log.i(TAG, "GetWatchDeviceCapabilityService::GetWatchDeviceCapability out");
        return "";
    }
}
