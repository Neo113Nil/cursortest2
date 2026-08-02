package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.squareup.cash.work.webview.views.WorkWebViewClient;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class ThreeDS2WebView extends WebView {
    public final WorkWebViewClient webViewClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        WorkWebViewClient workWebViewClient = new WorkWebViewClient();
        this.webViewClient = workWebViewClient;
        WebSettings settings = getSettings();
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setBlockNetworkImage(true);
        settings.setBlockNetworkLoads(true);
        super.setWebViewClient(workWebViewClient);
    }

    public final void setOnHtmlSubmitListener$3ds2sdk_release(ThreeDS2WebViewClient$OnHtmlSubmitListener threeDS2WebViewClient$OnHtmlSubmitListener) {
        this.webViewClient.onEvent = threeDS2WebViewClient$OnHtmlSubmitListener;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        webViewClient.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ThreeDS2WebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
