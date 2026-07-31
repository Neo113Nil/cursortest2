package com.onesignal.debug.internal.crash;

import com.facebook.react.uimanager.ViewProps;
import com.onesignal.core.BuildConfig;
import com.onesignal.debug.internal.crash.AnrCheckResult;
import com.onesignal.otel.IOtelCrashReporter;
import com.onesignal.otel.IOtelLogger;
import com.onesignal.otel.IOtelOpenTelemetryCrash;
import com.onesignal.otel.OtelFactory;
import com.onesignal.otel.crash.IOtelAnrDetector;
import com.onesignal.otel.crash.OtelCrashHandlerKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* compiled from: OtelAnrDetector.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 -2\u00020\u0001:\u0003+,-BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\r\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0007H\u0000¢\u0006\u0002\b J\r\u0010!\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\"J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0007H\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0007H\u0002J\b\u0010&\u001a\u00020\fH\u0002J\b\u0010'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u001cH\u0016J\b\u0010)\u001a\u00020\u001cH\u0002J\b\u0010*\u001a\u00020\u001cH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/onesignal/debug/internal/crash/OtelAnrDetector;", "Lcom/onesignal/otel/crash/IOtelAnrDetector;", "openTelemetryCrash", "Lcom/onesignal/otel/IOtelOpenTelemetryCrash;", "logger", "Lcom/onesignal/otel/IOtelLogger;", "anrThresholdMs", "", "checkIntervalMs", "backgroundThresholdMs", "isAppInForeground", "Lkotlin/Function0;", "", "platform", "Lcom/onesignal/debug/internal/crash/AnrWatchdogPlatform;", "(Lcom/onesignal/otel/IOtelOpenTelemetryCrash;Lcom/onesignal/otel/IOtelLogger;JJJLkotlin/jvm/functions/Function0;Lcom/onesignal/debug/internal/crash/AnrWatchdogPlatform;)V", "crashReporter", "Lcom/onesignal/otel/IOtelCrashReporter;", "evaluator", "Lcom/onesignal/debug/internal/crash/AnrCheckEvaluator;", "isMonitoring", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mainThreadRunnable", "Ljava/lang/Runnable;", "watchdogRunnable", "watchdogThread", "Ljava/lang/Thread;", "checkForAnr", "", "checkForAnr$com_onesignal_core", "evaluateCheck", "actualSleepMs", "evaluateCheck$com_onesignal_core", "recordHeartbeat", "recordHeartbeat$com_onesignal_core", "reportAnr", "unresponsiveDurationMs", "reportBackgroundBlock", "resolveForeground", "setupRunnables", ViewProps.START, "startWatchdogThread", "stop", "ApplicationNotRespondingException", "BackgroundMainThreadBlockException", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelAnrDetector implements IOtelAnrDetector {
    private static final long FROZEN_PROCESS_SLACK_MS = 2000;
    private static final long MIN_TIME_BETWEEN_ANR_REPORTS_MS = 30000;
    private static final String TAG = "OtelAnrDetector";
    private final long anrThresholdMs;
    private final long checkIntervalMs;
    private final IOtelCrashReporter crashReporter;
    private final AnrCheckEvaluator evaluator;
    private final Function0<Boolean> isAppInForeground;
    private final AtomicBoolean isMonitoring;
    private final IOtelLogger logger;
    private Runnable mainThreadRunnable;
    private final AnrWatchdogPlatform platform;
    private Runnable watchdogRunnable;
    private Thread watchdogThread;

    public OtelAnrDetector(IOtelOpenTelemetryCrash openTelemetryCrash, IOtelLogger logger, long j, long j2, long j3, Function0<Boolean> isAppInForeground, AnrWatchdogPlatform platform) {
        Intrinsics.checkNotNullParameter(openTelemetryCrash, "openTelemetryCrash");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(isAppInForeground, "isAppInForeground");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.logger = logger;
        this.anrThresholdMs = j;
        this.checkIntervalMs = j2;
        this.isAppInForeground = isAppInForeground;
        this.platform = platform;
        this.crashReporter = OtelFactory.INSTANCE.createCrashReporter(openTelemetryCrash, logger);
        this.isMonitoring = new AtomicBoolean(false);
        this.evaluator = new AnrCheckEvaluator(j, j2, j3, 2000L, 30000L, new Function0<Long>() { // from class: com.onesignal.debug.internal.crash.OtelAnrDetector$evaluator$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                AnrWatchdogPlatform anrWatchdogPlatform;
                anrWatchdogPlatform = OtelAnrDetector.this.platform;
                return Long.valueOf(anrWatchdogPlatform.now());
            }
        });
    }

    public /* synthetic */ OtelAnrDetector(IOtelOpenTelemetryCrash iOtelOpenTelemetryCrash, IOtelLogger iOtelLogger, long j, long j2, long j3, Function0 function0, AnrWatchdogPlatform anrWatchdogPlatform, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iOtelOpenTelemetryCrash, iOtelLogger, (i & 4) != 0 ? 5000L : j, (i & 8) != 0 ? 2000L : j2, (i & 16) != 0 ? 10000L : j3, (i & 32) != 0 ? new Function0<Boolean>() { // from class: com.onesignal.debug.internal.crash.OtelAnrDetector.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return true;
            }
        } : function0, (i & 64) != 0 ? new AndroidAnrWatchdogPlatform() : anrWatchdogPlatform);
    }

    @Override // com.onesignal.otel.crash.IOtelAnrDetector
    public void start() {
        if (this.isMonitoring.getAndSet(true)) {
            this.logger.warn("OtelAnrDetector: Already monitoring for ANRs, skipping start");
            return;
        }
        this.logger.info("OtelAnrDetector: Starting ANR detection (threshold: " + this.anrThresholdMs + "ms, check interval: " + this.checkIntervalMs + "ms)");
        this.evaluator.resetBaseline();
        setupRunnables();
        startWatchdogThread();
        this.logger.info("OtelAnrDetector: ✅ ANR detection started successfully");
    }

    private final void setupRunnables() {
        this.mainThreadRunnable = new Runnable() { // from class: com.onesignal.debug.internal.crash.OtelAnrDetector$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OtelAnrDetector.setupRunnables$lambda$0(OtelAnrDetector.this);
            }
        };
        this.watchdogRunnable = new Runnable() { // from class: com.onesignal.debug.internal.crash.OtelAnrDetector$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OtelAnrDetector.setupRunnables$lambda$1(OtelAnrDetector.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRunnables$lambda$0(OtelAnrDetector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.recordHeartbeat$com_onesignal_core();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRunnables$lambda$1(OtelAnrDetector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        while (this$0.isMonitoring.get()) {
            try {
                this$0.checkForAnr$com_onesignal_core();
            } catch (InterruptedException unused) {
                this$0.logger.info("OtelAnrDetector: Watchdog thread interrupted, stopping ANR detection");
                return;
            } catch (Throwable th) {
                this$0.logger.error("OtelAnrDetector: Error in ANR watchdog: " + th.getMessage() + " - " + th.getClass().getSimpleName());
            }
        }
    }

    public final void checkForAnr$com_onesignal_core() {
        Runnable runnable = this.mainThreadRunnable;
        if (runnable == null) {
            return;
        }
        this.platform.postToMainThread(runnable);
        long now = this.platform.now();
        Thread.sleep(this.checkIntervalMs);
        evaluateCheck$com_onesignal_core(this.platform.now() - now);
    }

    public final void recordHeartbeat$com_onesignal_core() {
        this.evaluator.recordHeartbeat();
    }

    public final void evaluateCheck$com_onesignal_core(long actualSleepMs) {
        AnrCheckResult evaluate = this.evaluator.evaluate(actualSleepMs, resolveForeground());
        if (evaluate instanceof AnrCheckResult.Responsive) {
            return;
        }
        if (evaluate instanceof AnrCheckResult.FrozenProcess) {
            AnrCheckResult.FrozenProcess frozenProcess = (AnrCheckResult.FrozenProcess) evaluate;
            this.logger.debug("OtelAnrDetector: Skipping check — watchdog overslept " + frozenProcess.getActualSleepMs() + "ms (expected " + frozenProcess.getExpectedSleepMs() + "ms); process was frozen, not blocked");
            return;
        }
        if (evaluate instanceof AnrCheckResult.Deduped) {
            AnrCheckResult.Deduped deduped = (AnrCheckResult.Deduped) evaluate;
            this.logger.debug("OtelAnrDetector: Block still ongoing (" + deduped.getDurationMs() + "ms), already reported recently (" + deduped.getSinceLastReportMs() + "ms ago)");
        } else if (evaluate instanceof AnrCheckResult.ForegroundAnr) {
            AnrCheckResult.ForegroundAnr foregroundAnr = (AnrCheckResult.ForegroundAnr) evaluate;
            this.logger.info("OtelAnrDetector: ⚠️ ANR detected! Main thread unresponsive for " + foregroundAnr.getDurationMs() + "ms (foreground)");
            reportAnr(foregroundAnr.getDurationMs());
        } else if (evaluate instanceof AnrCheckResult.BackgroundWarning) {
            AnrCheckResult.BackgroundWarning backgroundWarning = (AnrCheckResult.BackgroundWarning) evaluate;
            this.logger.info("OtelAnrDetector: Main thread blocked for " + backgroundWarning.getDurationMs() + "ms while backgrounded — recording warning, not ANR");
            reportBackgroundBlock(backgroundWarning.getDurationMs());
        }
    }

    private final boolean resolveForeground() {
        try {
            return this.isAppInForeground.invoke().booleanValue();
        } catch (Throwable th) {
            this.logger.debug("OtelAnrDetector: Could not resolve app state (" + th.getMessage() + "), assuming foreground");
            return true;
        }
    }

    private final void startWatchdogThread() {
        Thread thread = new Thread(this.watchdogRunnable, "OneSignal-ANR-Watchdog");
        this.watchdogThread = thread;
        thread.setDaemon(true);
        Thread thread2 = this.watchdogThread;
        if (thread2 != null) {
            thread2.start();
        }
    }

    @Override // com.onesignal.otel.crash.IOtelAnrDetector
    public void stop() {
        if (!this.isMonitoring.getAndSet(false)) {
            this.logger.warn("OtelAnrDetector: Not monitoring, skipping stop");
            return;
        }
        this.logger.info("OtelAnrDetector: Stopping ANR detection...");
        Thread thread = this.watchdogThread;
        if (thread != null) {
            thread.interrupt();
        }
        this.watchdogThread = null;
        this.watchdogRunnable = null;
        Runnable runnable = this.mainThreadRunnable;
        if (runnable != null) {
            this.platform.removeFromMainThread(runnable);
        }
        this.mainThreadRunnable = null;
        this.logger.info("OtelAnrDetector: ✅ ANR detection stopped");
    }

    private final void reportAnr(long unresponsiveDurationMs) {
        try {
            this.logger.info("OtelAnrDetector: Checking if ANR is OneSignal-related (unresponsive for " + unresponsiveDurationMs + "ms)");
            Thread mainThread = this.platform.mainThread();
            StackTraceElement[] mainThreadStackTrace = this.platform.mainThreadStackTrace();
            if (!OtelCrashHandlerKt.isOneSignalAtFault(mainThreadStackTrace)) {
                this.logger.debug("OtelAnrDetector: ANR is not OneSignal-related, skipping report");
                return;
            }
            this.logger.info("OtelAnrDetector: OneSignal-related ANR detected, reporting...");
            BuildersKt__BuildersKt.runBlocking$default(null, new OtelAnrDetector$reportAnr$1(this, mainThread, new ApplicationNotRespondingException("Application Not Responding: Main thread blocked for " + unresponsiveDurationMs + "ms", mainThreadStackTrace), null), 1, null);
            this.logger.info("OtelAnrDetector: ✅ ANR report saved successfully");
        } catch (Throwable th) {
            this.logger.error("OtelAnrDetector: Failed to report ANR: " + th.getMessage() + " - " + th.getClass().getSimpleName());
        }
    }

    private final void reportBackgroundBlock(long unresponsiveDurationMs) {
        try {
            Thread mainThread = this.platform.mainThread();
            StackTraceElement[] mainThreadStackTrace = this.platform.mainThreadStackTrace();
            if (OtelCrashHandlerKt.isOneSignalAtFault(mainThreadStackTrace)) {
                BuildersKt__BuildersKt.runBlocking$default(null, new OtelAnrDetector$reportBackgroundBlock$1(this, mainThread, new BackgroundMainThreadBlockException("Background main-thread block for " + unresponsiveDurationMs + "ms | " + AnrCheckEvaluatorKt.buildBlockFingerprint(mainThreadStackTrace), mainThreadStackTrace), null), 1, null);
                this.logger.info("OtelAnrDetector: ✅ Background block warning recorded");
            } else {
                this.logger.debug("OtelAnrDetector: Background block is not OneSignal-related, skipping");
            }
        } catch (Throwable th) {
            this.logger.error("OtelAnrDetector: Failed to record background block: " + th.getMessage() + " - " + th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OtelAnrDetector.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/debug/internal/crash/OtelAnrDetector$ApplicationNotRespondingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "stackTrace", "", "Ljava/lang/StackTraceElement;", "(Ljava/lang/String;[Ljava/lang/StackTraceElement;)V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class ApplicationNotRespondingException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplicationNotRespondingException(String message, StackTraceElement[] stackTrace) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
            setStackTrace(stackTrace);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OtelAnrDetector.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/debug/internal/crash/OtelAnrDetector$BackgroundMainThreadBlockException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "stackTrace", "", "Ljava/lang/StackTraceElement;", "(Ljava/lang/String;[Ljava/lang/StackTraceElement;)V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class BackgroundMainThreadBlockException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackgroundMainThreadBlockException(String message, StackTraceElement[] stackTrace) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
            setStackTrace(stackTrace);
        }
    }
}
