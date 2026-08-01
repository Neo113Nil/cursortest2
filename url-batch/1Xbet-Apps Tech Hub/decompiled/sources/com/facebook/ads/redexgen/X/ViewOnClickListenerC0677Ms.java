package com.facebook.ads.redexgen.X;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.facebook.ads.redexgen.X.Ms, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0677Ms implements View.OnClickListener {
    public final /* synthetic */ C0681Mw A00;

    public ViewOnClickListenerC0677Ms(C0681Mw c0681Mw) {
        this.A00 = c0681Mw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (K0.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A08;
            if (!webView.canGoBack()) {
                return;
            }
            webView2 = this.A00.A08;
            webView2.goBack();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
