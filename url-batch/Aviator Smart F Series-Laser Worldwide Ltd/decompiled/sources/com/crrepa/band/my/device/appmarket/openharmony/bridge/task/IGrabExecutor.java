package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.google.gson.JsonObject;

/* loaded from: classes2.dex */
public interface IGrabExecutor {
    DWebView getWebView();

    void senMessageToNative(JsonObject jsonObject, CompletionHandler<String> completionHandler);
}
