package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.k;

/* loaded from: classes.dex */
public class r2 extends k.o {

    /* renamed from: b, reason: collision with root package name */
    private final i2 f17785b;

    public r2(m5.c cVar, i2 i2Var) {
        super(cVar);
        this.f17785b = i2Var;
    }

    private long i(WebChromeClient webChromeClient) {
        Long g7 = this.f17785b.g(webChromeClient);
        if (g7 != null) {
            return g7.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebChromeClient.");
    }

    public void h(WebChromeClient webChromeClient, k.o.a<Void> aVar) {
        if (this.f17785b.f(webChromeClient)) {
            c(Long.valueOf(i(webChromeClient)), aVar);
        } else {
            aVar.a(null);
        }
    }

    public void j(WebChromeClient webChromeClient, WebView webView, Long l7, k.o.a<Void> aVar) {
        Long g7 = this.f17785b.g(webView);
        if (g7 == null) {
            throw new IllegalStateException("Could not find identifier for WebView.");
        }
        super.g(Long.valueOf(i(webChromeClient)), g7, l7, aVar);
    }
}
