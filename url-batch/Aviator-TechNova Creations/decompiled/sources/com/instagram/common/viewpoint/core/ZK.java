package com.instagram.common.viewpoint.core;

import android.view.View;
import android.webkit.WebView;

/* loaded from: assets/audience_network.dex */
public class ZK implements View.OnClickListener {
    public final /* synthetic */ ZO A00;

    public ZK(ZO zo) {
        this.A00 = zo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A09;
            if (!webView.canGoBack()) {
                return;
            }
            webView2 = this.A00.A09;
            webView2.goBack();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
