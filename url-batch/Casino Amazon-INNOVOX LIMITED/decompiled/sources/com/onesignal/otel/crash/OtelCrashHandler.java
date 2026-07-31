package com.onesignal.otel.crash;

import com.onesignal.otel.IOtelCrashHandler;
import com.onesignal.otel.IOtelCrashReporter;
import com.onesignal.otel.IOtelLogger;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* compiled from: OtelCrashHandler.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/onesignal/otel/crash/OtelCrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Lcom/onesignal/otel/IOtelCrashHandler;", "crashReporter", "Lcom/onesignal/otel/IOtelCrashReporter;", "logger", "Lcom/onesignal/otel/IOtelLogger;", "(Lcom/onesignal/otel/IOtelCrashReporter;Lcom/onesignal/otel/IOtelLogger;)V", "existingHandler", "initialized", "", "seenThrowables", "", "", "initialize", "", "uncaughtException", "thread", "Ljava/lang/Thread;", "throwable", "unregister", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelCrashHandler implements Thread.UncaughtExceptionHandler, IOtelCrashHandler {
    private final IOtelCrashReporter crashReporter;
    private Thread.UncaughtExceptionHandler existingHandler;
    private volatile boolean initialized;
    private final IOtelLogger logger;
    private final List<Throwable> seenThrowables;

    public OtelCrashHandler(IOtelCrashReporter crashReporter, IOtelLogger logger) {
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.crashReporter = crashReporter;
        this.logger = logger;
        this.seenThrowables = new ArrayList();
    }

    @Override // com.onesignal.otel.IOtelCrashHandler
    public void initialize() {
        if (this.initialized) {
            this.logger.warn("OtelCrashHandler already initialized, skipping");
            return;
        }
        this.logger.info("OtelCrashHandler: Setting up uncaught exception handler...");
        this.existingHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.initialized = true;
        this.logger.info("OtelCrashHandler: ✅ Successfully initialized and registered as default uncaught exception handler");
    }

    @Override // com.onesignal.otel.IOtelCrashHandler
    public void unregister() {
        if (!this.initialized) {
            this.logger.debug("OtelCrashHandler: Not initialized, nothing to unregister");
            return;
        }
        this.logger.info("OtelCrashHandler: Unregistering — restoring previous exception handler");
        Thread.setDefaultUncaughtExceptionHandler(this.existingHandler);
        this.existingHandler = null;
        this.initialized = false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable throwable) {
        String message;
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        synchronized (this.seenThrowables) {
            if (this.seenThrowables.contains(throwable)) {
                this.logger.warn("OtelCrashHandler: Ignoring duplicate throwable instance");
                return;
            }
            this.seenThrowables.add(throwable);
            this.logger.info("OtelCrashHandler: Uncaught exception detected - " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage());
            String simpleName = throwable.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            boolean z = StringsKt.contains((CharSequence) simpleName, (CharSequence) "ApplicationNotResponding", true) || ((message = throwable.getMessage()) != null && StringsKt.contains((CharSequence) message, (CharSequence) "Application Not Responding", true));
            if (!z && !OtelCrashHandlerKt.isOneSignalAtFault(throwable)) {
                this.logger.debug("OtelCrashHandler: Crash is not OneSignal-related, delegating to existing handler");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.existingHandler;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, throwable);
                    return;
                }
                return;
            }
            if (z) {
                this.logger.info("OtelCrashHandler: ANR exception caught (unusual - ANRs are usually detected by standalone detector)");
            }
            this.logger.info("OtelCrashHandler: OneSignal-related crash detected, saving crash report...");
            try {
                BuildersKt__BuildersKt.runBlocking$default(null, new OtelCrashHandler$uncaughtException$2(this, thread, throwable, null), 1, null);
                this.logger.info("OtelCrashHandler: Crash report saved successfully");
            } catch (Throwable th) {
                this.logger.error("OtelCrashHandler: Failed to save crash report: " + th.getMessage() + " - " + th.getClass().getSimpleName());
            }
            this.logger.info("OtelCrashHandler: Delegating to existing crash handler");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.existingHandler;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, throwable);
            }
        }
    }
}
