package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes.dex */
final class qz2 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final WebView f10927f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ rz2 f10928g;

    qz2(rz2 rz2Var) {
        WebView webView;
        this.f10928g = rz2Var;
        webView = rz2Var.f11579d;
        this.f10927f = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10927f.destroy();
    }
}
