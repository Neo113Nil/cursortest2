package com.startapp.sdk.internal;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class d8 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f8 f212a;

    public d8(f8 f8Var) {
        this.f212a = f8Var;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.f212a.w.setProgress(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        if (str == null || str.equals("")) {
            return;
        }
        this.f212a.u.a().setText(str);
    }
}
