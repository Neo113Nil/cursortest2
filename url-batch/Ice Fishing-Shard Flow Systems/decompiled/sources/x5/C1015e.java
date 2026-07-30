package x5;

import java.lang.Thread;

/* renamed from: x5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1015e implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f8380a;

    public C1015e(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f8380a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th instanceof InterruptedException) {
            thread.interrupt();
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8380a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
