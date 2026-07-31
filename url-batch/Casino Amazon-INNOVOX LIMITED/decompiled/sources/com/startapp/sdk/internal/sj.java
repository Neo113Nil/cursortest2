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

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class sj {

    /* renamed from: a, reason: collision with root package name */
    public final pa f427a;
    public final LinkedList b = new LinkedList();

    public sj(Context context, pa paVar) {
        this.f427a = paVar;
    }

    public final void a(WebView webView) {
        webView.stopLoading();
        webView.loadUrl("about:blank");
        if (this.b.size() < 3) {
            this.b.add(new WeakReference(webView));
        } else {
            webView.destroy();
        }
    }

    public final void a(String str, xh xhVar) {
        Throwable th;
        xh xhVar2;
        if ("true".equals(zh.a(str, "@doNotRender@", "@doNotRender@"))) {
            xhVar.a();
            return;
        }
        WebView webView = null;
        while (webView == null) {
            try {
                if (this.b.size() <= 0) {
                    break;
                }
                WeakReference weakReference = (WeakReference) this.b.poll();
                if (weakReference != null) {
                    webView = (WebView) weakReference.get();
                }
            } catch (Throwable th2) {
                th = th2;
                xhVar2 = xhVar;
                n8.a(th);
                xhVar2.a("WebView instantiation Error");
            }
        }
        if (webView == null) {
            webView = ((uj) this.f427a.a()).c();
        }
        WebView webView2 = webView;
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Handler handler = new Handler(Looper.getMainLooper());
            AtomicLong atomicLong = new AtomicLong();
            int i = 0;
            if (f0.f.booleanValue()) {
                webView2.getSettings().setBlockNetworkImage(false);
                webView2.getSettings().setLoadsImagesAutomatically(true);
                webView2.getSettings().setJavaScriptEnabled(true);
                i = 25000;
            }
            int i2 = i;
            webView2.setWebChromeClient(new WebChromeClient());
            try {
                xhVar2 = xhVar;
                try {
                    webView2.setWebViewClient(new pj(this, handler, atomicBoolean, webView2, xhVar, atomicLong, i2));
                    atomicLong.set(zh.b());
                    if (!zh.a(webView2, str)) {
                        handler.removeCallbacksAndMessages(null);
                        handler.post(new qj(this, atomicBoolean, webView2, xhVar2));
                    } else {
                        handler.postDelayed(new rj(this, atomicBoolean, webView2, xhVar2, atomicLong), 25000L);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    n8.a(th);
                    xhVar2.a("WebView instantiation Error");
                }
            } catch (Throwable th4) {
                th = th4;
                xhVar2 = xhVar;
            }
        } catch (Throwable th5) {
            th = th5;
            xhVar2 = xhVar;
        }
    }
}
