package com.onesignal.debug.internal.crash;

import H5.AbstractC0165z;
import H5.InterfaceC0163x;
import f3.InterfaceC0368a;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.v;
import m1.AbstractC0521b;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import u0.C0675e;
import x5.InterfaceC0732a;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class p implements InterfaceC0368a {
    public static final d Companion = new d(null);
    private static final long FROZEN_PROCESS_SLACK_MS = 2000;
    private static final long MIN_TIME_BETWEEN_ANR_REPORTS_MS = 30000;
    private static final String TAG = "OtelAnrDetector";
    private final long anrThresholdMs;
    private final long checkIntervalMs;
    private final c3.b crashReporter;
    private final com.onesignal.debug.internal.crash.b evaluator;
    private final InterfaceC0732a isAppInForeground;
    private final AtomicBoolean isMonitoring;
    private final c3.c logger;
    private Runnable mainThreadRunnable;
    private final k platform;
    private Runnable watchdogRunnable;
    private Thread watchdogThread;

    public static final class a extends kotlin.jvm.internal.j implements InterfaceC0732a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class b extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String message, StackTraceElement[] stackTrace) {
            super(message);
            kotlin.jvm.internal.i.e(message, "message");
            kotlin.jvm.internal.i.e(stackTrace, "stackTrace");
            setStackTrace(stackTrace);
        }
    }

    public static final class c extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String message, StackTraceElement[] stackTrace) {
            super(message);
            kotlin.jvm.internal.i.e(message, "message");
            kotlin.jvm.internal.i.e(stackTrace, "stackTrace");
            setStackTrace(stackTrace);
        }
    }

    public static final class d {
        public /* synthetic */ d(kotlin.jvm.internal.e eVar) {
            this();
        }

        private d() {
        }
    }

    public static final class e extends kotlin.jvm.internal.j implements InterfaceC0732a {
        public e() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Long invoke() {
            return Long.valueOf(p.this.platform.now());
        }
    }

    public static final class f extends q5.g implements InterfaceC0747p {
        final /* synthetic */ b $anrException;
        final /* synthetic */ Thread $mainThread;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Thread thread, b bVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$mainThread = thread;
            this.$anrException = bVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return p.this.new f(this.$mainThread, this.$anrException, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((f) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            v vVar = v.f5219a;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                c3.b bVar = p.this.crashReporter;
                Thread thread = this.$mainThread;
                b bVar2 = this.$anrException;
                this.label = 1;
                Object i8 = ((C0675e) bVar).i(thread, bVar2, b4.i.FATAL, true, this);
                if (i8 != enumC0580a) {
                    i8 = vVar;
                }
                if (i8 == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return vVar;
        }
    }

    public static final class g extends q5.g implements InterfaceC0747p {
        final /* synthetic */ c $blockException;
        final /* synthetic */ Thread $mainThread;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Thread thread, c cVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$mainThread = thread;
            this.$blockException = cVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return p.this.new g(this.$mainThread, this.$blockException, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((g) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            v vVar = v.f5219a;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                return vVar;
            }
            AbstractC0676f.w(obj);
            c3.b bVar = p.this.crashReporter;
            Thread thread = this.$mainThread;
            c cVar = this.$blockException;
            this.label = 1;
            Object i8 = ((C0675e) bVar).i(thread, cVar, b4.i.WARN, false, this);
            if (i8 != enumC0580a) {
                i8 = vVar;
            }
            return i8 == enumC0580a ? enumC0580a : vVar;
        }
    }

    public p(c3.d openTelemetryCrash, c3.c logger, long j4, long j7, long j8, InterfaceC0732a isAppInForeground, k platform) {
        kotlin.jvm.internal.i.e(openTelemetryCrash, "openTelemetryCrash");
        kotlin.jvm.internal.i.e(logger, "logger");
        kotlin.jvm.internal.i.e(isAppInForeground, "isAppInForeground");
        kotlin.jvm.internal.i.e(platform, "platform");
        this.logger = logger;
        this.anrThresholdMs = j4;
        this.checkIntervalMs = j7;
        this.isAppInForeground = isAppInForeground;
        this.platform = platform;
        this.crashReporter = new C0675e(openTelemetryCrash, 10, logger);
        this.isMonitoring = new AtomicBoolean(false);
        this.evaluator = new com.onesignal.debug.internal.crash.b(j4, j7, j8, FROZEN_PROCESS_SLACK_MS, MIN_TIME_BETWEEN_ANR_REPORTS_MS, new e());
    }

    private final void reportAnr(long j4) {
        try {
            this.logger.info("OtelAnrDetector: Checking if ANR is OneSignal-related (unresponsive for " + j4 + "ms)");
            Thread mainThread = this.platform.mainThread();
            StackTraceElement[] mainThreadStackTrace = this.platform.mainThreadStackTrace();
            if (!AbstractC0521b.u(mainThreadStackTrace)) {
                this.logger.debug("OtelAnrDetector: ANR is not OneSignal-related, skipping report");
                return;
            }
            this.logger.info("OtelAnrDetector: OneSignal-related ANR detected, reporting...");
            AbstractC0165z.o(new f(mainThread, new b("Application Not Responding: Main thread blocked for " + j4 + "ms", mainThreadStackTrace), null));
            this.logger.info("OtelAnrDetector: ✅ ANR report saved successfully");
        } catch (Throwable th) {
            this.logger.error("OtelAnrDetector: Failed to report ANR: " + th.getMessage() + " - " + th.getClass().getSimpleName());
        }
    }

    private final void reportBackgroundBlock(long j4) {
        try {
            Thread mainThread = this.platform.mainThread();
            StackTraceElement[] mainThreadStackTrace = this.platform.mainThreadStackTrace();
            if (!AbstractC0521b.u(mainThreadStackTrace)) {
                this.logger.debug("OtelAnrDetector: Background block is not OneSignal-related, skipping");
                return;
            }
            AbstractC0165z.o(new g(mainThread, new c("Background main-thread block for " + j4 + "ms | " + com.onesignal.debug.internal.crash.d.buildBlockFingerprint(mainThreadStackTrace), mainThreadStackTrace), null));
            this.logger.info("OtelAnrDetector: ✅ Background block warning recorded");
        } catch (Throwable th) {
            this.logger.error("OtelAnrDetector: Failed to record background block: " + th.getMessage() + " - " + th.getClass().getSimpleName());
        }
    }

    private final boolean resolveForeground() {
        try {
            return ((Boolean) this.isAppInForeground.invoke()).booleanValue();
        } catch (Throwable th) {
            this.logger.debug("OtelAnrDetector: Could not resolve app state (" + th.getMessage() + "), assuming foreground");
            return true;
        }
    }

    private final void setupRunnables() {
        final int i7 = 0;
        this.mainThreadRunnable = new Runnable(this) { // from class: com.onesignal.debug.internal.crash.o

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ p f3919g;

            {
                this.f3919g = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        p.setupRunnables$lambda$0(this.f3919g);
                        break;
                    default:
                        p.setupRunnables$lambda$1(this.f3919g);
                        break;
                }
            }
        };
        final int i8 = 1;
        this.watchdogRunnable = new Runnable(this) { // from class: com.onesignal.debug.internal.crash.o

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ p f3919g;

            {
                this.f3919g = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i8) {
                    case 0:
                        p.setupRunnables$lambda$0(this.f3919g);
                        break;
                    default:
                        p.setupRunnables$lambda$1(this.f3919g);
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRunnables$lambda$0(p this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this$0.recordHeartbeat$com_onesignal_core();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRunnables$lambda$1(p this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
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

    private final void startWatchdogThread() {
        Thread thread = new Thread(this.watchdogRunnable, "OneSignal-ANR-Watchdog");
        this.watchdogThread = thread;
        thread.setDaemon(true);
        Thread thread2 = this.watchdogThread;
        if (thread2 != null) {
            thread2.start();
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

    public final void evaluateCheck$com_onesignal_core(long j4) {
        j evaluate = this.evaluator.evaluate(j4, resolveForeground());
        if (evaluate instanceof i) {
            return;
        }
        if (evaluate instanceof h) {
            c3.c cVar = this.logger;
            StringBuilder sb = new StringBuilder("OtelAnrDetector: Skipping check — watchdog overslept ");
            h hVar = (h) evaluate;
            sb.append(hVar.getActualSleepMs());
            sb.append("ms (expected ");
            sb.append(hVar.getExpectedSleepMs());
            sb.append("ms); process was frozen, not blocked");
            cVar.debug(sb.toString());
            return;
        }
        if (evaluate instanceof com.onesignal.debug.internal.crash.f) {
            c3.c cVar2 = this.logger;
            StringBuilder sb2 = new StringBuilder("OtelAnrDetector: Block still ongoing (");
            com.onesignal.debug.internal.crash.f fVar = (com.onesignal.debug.internal.crash.f) evaluate;
            sb2.append(fVar.getDurationMs());
            sb2.append("ms), already reported recently (");
            sb2.append(fVar.getSinceLastReportMs());
            sb2.append("ms ago)");
            cVar2.debug(sb2.toString());
            return;
        }
        if (evaluate instanceof com.onesignal.debug.internal.crash.g) {
            c3.c cVar3 = this.logger;
            StringBuilder sb3 = new StringBuilder("OtelAnrDetector: ⚠️ ANR detected! Main thread unresponsive for ");
            com.onesignal.debug.internal.crash.g gVar = (com.onesignal.debug.internal.crash.g) evaluate;
            sb3.append(gVar.getDurationMs());
            sb3.append("ms (foreground)");
            cVar3.info(sb3.toString());
            reportAnr(gVar.getDurationMs());
            return;
        }
        if (evaluate instanceof com.onesignal.debug.internal.crash.e) {
            c3.c cVar4 = this.logger;
            StringBuilder sb4 = new StringBuilder("OtelAnrDetector: Main thread blocked for ");
            com.onesignal.debug.internal.crash.e eVar = (com.onesignal.debug.internal.crash.e) evaluate;
            sb4.append(eVar.getDurationMs());
            sb4.append("ms while backgrounded — recording warning, not ANR");
            cVar4.info(sb4.toString());
            reportBackgroundBlock(eVar.getDurationMs());
        }
    }

    public final void recordHeartbeat$com_onesignal_core() {
        this.evaluator.recordHeartbeat();
    }

    @Override // f3.InterfaceC0368a
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

    @Override // f3.InterfaceC0368a
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

    public /* synthetic */ p(c3.d dVar, c3.c cVar, long j4, long j7, long j8, InterfaceC0732a interfaceC0732a, k kVar, int i7, kotlin.jvm.internal.e eVar) {
        this(dVar, cVar, (i7 & 4) != 0 ? 5000L : j4, (i7 & 8) != 0 ? 2000L : j7, (i7 & 16) != 0 ? 10000L : j8, (i7 & 32) != 0 ? a.INSTANCE : interfaceC0732a, (i7 & 64) != 0 ? new com.onesignal.debug.internal.crash.a() : kVar);
    }
}
