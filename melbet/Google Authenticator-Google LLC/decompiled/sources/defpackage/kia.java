package defpackage;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kia implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ kiq a;

    public kia(kiq kiqVar) {
        this.a = kiqVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = kiq.a;
        Level level = Level.SEVERE;
        kiq kiqVar = this.a;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(kiqVar.g) + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        try {
            if (kiqVar.u) {
                return;
            }
            kiqVar.u = true;
            try {
                kiqVar.e(true);
                kiqVar.i(false);
            } finally {
                kiqVar.j(new jzb(jze.a(kbq.k.e("Panic! This is a bug!").d(th))));
                kiqVar.I.c(null);
                kiqVar.G.a(4, "PANIC! Entering TRANSIENT_FAILURE");
                kiqVar.o.a(jxi.c);
            }
        } catch (Throwable th2) {
            kiq kiqVar2 = this.a;
            kiq.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(kiqVar2.g) + "] Uncaught exception while panicking", th2);
        }
    }
}
