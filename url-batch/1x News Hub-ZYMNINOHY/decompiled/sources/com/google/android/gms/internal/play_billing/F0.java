package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class F0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public H0 f2731a;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC0277y0 interfaceFutureC0277y0;
        C0218e0 c0218e0;
        H0 h02 = this.f2731a;
        if (h02 == null || (interfaceFutureC0277y0 = h02.f2737h) == null) {
            return;
        }
        this.f2731a = null;
        if (interfaceFutureC0277y0.isDone()) {
            Object obj = h02.f2890a;
            if (obj == null) {
                if (interfaceFutureC0277y0.isDone()) {
                    if (AbstractC0245n0.f.D(h02, null, AbstractC0245n0.e(interfaceFutureC0277y0))) {
                        AbstractC0245n0.h(h02);
                        return;
                    }
                    return;
                }
                RunnableC0227h0 runnableC0227h0 = new RunnableC0227h0(h02, interfaceFutureC0277y0);
                if (AbstractC0245n0.f.D(h02, null, runnableC0227h0)) {
                    try {
                        interfaceFutureC0277y0.a(runnableC0227h0, EnumC0256r0.f2912a);
                        return;
                    } catch (Throwable th) {
                        try {
                            c0218e0 = new C0218e0(th);
                        } catch (Error | Exception unused) {
                            c0218e0 = C0218e0.f2851b;
                        }
                        AbstractC0245n0.f.D(h02, runnableC0227h0, c0218e0);
                        return;
                    }
                }
                obj = h02.f2890a;
            }
            if (obj instanceof C0212c0) {
                interfaceFutureC0277y0.cancel(((C0212c0) obj).f2837a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = h02.f2738i;
            h02.f2738i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    h02.d(new G0(str));
                    throw th2;
                }
            }
            h02.d(new G0(str + ": " + interfaceFutureC0277y0.toString()));
        } finally {
            interfaceFutureC0277y0.cancel(true);
        }
    }
}
