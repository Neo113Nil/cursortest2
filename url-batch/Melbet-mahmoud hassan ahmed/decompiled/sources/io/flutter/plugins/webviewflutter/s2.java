package io.flutter.plugins.webviewflutter;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.k;
import io.flutter.plugins.webviewflutter.s2;

/* loaded from: classes.dex */
public class s2 implements k.q {

    /* renamed from: a, reason: collision with root package name */
    private final i2 f17789a;

    /* renamed from: b, reason: collision with root package name */
    private final a f17790b;

    /* renamed from: c, reason: collision with root package name */
    private final r2 f17791c;

    public static class a {
        public b a(r2 r2Var, WebViewClient webViewClient) {
            return new b(r2Var, webViewClient);
        }
    }

    public static class b extends WebChromeClient implements p2 {

        /* renamed from: f, reason: collision with root package name */
        private r2 f17792f;

        /* renamed from: g, reason: collision with root package name */
        private WebViewClient f17793g;

        class a extends WebViewClient {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebView f17794a;

            a(WebView webView) {
                this.f17794a = webView;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                if (b.this.f17793g.shouldOverrideUrlLoading(this.f17794a, webResourceRequest)) {
                    return true;
                }
                this.f17794a.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (b.this.f17793g.shouldOverrideUrlLoading(this.f17794a, str)) {
                    return true;
                }
                this.f17794a.loadUrl(str);
                return true;
            }
        }

        public b(r2 r2Var, WebViewClient webViewClient) {
            this.f17792f = r2Var;
            this.f17793g = webViewClient;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(Void r02) {
        }

        @Override // io.flutter.plugins.webviewflutter.p2
        public void a() {
            r2 r2Var = this.f17792f;
            if (r2Var != null) {
                r2Var.h(this, new k.o.a() { // from class: io.flutter.plugins.webviewflutter.u2
                    @Override // io.flutter.plugins.webviewflutter.k.o.a
                    public final void a(Object obj) {
                        s2.b.f((Void) obj);
                    }
                });
            }
            this.f17792f = null;
        }

        boolean g(WebView webView, Message message, WebView webView2) {
            a aVar = new a(webView);
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public void h(WebViewClient webViewClient) {
            this.f17793g = webViewClient;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z6, boolean z7, Message message) {
            return g(webView, message, new WebView(webView.getContext()));
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i7) {
            r2 r2Var = this.f17792f;
            if (r2Var != null) {
                r2Var.j(this, webView, Long.valueOf(i7), new k.o.a() { // from class: io.flutter.plugins.webviewflutter.t2
                    @Override // io.flutter.plugins.webviewflutter.k.o.a
                    public final void a(Object obj) {
                        s2.b.e((Void) obj);
                    }
                });
            }
        }
    }

    public s2(i2 i2Var, a aVar, r2 r2Var) {
        this.f17789a = i2Var;
        this.f17790b = aVar;
        this.f17791c = r2Var;
    }

    @Override // io.flutter.plugins.webviewflutter.k.q
    public void b(Long l7, Long l8) {
        this.f17789a.b(this.f17790b.a(this.f17791c, (WebViewClient) this.f17789a.h(l8.longValue())), l7.longValue());
    }
}
