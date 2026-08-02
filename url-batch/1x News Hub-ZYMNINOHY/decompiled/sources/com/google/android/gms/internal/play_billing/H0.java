package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w0.AbstractC1234c;

/* loaded from: classes.dex */
public final class H0 extends AbstractC0259s0 {

    /* renamed from: h, reason: collision with root package name */
    public InterfaceFutureC0277y0 f2737h;

    /* renamed from: i, reason: collision with root package name */
    public ScheduledFuture f2738i;

    @Override // com.google.android.gms.internal.play_billing.AbstractC0245n0
    public final String b() {
        InterfaceFutureC0277y0 interfaceFutureC0277y0 = this.f2737h;
        ScheduledFuture scheduledFuture = this.f2738i;
        if (interfaceFutureC0277y0 == null) {
            return null;
        }
        String a3 = AbstractC1234c.a("inputFuture=[", interfaceFutureC0277y0.toString(), "]");
        if (scheduledFuture == null) {
            return a3;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return a3;
        }
        return a3 + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0245n0
    public final void c() {
        InterfaceFutureC0277y0 interfaceFutureC0277y0 = this.f2737h;
        if ((interfaceFutureC0277y0 != null) & (this.f2890a instanceof C0212c0)) {
            Object obj = this.f2890a;
            interfaceFutureC0277y0.cancel((obj instanceof C0212c0) && ((C0212c0) obj).f2837a);
        }
        ScheduledFuture scheduledFuture = this.f2738i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f2737h = null;
        this.f2738i = null;
    }
}
