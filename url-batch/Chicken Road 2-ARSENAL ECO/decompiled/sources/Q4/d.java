package Q4;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class d implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f2015a;

    public d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f2015a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th instanceof InterruptedException) {
            thread.interrupt();
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2015a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
