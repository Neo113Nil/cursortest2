package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1051a;
    public final /* synthetic */ C0541u1 b;

    public T0(C0541u1 c0541u1, boolean z) {
        this.b = c0541u1;
        this.f1051a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0665z0 c0665z0 = this.b.f1507a;
        boolean z = this.f1051a;
        c0665z0.getClass();
        C0640y0.c().setDataSendingEnabled(z);
    }
}
