package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class pk {

    /* renamed from: a, reason: collision with root package name */
    public final ib f7462a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f7463b = new LinkedList();

    public pk(Context context, ib ibVar) {
        this.f7462a = ibVar;
    }

    public final void a(WebView webView) {
        webView.stopLoading();
        webView.loadUrl("about:blank");
        if (this.f7463b.size() < 3) {
            this.f7463b.add(new WeakReference(webView));
        } else {
            webView.destroy();
        }
    }

    public final void a(String str, qi qiVar) {
        Throwable th;
        qi qiVar2;
        if ("true".equals(si.a(str, "@doNotRender@", "@doNotRender@"))) {
            qiVar.a();
            return;
        }
        WebView webView = null;
        while (webView == null) {
            try {
                if (this.f7463b.size() <= 0) {
                    break;
                }
                WeakReference weakReference = (WeakReference) this.f7463b.poll();
                if (weakReference != null) {
                    webView = (WebView) weakReference.get();
                }
            } catch (Throwable th2) {
                th = th2;
                qiVar2 = qiVar;
                d9.a(th);
                qiVar2.a("WebView instantiation Error");
            }
        }
        if (webView == null) {
            webView = ((rk) this.f7462a.a()).c();
        }
        WebView webView2 = webView;
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Handler handler = new Handler(Looper.getMainLooper());
            AtomicLong atomicLong = new AtomicLong();
            int i4 = 0;
            if (h0.f7040f.booleanValue()) {
                webView2.getSettings().setBlockNetworkImage(false);
                webView2.getSettings().setLoadsImagesAutomatically(true);
                webView2.getSettings().setJavaScriptEnabled(true);
                i4 = 25000;
            }
            int i5 = i4;
            webView2.setWebChromeClient(new WebChromeClient());
            try {
                qiVar2 = qiVar;
                try {
                    webView2.setWebViewClient(new mk(this, handler, atomicBoolean, webView2, qiVar, atomicLong, i5));
                    atomicLong.set(si.b());
                    if (!si.a(webView2, str)) {
                        handler.removeCallbacksAndMessages(null);
                        handler.post(new nk(this, atomicBoolean, webView2, qiVar2));
                    } else {
                        handler.postDelayed(new ok(this, atomicBoolean, webView2, qiVar2, atomicLong), 25000L);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    d9.a(th);
                    qiVar2.a("WebView instantiation Error");
                }
            } catch (Throwable th4) {
                th = th4;
                qiVar2 = qiVar;
            }
        } catch (Throwable th5) {
            th = th5;
            qiVar2 = qiVar;
        }
    }
}
