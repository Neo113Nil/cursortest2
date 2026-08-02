package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class S0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f10910b;

    public S0(C0963t1 c0963t1, boolean z) {
        this.f10910b = c0963t1;
        this.f10909a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1118z0 c1118z0 = this.f10910b.f12756a;
        boolean z = this.f10909a;
        c1118z0.getClass();
        C1092y0.c().setDataSendingEnabled(z);
    }
}
