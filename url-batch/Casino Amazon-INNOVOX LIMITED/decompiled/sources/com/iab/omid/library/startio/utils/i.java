package com.iab.omid.library.startio.utils;

import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* loaded from: classes2.dex */
public class i {
    public void a(WebView webView, String str) {
        WebViewCompat.removeWebMessageListener(webView, str);
    }

    public void a(WebView webView, String str, Set set, WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}
