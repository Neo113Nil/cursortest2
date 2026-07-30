package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeBody;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.NativeCallJavascriptResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.enm.CallNativeResponseCodeEnum;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.crrepa.band.my.device.appmarket.openharmony.service.DownloadWatchFaceService;
import com.google.gson.JsonObject;
import com.moyoung.dafit.module.common.utils.s;

/* loaded from: classes2.dex */
public class DownloadWatchFaceExecutor extends AbstractGrabAbstractExecutor {
    private static final String TAG = "tagWatchConnectApp";

    DownloadWatchFaceExecutor(@NonNull DWebView dWebView) {
        super(dWebView);
    }

    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor
    public void senMessageToNative(final JsonObject jsonObject, CompletionHandler<String> completionHandler) {
        Log.d(TAG, "DownloadWatchFaceExecutor::senMessageToNative--->optParam:" + jsonObject);
        new DownloadWatchFaceService().downloadWatchFace(jsonObject, new DownloadWatchFaceService.DownloadWatchFaceCallback() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.DownloadWatchFaceExecutor.1
            @Override // com.crrepa.band.my.device.appmarket.openharmony.service.DownloadWatchFaceService.DownloadWatchFaceCallback
            public void onDownloadWatchFaceComplete(int i8, String str) {
                String asString = jsonObject.get("uuid").getAsString();
                String asString2 = jsonObject.get("name").getAsString();
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("uuid", asString);
                jsonObject2.addProperty("name", asString2);
                jsonObject2.addProperty("code", Integer.valueOf(i8));
                jsonObject2.addProperty("message", str);
                NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
                nativeCallJavascriptResponse.setBody(jsonObject2);
                Log.i(DownloadWatchFaceExecutor.TAG, "onDownloadWatchFaceComplete body:" + s.bean2Json(nativeCallJavascriptResponse));
            }

            @Override // com.crrepa.band.my.device.appmarket.openharmony.service.DownloadWatchFaceService.DownloadWatchFaceCallback
            public void onDownloadWatchFaceProgress(long j8) {
                String asString = jsonObject.get("uuid").getAsString();
                String asString2 = jsonObject.get("name").getAsString();
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("uuid", asString);
                jsonObject2.addProperty("name", asString2);
                jsonObject2.addProperty("progress", Long.valueOf(j8));
                NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
                nativeCallJavascriptResponse.setBody(jsonObject2);
                Log.i(DownloadWatchFaceExecutor.TAG, "onProgress body:" + s.bean2Json(nativeCallJavascriptResponse));
            }
        });
        JavascriptCallNativeResponse javascriptCallNativeResponse = new JavascriptCallNativeResponse();
        JavascriptCallNativeBody javascriptCallNativeBody = new JavascriptCallNativeBody();
        javascriptCallNativeBody.setSuccessStatus(CallNativeResponseCodeEnum.OK.getCode());
        javascriptCallNativeResponse.setBody(javascriptCallNativeBody);
        completionHandler.complete(s.bean2Json(javascriptCallNativeResponse));
    }
}
