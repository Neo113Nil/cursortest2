package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.hermes.intl.Constants;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class bk implements uj {

    /* renamed from: a, reason: collision with root package name */
    public final pa f190a;
    public final pa b;
    public final pa c;
    public final pa d;
    public final c7 e;
    public final z2 f;
    public final Context g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final LinkedList l;
    public volatile String m;
    public boolean n;

    public bk(Context context, pa paVar, pa paVar2, pa paVar3, pa paVar4, c7 c7Var, z2 z2Var) {
        context.getClass();
        paVar2.getClass();
        paVar3.getClass();
        c7Var.getClass();
        z2Var.getClass();
        this.f190a = paVar;
        this.b = paVar2;
        this.c = paVar3;
        this.d = paVar4;
        this.e = c7Var;
        this.f = z2Var;
        if (Build.VERSION.SDK_INT >= 31 && !context.isUiContext()) {
            context = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
            context.getClass();
        }
        this.g = context;
        this.h = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.internal.bk$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bk.b(bk.this);
            }
        });
        this.i = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.internal.bk$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(bk.j(bk.this));
            }
        });
        this.j = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.internal.bk$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bk.c(bk.this);
            }
        });
        this.k = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.internal.bk$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(bk.e(bk.this));
            }
        });
        this.l = new LinkedList();
        this.n = true;
    }

    public static final WvfMetadata b(bk bkVar) {
        return (WvfMetadata) bkVar.e.call();
    }

    public static final String c(bk bkVar) {
        WeightedChoice b;
        String a2;
        WvfMetadata wvfMetadata = (WvfMetadata) bkVar.h.getValue();
        return (wvfMetadata == null || (b = wvfMetadata.b()) == null || (a2 = b.a()) == null) ? Constants.COLLATION_DEFAULT : a2;
    }

    public static final long e(bk bkVar) {
        WvfMetadata wvfMetadata = (WvfMetadata) bkVar.h.getValue();
        return Math.min(Math.max(60000L, wvfMetadata != null ? wvfMetadata.d() : 2592000000L), 31536000000L);
    }

    public static final void g(final bk bkVar) {
        bkVar.getClass();
        try {
            if (bkVar.f.a() < ((af) bkVar.f190a.a()).getLong("06202469550e108e", 0L) + ((Number) bkVar.k.getValue()).longValue()) {
                String string = ((af) bkVar.f190a.a()).getString("5b47fb537d32a117", null);
                String c = string != null ? zh.c(string) : null;
                if (c != null && !StringsKt.isBlank(c)) {
                    bkVar.m = c;
                }
            }
        } catch (Throwable th) {
            if (bkVar.a(4096)) {
                n8.a(th);
            }
        }
        ((v7) bkVar.c.a()).f464a.post(new Runnable() { // from class: com.startapp.sdk.internal.bk$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                bk.this.f();
            }
        });
    }

    public static final boolean j(bk bkVar) {
        EnabledConfig e;
        WvfMetadata wvfMetadata = (WvfMetadata) bkVar.h.getValue();
        if (wvfMetadata == null || (e = wvfMetadata.e()) == null) {
            return false;
        }
        return e.a(bkVar.f);
    }

    public final boolean a(int i) {
        ComponentInfoEventConfig a2;
        WvfMetadata wvfMetadata = (WvfMetadata) this.h.getValue();
        if (wvfMetadata == null || (a2 = wvfMetadata.a()) == null) {
            return false;
        }
        return a2.a(i);
    }

    public final void d() {
        try {
            if (!this.l.isEmpty()) {
                if (!this.n) {
                    return;
                }
                String str = this.m;
                if (str != null && !StringsKt.isBlank(str)) {
                    return;
                }
            }
            kb kbVar = (kb) this.d.a();
            Runnable runnable = new Runnable() { // from class: com.startapp.sdk.internal.bk$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    bk.a(bk.this);
                }
            };
            synchronized (kbVar) {
                if (kbVar.c != null) {
                    return;
                }
                Thread thread = new Thread(new jb(kbVar, runnable), "startapp-lid-" + kb.g.incrementAndGet());
                kbVar.c = thread;
                thread.start();
            }
        } catch (Throwable th) {
            if (a(256)) {
                n8.a(th);
            }
        }
    }

    public final void f() {
        try {
            if (this.n) {
                String str = this.m;
                if (str == null || StringsKt.isBlank(str)) {
                    this.n = false;
                    String str2 = (String) this.j.getValue();
                    if (Intrinsics.areEqual(str2, Constants.COLLATION_DEFAULT)) {
                        e();
                    } else if (Intrinsics.areEqual(str2, "headers")) {
                        a(c());
                    }
                }
            }
        } catch (Throwable th) {
            if (a(8192)) {
                n8.a(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:2:0x0000, B:4:0x0004, B:9:0x0010, B:10:0x0020, B:12:0x002e, B:16:0x0043), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:2:0x0000, B:4:0x0004, B:9:0x0010, B:10:0x0020, B:12:0x002e, B:16:0x0043), top: B:1:0x0000 }] */
    @Override // com.startapp.sdk.internal.uj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        try {
            String str = this.m;
            if (str != null && !StringsKt.isBlank(str)) {
                z = false;
                if (z) {
                    ((Executor) this.b.a()).execute(new Runnable() { // from class: com.startapp.sdk.internal.bk$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            bk.g(bk.this);
                        }
                    });
                }
                if (!((Boolean) this.i.getValue()).booleanValue()) {
                    v7 v7Var = (v7) this.c.a();
                    v7Var.f464a.post(new Runnable() { // from class: com.startapp.sdk.internal.bk$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            bk.this.d();
                        }
                    });
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    v7 v7Var2 = (v7) this.c.a();
                    v7Var2.f464a.post(new Runnable() { // from class: com.startapp.sdk.internal.bk$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            bk.this.f();
                        }
                    });
                    return;
                }
            }
            z = true;
            if (z) {
            }
            if (!((Boolean) this.i.getValue()).booleanValue()) {
            }
        } catch (Throwable th) {
            if (a(16384)) {
                n8.a(th);
            }
        }
    }

    @Override // com.startapp.sdk.internal.uj
    public final String a() {
        String str = this.m;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String property = System.getProperty("http.agent");
        if (property == null || StringsKt.isBlank(property)) {
            return null;
        }
        return property;
    }

    @Override // com.startapp.sdk.internal.uj
    public final WebView c() {
        WebView webView = (WebView) this.l.poll();
        if (webView == null) {
            webView = new WebView(this.g);
            webView.setWebViewClient(new tj());
        }
        if (((Boolean) this.i.getValue()).booleanValue()) {
            d();
        }
        return webView;
    }

    public final void e() {
        try {
            ((Executor) this.b.a()).execute(new Runnable() { // from class: com.startapp.sdk.internal.bk$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    bk.d(bk.this);
                }
            });
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            if (a(8)) {
                n8.a(th);
            }
        }
    }

    public final void a(String str) {
        if (str != null) {
            try {
                String h = zh.h(str);
                if (h != null) {
                    ze edit = ((af) this.f190a.a()).edit();
                    edit.a("5b47fb537d32a117", h);
                    edit.f526a.putString("5b47fb537d32a117", h);
                    edit.putLong("06202469550e108e", this.f.a()).f526a.commit();
                }
            } catch (IOException e) {
                if (a(2048)) {
                    n8.a(e);
                }
            }
        }
    }

    public static final void b(WebView webView) {
        webView.loadUrl(zh.a());
    }

    public static final void a(bk bkVar) {
        WebView webView;
        bkVar.getClass();
        try {
            if (bkVar.l.isEmpty()) {
                try {
                    webView = new WebView(bkVar.g);
                    webView.setWebViewClient(new tj());
                } catch (Throwable th) {
                    if (bkVar.a(2)) {
                        n8.a(th);
                    }
                    webView = null;
                }
                if (webView != null) {
                    bkVar.l.add(webView);
                    bkVar.d();
                    return;
                }
                return;
            }
            bkVar.f();
        } catch (Throwable th2) {
            if (bkVar.a(1024)) {
                n8.a(th2);
            }
        }
    }

    public static final void d(bk bkVar) {
        bkVar.getClass();
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(bkVar.g);
            if (defaultUserAgent != null) {
                if (!StringsKt.isBlank(defaultUserAgent)) {
                    bkVar.m = defaultUserAgent;
                }
                bkVar.a(defaultUserAgent);
            }
        } catch (Throwable th) {
            if (bkVar.a(16)) {
                n8.a(th);
            }
        }
    }

    public final void a(final WebView webView) {
        try {
            webView.setWebViewClient(new ak(this));
            v7 v7Var = (v7) this.c.a();
            v7Var.f464a.post(new Runnable() { // from class: com.startapp.sdk.internal.bk$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    bk.b(webView);
                }
            });
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            if (a(32)) {
                n8.a(th);
            }
        }
    }

    public static final void a(WebView webView, bk bkVar) {
        webView.setWebViewClient(new tj());
        bkVar.l.add(webView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r3) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        try {
            if (webResourceRequest != null) {
                try {
                    Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                    if (requestHeaders != null && (r3 = requestHeaders.get("User-Agent")) != null) {
                    }
                } catch (Throwable th) {
                    if (a(128)) {
                        n8.a(th);
                    }
                }
            }
            String str = null;
            if (str != null && !StringsKt.isBlank(str)) {
                this.m = str;
            }
            a(str);
            ((v7) this.c.a()).f464a.post(new Runnable() { // from class: com.startapp.sdk.internal.bk$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    bk.a(webView, this);
                }
            });
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th2) {
            if (a(64)) {
                n8.a(th2);
            }
        }
    }
}
