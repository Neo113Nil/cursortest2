package defpackage;

import java.lang.Thread;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gdj extends kqe implements CoroutineExceptionHandler {
    public static final gdj a = new gdj();

    private gdj() {
        super(CoroutineExceptionHandler.c);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kqn kqnVar, Throwable th) {
        kqnVar.getClass();
        th.getClass();
        Thread currentThread = Thread.currentThread();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
        uncaughtExceptionHandler.getClass();
        uncaughtExceptionHandler.uncaughtException(currentThread, th);
    }
}
