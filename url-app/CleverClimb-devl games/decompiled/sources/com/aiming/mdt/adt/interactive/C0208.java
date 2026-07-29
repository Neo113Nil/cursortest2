package com.aiming.mdt.adt.interactive;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.aiming.mdt.adt.interactive.ʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0208 extends WebChromeClient {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ InteractiveActivity f713;

    C0208(InteractiveActivity interactiveActivity) {
        this.f713 = interactiveActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        this.f713.updateTitle(str);
    }
}
