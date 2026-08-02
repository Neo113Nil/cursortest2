package com.google.android.gms.internal.play_billing;

import w0.AbstractC1234c;

/* loaded from: classes.dex */
public final class D0 extends AbstractC0245n0 implements Runnable, InterfaceC0233j0 {

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f2724h;

    public D0(Runnable runnable) {
        runnable.getClass();
        this.f2724h = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0245n0
    public final String b() {
        return AbstractC1234c.a("task=[", this.f2724h.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2724h.run();
        } catch (Throwable th) {
            d(th);
            throw th;
        }
    }
}
