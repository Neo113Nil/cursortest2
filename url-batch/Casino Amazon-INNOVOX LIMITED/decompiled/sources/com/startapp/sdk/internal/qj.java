package com.startapp.sdk.internal;

import android.webkit.WebView;
import dev.hyo.openiap.OpenIapError;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class qj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f396a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ xh c;
    public final /* synthetic */ sj d;

    public qj(sj sjVar, AtomicBoolean atomicBoolean, WebView webView, xh xhVar) {
        this.d = sjVar;
        this.f396a = atomicBoolean;
        this.b = webView;
        this.c = xhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f396a.compareAndSet(false, true)) {
            this.d.a(this.b);
            this.c.a(OpenIapError.UnknownError.MESSAGE);
        }
    }
}
