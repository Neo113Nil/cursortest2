package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hvy implements Runnable {
    hwa a;

    public hvy(hwa hwaVar) {
        this.a = hwaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hvi hviVar;
        hwa hwaVar = this.a;
        if (hwaVar == null || (hviVar = hwaVar.a) == null) {
            return;
        }
        this.a = null;
        if (hviVar.isDone()) {
            hwaVar.q(hviVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = hwaVar.b;
            hwaVar.b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    hwaVar.p(new hvz(str));
                    throw th;
                }
            }
            hwaVar.p(new hvz(str + ": " + hviVar.toString()));
        } finally {
            hviVar.cancel(true);
        }
    }
}
