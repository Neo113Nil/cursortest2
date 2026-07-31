package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes.dex */
final class fz2 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ WebView f5393f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f5394g;

    fz2(gz2 gz2Var, WebView webView, String str) {
        this.f5393f = webView;
        this.f5394g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5393f.loadUrl(this.f5394g);
    }
}
