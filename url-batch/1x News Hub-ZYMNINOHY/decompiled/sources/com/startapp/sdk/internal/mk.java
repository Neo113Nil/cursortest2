package com.startapp.sdk.internal;

import android.os.Handler;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class mk extends qk {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f4167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f4168b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f4169c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi f4170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f4171e;
    public final /* synthetic */ int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk f4172g;

    public mk(pk pkVar, Handler handler, AtomicBoolean atomicBoolean, WebView webView, qi qiVar, AtomicLong atomicLong, int i3) {
        this.f4172g = pkVar;
        this.f4167a = handler;
        this.f4168b = atomicBoolean;
        this.f4169c = webView;
        this.f4170d = qiVar;
        this.f4171e = atomicLong;
        this.f = i3;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        long b3 = si.b();
        this.f4167a.removeCallbacksAndMessages(null);
        this.f4167a.postDelayed(new kk(this, b3), this.f);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i3, String str, String str2) {
        super.onReceivedError(webView, i3, str, str2);
        this.f4167a.removeCallbacksAndMessages(null);
        this.f4167a.post(new lk(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null || si.c(webView.getContext(), str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
