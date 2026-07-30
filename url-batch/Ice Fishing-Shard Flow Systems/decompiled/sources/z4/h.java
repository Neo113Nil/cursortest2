package z4;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class h extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f8725a;

    public h(i iVar) {
        this.f8725a = iVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f8725a.f8726a.f5785i.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }
}
