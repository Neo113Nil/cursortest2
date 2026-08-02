package Y1;

import E1.AbstractC0033i;
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
public final class b0 extends WebViewClient {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1823c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0117n f1824a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1825b = false;

    public b0(C0117n c0117n) {
        this.f1824a = c0117n;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(final WebView webView, final String str, final boolean z) {
        this.f1824a.f1873a.c(new Runnable() { // from class: Y1.Z
            @Override // java.lang.Runnable
            public final void run() {
                C0120q c0120q = new C0120q(2);
                b0 b0Var = b0.this;
                C0117n c0117n = b0Var.f1824a;
                c0117n.getClass();
                WebView webViewArg = webView;
                kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
                String urlArg = str;
                kotlin.jvm.internal.j.e(urlArg, "urlArg");
                A0.d dVar = c0117n.f1873a;
                dVar.getClass();
                if (!((C0107d) dVar.f17b).d(b0Var)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.doUpdateVisitedHistory` failed because native instance was not in the instance manager.", "");
                } else {
                    new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", dVar.a(), (K0.j) null).h(c2.f.L(b0Var, webViewArg, urlArg, Boolean.valueOf(z)), new M(8, c0120q));
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f1824a.f1873a.c(new X(this, webView, message, message2, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f1824a.f1873a.c(new W(this, webView, str, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f1824a.f1873a.c(new W(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f1824a.f1873a.c(new W(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f1824a.f1873a.c(new W(this, webView, str, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f1824a.f1873a.c(new A0.a(this, webView, clientCertRequest, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f1824a.f1873a.c(new X(this, webView, webResourceRequest, webResourceError, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f1824a.f1873a.c(new Y(this, webView, httpAuthHandler, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f1824a.f1873a.c(new X(this, webView, webResourceRequest, webResourceResponse, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f1824a.f1873a.c(new Y(this, webView, str, str2, str3));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f1824a.f1873a.c(new X(this, webView, sslErrorHandler, sslError, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(final WebView webView, final float f, final float f3) {
        this.f1824a.f1873a.c(new Runnable() { // from class: Y1.a0
            @Override // java.lang.Runnable
            public final void run() {
                double d3 = f;
                double d4 = f3;
                C0120q c0120q = new C0120q(2);
                b0 b0Var = b0.this;
                C0117n c0117n = b0Var.f1824a;
                c0117n.getClass();
                WebView viewArg = webView;
                kotlin.jvm.internal.j.e(viewArg, "viewArg");
                A0.d dVar = c0117n.f1873a;
                dVar.getClass();
                if (!((C0107d) dVar.f17b).d(b0Var)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.onScaleChanged` failed because native instance was not in the instance manager.", "");
                } else {
                    new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", dVar.a(), (K0.j) null).h(c2.f.L(b0Var, viewArg, Double.valueOf(d3), Double.valueOf(d4)), new M(7, c0120q));
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f1824a.f1873a.c(new A0.a(this, webView, webResourceRequest, 2));
        return webResourceRequest.isForMainFrame() && this.f1825b;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }
}
