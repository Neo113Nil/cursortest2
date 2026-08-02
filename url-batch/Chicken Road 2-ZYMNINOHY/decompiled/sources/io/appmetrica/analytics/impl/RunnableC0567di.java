package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0567di implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0644gi f11683a;

    public RunnableC0567di(C0644gi c0644gi) {
        this.f11683a = c0644gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f11683a;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).clearAppEnvironment();
    }
}
