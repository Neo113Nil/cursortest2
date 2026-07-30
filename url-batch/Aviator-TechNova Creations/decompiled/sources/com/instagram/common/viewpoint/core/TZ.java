package com.instagram.common.viewpoint.core;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: assets/audience_network.dex */
public class TZ extends WebViewClient {
    public final /* synthetic */ CallableC0777Ta A00;

    public TZ(CallableC0777Ta callableC0777Ta) {
        this.A00 = callableC0777Ta;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC0933Ze.A0D(AbstractC0772Sv.A2j);
        return true;
    }
}
