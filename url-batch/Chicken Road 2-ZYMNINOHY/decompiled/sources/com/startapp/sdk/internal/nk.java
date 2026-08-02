package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class nk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f7348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f7349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qi f7350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk f7351d;

    public nk(pk pkVar, AtomicBoolean atomicBoolean, WebView webView, qi qiVar) {
        this.f7351d = pkVar;
        this.f7348a = atomicBoolean;
        this.f7349b = webView;
        this.f7350c = qiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7348a.compareAndSet(false, true)) {
            this.f7351d.a(this.f7349b);
            this.f7350c.a("Unknown error");
        }
    }
}
