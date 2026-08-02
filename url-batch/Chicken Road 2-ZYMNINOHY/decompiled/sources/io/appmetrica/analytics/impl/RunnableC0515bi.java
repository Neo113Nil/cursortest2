package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0515bi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0644gi f11544a;

    public RunnableC0515bi(C0644gi c0644gi) {
        this.f11544a = c0644gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f11544a;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).sendEventsBuffer();
    }
}
