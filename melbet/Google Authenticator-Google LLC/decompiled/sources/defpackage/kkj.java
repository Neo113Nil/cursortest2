package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kkj implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new kbt(kbq.c(th).e("Uncaught exception in the SynchronizationContext. Re-thrown."), null);
    }
}
