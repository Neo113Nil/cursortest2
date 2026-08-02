package D0;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class h0 extends WebViewClient {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f360c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0050j f361a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f362b = false;

    public h0(C0050j c0050j) {
        this.f361a = c0050j;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        this.f361a.f366a.c(new d0(this, webView, str, z2, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f361a.f366a.c(new a0(this, webView, message, message2, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f361a.f366a.c(new g0(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f361a.f366a.c(new g0(this, webView, str, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f361a.f366a.c(new g0(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f361a.f366a.c(new g0(this, webView, str, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f361a.f366a.c(new Z(this, webView, clientCertRequest, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        this.f361a.f366a.c(new Y(this, webView, i2, str, str2, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f361a.f366a.c(new b0(this, webView, httpAuthHandler, str, str2, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f361a.f366a.c(new a0(this, webView, webResourceRequest, webResourceResponse, 7));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f361a.f366a.c(new b0(this, webView, str, str2, str3, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f361a.f366a.c(new a0(this, webView, sslErrorHandler, sslError, 5));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f2, float f3) {
        this.f361a.f366a.c(new e0(this, webView, f2, f3, 1));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f361a.f366a.c(new Z(this, webView, webResourceRequest, 3));
        return webResourceRequest.isForMainFrame() && this.f362b;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f361a.f366a.c(new a0(this, webView, webResourceRequest, webResourceError, 6));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f361a.f366a.c(new g0(this, webView, str, 1));
        return this.f362b;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }
}
