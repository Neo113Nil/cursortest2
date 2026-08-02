package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0522gi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0651li f7408a;

    public RunnableC0522gi(C0651li c0651li) {
        this.f7408a = c0651li;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f7408a;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).sendEventsBuffer();
    }
}
