package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vk implements rk {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7775a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f7776b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f7777c;

    /* renamed from: d, reason: collision with root package name */
    public final ib f7778d;

    /* renamed from: e, reason: collision with root package name */
    public final i7 f7779e;

    /* renamed from: g, reason: collision with root package name */
    public String f7781g;

    /* renamed from: i, reason: collision with root package name */
    public final ib f7783i;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f7780f = new LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f7782h = true;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f7784j = new R1.n(23, this);

    public vk(Context context, ib ibVar, ib ibVar2, ib ibVar3, i7 i7Var) {
        boolean isUiContext;
        Context createWindowContext;
        if (Build.VERSION.SDK_INT >= 31) {
            isUiContext = context.isUiContext();
            if (!isUiContext) {
                createWindowContext = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
                this.f7775a = createWindowContext;
                this.f7776b = ibVar;
                this.f7777c = ibVar2;
                this.f7778d = ibVar3;
                this.f7779e = i7Var;
                this.f7783i = new ib(new D(i7Var, 1));
            }
        }
        this.f7775a = context;
        this.f7776b = ibVar;
        this.f7777c = ibVar2;
        this.f7778d = ibVar3;
        this.f7779e = i7Var;
        this.f7783i = new ib(new D(i7Var, 1));
    }

    public final void a(String str) {
        this.f7781g = str;
    }

    @Override // com.startapp.sdk.internal.rk
    public final void b() {
        d();
    }

    @Override // com.startapp.sdk.internal.rk
    public final WebView c() {
        if (this.f7780f.isEmpty()) {
            WebView webView = new WebView(this.f7775a);
            webView.setWebViewClient(new qk());
            return webView;
        }
        if (this.f7780f.size() == 1) {
            d();
        }
        return (WebView) this.f7780f.removeFirst();
    }

    public final void d() {
        try {
            dc dcVar = (dc) this.f7778d.a();
            Runnable runnable = this.f7784j;
            synchronized (dcVar) {
                if (dcVar.f6804c != null) {
                    return;
                }
                Thread thread = new Thread(new cc(dcVar, runnable), "startapp-lid-" + dc.f6801g.incrementAndGet());
                dcVar.f6804c = thread;
                thread.start();
            }
        } catch (Throwable th) {
            if (a(256)) {
                d9.a(th);
            }
        }
    }

    public final void e() {
        WebView webView;
        if (!this.f7780f.isEmpty()) {
            if (this.f7782h && TextUtils.isEmpty(this.f7781g)) {
                this.f7782h = false;
                if (!"default".equals(this.f7783i.a())) {
                    if ("headers".equals(this.f7783i.a())) {
                        a((WebView) this.f7780f.removeFirst());
                        return;
                    }
                    return;
                } else {
                    try {
                        ((Executor) this.f7776b.a()).execute(new sk(this));
                        return;
                    } catch (Throwable th) {
                        if (a(8)) {
                            d9.a(th);
                            return;
                        }
                        return;
                    }
                }
            }
            return;
        }
        try {
            webView = new WebView(this.f7775a);
            webView.setWebViewClient(new qk());
        } catch (Throwable th2) {
            if (a(2)) {
                d9.a(th2);
            }
            webView = null;
        }
        if (webView != null) {
            try {
                this.f7780f.addLast(webView);
            } catch (Throwable th3) {
                if (a(4)) {
                    d9.a(th3);
                }
            }
            if (this.f7782h && TextUtils.isEmpty(this.f7781g)) {
                d();
            }
        }
    }

    public final void f() {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f7775a);
            k8 k8Var = (k8) this.f7777c.a();
            k8Var.f7181a.post(new R1.e(this, 27, defaultUserAgent));
        } catch (Throwable th) {
            if (a(16)) {
                d9.a(th);
            }
        }
    }

    public static /* synthetic */ String a(i7 i7Var) {
        WvfMetadata wvfMetadata = (WvfMetadata) i7Var.a();
        WeightedChoice b4 = wvfMetadata != null ? wvfMetadata.b() : null;
        String a3 = b4 != null ? b4.a() : null;
        return a3 != null ? a3 : "default";
    }

    public final boolean a(int i4) {
        WvfMetadata wvfMetadata = (WvfMetadata) this.f7779e.a();
        ComponentInfoEventConfig a3 = wvfMetadata != null ? wvfMetadata.a() : null;
        return a3 != null && a3.a((long) i4);
    }

    @Override // com.startapp.sdk.internal.rk
    public final String a() {
        String str = this.f7781g;
        WeakHashMap weakHashMap = si.f7575a;
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
                d9.a(th);
            }
            return null;
        }
    }

    public final void a(WebView webView) {
        try {
            webView.setWebViewClient(new tk(this));
            String a3 = si.a();
            k8 k8Var = (k8) this.f7777c.a();
            k8Var.f7181a.post(new R1.e(webView, 28, a3));
        } catch (Throwable th) {
            if (a(32)) {
                d9.a(th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
    
        if (r4.length() > 0) goto L18;
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
                        WeakHashMap weakHashMap = si.f7575a;
                        if (str != null) {
                        }
                    }
                } catch (Throwable th) {
                    if (a(128)) {
                        d9.a(th);
                    }
                }
            }
            str = null;
            k8 k8Var = (k8) this.f7777c.a();
            k8Var.f7181a.post(new uk(this, str, webView));
        } catch (Throwable th2) {
            if (a(64)) {
                d9.a(th2);
            }
        }
    }
}
