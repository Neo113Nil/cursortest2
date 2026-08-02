package com.instagram.common.viewpoint.core;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: assets/audience_network.dex */
public class TZ extends WebViewClient {
    public final /* synthetic */ CallableC0771Ta A00;

    public TZ(CallableC0771Ta callableC0771Ta) {
        this.A00 = callableC0771Ta;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC0927Ze.A0D(AbstractC0766Sv.A2j);
        return true;
    }
}
