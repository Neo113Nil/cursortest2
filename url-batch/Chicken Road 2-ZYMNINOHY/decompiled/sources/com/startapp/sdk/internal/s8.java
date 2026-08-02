package com.startapp.sdk.internal;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class s8 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u8 f7557a;

    public s8(u8 u8Var) {
        this.f7557a = u8Var;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i4) {
        this.f7557a.f7683w.setProgress(i4);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        if (str == null || str.equals("")) {
            return;
        }
        this.f7557a.f7682u.a().setText(str);
    }
}
