package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0496fi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f7321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f7322b;

    public RunnableC0496fi(C0651li c0651li, V v) {
        this.f7322b = c0651li;
        this.f7321a = v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f7322b;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).a(this.f7321a);
    }
}
