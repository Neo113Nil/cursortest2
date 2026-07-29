package com.dancingbogo.skyrolline.webview.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public class WebViewEx extends WebView {
    @SuppressLint({"NewApi"})
    public WebViewEx(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT <= 10 || Build.VERSION.SDK_INT >= 17) {
            return;
        }
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
    }

    @SuppressLint({"NewApi"})
    public WebViewEx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (Build.VERSION.SDK_INT <= 10 || Build.VERSION.SDK_INT >= 17) {
            return;
        }
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
    }

    @SuppressLint({"NewApi"})
    public WebViewEx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (Build.VERSION.SDK_INT <= 10 || Build.VERSION.SDK_INT >= 17) {
            return;
        }
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
    }
}
