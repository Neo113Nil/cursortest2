package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeBody;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.NativeCallJavascriptResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.WatchSystemInfo;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.enm.CallNativeResponseCodeEnum;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.crrepa.band.my.device.appmarket.openharmony.service.GetWatchSystemInfoService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.moyoung.dafit.module.common.utils.s;
import java.util.List;

/* loaded from: classes2.dex */
public class GetWatchSystemInfoExecutor extends AbstractGrabAbstractExecutor {
    private static final String TAG = "tagWatchConnectApp";

    GetWatchSystemInfoExecutor(@NonNull DWebView dWebView) {
        super(dWebView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$senMessageToNative$0(WatchSystemInfo watchSystemInfo) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("os", watchSystemInfo.getOs());
        jsonObject.addProperty("osVersion", watchSystemInfo.getOsVersion());
        jsonObject.addProperty("sdkVersion", watchSystemInfo.getSdkVersion());
        List<String> watchFaceProtocolVersion = watchSystemInfo.getWatchFaceProtocolVersion();
        JsonArray jsonArray = new JsonArray();
        watchFaceProtocolVersion.forEach(new b(jsonArray));
        jsonObject.add("watchFaceProtocolVersion", jsonArray);
        jsonObject.addProperty("resolution", watchSystemInfo.getResolution());
        NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
        nativeCallJavascriptResponse.setBody(jsonObject);
        Log.i(TAG, "onGetWatchSystemInfoResult body:" + s.bean2Json(nativeCallJavascriptResponse));
    }

    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor
    public void senMessageToNative(JsonObject jsonObject, CompletionHandler<String> completionHandler) {
        Log.d(TAG, "GetWatchSystemInfoExecutor::senMessageToNative--->optParam:" + jsonObject);
        new GetWatchSystemInfoService().getWatchSystemInfo(jsonObject, new GetWatchSystemInfoService.UninstallWatchFaceCallback() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.g
            @Override // com.crrepa.band.my.device.appmarket.openharmony.service.GetWatchSystemInfoService.UninstallWatchFaceCallback
            public final void onGetWatchSystemInfoResult(WatchSystemInfo watchSystemInfo) {
                GetWatchSystemInfoExecutor.lambda$senMessageToNative$0(watchSystemInfo);
            }
        });
        JavascriptCallNativeResponse javascriptCallNativeResponse = new JavascriptCallNativeResponse();
        JavascriptCallNativeBody javascriptCallNativeBody = new JavascriptCallNativeBody();
        javascriptCallNativeBody.setSuccessStatus(CallNativeResponseCodeEnum.OK.getCode());
        javascriptCallNativeResponse.setBody(javascriptCallNativeBody);
        completionHandler.complete(s.bean2Json(javascriptCallNativeResponse));
    }
}
