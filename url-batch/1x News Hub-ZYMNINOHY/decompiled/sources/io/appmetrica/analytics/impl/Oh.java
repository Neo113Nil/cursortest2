package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Oh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f6407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f6408b;

    public Oh(C0651li c0651li, Throwable th) {
        this.f6408b = c0651li;
        this.f6407a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f6408b;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportUnhandledException(this.f6407a);
    }
}
