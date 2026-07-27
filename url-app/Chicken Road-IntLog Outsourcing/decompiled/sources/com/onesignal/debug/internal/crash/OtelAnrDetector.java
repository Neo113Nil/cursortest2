package com.onesignal.debug.internal.crash;

import D4.AbstractC0024y;
import android.os.Handler;
import android.os.Looper;
import com.onesignal.otel.IOtelCrashReporter;
import com.onesignal.otel.IOtelLogger;
import com.onesignal.otel.IOtelOpenTelemetryCrash;
import com.onesignal.otel.OtelFactory;
import com.onesignal.otel.crash.IOtelAnrDetector;
import com.onesignal.otel.crash.OtelCrashHandlerKt;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import k4.C1224j;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OtelAnrDetector implements IOtelAnrDetector {
    public static final Companion Companion = new Companion(null);
    private static final long MIN_TIME_BETWEEN_ANR_REPORTS_MS = 30000;
    private static final String TAG = "OtelAnrDetector";
    private final long anrThresholdMs;
    private final long checkIntervalMs;
    private final IOtelCrashReporter crashReporter;
    private final AtomicBoolean isMonitoring;
    private final AtomicLong lastAnrReportTime;
    private final AtomicLong lastResponseTime;
    private final IOtelLogger logger;
    private final Handler mainHandler;
    private Runnable mainThreadRunnable;
    private Runnable watchdogRunnable;
    private Thread watchdogThread;

    public static final class ApplicationNotRespondingException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplicationNotRespondingException(String message, StackTraceElement[] stackTrace) {
            super(message);
            i.e(message, "message");
            i.e(stackTrace, "stackTrace");
            setStackTrace(stackTrace);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public OtelAnrDetector(IOtelOpenTelemetryCrash openTelemetryCrash, IOtelLogger logger, long j2, long j6) {
        i.e(openTelemetryCrash, "openTelemetryCrash");
        i.e(logger, "logger");
        this.logger = logger;
        this.anrThresholdMs = j2;
        this.checkIntervalMs = j6;
        this.crashReporter = OtelFactory.INSTANCE.createCrashReporter(openTelemetryCrash, logger);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.isMonitoring = new AtomicBoolean(false);
        this.lastResponseTime = new AtomicLong(System.currentTimeMillis());
        this.lastAnrReportTime = new AtomicLong(0L);
    }

    private final void checkForAnr() {
        Runnable runnable = this.mainThreadRunnable;
        if (runnable == null) {
            return;
        }
        this.mainHandler.post(runnable);
        Thread.sleep(this.checkIntervalMs);
        long currentTimeMillis = System.currentTimeMillis() - this.lastResponseTime.get();
        if (currentTimeMillis > this.anrThresholdMs) {
            handleAnrDetected(currentTimeMillis);
        } else {
            handleMainThreadResponsive();
        }
    }

    private final void handleAnrDetected(long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        long j6 = currentTimeMillis - this.lastAnrReportTime.get();
        if (j6 > MIN_TIME_BETWEEN_ANR_REPORTS_MS) {
            this.logger.warn("OtelAnrDetector: ⚠️ ANR detected! Main thread unresponsive for " + j2 + "ms");
            this.lastAnrReportTime.set(currentTimeMillis);
            reportAnr(j2);
            return;
        }
        this.logger.debug("OtelAnrDetector: ANR still ongoing (" + j2 + "ms), but already reported recently (" + j6 + "ms ago)");
    }

    private final void handleMainThreadResponsive() {
        if (this.lastAnrReportTime.get() > 0) {
            this.lastAnrReportTime.set(0L);
            this.logger.debug("OtelAnrDetector: Main thread recovered, ready to detect new ANRs");
        }
    }

    private final void reportAnr(long j2) {
        try {
            this.logger.info("OtelAnrDetector: Checking if ANR is OneSignal-related (unresponsive for " + j2 + "ms)");
            Thread thread = Looper.getMainLooper().getThread();
            i.d(thread, "getThread(...)");
            StackTraceElement[] stackTrace = thread.getStackTrace();
            i.b(stackTrace);
            if (!OtelCrashHandlerKt.isOneSignalAtFault(stackTrace)) {
                this.logger.debug("OtelAnrDetector: ANR is not OneSignal-related, skipping report");
                return;
            }
            this.logger.info("OtelAnrDetector: OneSignal-related ANR detected, reporting...");
            AbstractC0024y.q(C1224j.f10720a, new OtelAnrDetector$reportAnr$1(this, thread, new ApplicationNotRespondingException("Application Not Responding: Main thread blocked for " + j2 + "ms", stackTrace), null));
            this.logger.info("OtelAnrDetector: ✅ ANR report saved successfully");
        } catch (Throwable th) {
            this.logger.error("OtelAnrDetector: Failed to report ANR: " + th.getMessage() + " - " + th.getClass().getSimpleName());
        }
    }

    private final void setupRunnables() {
        final int i2 = 0;
        this.mainThreadRunnable = new Runnable(this) { // from class: com.onesignal.debug.internal.crash.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtelAnrDetector f5340b;

            {
                this.f5340b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        OtelAnrDetector.setupRunnables$lambda$0(this.f5340b);
                        break;
                    default:
                        OtelAnrDetector.setupRunnables$lambda$1(this.f5340b);
                        break;
                }
            }
        };
        final int i3 = 1;
        this.watchdogRunnable = new Runnable(this) { // from class: com.onesignal.debug.internal.crash.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtelAnrDetector f5340b;

            {
                this.f5340b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        OtelAnrDetector.setupRunnables$lambda$0(this.f5340b);
                        break;
                    default:
                        OtelAnrDetector.setupRunnables$lambda$1(this.f5340b);
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRunnables$lambda$0(OtelAnrDetector this$0) {
        i.e(this$0, "this$0");
        this$0.lastResponseTime.set(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRunnables$lambda$1(OtelAnrDetector this$0) {
        i.e(this$0, "this$0");
        while (this$0.isMonitoring.get()) {
            try {
                this$0.checkForAnr();
            } catch (InterruptedException unused) {
                this$0.logger.info("OtelAnrDetector: Watchdog thread interrupted, stopping ANR detection");
                return;
            } catch (Throwable th) {
                this$0.logger.error("OtelAnrDetector: Error in ANR watchdog: " + th.getMessage() + " - " + th.getClass().getSimpleName());
            }
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
    public void start() {
        if (this.isMonitoring.getAndSet(true)) {
            this.logger.warn("OtelAnrDetector: Already monitoring for ANRs, skipping start");
            return;
        }
        this.logger.info("OtelAnrDetector: Starting ANR detection (threshold: " + this.anrThresholdMs + "ms, check interval: " + this.checkIntervalMs + "ms)");
        setupRunnables();
        startWatchdogThread();
        this.logger.info("OtelAnrDetector: ✅ ANR detection started successfully");
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
            this.mainHandler.removeCallbacks(runnable);
        }
        this.mainThreadRunnable = null;
        this.logger.info("OtelAnrDetector: ✅ ANR detection stopped");
    }

    public /* synthetic */ OtelAnrDetector(IOtelOpenTelemetryCrash iOtelOpenTelemetryCrash, IOtelLogger iOtelLogger, long j2, long j6, int i2, e eVar) {
        this(iOtelOpenTelemetryCrash, iOtelLogger, (i2 & 4) != 0 ? AnrConstants.DEFAULT_ANR_THRESHOLD_MS : j2, (i2 & 8) != 0 ? AnrConstants.DEFAULT_CHECK_INTERVAL_MS : j6);
    }
}
