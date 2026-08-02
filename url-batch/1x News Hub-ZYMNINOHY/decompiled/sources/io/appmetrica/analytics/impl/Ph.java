package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ph implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0651li f6467a;

    public Ph(C0651li c0651li) {
        this.f6467a = c0651li;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f6467a;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).resumeSession();
    }
}
