package com.onesignal.debug.internal.crash;

import P0.l;
import X5.j;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class d implements H3.a {
    public static final b Companion = new b(null);
    private static final long MIN_TIME_BETWEEN_ANR_REPORTS_MS = 30000;
    private static final String TAG = "OtelAnrDetector";
    private final long anrThresholdMs;
    private final long checkIntervalMs;
    private final E3.b crashReporter;
    private final AtomicBoolean isMonitoring;
    private final AtomicLong lastAnrReportTime;
    private final AtomicLong lastResponseTime;
    private final E3.c logger;
    private final Handler mainHandler;
    private Runnable mainThreadRunnable;
    private Runnable watchdogRunnable;
    private Thread watchdogThread;

    public static final class a extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String message, StackTraceElement[] stackTrace) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
            setStackTrace(stackTrace);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends j implements Function2 {
        final /* synthetic */ a $anrException;
        final /* synthetic */ Thread $mainThread;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Thread thread, a aVar, V5.b bVar) {
            super(2, bVar);
            this.$mainThread = thread;
            this.$anrException = aVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return d.this.new c(this.$mainThread, this.$anrException, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                E3.b bVar = d.this.crashReporter;
                Thread thread = this.$mainThread;
                a aVar2 = this.$anrException;
                this.label = 1;
                if (((l) bVar).d(thread, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((c) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public d(E3.d openTelemetryCrash, E3.c logger, long j, long j7) {
        Intrinsics.checkNotNullParameter(openTelemetryCrash, "openTelemetryCrash");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.anrThresholdMs = j;
        this.checkIntervalMs = j7;
        Intrinsics.checkNotNullParameter(openTelemetryCrash, "openTelemetryCrash");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.crashReporter = new l(openTelemetryCrash, logger);
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

    private final void handleAnrDetected(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        long j7 = currentTimeMillis - this.lastAnrReportTime.get();
        if (j7 > MIN_TIME_BETWEEN_ANR_REPORTS_MS) {
            this.logger.info("OtelAnrDetector: ⚠️ ANR detected! Main thread unresponsive for " + j + "ms");
            this.lastAnrReportTime.set(currentTimeMillis);
            reportAnr(j);
            return;
        }
        this.logger.debug("OtelAnrDetector: ANR still ongoing (" + j + "ms), but already reported recently (" + j7 + "ms ago)");
    }

    private final void handleMainThreadResponsive() {
        if (this.lastAnrReportTime.get() > 0) {
            this.lastAnrReportTime.set(0L);
            this.logger.debug("OtelAnrDetector: Main thread recovered, ready to detect new ANRs");
        }
    }

    private final void reportAnr(long j) {
        try {
            this.logger.info("OtelAnrDetector: Checking if ANR is OneSignal-related (unresponsive for " + j + "ms)");
            Thread thread = Looper.getMainLooper().getThread();
            Intrinsics.checkNotNullExpressionValue(thread, "getThread(...)");
            StackTraceElement[] stackTrace = thread.getStackTrace();
            Intrinsics.b(stackTrace);
            if (!P0.f.A(stackTrace)) {
                this.logger.debug("OtelAnrDetector: ANR is not OneSignal-related, skipping report");
                return;
            }
            this.logger.info("OtelAnrDetector: OneSignal-related ANR detected, reporting...");
            AbstractC0792z.o(g.f6146d, new c(thread, new a("Application Not Responding: Main thread blocked for " + j + "ms", stackTrace), null));
            this.logger.info("OtelAnrDetector: ✅ ANR report saved successfully");
        } catch (Throwable th) {
            this.logger.error("OtelAnrDetector: Failed to report ANR: " + th.getMessage() + " - " + th.getClass().getSimpleName());
        }
    }

    private final void setupRunnables() {
        final int i2 = 0;
        this.mainThreadRunnable = new Runnable(this) { // from class: com.onesignal.debug.internal.crash.c

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f4546e;

            {
                this.f4546e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        d.setupRunnables$lambda$0(this.f4546e);
                        break;
                    default:
                        d.setupRunnables$lambda$1(this.f4546e);
                        break;
                }
            }
        };
        final int i5 = 1;
        this.watchdogRunnable = new Runnable(this) { // from class: com.onesignal.debug.internal.crash.c

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f4546e;

            {
                this.f4546e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        d.setupRunnables$lambda$0(this.f4546e);
                        break;
                    default:
                        d.setupRunnables$lambda$1(this.f4546e);
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRunnables$lambda$0(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lastResponseTime.set(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRunnables$lambda$1(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
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

    @Override // H3.a
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

    @Override // H3.a
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

    public /* synthetic */ d(E3.d dVar, E3.c cVar, long j, long j7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, cVar, (i2 & 4) != 0 ? 5000L : j, (i2 & 8) != 0 ? 2000L : j7);
    }
}
