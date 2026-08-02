package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class nk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f4215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f4216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qi f4217c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk f4218d;

    public nk(pk pkVar, AtomicBoolean atomicBoolean, WebView webView, qi qiVar) {
        this.f4218d = pkVar;
        this.f4215a = atomicBoolean;
        this.f4216b = webView;
        this.f4217c = qiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4215a.compareAndSet(false, true)) {
            this.f4218d.a(this.f4216b);
            this.f4217c.a("Unknown error");
        }
    }
}
