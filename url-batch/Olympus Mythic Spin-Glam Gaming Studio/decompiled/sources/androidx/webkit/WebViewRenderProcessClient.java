package androidx.webkit;

import android.webkit.WebView;

/* loaded from: classes14.dex */
public abstract class WebViewRenderProcessClient {
    public abstract void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);

    public abstract void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);
}
