package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class ok implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f4271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f4272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qi f4273c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f4274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk f4275e;

    public ok(pk pkVar, AtomicBoolean atomicBoolean, WebView webView, qi qiVar, AtomicLong atomicLong) {
        this.f4275e = pkVar;
        this.f4271a = atomicBoolean;
        this.f4272b = webView;
        this.f4273c = qiVar;
        this.f4274d = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4271a.compareAndSet(false, true)) {
            this.f4275e.a(this.f4272b);
            qi qiVar = this.f4273c;
            this.f4274d.get();
            si.b();
            qiVar.a();
        }
    }
}
