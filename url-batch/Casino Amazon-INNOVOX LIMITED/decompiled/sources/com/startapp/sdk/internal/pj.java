package com.startapp.sdk.internal;

import android.os.Handler;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class pj extends tj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f383a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ xh d;
    public final /* synthetic */ AtomicLong e;
    public final /* synthetic */ int f;
    public final /* synthetic */ sj g;

    public pj(sj sjVar, Handler handler, AtomicBoolean atomicBoolean, WebView webView, xh xhVar, AtomicLong atomicLong, int i) {
        this.g = sjVar;
        this.f383a = handler;
        this.b = atomicBoolean;
        this.c = webView;
        this.d = xhVar;
        this.e = atomicLong;
        this.f = i;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        long b = zh.b();
        this.f383a.removeCallbacksAndMessages(null);
        this.f383a.postDelayed(new nj(this, b), this.f);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.f383a.removeCallbacksAndMessages(null);
        this.f383a.post(new oj(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null || zh.c(webView.getContext(), str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
