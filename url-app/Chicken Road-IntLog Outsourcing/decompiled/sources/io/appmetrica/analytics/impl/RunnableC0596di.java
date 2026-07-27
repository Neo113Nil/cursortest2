package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0596di implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sn f8045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f8046b;

    public RunnableC0596di(C0802li c0802li, Sn sn) {
        this.f8046b = c0802li;
        this.f8045a = sn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f8046b;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).a(this.f8045a);
    }
}
