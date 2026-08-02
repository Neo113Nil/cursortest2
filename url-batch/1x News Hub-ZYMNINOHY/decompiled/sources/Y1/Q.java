package Y1;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class Q extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f1783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f1784b;

    public Q(S s3, WebView webView) {
        this.f1784b = s3;
        this.f1783a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f1784b.f1785a;
        WebView webView2 = this.f1783a;
        if (webViewClient.shouldOverrideUrlLoading(webView2, webResourceRequest)) {
            return true;
        }
        webView2.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }
}
