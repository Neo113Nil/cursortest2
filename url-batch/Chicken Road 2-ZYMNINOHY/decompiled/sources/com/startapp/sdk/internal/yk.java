package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c3.C0295g;
import c3.InterfaceC0291c;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Executor;
import o3.InterfaceC1328a;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class yk implements rk {

    /* renamed from: a, reason: collision with root package name */
    public final ib f7971a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f7972b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f7973c;

    /* renamed from: d, reason: collision with root package name */
    public final ib f7974d;

    /* renamed from: e, reason: collision with root package name */
    public final i7 f7975e;

    /* renamed from: f, reason: collision with root package name */
    public final e3 f7976f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f7977g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0291c f7978h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0291c f7979i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0291c f7980j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0291c f7981k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedList f7982l;

    /* renamed from: m, reason: collision with root package name */
    public volatile String f7983m;
    public boolean n;

    public yk(Context context, ib prefs, ib threadPool, ib uiExecutor, ib looperIdleDetector, i7 metadataHolder, e3 clock) {
        boolean isUiContext;
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(prefs, "prefs");
        kotlin.jvm.internal.i.e(threadPool, "threadPool");
        kotlin.jvm.internal.i.e(uiExecutor, "uiExecutor");
        kotlin.jvm.internal.i.e(looperIdleDetector, "looperIdleDetector");
        kotlin.jvm.internal.i.e(metadataHolder, "metadataHolder");
        kotlin.jvm.internal.i.e(clock, "clock");
        this.f7971a = prefs;
        this.f7972b = threadPool;
        this.f7973c = uiExecutor;
        this.f7974d = looperIdleDetector;
        this.f7975e = metadataHolder;
        this.f7976f = clock;
        if (Build.VERSION.SDK_INT >= 31) {
            isUiContext = context.isUiContext();
            if (!isUiContext) {
                context = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
                kotlin.jvm.internal.i.b(context);
            }
        }
        this.f7977g = context;
        final int i4 = 0;
        this.f7978h = new C0295g(new InterfaceC1328a(this) { // from class: com.startapp.sdk.internal.M

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yk f6635b;

            {
                this.f6635b = this;
            }

            @Override // o3.InterfaceC1328a
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return yk.b(this.f6635b);
                    case 1:
                        return Boolean.valueOf(yk.j(this.f6635b));
                    case 2:
                        return yk.c(this.f6635b);
                    default:
                        return Long.valueOf(yk.e(this.f6635b));
                }
            }
        });
        final int i5 = 1;
        this.f7979i = new C0295g(new InterfaceC1328a(this) { // from class: com.startapp.sdk.internal.M

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yk f6635b;

            {
                this.f6635b = this;
            }

            @Override // o3.InterfaceC1328a
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return yk.b(this.f6635b);
                    case 1:
                        return Boolean.valueOf(yk.j(this.f6635b));
                    case 2:
                        return yk.c(this.f6635b);
                    default:
                        return Long.valueOf(yk.e(this.f6635b));
                }
            }
        });
        final int i6 = 2;
        this.f7980j = new C0295g(new InterfaceC1328a(this) { // from class: com.startapp.sdk.internal.M

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yk f6635b;

            {
                this.f6635b = this;
            }

            @Override // o3.InterfaceC1328a
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return yk.b(this.f6635b);
                    case 1:
                        return Boolean.valueOf(yk.j(this.f6635b));
                    case 2:
                        return yk.c(this.f6635b);
                    default:
                        return Long.valueOf(yk.e(this.f6635b));
                }
            }
        });
        final int i7 = 3;
        this.f7981k = new C0295g(new InterfaceC1328a(this) { // from class: com.startapp.sdk.internal.M

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yk f6635b;

            {
                this.f6635b = this;
            }

            @Override // o3.InterfaceC1328a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return yk.b(this.f6635b);
                    case 1:
                        return Boolean.valueOf(yk.j(this.f6635b));
                    case 2:
                        return yk.c(this.f6635b);
                    default:
                        return Long.valueOf(yk.e(this.f6635b));
                }
            }
        });
        this.f7982l = new LinkedList();
        this.n = true;
    }

    public static final WvfMetadata b(yk this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        return (WvfMetadata) this$0.f7975e.a();
    }

    public static final String c(yk this$0) {
        WeightedChoice b4;
        String a3;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        WvfMetadata wvfMetadata = (WvfMetadata) ((C0295g) this$0.f7978h).a();
        return (wvfMetadata == null || (b4 = wvfMetadata.b()) == null || (a3 = b4.a()) == null) ? "default" : a3;
    }

    public static final long e(yk this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        WvfMetadata wvfMetadata = (WvfMetadata) ((C0295g) this$0.f7978h).a();
        return Math.min(Math.max(60000L, wvfMetadata != null ? wvfMetadata.d() : 2592000000L), 31536000000L);
    }

    public static final void g(yk this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        try {
            if (this$0.f7976f.a() < ((sf) this$0.f7971a.a()).getLong("06202469550e108e", 0L) + ((Number) ((C0295g) this$0.f7981k).a()).longValue()) {
                String string = ((sf) this$0.f7971a.a()).getString("5b47fb537d32a117", null);
                String c4 = string != null ? si.c(string) : null;
                if (c4 != null && !AbstractC1510g.j0(c4)) {
                    this$0.f7983m = c4;
                }
            }
        } catch (Throwable th) {
            if (this$0.a(4096)) {
                d9.a(th);
            }
        }
        ((k8) this$0.f7973c.a()).f7181a.post(new L(this$0, 3));
    }

    public static final boolean j(yk this$0) {
        EnabledConfig e4;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        WvfMetadata wvfMetadata = (WvfMetadata) ((C0295g) this$0.f7978h).a();
        if (wvfMetadata == null || (e4 = wvfMetadata.e()) == null) {
            return false;
        }
        return e4.a(this$0.f7976f);
    }

    public final boolean a(int i4) {
        ComponentInfoEventConfig a3;
        WvfMetadata wvfMetadata = (WvfMetadata) ((C0295g) this.f7978h).a();
        if (wvfMetadata == null || (a3 = wvfMetadata.a()) == null) {
            return false;
        }
        return a3.a(i4);
    }

    public final void d() {
        try {
            if (!this.f7982l.isEmpty()) {
                if (!this.n) {
                    return;
                }
                String str = this.f7983m;
                if (str != null && !AbstractC1510g.j0(str)) {
                    return;
                }
            }
            dc dcVar = (dc) this.f7974d.a();
            L l4 = new L(this, 0);
            synchronized (dcVar) {
                if (dcVar.f6804c != null) {
                    return;
                }
                Thread thread = new Thread(new cc(dcVar, l4), "startapp-lid-" + dc.f6801g.incrementAndGet());
                dcVar.f6804c = thread;
                thread.start();
            }
        } catch (Throwable th) {
            if (a(256)) {
                d9.a(th);
            }
        }
    }

    public final void f() {
        try {
            if (this.n) {
                String str = this.f7983m;
                if (str != null && !AbstractC1510g.j0(str)) {
                    return;
                }
                this.n = false;
                String str2 = (String) ((C0295g) this.f7980j).a();
                if (kotlin.jvm.internal.i.a(str2, "default")) {
                    e();
                } else if (kotlin.jvm.internal.i.a(str2, "headers")) {
                    a(c());
                }
            }
        } catch (Throwable th) {
            if (a(8192)) {
                d9.a(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:2:0x0000, B:4:0x0004, B:9:0x0012, B:10:0x0023, B:12:0x0033, B:16:0x0049), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:2:0x0000, B:4:0x0004, B:9:0x0012, B:10:0x0023, B:12:0x0033, B:16:0x0049), top: B:1:0x0000 }] */
    @Override // com.startapp.sdk.internal.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        try {
            String str = this.f7983m;
            if (str != null && !AbstractC1510g.j0(str)) {
                z = false;
                if (z) {
                    ((Executor) this.f7972b.a()).execute(new L(this, 4));
                }
                if (!((Boolean) ((C0295g) this.f7979i).a()).booleanValue()) {
                    k8 k8Var = (k8) this.f7973c.a();
                    k8Var.f7181a.post(new L(this, 5));
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    k8 k8Var2 = (k8) this.f7973c.a();
                    k8Var2.f7181a.post(new L(this, 1));
                    return;
                }
            }
            z = true;
            if (z) {
            }
            if (!((Boolean) ((C0295g) this.f7979i).a()).booleanValue()) {
            }
        } catch (Throwable th) {
            if (a(16384)) {
                d9.a(th);
            }
        }
    }

    @Override // com.startapp.sdk.internal.rk
    public final String a() {
        String str = this.f7983m;
        if (str != null) {
            if (AbstractC1510g.j0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String property = System.getProperty("http.agent");
        if (property == null || AbstractC1510g.j0(property)) {
            return null;
        }
        return property;
    }

    @Override // com.startapp.sdk.internal.rk
    public final WebView c() {
        WebView webView = (WebView) this.f7982l.poll();
        if (webView == null) {
            webView = new WebView(this.f7977g);
            webView.setWebViewClient(new qk());
        }
        if (((Boolean) ((C0295g) this.f7979i).a()).booleanValue()) {
            d();
        }
        return webView;
    }

    public final void e() {
        try {
            ((Executor) this.f7972b.a()).execute(new L(this, 2));
        } catch (Throwable th) {
            if (a(8)) {
                d9.a(th);
            }
        }
    }

    public final void a(String str) {
        if (str != null) {
            try {
                String h2 = si.h(str);
                if (h2 != null) {
                    rf edit = ((sf) this.f7971a.a()).edit();
                    edit.a("5b47fb537d32a117", h2);
                    edit.f7532a.putString("5b47fb537d32a117", h2);
                    long a3 = this.f7976f.a();
                    edit.a("06202469550e108e", Long.valueOf(a3));
                    edit.f7532a.putLong("06202469550e108e", a3);
                    edit.f7532a.commit();
                }
            } catch (IOException e4) {
                if (a(2048)) {
                    d9.a(e4);
                }
            }
        }
    }

    public static final void b(WebView webView) {
        kotlin.jvm.internal.i.e(webView, "$webView");
        String a3 = si.a();
        kotlin.jvm.internal.i.d(a3, "cipherVigenere(...)");
        webView.loadUrl(a3);
    }

    public static final void d(yk ykVar) {
        ykVar.getClass();
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(ykVar.f7977g);
            if (defaultUserAgent != null) {
                if (!AbstractC1510g.j0(defaultUserAgent)) {
                    ykVar.f7983m = defaultUserAgent;
                }
                ykVar.a(defaultUserAgent);
            }
        } catch (Throwable th) {
            if (ykVar.a(16)) {
                d9.a(th);
            }
        }
    }

    public static final void a(yk ykVar) {
        WebView webView;
        ykVar.getClass();
        try {
            if (ykVar.f7982l.isEmpty()) {
                try {
                    webView = new WebView(ykVar.f7977g);
                    webView.setWebViewClient(new qk());
                } catch (Throwable th) {
                    if (ykVar.a(2)) {
                        d9.a(th);
                    }
                    webView = null;
                }
                if (webView != null) {
                    ykVar.f7982l.add(webView);
                    ykVar.d();
                    return;
                }
                return;
            }
            ykVar.f();
        } catch (Throwable th2) {
            if (ykVar.a(1024)) {
                d9.a(th2);
            }
        }
    }

    public final void a(WebView webView) {
        try {
            webView.setWebViewClient(new xk(this));
            k8 k8Var = (k8) this.f7973c.a();
            k8Var.f7181a.post(new R1.n(25, webView));
        } catch (Throwable th) {
            if (a(32)) {
                d9.a(th);
            }
        }
    }

    public static final void a(WebView webView, yk this$0) {
        kotlin.jvm.internal.i.e(webView, "$webView");
        kotlin.jvm.internal.i.e(this$0, "this$0");
        webView.setWebViewClient(new qk());
        this$0.f7982l.add(webView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001b, code lost:
    
        if (w3.AbstractC1510g.j0(r4) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(WebView webView, WebResourceRequest webResourceRequest) {
        kotlin.jvm.internal.i.e(webView, "webView");
        try {
            if (webResourceRequest != null) {
                try {
                    Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                    if (requestHeaders != null && (r4 = requestHeaders.get("User-Agent")) != null) {
                    }
                } catch (Throwable th) {
                    if (a(128)) {
                        d9.a(th);
                    }
                }
            }
            String str = null;
            if (str != null && !AbstractC1510g.j0(str)) {
                this.f7983m = str;
            }
            a(str);
            ((k8) this.f7973c.a()).f7181a.post(new R1.e(webView, 29, this));
        } catch (Throwable th2) {
            if (a(64)) {
                d9.a(th2);
            }
        }
    }
}
