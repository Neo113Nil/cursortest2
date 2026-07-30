package H3;

import P0.l;
import java.lang.Thread;
import java.util.ArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n6.AbstractC0792z;

/* loaded from: classes.dex */
public final class c implements Thread.UncaughtExceptionHandler, E3.a {

    /* renamed from: a, reason: collision with root package name */
    public final l f962a;

    /* renamed from: b, reason: collision with root package name */
    public final E3.c f963b;

    /* renamed from: c, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f964c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f965d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f966e;

    public c(l crashReporter, E3.c logger) {
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f962a = crashReporter;
        this.f963b = logger;
        this.f965d = new ArrayList();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable throwable) {
        String message;
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        synchronized (this.f965d) {
            if (this.f965d.contains(throwable)) {
                this.f963b.warn("OtelCrashHandler: Ignoring duplicate throwable instance");
                return;
            }
            this.f965d.add(throwable);
            this.f963b.info("OtelCrashHandler: Uncaught exception detected - " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage());
            String simpleName = throwable.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            boolean z7 = true;
            if (!StringsKt.u(simpleName, "ApplicationNotResponding", true) && ((message = throwable.getMessage()) == null || !StringsKt.u(message, "Application Not Responding", true))) {
                z7 = false;
            }
            if (!z7) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                StackTraceElement[] stackTrace = throwable.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                if (!P0.f.A(stackTrace)) {
                    this.f963b.debug("OtelCrashHandler: Crash is not OneSignal-related, delegating to existing handler");
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f964c;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, throwable);
                        return;
                    }
                    return;
                }
            }
            if (z7) {
                this.f963b.info("OtelCrashHandler: ANR exception caught (unusual - ANRs are usually detected by standalone detector)");
            }
            this.f963b.info("OtelCrashHandler: OneSignal-related crash detected, saving crash report...");
            try {
                AbstractC0792z.o(g.f6146d, new b(this, thread, throwable, null));
                this.f963b.info("OtelCrashHandler: Crash report saved successfully");
            } catch (Throwable th) {
                this.f963b.error("OtelCrashHandler: Failed to save crash report: " + th.getMessage() + " - " + th.getClass().getSimpleName());
            }
            this.f963b.info("OtelCrashHandler: Delegating to existing crash handler");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f964c;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, throwable);
            }
        }
    }
}
