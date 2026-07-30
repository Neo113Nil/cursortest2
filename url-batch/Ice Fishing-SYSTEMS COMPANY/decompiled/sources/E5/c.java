package E5;

import M7.j;
import O7.AbstractC0399y;
import S0.s;
import java.lang.Thread;
import java.util.ArrayList;
import kotlin.jvm.internal.h;
import v7.C5139j;

/* loaded from: classes2.dex */
public final class c implements Thread.UncaughtExceptionHandler, B5.a {

    /* renamed from: a, reason: collision with root package name */
    public final s f829a;

    /* renamed from: b, reason: collision with root package name */
    public final B5.c f830b;

    /* renamed from: c, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f831c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f832d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f833e;

    public c(s sVar, B5.c cVar) {
        this.f829a = sVar;
        this.f830b = cVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable throwable) {
        String message;
        h.e(thread, "thread");
        h.e(throwable, "throwable");
        synchronized (this.f832d) {
            if (this.f832d.contains(throwable)) {
                this.f830b.warn("OtelCrashHandler: Ignoring duplicate throwable instance");
                return;
            }
            this.f832d.add(throwable);
            this.f830b.info("OtelCrashHandler: Uncaught exception detected - " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage());
            boolean z8 = true;
            if (!j.L(throwable.getClass().getSimpleName(), "ApplicationNotResponding", true) && ((message = throwable.getMessage()) == null || !j.L(message, "Application Not Responding", true))) {
                z8 = false;
            }
            if (!z8) {
                StackTraceElement[] stackTrace = throwable.getStackTrace();
                h.d(stackTrace, "getStackTrace(...)");
                if (!U2.a.m(stackTrace)) {
                    this.f830b.debug("OtelCrashHandler: Crash is not OneSignal-related, delegating to existing handler");
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f831c;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, throwable);
                        return;
                    }
                    return;
                }
            }
            if (z8) {
                this.f830b.info("OtelCrashHandler: ANR exception caught (unusual - ANRs are usually detected by standalone detector)");
            }
            this.f830b.info("OtelCrashHandler: OneSignal-related crash detected, saving crash report...");
            try {
                AbstractC0399y.s(C5139j.f41372n, new b(this, thread, throwable, null));
                this.f830b.info("OtelCrashHandler: Crash report saved successfully");
            } catch (Throwable th) {
                this.f830b.error("OtelCrashHandler: Failed to save crash report: " + th.getMessage() + " - " + th.getClass().getSimpleName());
            }
            this.f830b.info("OtelCrashHandler: Delegating to existing crash handler");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f831c;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, throwable);
            }
        }
    }
}
