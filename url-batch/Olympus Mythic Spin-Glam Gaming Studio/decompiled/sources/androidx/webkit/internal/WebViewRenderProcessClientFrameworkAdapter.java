package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes12.dex */
public class WebViewRenderProcessClientFrameworkAdapter extends WebViewRenderProcessClient {
    private final androidx.webkit.WebViewRenderProcessClient mWebViewRenderProcessClient;

    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.mWebViewRenderProcessClient.onRenderProcessUnresponsive(webView, WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess));
    }

    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.mWebViewRenderProcessClient.onRenderProcessResponsive(webView, WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess));
    }
}
