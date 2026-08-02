package com.squareup.cash.support.views.article;

import android.content.Context;
import android.webkit.WebView;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.webview.android.WebViewUseCase;

/* loaded from: classes7.dex */
public final class ArcadeArticleViewPreviewWebViewProvider implements WebViewProvider {
    public static final ArcadeArticleViewPreviewWebViewProvider INSTANCE = new ArcadeArticleViewPreviewWebViewProvider();
    public static boolean shouldSaveWebInstance;

    @Override // com.squareup.cash.webview.android.WebViewProvider
    public final void flushWebView() {
    }

    @Override // com.squareup.cash.webview.android.WebViewProvider
    public final boolean getShouldSaveWebInstance() {
        return shouldSaveWebInstance;
    }

    @Override // com.squareup.cash.webview.android.WebViewProvider
    public final WebView getWebView(WebViewUseCase webViewUseCase, Context context) {
        context.getClass();
        return new WebView(context);
    }

    @Override // com.squareup.cash.webview.android.WebViewProvider
    public final void setShouldSaveWebInstance(boolean z) {
        shouldSaveWebInstance = z;
    }
}
