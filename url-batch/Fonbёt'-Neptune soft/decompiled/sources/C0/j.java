package C0;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class j extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f230a;

    public j(k kVar) {
        this.f230a = kVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f230a.f231a.f2701g.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f230a.f231a.f2701g.loadUrl(str);
        return true;
    }
}
