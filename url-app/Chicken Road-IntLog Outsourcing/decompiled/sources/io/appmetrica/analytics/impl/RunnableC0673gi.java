package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0673gi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0802li f8283a;

    public RunnableC0673gi(C0802li c0802li) {
        this.f8283a = c0802li;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f8283a;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).sendEventsBuffer();
    }
}
