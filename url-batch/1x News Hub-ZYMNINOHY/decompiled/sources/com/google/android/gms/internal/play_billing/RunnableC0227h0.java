package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0227h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0245n0 f2866a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceFutureC0277y0 f2867b;

    public RunnableC0227h0(AbstractC0245n0 abstractC0245n0, InterfaceFutureC0277y0 interfaceFutureC0277y0) {
        this.f2866a = abstractC0245n0;
        this.f2867b = interfaceFutureC0277y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2866a.f2890a != this) {
            return;
        }
        InterfaceFutureC0277y0 interfaceFutureC0277y0 = this.f2867b;
        if (AbstractC0245n0.f.D(this.f2866a, this, AbstractC0245n0.e(interfaceFutureC0277y0))) {
            AbstractC0245n0.h(this.f2866a);
        }
    }
}
