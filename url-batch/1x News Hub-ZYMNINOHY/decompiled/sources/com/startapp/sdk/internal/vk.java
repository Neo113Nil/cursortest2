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
    public final Context f4631a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f4632b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f4633c;

    /* renamed from: d, reason: collision with root package name */
    public final ib f4634d;

    /* renamed from: e, reason: collision with root package name */
    public final i7 f4635e;

    /* renamed from: g, reason: collision with root package name */
    public String f4636g;

    /* renamed from: i, reason: collision with root package name */
    public final ib f4638i;
    public final LinkedList f = new LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f4637h = true;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f4639j = new B0.n(16, this);

    public vk(Context context, ib ibVar, ib ibVar2, ib ibVar3, i7 i7Var) {
        boolean isUiContext;
        Context createWindowContext;
        if (Build.VERSION.SDK_INT >= 31) {
            isUiContext = context.isUiContext();
            if (!isUiContext) {
                createWindowContext = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
                this.f4631a = createWindowContext;
                this.f4632b = ibVar;
                this.f4633c = ibVar2;
                this.f4634d = ibVar3;
                this.f4635e = i7Var;
                this.f4638i = new ib(new B(i7Var, 1));
            }
        }
        this.f4631a = context;
        this.f4632b = ibVar;
        this.f4633c = ibVar2;
        this.f4634d = ibVar3;
        this.f4635e = i7Var;
        this.f4638i = new ib(new B(i7Var, 1));
    }

    public final void a(String str) {
        this.f4636g = str;
    }

    @Override // com.startapp.sdk.internal.rk
    public final void b() {
        d();
    }

    @Override // com.startapp.sdk.internal.rk
    public final WebView c() {
        if (this.f.isEmpty()) {
            WebView webView = new WebView(this.f4631a);
            webView.setWebViewClient(new qk());
            return webView;
        }
        if (this.f.size() == 1) {
            d();
        }
        return (WebView) this.f.removeFirst();
    }

    public final void d() {
        try {
            dc dcVar = (dc) this.f4634d.a();
            Runnable runnable = this.f4639j;
            synchronized (dcVar) {
                if (dcVar.f3691c != null) {
                    return;
                }
                Thread thread = new Thread(new cc(dcVar, runnable), "startapp-lid-" + dc.f3688g.incrementAndGet());
                dcVar.f3691c = thread;
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
        if (!this.f.isEmpty()) {
            if (this.f4637h && TextUtils.isEmpty(this.f4636g)) {
                this.f4637h = false;
                if (!"default".equals(this.f4638i.a())) {
                    if ("headers".equals(this.f4638i.a())) {
                        a((WebView) this.f.removeFirst());
                        return;
                    }
                    return;
                } else {
                    try {
                        ((Executor) this.f4632b.a()).execute(new sk(this));
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
            webView = new WebView(this.f4631a);
            webView.setWebViewClient(new qk());
        } catch (Throwable th2) {
            if (a(2)) {
                d9.a(th2);
            }
            webView = null;
        }
        if (webView != null) {
            try {
                this.f.addLast(webView);
            } catch (Throwable th3) {
                if (a(4)) {
                    d9.a(th3);
                }
            }
            if (this.f4637h && TextUtils.isEmpty(this.f4636g)) {
                d();
            }
        }
    }

    public final void f() {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f4631a);
            k8 k8Var = (k8) this.f4633c.a();
            k8Var.f4053a.post(new A1.a(this, 11, defaultUserAgent));
        } catch (Throwable th) {
            if (a(16)) {
                d9.a(th);
            }
        }
    }

    public static /* synthetic */ String a(i7 i7Var) {
        WvfMetadata wvfMetadata = (WvfMetadata) i7Var.a();
        WeightedChoice b3 = wvfMetadata != null ? wvfMetadata.b() : null;
        String a3 = b3 != null ? b3.a() : null;
        return a3 != null ? a3 : "default";
    }

    public final boolean a(int i3) {
        WvfMetadata wvfMetadata = (WvfMetadata) this.f4635e.a();
        ComponentInfoEventConfig a3 = wvfMetadata != null ? wvfMetadata.a() : null;
        return a3 != null && a3.a((long) i3);
    }

    @Override // com.startapp.sdk.internal.rk
    public final String a() {
        String str = this.f4636g;
        WeakHashMap weakHashMap = si.f4438a;
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
            k8 k8Var = (k8) this.f4633c.a();
            k8Var.f4053a.post(new A1.a(webView, 12, a3));
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
                        WeakHashMap weakHashMap = si.f4438a;
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
            k8 k8Var = (k8) this.f4633c.a();
            k8Var.f4053a.post(new uk(this, str, webView));
        } catch (Throwable th2) {
            if (a(64)) {
                d9.a(th2);
            }
        }
    }
}
