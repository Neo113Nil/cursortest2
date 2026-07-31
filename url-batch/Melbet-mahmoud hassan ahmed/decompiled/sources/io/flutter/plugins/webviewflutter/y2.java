package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import io.flutter.plugins.webviewflutter.k;
import io.flutter.plugins.webviewflutter.y2;

/* loaded from: classes.dex */
public class y2 implements k.a0 {

    /* renamed from: a, reason: collision with root package name */
    private final i2 f17818a;

    /* renamed from: b, reason: collision with root package name */
    private final c f17819b;

    /* renamed from: c, reason: collision with root package name */
    private final x2 f17820c;

    public interface a extends p2 {
    }

    public static class b extends WebViewClientCompat implements a {

        /* renamed from: g, reason: collision with root package name */
        private x2 f17821g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f17822h;

        public b(x2 x2Var, boolean z6) {
            this.f17822h = z6;
            this.f17821g = x2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void k(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void l(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void m(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void n(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void o(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void p(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void q(Void r02) {
        }

        @Override // io.flutter.plugins.webviewflutter.p2
        public void a() {
            x2 x2Var = this.f17821g;
            if (x2Var != null) {
                x2Var.z(this, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.e3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.b.o((Void) obj);
                    }
                });
            }
            this.f17821g = null;
        }

        @Override // androidx.webkit.WebViewClientCompat
        @SuppressLint({"RequiresFeature"})
        public void b(WebView webView, WebResourceRequest webResourceRequest, b0.e eVar) {
            x2 x2Var = this.f17821g;
            if (x2Var != null) {
                x2Var.F(this, webView, webResourceRequest, eVar, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.d3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.b.m((Void) obj);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            x2 x2Var = this.f17821g;
            if (x2Var != null) {
                x2Var.B(this, webView, str, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.z2
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.b.k((Void) obj);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            x2 x2Var = this.f17821g;
            if (x2Var != null) {
                x2Var.C(this, webView, str, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.b3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.b.l((Void) obj);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i7, String str, String str2) {
            x2 x2Var = this.f17821g;
            if (x2Var != null) {
                x2Var.D(this, webView, Long.valueOf(i7), str, str2, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.c3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.b.n((Void) obj);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            x2 x2Var = this.f17821g;
            if (x2Var != null) {
                x2Var.G(this, webView, webResourceRequest, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.a3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.b.p((Void) obj);
                    }
                });
            }
            return this.f17822h;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            x2 x2Var = this.f17821g;
            if (x2Var != null) {
                x2Var.H(this, webView, str, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.f3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.b.q((Void) obj);
                    }
                });
            }
            return this.f17822h;
        }
    }

    public static class c {
        public WebViewClient a(x2 x2Var, boolean z6) {
            return Build.VERSION.SDK_INT >= 24 ? new d(x2Var, z6) : new b(x2Var, z6);
        }
    }

    public static class d extends WebViewClient implements a {

        /* renamed from: f, reason: collision with root package name */
        private x2 f17823f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f17824g;

        public d(x2 x2Var, boolean z6) {
            this.f17824g = z6;
            this.f17823f = x2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void i(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void j(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void k(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void l(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void m(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void n(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void o(Void r02) {
        }

        @Override // io.flutter.plugins.webviewflutter.p2
        public void a() {
            x2 x2Var = this.f17823f;
            if (x2Var != null) {
                x2Var.z(this, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.m3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.d.m((Void) obj);
                    }
                });
            }
            this.f17823f = null;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            x2 x2Var = this.f17823f;
            if (x2Var != null) {
                x2Var.B(this, webView, str, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.h3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.d.i((Void) obj);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            x2 x2Var = this.f17823f;
            if (x2Var != null) {
                x2Var.C(this, webView, str, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.g3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.d.j((Void) obj);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i7, String str, String str2) {
            x2 x2Var = this.f17823f;
            if (x2Var != null) {
                x2Var.D(this, webView, Long.valueOf(i7), str, str2, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.k3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.d.l((Void) obj);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            x2 x2Var = this.f17823f;
            if (x2Var != null) {
                x2Var.E(this, webView, webResourceRequest, webResourceError, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.j3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.d.k((Void) obj);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            x2 x2Var = this.f17823f;
            if (x2Var != null) {
                x2Var.G(this, webView, webResourceRequest, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.i3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.d.n((Void) obj);
                    }
                });
            }
            return this.f17824g;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            x2 x2Var = this.f17823f;
            if (x2Var != null) {
                x2Var.H(this, webView, str, new k.y.a() { // from class: io.flutter.plugins.webviewflutter.l3
                    @Override // io.flutter.plugins.webviewflutter.k.y.a
                    public final void a(Object obj) {
                        y2.d.o((Void) obj);
                    }
                });
            }
            return this.f17824g;
        }
    }

    public y2(i2 i2Var, c cVar, x2 x2Var) {
        this.f17818a = i2Var;
        this.f17819b = cVar;
        this.f17820c = x2Var;
    }

    @Override // io.flutter.plugins.webviewflutter.k.a0
    public void b(Long l7, Boolean bool) {
        this.f17818a.b(this.f17819b.a(this.f17820c, bool.booleanValue()), l7.longValue());
    }
}
