package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class D0 extends AbstractC0354n0 implements Runnable, InterfaceC0342j0 {

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f5040h;

    public D0(Runnable runnable) {
        runnable.getClass();
        this.f5040h = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0354n0
    public final String c() {
        return AbstractC0279e.f("task=[", this.f5040h.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5040h.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
