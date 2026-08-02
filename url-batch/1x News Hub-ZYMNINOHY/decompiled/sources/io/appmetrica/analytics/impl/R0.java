package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class R0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6535b;

    public R0(C0815s1 c0815s1, boolean z) {
        this.f6535b = c0815s1;
        this.f6534a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0944x0 c0944x0 = this.f6535b.f8278a;
        boolean z = this.f6534a;
        c0944x0.getClass();
        C0918w0.c().setDataSendingEnabled(z);
    }
}
