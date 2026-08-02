package com.startapp.sdk.internal;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class s8 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u8 f4420a;

    public s8(u8 u8Var) {
        this.f4420a = u8Var;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i3) {
        this.f4420a.f4543w.setProgress(i3);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        if (str == null || str.equals("")) {
            return;
        }
        this.f4420a.f4542u.a().setText(str);
    }
}
