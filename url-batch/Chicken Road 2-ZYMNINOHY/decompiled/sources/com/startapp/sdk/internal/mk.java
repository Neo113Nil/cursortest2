package com.startapp.sdk.internal;

import android.os.Handler;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class mk extends qk {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f7296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f7297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f7298c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi f7299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f7300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk f7302g;

    public mk(pk pkVar, Handler handler, AtomicBoolean atomicBoolean, WebView webView, qi qiVar, AtomicLong atomicLong, int i4) {
        this.f7302g = pkVar;
        this.f7296a = handler;
        this.f7297b = atomicBoolean;
        this.f7298c = webView;
        this.f7299d = qiVar;
        this.f7300e = atomicLong;
        this.f7301f = i4;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        long b4 = si.b();
        this.f7296a.removeCallbacksAndMessages(null);
        this.f7296a.postDelayed(new kk(this, b4), this.f7301f);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i4, String str, String str2) {
        super.onReceivedError(webView, i4, str, str2);
        this.f7296a.removeCallbacksAndMessages(null);
        this.f7296a.post(new lk(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null || si.c(webView.getContext(), str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
