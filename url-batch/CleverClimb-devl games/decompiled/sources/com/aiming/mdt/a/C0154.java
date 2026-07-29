package com.aiming.mdt.a;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.aiming.mdt.a.ʽʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0154 extends WebViewClient {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f513 = 1;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f514;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ C0038 f515;

    C0154(C0038 c0038) {
        this.f515 = c0038;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        int i2 = f514 + 73;
        f513 = i2 % 128;
        if (i2 % 2 == 0) {
        }
        super.onReceivedError(webView, i, str, str2);
        C0044.m108();
        int i3 = f514 + 125;
        f513 = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = f513 + 17;
        f514 = i % 128;
        if (i % 2 != 0) {
        }
        this.f515.loadUrl(str);
        int i2 = f513 + 63;
        f514 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        return true;
    }
}
