package L3;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class d implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f1491a;

    public d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f1491a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th instanceof InterruptedException) {
            thread.interrupt();
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f1491a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
