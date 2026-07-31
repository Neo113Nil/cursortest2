package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* loaded from: classes.dex */
final class wo implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final ValueCallback<String> f13889f = new vo(this);

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ oo f13890g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ WebView f13891h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f13892i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ yo f13893j;

    wo(yo yoVar, oo ooVar, WebView webView, boolean z6) {
        this.f13893j = yoVar;
        this.f13890g = ooVar;
        this.f13891h = webView;
        this.f13892i = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13891h.getSettings().getJavaScriptEnabled()) {
            try {
                this.f13891h.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f13889f);
            } catch (Throwable unused) {
                ((vo) this.f13889f).onReceiveValue("");
            }
        }
    }
}
