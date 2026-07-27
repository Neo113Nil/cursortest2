package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Qh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0802li f7336a;

    public Qh(C0802li c0802li) {
        this.f7336a = c0802li;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7336a;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).pauseSession();
    }
}
