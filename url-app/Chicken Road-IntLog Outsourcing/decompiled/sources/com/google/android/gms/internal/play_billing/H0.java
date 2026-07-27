package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class H0 extends AbstractC0368s0 {

    /* renamed from: h, reason: collision with root package name */
    public InterfaceFutureC0386y0 f5053h;

    /* renamed from: i, reason: collision with root package name */
    public ScheduledFuture f5054i;

    @Override // com.google.android.gms.internal.play_billing.AbstractC0354n0
    public final String c() {
        InterfaceFutureC0386y0 interfaceFutureC0386y0 = this.f5053h;
        ScheduledFuture scheduledFuture = this.f5054i;
        if (interfaceFutureC0386y0 == null) {
            return null;
        }
        String f3 = AbstractC0279e.f("inputFuture=[", interfaceFutureC0386y0.toString(), "]");
        if (scheduledFuture == null) {
            return f3;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return f3;
        }
        return f3 + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0354n0
    public final void d() {
        InterfaceFutureC0386y0 interfaceFutureC0386y0 = this.f5053h;
        if ((interfaceFutureC0386y0 != null) & (this.f5216a instanceof C0324d0)) {
            Object obj = this.f5216a;
            interfaceFutureC0386y0.cancel((obj instanceof C0324d0) && ((C0324d0) obj).f5165a);
        }
        ScheduledFuture scheduledFuture = this.f5054i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f5053h = null;
        this.f5054i = null;
    }
}
