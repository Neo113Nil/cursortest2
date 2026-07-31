package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.hermes.intl.Constants;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class yj implements uj {

    /* renamed from: a, reason: collision with root package name */
    public final Context f514a;
    public final pa b;
    public final pa c;
    public final pa d;
    public final c7 e;
    public String g;
    public final pa i;
    public final LinkedList f = new LinkedList();
    public boolean h = true;
    public final Runnable j = new Runnable() { // from class: com.startapp.sdk.internal.yj$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            yj.this.e();
        }
    };

    public yj(Context context, pa paVar, pa paVar2, pa paVar3, final c7 c7Var) {
        if (Build.VERSION.SDK_INT < 31 || context.isUiContext()) {
            this.f514a = context;
        } else {
            this.f514a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
        }
        this.b = paVar;
        this.c = paVar2;
        this.d = paVar3;
        this.e = c7Var;
        this.i = new pa(new c7() { // from class: com.startapp.sdk.internal.yj$$ExternalSyntheticLambda3
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return yj.a(c7.this);
            }
        });
    }

    public final void a(String str) {
        this.g = str;
    }

    @Override // com.startapp.sdk.internal.uj
    public final void b() {
        d();
    }

    @Override // com.startapp.sdk.internal.uj
    public final WebView c() {
        if (this.f.isEmpty()) {
            WebView webView = new WebView(this.f514a);
            webView.setWebViewClient(new tj());
            return webView;
        }
        if (this.f.size() == 1) {
            d();
        }
        return (WebView) this.f.removeFirst();
    }

    public final void d() {
        try {
            kb kbVar = (kb) this.d.a();
            Runnable runnable = this.j;
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

    public final void e() {
        WebView webView;
        if (!this.f.isEmpty()) {
            if (this.h && TextUtils.isEmpty(this.g)) {
                this.h = false;
                if (!Constants.COLLATION_DEFAULT.equals(this.i.a())) {
                    if ("headers".equals(this.i.a())) {
                        a((WebView) this.f.removeFirst());
                        return;
                    }
                    return;
                } else {
                    try {
                        ((Executor) this.b.a()).execute(new vj(this));
                        return;
                    } catch (Throwable th) {
                        if (a(8)) {
                            n8.a(th);
                            return;
                        }
                        return;
                    }
                }
            }
            return;
        }
        try {
            webView = new WebView(this.f514a);
            webView.setWebViewClient(new tj());
        } catch (Throwable th2) {
            if (a(2)) {
                n8.a(th2);
            }
            webView = null;
        }
        if (webView != null) {
            try {
                this.f.addLast(webView);
            } catch (Throwable th3) {
                if (a(4)) {
                    n8.a(th3);
                }
            }
            if (this.h && TextUtils.isEmpty(this.g)) {
                d();
            }
        }
    }

    public final void f() {
        try {
            final String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f514a);
            v7 v7Var = (v7) this.c.a();
            v7Var.f464a.post(new Runnable() { // from class: com.startapp.sdk.internal.yj$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    yj.this.a(defaultUserAgent);
                }
            });
        } catch (Throwable th) {
            if (a(16)) {
                n8.a(th);
            }
        }
    }

    public static /* synthetic */ String a(c7 c7Var) {
        WvfMetadata wvfMetadata = (WvfMetadata) c7Var.call();
        WeightedChoice b = wvfMetadata != null ? wvfMetadata.b() : null;
        String a2 = b != null ? b.a() : null;
        return a2 != null ? a2 : Constants.COLLATION_DEFAULT;
    }

    public final boolean a(int i) {
        WvfMetadata wvfMetadata = (WvfMetadata) this.e.call();
        ComponentInfoEventConfig a2 = wvfMetadata != null ? wvfMetadata.a() : null;
        return a2 != null && a2.a((long) i);
    }

    @Override // com.startapp.sdk.internal.uj
    public final String a() {
        String str = this.g;
        WeakHashMap weakHashMap = zh.f528a;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        try {
            String property = System.getProperty("http.agent");
            if (property != null) {
                if (property.length() > 0) {
                    return property;
                }
            }
            return null;
        } catch (Throwable th) {
            if (a(1)) {
                n8.a(th);
            }
            return null;
        }
    }

    public final void a(final WebView webView) {
        try {
            webView.setWebViewClient(new wj(this));
            final String a2 = zh.a();
            v7 v7Var = (v7) this.c.a();
            v7Var.f464a.post(new Runnable() { // from class: com.startapp.sdk.internal.yj$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    webView.loadUrl(a2);
                }
            });
        } catch (Throwable th) {
            if (a(32)) {
                n8.a(th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
    
        if (r4.length() > 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        try {
            if (webResourceRequest != null) {
                try {
                    Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                    if (requestHeaders != null) {
                        str = requestHeaders.get("User-Agent");
                        WeakHashMap weakHashMap = zh.f528a;
                        if (str != null) {
                        }
                    }
                } catch (Throwable th) {
                    if (a(128)) {
                        n8.a(th);
                    }
                }
            }
            str = null;
            v7 v7Var = (v7) this.c.a();
            v7Var.f464a.post(new xj(this, str, webView));
        } catch (Throwable th2) {
            if (a(64)) {
                n8.a(th2);
            }
        }
    }
}
