package com.facebook.ads.internal.view.b;

import android.content.Context;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.q.a.j;
import com.facebook.ads.internal.q.a.s;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.r.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends com.facebook.ads.internal.q.c.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5528a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<b> f5529b;

    /* renamed from: c, reason: collision with root package name */
    private s f5530c;

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.ads.internal.r.a f5531d;
    private a.AbstractC0350a e;

    /* renamed from: com.facebook.ads.internal.view.b.a$a, reason: collision with other inner class name */
    public static class C0354a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5534a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference<a> f5535b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference<b> f5536c;

        /* renamed from: d, reason: collision with root package name */
        private final WeakReference<com.facebook.ads.internal.r.a> f5537d;

        private C0354a(a aVar, b bVar, com.facebook.ads.internal.r.a aVar2) {
            this.f5534a = C0354a.class.getSimpleName();
            this.f5535b = new WeakReference<>(aVar);
            this.f5536c = new WeakReference<>(bVar);
            this.f5537d = new WeakReference<>(aVar2);
        }

        @JavascriptInterface
        public void alert(String str) {
            Log.e(this.f5534a, str);
        }

        @JavascriptInterface
        public String getAnalogInfo() {
            return j.a(com.facebook.ads.internal.g.a.a());
        }

        @JavascriptInterface
        public void onPageInitialized() {
            a aVar = this.f5535b.get();
            if (aVar == null || aVar.c()) {
                return;
            }
            b bVar = this.f5536c.get();
            if (bVar != null) {
                bVar.a();
            }
            new Handler(Looper.getMainLooper()).post(new c(this.f5537d));
        }
    }

    public interface b {
        void a();

        void a(int i);

        void a(String str, Map<String, String> map);

        void b();
    }

    static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<com.facebook.ads.internal.r.a> f5538a;

        c(WeakReference<com.facebook.ads.internal.r.a> weakReference) {
            this.f5538a = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.facebook.ads.internal.r.a aVar = this.f5538a.get();
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    static class d extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<b> f5539a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference<com.facebook.ads.internal.r.a> f5540b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference<s> f5541c;

        d(WeakReference<b> weakReference, WeakReference<com.facebook.ads.internal.r.a> weakReference2, WeakReference<s> weakReference3) {
            this.f5539a = weakReference;
            this.f5540b = weakReference2;
            this.f5541c = weakReference3;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HashMap hashMap = new HashMap();
            if (this.f5540b.get() != null) {
                this.f5540b.get().a(hashMap);
            }
            if (this.f5541c.get() != null) {
                hashMap.put("touch", j.a(this.f5541c.get().e()));
            }
            if (this.f5539a.get() == null) {
                return true;
            }
            this.f5539a.get().a(str, hashMap);
            return true;
        }
    }

    public a(Context context, WeakReference<b> weakReference, int i) {
        super(context);
        this.f5530c = new s();
        this.f5529b = weakReference;
        this.e = new a.AbstractC0350a() { // from class: com.facebook.ads.internal.view.b.a.1
            @Override // com.facebook.ads.internal.r.a.AbstractC0350a
            public void a() {
                a.this.f5530c.a();
                if (a.this.f5529b.get() != null) {
                    ((b) a.this.f5529b.get()).b();
                }
            }
        };
        this.f5531d = new com.facebook.ads.internal.r.a(this, i, this.e);
        setWebChromeClient(a());
        setWebViewClient(b());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        addJavascriptInterface(new C0354a(weakReference.get(), this.f5531d), "AdControl");
    }

    @Override // com.facebook.ads.internal.q.c.a
    protected WebChromeClient a() {
        return new WebChromeClient() { // from class: com.facebook.ads.internal.view.b.a.2
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return true;
            }
        };
    }

    public void a(int i, int i2) {
        this.f5531d.a(i);
        this.f5531d.b(i2);
    }

    @Override // com.facebook.ads.internal.q.c.a
    protected WebViewClient b() {
        return new d(this.f5529b, new WeakReference(this.f5531d), new WeakReference(this.f5530c));
    }

    @Override // com.facebook.ads.internal.q.c.a, android.webkit.WebView
    public void destroy() {
        if (this.f5531d != null) {
            this.f5531d.b();
            this.f5531d = null;
        }
        v.b(this);
        this.e = null;
        this.f5530c = null;
        com.facebook.ads.internal.q.c.b.a(this);
        super.destroy();
    }

    public Map<String, String> getTouchData() {
        return this.f5530c.e();
    }

    public com.facebook.ads.internal.r.a getViewabilityChecker() {
        return this.f5531d;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f5530c.a(motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f5529b.get() != null) {
            this.f5529b.get().a(i);
        }
        if (this.f5531d != null) {
            if (i == 0) {
                this.f5531d.a();
            } else if (i == 8) {
                this.f5531d.b();
            }
        }
    }
}
