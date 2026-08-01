package i9;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final a1.d f4679a;

    public e(a1.d dVar) {
        this.f4679a = dVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f4679a.invoke(2);
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }
}
