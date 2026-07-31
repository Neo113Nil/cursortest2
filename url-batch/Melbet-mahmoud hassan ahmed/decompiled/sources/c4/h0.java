package c4;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
final class h0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ g0 f1984a;

    private h0(g0 g0Var) {
        this.f1984a = g0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        boolean e7;
        l0 l0Var;
        g0 g0Var = this.f1984a;
        e7 = g0.e(str);
        if (e7) {
            l0Var = this.f1984a.f1965g;
            l0Var.d(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z6;
        l0 unused;
        z6 = this.f1984a.f1966h;
        if (z6) {
            return;
        }
        unused = this.f1984a.f1965g;
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        g0.d(this.f1984a, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        l0 l0Var;
        l0Var = this.f1984a.f1965g;
        l0Var.c(i7, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean e7;
        l0 l0Var;
        String uri = webResourceRequest.getUrl().toString();
        g0 g0Var = this.f1984a;
        e7 = g0.e(uri);
        if (!e7) {
            return false;
        }
        l0Var = this.f1984a.f1965g;
        l0Var.d(uri);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean e7;
        l0 l0Var;
        g0 g0Var = this.f1984a;
        e7 = g0.e(str);
        if (!e7) {
            return false;
        }
        l0Var = this.f1984a.f1965g;
        l0Var.d(str);
        return true;
    }
}
