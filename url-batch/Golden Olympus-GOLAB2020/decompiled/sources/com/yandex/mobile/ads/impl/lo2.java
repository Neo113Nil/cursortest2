package com.yandex.mobile.ads.impl;

import android.webkit.WebView;

/* loaded from: classes3.dex */
final class lo2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WebView f28697b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f28698c;

    lo2(WebView webView, String str) {
        this.f28697b = webView;
        this.f28698c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28697b.loadUrl(this.f28698c);
    }
}
