package com.just.agentweb;

import android.webkit.WebView;

/* loaded from: classes4.dex */
public interface IndicatorController {
    void finish();

    BaseIndicatorSpec offerIndicator();

    void progress(WebView webView, int i8);

    void setProgress(int i8);

    void showIndicator();
}
