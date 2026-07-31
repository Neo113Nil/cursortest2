package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f38043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38044b;

    public O0(C2872p1 c2872p1, boolean z4) {
        this.f38044b = c2872p1;
        this.f38043a = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3000u0 c3000u0 = this.f38044b.f39593a;
        boolean z4 = this.f38043a;
        c3000u0.getClass();
        C2974t0.c().setDataSendingEnabled(z4);
    }
}
