package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class X implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public Z f5928a;

    @Override // java.lang.Runnable
    public final void run() {
        W w4;
        G g4;
        Z z = this.f5928a;
        if (z == null || (w4 = z.f5929h) == null) {
            return;
        }
        this.f5928a = null;
        if (w4.isDone()) {
            Object obj = z.f5891a;
            if (obj == null) {
                if (w4.isDone()) {
                    if (N.f5890g.R(z, null, Z.g(w4))) {
                        Z.i(z);
                        return;
                    }
                    return;
                }
                E e4 = new E(z, w4);
                if (N.f5890g.R(z, null, e4)) {
                    try {
                        w4.a(e4, S.f5908a);
                        return;
                    } catch (Throwable th) {
                        try {
                            g4 = new G(th);
                        } catch (Error | Exception unused) {
                            g4 = G.f5834b;
                        }
                        N.f5890g.R(z, e4, g4);
                        return;
                    }
                }
                obj = z.f5891a;
            }
            if (obj instanceof D) {
                w4.cancel(((D) obj).f5814a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = z.f5930i;
            z.f5930i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    if (N.f5890g.R(z, null, new G(new Y(str)))) {
                        Z.i(z);
                    }
                    throw th2;
                }
            }
            if (N.f5890g.R(z, null, new G(new Y(str + ": " + w4.toString())))) {
                Z.i(z);
            }
        } finally {
            w4.cancel(true);
        }
    }
}
