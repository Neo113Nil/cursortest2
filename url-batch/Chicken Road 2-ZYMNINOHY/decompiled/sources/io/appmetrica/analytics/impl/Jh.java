package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Jh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f10486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0644gi f10487b;

    public Jh(C0644gi c0644gi, Throwable th) {
        this.f10487b = c0644gi;
        this.f10486a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f10487b;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportUnhandledException(this.f10486a);
    }
}
