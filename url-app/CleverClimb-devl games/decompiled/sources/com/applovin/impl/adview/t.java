package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class t extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f2626a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<a> f2627b;

    public interface a {
        void a(s sVar);

        void b(s sVar);

        void c(s sVar);
    }

    public t(com.applovin.impl.sdk.j jVar) {
        this.f2626a = jVar.u();
    }

    private void a(WebView webView, String str) {
        this.f2626a.b("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        if (str == null || !(webView instanceof s)) {
            return;
        }
        s sVar = (s) webView;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        a aVar = this.f2627b.get();
        if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.a(sVar);
                return;
            }
            if ("/close_ad".equals(path)) {
                aVar.b(sVar);
                return;
            }
            if ("/skip_ad".equals(path)) {
                aVar.c(sVar);
                return;
            }
            this.f2626a.c("WebViewButtonClient", "Unknown URL: " + str);
            this.f2626a.c("WebViewButtonClient", "Path: " + path);
        }
    }

    public void a(WeakReference<a> weakReference) {
        this.f2627b = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, str);
        return true;
    }
}
