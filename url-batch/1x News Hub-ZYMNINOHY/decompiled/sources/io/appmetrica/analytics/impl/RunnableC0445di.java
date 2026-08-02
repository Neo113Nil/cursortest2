package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0445di implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sn f7187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f7188b;

    public RunnableC0445di(C0651li c0651li, Sn sn) {
        this.f7188b = c0651li;
        this.f7187a = sn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f7188b;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).a(this.f7187a);
    }
}
