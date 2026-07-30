package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import androidx.annotation.NonNull;
import com.crrepa.band.my.device.appmarket.openharmony.OpenWearPlayJSInterface;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeBody;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.NativeCallJavascriptResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.enm.CallNativeResponseCodeEnum;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.OnReturnValue;
import com.crrepa.band.my.device.appmarket.openharmony.service.DownloadAppService;
import com.google.gson.JsonObject;
import com.moyoung.dafit.module.common.utils.s;

/* loaded from: classes2.dex */
public class DownloadAppExecutor extends AbstractGrabAbstractExecutor {
    public DownloadAppExecutor(@NonNull DWebView dWebView) {
        super(dWebView);
    }

    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor
    public void senMessageToNative(final JsonObject jsonObject, CompletionHandler<String> completionHandler) {
        com.orhanobut.logger.f.d("DownloadAppExecutor::senMessageToNative--->optParam:" + jsonObject);
        new DownloadAppService().downloadApp(jsonObject, new DownloadAppService.DownloadListener() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.DownloadAppExecutor.1
            @Override // com.crrepa.band.my.device.appmarket.openharmony.service.DownloadAppService.DownloadListener
            public void onComplete(int i8, String str) {
                String asString = jsonObject.get("packageName").getAsString();
                String asString2 = jsonObject.get("appName").getAsString();
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("name", asString2);
                jsonObject2.addProperty("packageName", asString);
                jsonObject2.addProperty("code", Integer.valueOf(i8));
                jsonObject2.addProperty("message", str);
                NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
                nativeCallJavascriptResponse.setBody(jsonObject2);
                com.orhanobut.logger.f.d("onComplete body:" + s.bean2Json(nativeCallJavascriptResponse));
                DownloadAppExecutor.this.getWebView().callHandler(OpenWearPlayJSInterface.ON_DOWNLOAD_COMPLETE, new Object[]{s.bean2Json(nativeCallJavascriptResponse)}, new OnReturnValue<String>() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.DownloadAppExecutor.1.2
                    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.OnReturnValue
                    public void onValue(String str2) {
                    }
                });
            }

            @Override // com.crrepa.band.my.device.appmarket.openharmony.service.DownloadAppService.DownloadListener
            public void onProgress(long j8) {
                String asString = jsonObject.get("packageName").getAsString();
                String asString2 = jsonObject.get("appName").getAsString();
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("name", asString2);
                jsonObject2.addProperty("packageName", asString);
                jsonObject2.addProperty("progress", Long.valueOf(j8));
                NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
                nativeCallJavascriptResponse.setBody(jsonObject2);
                DownloadAppExecutor.this.getWebView().callHandler(OpenWearPlayJSInterface.ON_DOWNLOAD_PROGRESS, new Object[]{s.bean2Json(nativeCallJavascriptResponse)}, new OnReturnValue<String>() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.DownloadAppExecutor.1.1
                    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.OnReturnValue
                    public void onValue(String str) {
                    }
                });
            }
        });
        JavascriptCallNativeResponse javascriptCallNativeResponse = new JavascriptCallNativeResponse();
        JavascriptCallNativeBody javascriptCallNativeBody = new JavascriptCallNativeBody();
        javascriptCallNativeBody.setSuccessStatus(CallNativeResponseCodeEnum.OK.getCode());
        javascriptCallNativeResponse.setBody(javascriptCallNativeBody);
        completionHandler.complete(s.bean2Json(javascriptCallNativeResponse));
    }
}
