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
import com.crrepa.band.my.device.appmarket.openharmony.service.UninstallAppService;
import com.google.gson.JsonObject;
import com.moyoung.dafit.module.common.utils.s;

/* loaded from: classes2.dex */
public class UninstallAppExecutor extends AbstractGrabAbstractExecutor {
    private static final String TAG = "tagWatchConnectApp";

    UninstallAppExecutor(@NonNull DWebView dWebView) {
        super(dWebView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$senMessageToNative$0(JsonObject jsonObject, int i8, String str) {
        String asString = jsonObject.get("appName").getAsString();
        String asString2 = jsonObject.get("packageName").getAsString();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("name", asString);
        jsonObject2.addProperty("packageName", asString2);
        jsonObject2.addProperty("code", Integer.valueOf(i8));
        jsonObject2.addProperty("message", str);
        NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
        nativeCallJavascriptResponse.setBody(jsonObject2);
        Log.i(TAG, "onUninstallAppResult body:" + s.bean2Json(nativeCallJavascriptResponse));
        getWebView().callHandler(OpenWearPlayJSInterface.ON_UNINSTALL_APP_RESULT, new Object[]{s.bean2Json(nativeCallJavascriptResponse)}, new OnReturnValue<String>() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.UninstallAppExecutor.1
            @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.OnReturnValue
            public void onValue(String str2) {
            }
        });
    }

    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor
    public void senMessageToNative(final JsonObject jsonObject, CompletionHandler<String> completionHandler) {
        Log.d(TAG, "UninstallAppExecutor::senMessageToNative--->optParam:" + jsonObject);
        new UninstallAppService().uninstallApp(jsonObject, new UninstallAppService.UninstallAppListener() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.k
            @Override // com.crrepa.band.my.device.appmarket.openharmony.service.UninstallAppService.UninstallAppListener
            public final void onUninstallAppResult(int i8, String str) {
                UninstallAppExecutor.this.lambda$senMessageToNative$0(jsonObject, i8, str);
            }
        });
        JavascriptCallNativeResponse javascriptCallNativeResponse = new JavascriptCallNativeResponse();
        JavascriptCallNativeBody javascriptCallNativeBody = new JavascriptCallNativeBody();
        javascriptCallNativeBody.setSuccessStatus(CallNativeResponseCodeEnum.OK.getCode());
        javascriptCallNativeResponse.setBody(javascriptCallNativeBody);
        completionHandler.complete(s.bean2Json(javascriptCallNativeResponse));
    }
}
