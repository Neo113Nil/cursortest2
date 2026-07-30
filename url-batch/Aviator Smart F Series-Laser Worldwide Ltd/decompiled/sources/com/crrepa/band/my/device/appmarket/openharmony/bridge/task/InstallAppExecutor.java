package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.appmarket.openharmony.OpenWearPlayJSInterface;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeBody;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.NativeCallJavascriptResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.enm.CallNativeResponseCodeEnum;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.OnReturnValue;
import com.crrepa.band.my.device.appmarket.openharmony.service.InstallAppService;
import com.google.gson.JsonObject;
import com.moyoung.dafit.module.common.utils.s;

/* loaded from: classes2.dex */
public class InstallAppExecutor extends AbstractGrabAbstractExecutor {
    private static final String TAG = "tagWatchConnectApp";
    private final InstallAppService installAppService;

    InstallAppExecutor(@NonNull DWebView dWebView) {
        super(dWebView);
        this.installAppService = new InstallAppService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onInstallAppResult, reason: merged with bridge method [inline-methods] */
    public void lambda$senMessageToNative$0(int i8, String str, String str2, String str3) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", str2);
        jsonObject.addProperty("packageName", str3);
        jsonObject.addProperty("code", Integer.valueOf(i8));
        jsonObject.addProperty("message", str);
        NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
        nativeCallJavascriptResponse.setBody(jsonObject);
        Log.i(TAG, "onInstallAppResult body:" + s.bean2Json(nativeCallJavascriptResponse));
        getWebView().callHandler(OpenWearPlayJSInterface.ON_INSTALL_APP_RESULT, new Object[]{s.bean2Json(nativeCallJavascriptResponse)}, new OnReturnValue<String>() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.InstallAppExecutor.1
            @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.OnReturnValue
            public void onValue(String str4) {
            }
        });
    }

    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor
    public void senMessageToNative(JsonObject jsonObject, CompletionHandler<String> completionHandler) {
        Log.d(TAG, "InstallAppExecutor::senMessageToNative--->optParam:" + jsonObject);
        final String asString = jsonObject.get("packageName").getAsString();
        final String asString2 = jsonObject.get("appName").getAsString();
        if (this.installAppService.isTransCompleted()) {
            this.installAppService.installApp(jsonObject, new InstallAppService.InstallAppListener() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.h
                @Override // com.crrepa.band.my.device.appmarket.openharmony.service.InstallAppService.InstallAppListener
                public final void onInstallAppResult(int i8, String str) {
                    InstallAppExecutor.this.lambda$senMessageToNative$0(asString2, asString, i8, str);
                }
            });
        } else {
            lambda$senMessageToNative$0(5, "app is installing!!!", asString2, asString);
        }
        JavascriptCallNativeResponse javascriptCallNativeResponse = new JavascriptCallNativeResponse();
        JavascriptCallNativeBody javascriptCallNativeBody = new JavascriptCallNativeBody();
        javascriptCallNativeBody.setSuccessStatus(CallNativeResponseCodeEnum.OK.getCode());
        javascriptCallNativeResponse.setBody(javascriptCallNativeBody);
        completionHandler.complete(s.bean2Json(javascriptCallNativeResponse));
    }
}
