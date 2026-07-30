package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeBody;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.NativeCallJavascriptResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.enm.CallNativeResponseCodeEnum;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.crrepa.band.my.device.appmarket.openharmony.service.GetInstalledWatchFaceService;
import com.google.gson.JsonObject;
import com.moyoung.dafit.module.common.utils.s;
import java.util.List;

/* loaded from: classes2.dex */
public class GetInstalledWatchFaceExecutor extends AbstractGrabAbstractExecutor {
    private static final String TAG = "tagWatchConnectApp";

    GetInstalledWatchFaceExecutor(@NonNull DWebView dWebView) {
        super(dWebView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$senMessageToNative$0(List list) {
        NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
        nativeCallJavascriptResponse.setBody(list);
        Log.i(TAG, "onGetInstalledWatchFaceResult body:" + s.bean2Json(nativeCallJavascriptResponse));
    }

    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor
    public void senMessageToNative(JsonObject jsonObject, CompletionHandler<String> completionHandler) {
        Log.d(TAG, "GetInstalledWatchFaceExecutor::senMessageToNative--->optParam:" + jsonObject);
        new GetInstalledWatchFaceService().getInstalledWatchFace(jsonObject, new GetInstalledWatchFaceService.GetInstalledWatchFaceCallback() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.d
            @Override // com.crrepa.band.my.device.appmarket.openharmony.service.GetInstalledWatchFaceService.GetInstalledWatchFaceCallback
            public final void onGetInstalledWatchFaceResult(List list) {
                GetInstalledWatchFaceExecutor.lambda$senMessageToNative$0(list);
            }
        });
        JavascriptCallNativeResponse javascriptCallNativeResponse = new JavascriptCallNativeResponse();
        JavascriptCallNativeBody javascriptCallNativeBody = new JavascriptCallNativeBody();
        javascriptCallNativeBody.setSuccessStatus(CallNativeResponseCodeEnum.OK.getCode());
        javascriptCallNativeResponse.setBody(javascriptCallNativeBody);
        completionHandler.complete(s.bean2Json(javascriptCallNativeResponse));
    }
}
