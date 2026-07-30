package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeBody;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.NativeCallJavascriptResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.enm.CallNativeResponseCodeEnum;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.crrepa.band.my.device.appmarket.openharmony.service.GetAlgorithmAndPublicKeyService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.moyoung.dafit.module.common.utils.s;
import java.util.List;

/* loaded from: classes2.dex */
public class GetAlgorithmAndPublicKeyExecutor extends AbstractGrabAbstractExecutor {
    private static final String TAG = "tagWatchConnectApp";

    GetAlgorithmAndPublicKeyExecutor(@NonNull DWebView dWebView) {
        super(dWebView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$senMessageToNative$0(String str, String str2, String str3, List list) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("algorithm", str);
        jsonObject.addProperty("encryptMode", str2);
        jsonObject.addProperty("publicKey", str3);
        JsonArray jsonArray = new JsonArray();
        list.forEach(new b(jsonArray));
        jsonObject.add("nonce", jsonArray);
        NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
        nativeCallJavascriptResponse.setBody(jsonObject);
        Log.i(TAG, "onGetAlgorithmAndPublicKeyResult body:" + s.bean2Json(nativeCallJavascriptResponse));
    }

    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor
    public void senMessageToNative(JsonObject jsonObject, CompletionHandler<String> completionHandler) {
        Log.d(TAG, "GetAlgorithmAndPublicKeyExecutor::senMessageToNative--->optParam:" + jsonObject);
        new GetAlgorithmAndPublicKeyService().getAlgorithmAndPublicKey(jsonObject, new GetAlgorithmAndPublicKeyService.GetAlgorithmAndPublicKeyListener() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.a
            @Override // com.crrepa.band.my.device.appmarket.openharmony.service.GetAlgorithmAndPublicKeyService.GetAlgorithmAndPublicKeyListener
            public final void onGetAlgorithmAndPublicKeyResult(String str, String str2, String str3, List list) {
                GetAlgorithmAndPublicKeyExecutor.lambda$senMessageToNative$0(str, str2, str3, list);
            }
        });
        JavascriptCallNativeResponse javascriptCallNativeResponse = new JavascriptCallNativeResponse();
        JavascriptCallNativeBody javascriptCallNativeBody = new JavascriptCallNativeBody();
        javascriptCallNativeBody.setSuccessStatus(CallNativeResponseCodeEnum.OK.getCode());
        javascriptCallNativeResponse.setBody(javascriptCallNativeBody);
        completionHandler.complete(s.bean2Json(javascriptCallNativeResponse));
    }
}
