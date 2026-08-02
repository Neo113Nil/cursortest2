package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class ok implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f7406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f7407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qi f7408c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f7409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk f7410e;

    public ok(pk pkVar, AtomicBoolean atomicBoolean, WebView webView, qi qiVar, AtomicLong atomicLong) {
        this.f7410e = pkVar;
        this.f7406a = atomicBoolean;
        this.f7407b = webView;
        this.f7408c = qiVar;
        this.f7409d = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7406a.compareAndSet(false, true)) {
            this.f7410e.a(this.f7407b);
            qi qiVar = this.f7408c;
            this.f7409d.get();
            si.b();
            qiVar.a();
        }
    }
}
