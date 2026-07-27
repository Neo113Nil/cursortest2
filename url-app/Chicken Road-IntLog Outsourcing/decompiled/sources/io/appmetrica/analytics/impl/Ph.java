package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ph implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0802li f7281a;

    public Ph(C0802li c0802li) {
        this.f7281a = c0802li;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7281a;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).resumeSession();
    }
}
