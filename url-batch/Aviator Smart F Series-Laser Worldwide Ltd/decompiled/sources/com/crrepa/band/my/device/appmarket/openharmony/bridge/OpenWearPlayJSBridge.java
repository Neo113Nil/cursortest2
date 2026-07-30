package com.crrepa.band.my.device.appmarket.openharmony.bridge;

import android.webkit.JavascriptInterface;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeBody;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.JavascriptCallNativeResponse;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.OptParam;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.enm.CallNativeResponseCodeEnum;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.task.GrabFactory;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.task.JsParamParser;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.moyoung.dafit.module.common.utils.s;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class OpenWearPlayJSBridge {
    private final GrabFactory grabFactory;

    public OpenWearPlayJSBridge(DWebView dWebView) {
        this.grabFactory = new GrabFactory(dWebView);
    }

    @JavascriptInterface
    public void hwohBridgeCallNative(Object obj, CompletionHandler<String> completionHandler) {
        OptParam Parser = JsParamParser.Parser(obj);
        f.i("hwohBridgeCallNative: args:" + obj, new Object[0]);
        IGrabExecutor executor = this.grabFactory.getExecutor(Parser.getOpt());
        if (executor != null) {
            executor.senMessageToNative(Parser.getParam(), completionHandler);
            return;
        }
        JavascriptCallNativeResponse javascriptCallNativeResponse = new JavascriptCallNativeResponse();
        JavascriptCallNativeBody javascriptCallNativeBody = new JavascriptCallNativeBody();
        javascriptCallNativeBody.setSuccessStatus(CallNativeResponseCodeEnum.CANOT_FIND.getCode());
        javascriptCallNativeResponse.setBody(javascriptCallNativeBody);
        completionHandler.complete(s.bean2Json(javascriptCallNativeResponse));
    }
}
