package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class S0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1034a;
    public final /* synthetic */ C0541u1 b;

    public S0(C0541u1 c0541u1, boolean z) {
        this.b = c0541u1;
        this.f1034a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0665z0 c0665z0 = this.b.f1507a;
        boolean z = this.f1034a;
        c0665z0.getClass();
        C0640y0.c().a(z, true);
    }
}
