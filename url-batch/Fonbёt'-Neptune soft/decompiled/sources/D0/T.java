package D0;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class T extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f281b;

    public T(U u2, WebView webView) {
        this.f281b = u2;
        this.f280a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean shouldOverrideUrlLoading;
        WebViewClient webViewClient = this.f281b.f282a;
        WebView webView2 = this.f280a;
        shouldOverrideUrlLoading = webViewClient.shouldOverrideUrlLoading(webView2, webResourceRequest);
        if (shouldOverrideUrlLoading) {
            return true;
        }
        webView2.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClient = this.f281b.f282a;
        WebView webView2 = this.f280a;
        if (webViewClient.shouldOverrideUrlLoading(webView2, str)) {
            return true;
        }
        webView2.loadUrl(str);
        return true;
    }
}
