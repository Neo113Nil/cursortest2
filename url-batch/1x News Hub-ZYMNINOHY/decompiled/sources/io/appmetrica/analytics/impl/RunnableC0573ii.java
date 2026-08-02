package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ii, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0573ii implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0651li f7569a;

    public RunnableC0573ii(C0651li c0651li) {
        this.f7569a = c0651li;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f7569a;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).clearAppEnvironment();
    }
}
