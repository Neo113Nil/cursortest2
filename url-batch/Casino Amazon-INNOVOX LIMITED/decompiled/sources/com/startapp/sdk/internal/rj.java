package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class rj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f409a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ xh c;
    public final /* synthetic */ AtomicLong d;
    public final /* synthetic */ sj e;

    public rj(sj sjVar, AtomicBoolean atomicBoolean, WebView webView, xh xhVar, AtomicLong atomicLong) {
        this.e = sjVar;
        this.f409a = atomicBoolean;
        this.b = webView;
        this.c = xhVar;
        this.d = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f409a.compareAndSet(false, true)) {
            this.e.a(this.b);
            xh xhVar = this.c;
            this.d.get();
            zh.b();
            xhVar.a();
        }
    }
}
