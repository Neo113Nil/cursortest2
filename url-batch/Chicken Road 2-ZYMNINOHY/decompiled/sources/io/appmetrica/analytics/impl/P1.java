package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class P1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0485ae f10785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1099y7 f10786b;

    public P1(R1 r12, C1099y7 c1099y7) {
        this.f10785a = r12;
        this.f10786b = c1099y7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10785a.consume(this.f10786b);
    }
}
