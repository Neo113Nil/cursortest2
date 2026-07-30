package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import androidx.annotation.NonNull;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;

/* loaded from: classes2.dex */
public abstract class AbstractGrabAbstractExecutor implements IGrabExecutor {
    private final DWebView webView;

    AbstractGrabAbstractExecutor(@NonNull DWebView dWebView) {
        this.webView = dWebView;
    }

    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor
    public DWebView getWebView() {
        return this.webView;
    }
}
