package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeBody;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.NativeCallJavascriptResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.WatchDeviceCapability;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.enm.CallNativeResponseCodeEnum;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.crrepa.band.my.device.appmarket.openharmony.service.GetWatchDeviceCapabilityService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.moyoung.dafit.module.common.utils.s;

/* loaded from: classes2.dex */
public class GetWatchDeviceCapabilityExecutor extends AbstractGrabAbstractExecutor {
    private static final String TAG = "tagWatchConnectApp";

    GetWatchDeviceCapabilityExecutor(@NonNull DWebView dWebView) {
        super(dWebView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$senMessageToNative$0(WatchDeviceCapability watchDeviceCapability) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("kaleidoscope", Integer.valueOf(watchDeviceCapability.getAbilityKaleidoscope()));
        jsonObject.addProperty("3D", Integer.valueOf(watchDeviceCapability.getAbility3D()));
        jsonObject.addProperty("video", Integer.valueOf(watchDeviceCapability.getAbilityVideo()));
        if (watchDeviceCapability.getAbilityVideo() == 1) {
            JsonArray jsonArray = new JsonArray();
            jsonArray.add("");
            watchDeviceCapability.getVideoFormatList().forEach(new b(jsonArray));
            jsonObject.add("videoFormat", jsonArray);
        }
        NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
        nativeCallJavascriptResponse.setBody(jsonObject);
        Log.i(TAG, "onGetWatchDeviceCapabilityResult body:" + s.bean2Json(nativeCallJavascriptResponse));
    }

    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor
    public void senMessageToNative(JsonObject jsonObject, CompletionHandler<String> completionHandler) {
        Log.d(TAG, "GetWatchDeviceCapabilityExecutor::senMessageToNative--->optParam:" + jsonObject);
        new GetWatchDeviceCapabilityService().GetWatchDeviceCapability(jsonObject, new GetWatchDeviceCapabilityService.GetDeviceWatchFaceCapabilityCallback() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.e
            @Override // com.crrepa.band.my.device.appmarket.openharmony.service.GetWatchDeviceCapabilityService.GetDeviceWatchFaceCapabilityCallback
            public final void onGetWatchDeviceCapabilityResult(WatchDeviceCapability watchDeviceCapability) {
                GetWatchDeviceCapabilityExecutor.lambda$senMessageToNative$0(watchDeviceCapability);
            }
        });
        JavascriptCallNativeResponse javascriptCallNativeResponse = new JavascriptCallNativeResponse();
        JavascriptCallNativeBody javascriptCallNativeBody = new JavascriptCallNativeBody();
        javascriptCallNativeBody.setSuccessStatus(CallNativeResponseCodeEnum.OK.getCode());
        javascriptCallNativeResponse.setBody(javascriptCallNativeBody);
        completionHandler.complete(s.bean2Json(javascriptCallNativeResponse));
    }
}
