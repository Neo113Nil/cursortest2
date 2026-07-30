package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeBody;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.NativeCallJavascriptResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.enm.CallNativeResponseCodeEnum;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.crrepa.band.my.device.appmarket.openharmony.service.UninstallWatchFaceService;
import com.google.gson.JsonObject;
import com.moyoung.dafit.module.common.utils.s;

/* loaded from: classes2.dex */
public class UninstallWatchFaceExecutor extends AbstractGrabAbstractExecutor {
    private static final String TAG = "tagWatchConnectApp";

    UninstallWatchFaceExecutor(@NonNull DWebView dWebView) {
        super(dWebView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$senMessageToNative$0(JsonObject jsonObject, int i8, String str) {
        String asString = jsonObject.get("uuid").getAsString();
        String asString2 = jsonObject.get("name").getAsString();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("uuid", asString);
        jsonObject2.addProperty("name", asString2);
        jsonObject2.addProperty("code", Integer.valueOf(i8));
        jsonObject2.addProperty("message", str);
        NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
        nativeCallJavascriptResponse.setBody(jsonObject2);
        Log.i(TAG, "onUninstallWatchFaceResult body:" + s.bean2Json(nativeCallJavascriptResponse));
    }

    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor
    public void senMessageToNative(final JsonObject jsonObject, CompletionHandler<String> completionHandler) {
        Log.d(TAG, "UninstallWatchFaceExecutor::senMessageToNative--->optParam:" + jsonObject);
        new UninstallWatchFaceService().uninstallWatchFace(jsonObject, new UninstallWatchFaceService.UninstallWatchFaceCallback() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.l
            @Override // com.crrepa.band.my.device.appmarket.openharmony.service.UninstallWatchFaceService.UninstallWatchFaceCallback
            public final void onUninstallWatchFaceResult(int i8, String str) {
                UninstallWatchFaceExecutor.lambda$senMessageToNative$0(JsonObject.this, i8, str);
            }
        });
        JavascriptCallNativeResponse javascriptCallNativeResponse = new JavascriptCallNativeResponse();
        JavascriptCallNativeBody javascriptCallNativeBody = new JavascriptCallNativeBody();
        javascriptCallNativeBody.setSuccessStatus(CallNativeResponseCodeEnum.OK.getCode());
        javascriptCallNativeResponse.setBody(javascriptCallNativeBody);
        completionHandler.complete(s.bean2Json(javascriptCallNativeResponse));
    }
}
