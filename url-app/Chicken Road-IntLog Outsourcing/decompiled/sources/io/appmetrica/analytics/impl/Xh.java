package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f7706b;

    public Xh(C0802li c0802li, boolean z) {
        this.f7706b = c0802li;
        this.f7705a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7706b;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).setDataSendingEnabled(this.f7705a);
    }
}
