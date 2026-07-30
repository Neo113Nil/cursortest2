package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeBody;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.NativeCallJavascriptResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.WatchFaceInfo;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.enm.CallNativeResponseCodeEnum;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.crrepa.band.my.device.appmarket.openharmony.service.GetWatchFaceInfoService;
import com.google.gson.JsonObject;
import com.moyoung.dafit.module.common.utils.s;

/* loaded from: classes2.dex */
public class GetWatchFaceInfoExecutor extends AbstractGrabAbstractExecutor {
    private static final String TAG = "tagWatchConnectApp";

    GetWatchFaceInfoExecutor(@NonNull DWebView dWebView) {
        super(dWebView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$senMessageToNative$0(WatchFaceInfo watchFaceInfo) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("uuid", watchFaceInfo.getUuid());
        jsonObject.addProperty("name", watchFaceInfo.getName());
        jsonObject.addProperty("isInstalled", Boolean.valueOf(watchFaceInfo.isInstalled()));
        jsonObject.addProperty("isCurrentWatchFace", Boolean.valueOf(watchFaceInfo.isCurrentWatchFace()));
        jsonObject.addProperty("protocolVersion", watchFaceInfo.getProtocolVersion());
        jsonObject.addProperty("watchfaceVersion", watchFaceInfo.getWatchfaceVersion());
        NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
        nativeCallJavascriptResponse.setBody(jsonObject);
        Log.i(TAG, "onGetWatchFaceInfoResult body:" + s.bean2Json(nativeCallJavascriptResponse));
    }

    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor
    public void senMessageToNative(JsonObject jsonObject, CompletionHandler<String> completionHandler) {
        Log.d(TAG, "GetWatchFaceInfoExecutor::senMessageToNative--->optParam:" + jsonObject);
        new GetWatchFaceInfoService().GetWatchFaceInfo(jsonObject, new GetWatchFaceInfoService.GetWatchFaceInfoCallback() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.f
            @Override // com.crrepa.band.my.device.appmarket.openharmony.service.GetWatchFaceInfoService.GetWatchFaceInfoCallback
            public final void onGetWatchFaceInfoResult(WatchFaceInfo watchFaceInfo) {
                GetWatchFaceInfoExecutor.lambda$senMessageToNative$0(watchFaceInfo);
            }
        });
        JavascriptCallNativeResponse javascriptCallNativeResponse = new JavascriptCallNativeResponse();
        JavascriptCallNativeBody javascriptCallNativeBody = new JavascriptCallNativeBody();
        javascriptCallNativeBody.setSuccessStatus(CallNativeResponseCodeEnum.OK.getCode());
        javascriptCallNativeResponse.setBody(javascriptCallNativeBody);
        completionHandler.complete(s.bean2Json(javascriptCallNativeResponse));
    }
}
