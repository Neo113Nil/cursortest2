package com.squareup.cash.webview.android;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes.dex */
public interface WebViewProvider {
    void flushWebView();

    boolean getShouldSaveWebInstance();

    WebView getWebView(WebViewUseCase webViewUseCase, Context context);

    void setShouldSaveWebInstance(boolean z);
}
