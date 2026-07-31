package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.View;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.e;
import io.flutter.plugins.webviewflutter.k;
import io.flutter.plugins.webviewflutter.s2;
import io.flutter.plugins.webviewflutter.y2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class q3 implements k.c0 {

    /* renamed from: a, reason: collision with root package name */
    private final i2 f17771a;

    /* renamed from: b, reason: collision with root package name */
    private final d f17772b;

    /* renamed from: c, reason: collision with root package name */
    private final View f17773c;

    /* renamed from: d, reason: collision with root package name */
    private Context f17774d;

    @SuppressLint({"ViewConstructor"})
    public static class a extends g2 implements io.flutter.plugin.platform.d, p2 {

        /* renamed from: i, reason: collision with root package name */
        private final b<y2.a> f17775i;

        /* renamed from: j, reason: collision with root package name */
        private final b<e.b> f17776j;

        /* renamed from: k, reason: collision with root package name */
        private final b<s2.b> f17777k;

        /* renamed from: l, reason: collision with root package name */
        private final Map<String, b<m2>> f17778l;

        public a(Context context, View view) {
            super(context, view);
            this.f17775i = new b<>();
            this.f17776j = new b<>();
            this.f17777k = new b<>();
            this.f17778l = new HashMap();
        }

        @Override // io.flutter.plugins.webviewflutter.p2
        public void a() {
            this.f17775i.b();
            this.f17776j.b();
            this.f17777k.b();
            Iterator<b<m2>> it = this.f17778l.values().iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f17778l.clear();
        }

        @Override // android.webkit.WebView
        @SuppressLint({"JavascriptInterface"})
        public void addJavascriptInterface(Object obj, String str) {
            super.addJavascriptInterface(obj, str);
            if (obj instanceof m2) {
                b<m2> bVar = this.f17778l.get(str);
                if (bVar != null && bVar.a() != obj) {
                    bVar.b();
                }
                this.f17778l.put(str, new b<>((m2) obj));
            }
        }

        @Override // io.flutter.plugins.webviewflutter.g2, android.view.View
        public /* bridge */ /* synthetic */ boolean checkInputConnectionProxy(View view) {
            return super.checkInputConnectionProxy(view);
        }

        @Override // io.flutter.plugins.webviewflutter.g2, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ void clearFocus() {
            super.clearFocus();
        }

        @Override // io.flutter.plugins.webviewflutter.g2, io.flutter.plugin.platform.d
        public void d() {
            super.d();
            destroy();
        }

        @Override // io.flutter.plugin.platform.d
        public void e() {
            k();
        }

        @Override // io.flutter.plugin.platform.d
        public void f(View view) {
            setContainerView(view);
        }

        @Override // io.flutter.plugin.platform.d
        public void g() {
            setContainerView(null);
        }

        @Override // io.flutter.plugin.platform.d
        public View getView() {
            return this;
        }

        @Override // io.flutter.plugin.platform.d
        public void h() {
            i();
        }

        @Override // android.webkit.WebView
        public void removeJavascriptInterface(String str) {
            super.removeJavascriptInterface(str);
            this.f17778l.get(str).b();
            this.f17778l.remove(str);
        }

        @Override // android.webkit.WebView
        public void setDownloadListener(DownloadListener downloadListener) {
            super.setDownloadListener(downloadListener);
            this.f17776j.c((e.b) downloadListener);
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            this.f17777k.c((s2.b) webChromeClient);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f17775i.c((y2.a) webViewClient);
            s2.b a7 = this.f17777k.a();
            if (a7 != null) {
                a7.h(webViewClient);
            }
        }
    }

    private static class b<T extends p2> {

        /* renamed from: a, reason: collision with root package name */
        private T f17779a;

        b() {
        }

        b(T t6) {
            this.f17779a = t6;
        }

        T a() {
            return this.f17779a;
        }

        void b() {
            T t6 = this.f17779a;
            if (t6 != null) {
                t6.a();
            }
            this.f17779a = null;
        }

        void c(T t6) {
            b();
            this.f17779a = t6;
        }
    }

    public static class c extends WebView implements io.flutter.plugin.platform.d, p2 {

        /* renamed from: f, reason: collision with root package name */
        private final b<y2.a> f17780f;

        /* renamed from: g, reason: collision with root package name */
        private final b<e.b> f17781g;

        /* renamed from: h, reason: collision with root package name */
        private final b<s2.b> f17782h;

        /* renamed from: i, reason: collision with root package name */
        private final Map<String, b<m2>> f17783i;

        public c(Context context) {
            super(context);
            this.f17780f = new b<>();
            this.f17781g = new b<>();
            this.f17782h = new b<>();
            this.f17783i = new HashMap();
        }

        @Override // io.flutter.plugins.webviewflutter.p2
        public void a() {
            this.f17780f.b();
            this.f17781g.b();
            this.f17782h.b();
            Iterator<b<m2>> it = this.f17783i.values().iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f17783i.clear();
        }

        @Override // android.webkit.WebView
        @SuppressLint({"JavascriptInterface"})
        public void addJavascriptInterface(Object obj, String str) {
            super.addJavascriptInterface(obj, str);
            if (obj instanceof m2) {
                b<m2> bVar = this.f17783i.get(str);
                if (bVar != null && bVar.a() != obj) {
                    bVar.b();
                }
                this.f17783i.put(str, new b<>((m2) obj));
            }
        }

        @Override // io.flutter.plugin.platform.d
        public void d() {
            destroy();
        }

        @Override // io.flutter.plugin.platform.d
        public /* synthetic */ void e() {
            io.flutter.plugin.platform.c.d(this);
        }

        @Override // io.flutter.plugin.platform.d
        public /* synthetic */ void f(View view) {
            io.flutter.plugin.platform.c.a(this, view);
        }

        @Override // io.flutter.plugin.platform.d
        public /* synthetic */ void g() {
            io.flutter.plugin.platform.c.b(this);
        }

        @Override // io.flutter.plugin.platform.d
        public View getView() {
            return this;
        }

        @Override // io.flutter.plugin.platform.d
        public /* synthetic */ void h() {
            io.flutter.plugin.platform.c.c(this);
        }

        @Override // android.webkit.WebView
        public void removeJavascriptInterface(String str) {
            super.removeJavascriptInterface(str);
            this.f17783i.get(str).b();
            this.f17783i.remove(str);
        }

        @Override // android.webkit.WebView
        public void setDownloadListener(DownloadListener downloadListener) {
            super.setDownloadListener(downloadListener);
            this.f17781g.c((e.b) downloadListener);
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            this.f17782h.c((s2.b) webChromeClient);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f17780f.c((y2.a) webViewClient);
            s2.b a7 = this.f17782h.a();
            if (a7 != null) {
                a7.h(webViewClient);
            }
        }
    }

    public static class d {
        public a a(Context context, View view) {
            return new a(context, view);
        }

        public c b(Context context) {
            return new c(context);
        }

        public void c(boolean z6) {
            WebView.setWebContentsDebuggingEnabled(z6);
        }
    }

    public q3(i2 i2Var, d dVar, Context context, View view) {
        this.f17771a = i2Var;
        this.f17772b = dVar;
        this.f17774d = context;
        this.f17773c = view;
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void A(Long l7, Long l8) {
        ((WebView) this.f17771a.h(l7.longValue())).setWebViewClient((WebViewClient) this.f17771a.h(l8.longValue()));
    }

    public void B(Context context) {
        this.f17774d = context;
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void a(Long l7) {
        ViewParent viewParent = (WebView) this.f17771a.h(l7.longValue());
        if (viewParent != null) {
            ((p2) viewParent).a();
            this.f17771a.k(l7.longValue());
        }
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void b(Long l7, Boolean bool) {
        io.flutter.plugins.webviewflutter.c cVar = new io.flutter.plugins.webviewflutter.c();
        DisplayManager displayManager = (DisplayManager) this.f17774d.getSystemService("display");
        cVar.b(displayManager);
        Object b7 = bool.booleanValue() ? this.f17772b.b(this.f17774d) : this.f17772b.a(this.f17774d, this.f17773c);
        cVar.a(displayManager);
        this.f17771a.b(b7, l7.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public Long c(Long l7) {
        return Long.valueOf(((WebView) this.f17771a.h(l7.longValue())).getScrollX());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public String d(Long l7) {
        return ((WebView) this.f17771a.h(l7.longValue())).getTitle();
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void e(Long l7, String str, String str2, String str3) {
        ((WebView) this.f17771a.h(l7.longValue())).loadData(str, str2, str3);
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void f(Long l7) {
        ((WebView) this.f17771a.h(l7.longValue())).reload();
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void g(Long l7, Long l8) {
        WebView webView = (WebView) this.f17771a.h(l7.longValue());
        m2 m2Var = (m2) this.f17771a.h(l8.longValue());
        webView.addJavascriptInterface(m2Var, m2Var.f17736g);
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public Boolean h(Long l7) {
        return Boolean.valueOf(((WebView) this.f17771a.h(l7.longValue())).canGoForward());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void i(Long l7, String str, String str2, String str3, String str4, String str5) {
        ((WebView) this.f17771a.h(l7.longValue())).loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void j(Long l7) {
        ((WebView) this.f17771a.h(l7.longValue())).goBack();
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void k(Long l7, Long l8) {
        ((WebView) this.f17771a.h(l7.longValue())).setBackgroundColor(l8.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void l(Long l7, Long l8) {
        ((WebView) this.f17771a.h(l7.longValue())).setDownloadListener((DownloadListener) this.f17771a.h(l8.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void m(Boolean bool) {
        this.f17772b.c(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void n(Long l7, Long l8) {
        ((WebView) this.f17771a.h(l7.longValue())).setWebChromeClient((WebChromeClient) this.f17771a.h(l8.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void o(Long l7) {
        ((WebView) this.f17771a.h(l7.longValue())).goForward();
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void p(Long l7, String str, Map<String, String> map) {
        ((WebView) this.f17771a.h(l7.longValue())).loadUrl(str, map);
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public Boolean q(Long l7) {
        return Boolean.valueOf(((WebView) this.f17771a.h(l7.longValue())).canGoBack());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void r(Long l7, Boolean bool) {
        ((WebView) this.f17771a.h(l7.longValue())).clearCache(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public String s(Long l7) {
        return ((WebView) this.f17771a.h(l7.longValue())).getUrl();
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void t(Long l7, String str, byte[] bArr) {
        ((WebView) this.f17771a.h(l7.longValue())).postUrl(str, bArr);
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void u(Long l7, String str, final k.n<String> nVar) {
        WebView webView = (WebView) this.f17771a.h(l7.longValue());
        Objects.requireNonNull(nVar);
        webView.evaluateJavascript(str, new ValueCallback() { // from class: io.flutter.plugins.webviewflutter.p3
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                k.n.this.a((String) obj);
            }
        });
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void v(Long l7, Long l8, Long l9) {
        ((WebView) this.f17771a.h(l7.longValue())).scrollTo(l8.intValue(), l9.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void w(Long l7, Long l8) {
        ((WebView) this.f17771a.h(l7.longValue())).removeJavascriptInterface(((m2) this.f17771a.h(l8.longValue())).f17736g);
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public Long x(Long l7) {
        return Long.valueOf(((WebView) this.f17771a.h(l7.longValue())).getScrollY());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public k.e0 y(Long l7) {
        Objects.requireNonNull((WebView) this.f17771a.h(l7.longValue()));
        return new k.e0.a().b(Long.valueOf(r4.getScrollX())).c(Long.valueOf(r4.getScrollY())).a();
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void z(Long l7, Long l8, Long l9) {
        ((WebView) this.f17771a.h(l7.longValue())).scrollBy(l8.intValue(), l9.intValue());
    }
}
