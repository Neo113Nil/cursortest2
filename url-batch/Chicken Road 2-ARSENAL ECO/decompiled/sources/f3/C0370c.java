package f3;

import F5.j;
import H5.AbstractC0165z;
import c3.InterfaceC0281a;
import java.lang.Thread;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import m1.AbstractC0521b;
import u0.C0675e;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370c implements Thread.UncaughtExceptionHandler, InterfaceC0281a {

    /* renamed from: a, reason: collision with root package name */
    public final C0675e f4203a;

    /* renamed from: b, reason: collision with root package name */
    public final c3.c f4204b;

    /* renamed from: c, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f4205c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4206d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f4207e;

    public C0370c(C0675e c0675e, c3.c cVar) {
        this.f4203a = c0675e;
        this.f4204b = cVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable throwable) {
        String message;
        i.e(thread, "thread");
        i.e(throwable, "throwable");
        synchronized (this.f4206d) {
            if (this.f4206d.contains(throwable)) {
                this.f4204b.warn("OtelCrashHandler: Ignoring duplicate throwable instance");
                return;
            }
            this.f4206d.add(throwable);
            this.f4204b.info("OtelCrashHandler: Uncaught exception detected - " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage());
            boolean z5 = true;
            if (!j.L(throwable.getClass().getSimpleName(), "ApplicationNotResponding", true) && ((message = throwable.getMessage()) == null || !j.L(message, "Application Not Responding", true))) {
                z5 = false;
            }
            if (!z5) {
                StackTraceElement[] stackTrace = throwable.getStackTrace();
                i.d(stackTrace, "getStackTrace(...)");
                if (!AbstractC0521b.u(stackTrace)) {
                    this.f4204b.debug("OtelCrashHandler: Crash is not OneSignal-related, delegating to existing handler");
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f4205c;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, throwable);
                        return;
                    }
                    return;
                }
            }
            if (z5) {
                this.f4204b.info("OtelCrashHandler: ANR exception caught (unusual - ANRs are usually detected by standalone detector)");
            }
            this.f4204b.info("OtelCrashHandler: OneSignal-related crash detected, saving crash report...");
            try {
                AbstractC0165z.o(new C0369b(this, thread, throwable, null));
                this.f4204b.info("OtelCrashHandler: Crash report saved successfully");
            } catch (Throwable th) {
                this.f4204b.error("OtelCrashHandler: Failed to save crash report: " + th.getMessage() + " - " + th.getClass().getSimpleName());
            }
            this.f4204b.info("OtelCrashHandler: Delegating to existing crash handler");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f4205c;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, throwable);
            }
        }
    }
}
