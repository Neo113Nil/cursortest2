package com.onesignal.internal;

import android.content.Context;
import c3.InterfaceC0281a;
import com.onesignal.debug.internal.crash.m;
import com.onesignal.debug.internal.crash.q;
import com.onesignal.debug.internal.crash.r;
import com.onesignal.internal.e;
import f3.C0370c;
import f3.InterfaceC0368a;
import k5.InterfaceC0475e;
import kotlin.jvm.internal.j;
import m1.AbstractC0521b;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;
import x5.InterfaceC0748q;
import x5.InterfaceC0749r;

/* loaded from: classes.dex */
public final class g implements com.onesignal.common.modeling.g {
    private InterfaceC0368a anrDetector;
    private final InterfaceC0749r anrDetectorFactory;
    private final Context context;
    private InterfaceC0281a crashHandler;
    private final InterfaceC0748q crashHandlerFactory;
    private com.onesignal.internal.d currentConfig;
    private final InterfaceC0732a featureManagerProvider;
    private final Object lock;
    private final InterfaceC0475e logger$delegate;
    private final InterfaceC0732a loggerFactory;
    private final InterfaceC0475e platformProvider$delegate;
    private final InterfaceC0747p platformProviderFactory;
    private c3.e remoteTelemetry;
    private final InterfaceC0743l remoteTelemetryFactory;

    public static final class a extends j implements InterfaceC0748q {
        public static final a INSTANCE = new a();

        public a() {
            super(3);
        }

        @Override // x5.InterfaceC0748q
        public final InterfaceC0281a invoke(Context ctx, c3.c log, InterfaceC0732a fm) {
            kotlin.jvm.internal.i.e(ctx, "ctx");
            kotlin.jvm.internal.i.e(log, "log");
            kotlin.jvm.internal.i.e(fm, "fm");
            return m.INSTANCE.createCrashHandler(ctx, log, fm);
        }
    }

    public static final class b extends j implements InterfaceC0749r {
        public static final b INSTANCE = new b();

        public b() {
            super(4);
        }

        public final InterfaceC0368a invoke(c3.f pp, c3.c log, long j4, long j7) {
            InterfaceC0368a createAnrDetector;
            kotlin.jvm.internal.i.e(pp, "pp");
            kotlin.jvm.internal.i.e(log, "log");
            createAnrDetector = q.createAnrDetector(pp, log, (r14 & 4) != 0 ? 5000L : j4, (r14 & 8) != 0 ? 2000L : j7, (r14 & 16) != 0 ? 10000L : 0L);
            return createAnrDetector;
        }

        @Override // x5.InterfaceC0749r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((c3.f) obj, (c3.c) obj2, ((Number) obj3).longValue(), ((Number) obj4).longValue());
        }
    }

    public static final class c extends j implements InterfaceC0743l {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public final c3.e invoke(c3.f pp) {
            kotlin.jvm.internal.i.e(pp, "pp");
            return new c3.m(pp, new a6.d(pp), new V5.g(4, pp));
        }
    }

    public static final class d extends j implements InterfaceC0747p {
        public static final d INSTANCE = new d();

        public d() {
            super(2);
        }

        @Override // x5.InterfaceC0747p
        public final com.onesignal.debug.internal.logging.otel.android.c invoke(Context ctx, InterfaceC0732a fm) {
            kotlin.jvm.internal.i.e(ctx, "ctx");
            kotlin.jvm.internal.i.e(fm, "fm");
            return com.onesignal.debug.internal.logging.otel.android.e.createAndroidOtelPlatformProvider(ctx, fm);
        }
    }

    public static final class e extends j implements InterfaceC0732a {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final com.onesignal.debug.internal.logging.otel.android.a invoke() {
            return new com.onesignal.debug.internal.logging.otel.android.a();
        }
    }

    public static final class f extends j implements InterfaceC0743l {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public final Boolean invoke(i2.c it) {
            kotlin.jvm.internal.i.e(it, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.onesignal.internal.g$g, reason: collision with other inner class name */
    public static final class C0047g extends j implements InterfaceC0732a {
        public C0047g() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final c3.c invoke() {
            return (c3.c) g.this.loggerFactory.invoke();
        }
    }

    public static final class h extends j implements InterfaceC0732a {
        public h() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final com.onesignal.debug.internal.logging.otel.android.c invoke() {
            return (com.onesignal.debug.internal.logging.otel.android.c) g.this.platformProviderFactory.invoke(g.this.context, g.this.featureManagerProvider);
        }
    }

    public static final class i extends j implements InterfaceC0743l {
        final /* synthetic */ i2.c $logLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(i2.c cVar) {
            super(1);
            this.$logLevel = cVar;
        }

        @Override // x5.InterfaceC0743l
        public final Boolean invoke(i2.c level) {
            kotlin.jvm.internal.i.e(level, "level");
            i2.c cVar = this.$logLevel;
            return Boolean.valueOf(cVar != i2.c.NONE && level.compareTo(cVar) <= 0);
        }
    }

    public g(Context context, InterfaceC0732a featureManagerProvider, InterfaceC0748q crashHandlerFactory, InterfaceC0749r anrDetectorFactory, InterfaceC0743l remoteTelemetryFactory, InterfaceC0747p platformProviderFactory, InterfaceC0732a loggerFactory) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(featureManagerProvider, "featureManagerProvider");
        kotlin.jvm.internal.i.e(crashHandlerFactory, "crashHandlerFactory");
        kotlin.jvm.internal.i.e(anrDetectorFactory, "anrDetectorFactory");
        kotlin.jvm.internal.i.e(remoteTelemetryFactory, "remoteTelemetryFactory");
        kotlin.jvm.internal.i.e(platformProviderFactory, "platformProviderFactory");
        kotlin.jvm.internal.i.e(loggerFactory, "loggerFactory");
        this.context = context;
        this.featureManagerProvider = featureManagerProvider;
        this.crashHandlerFactory = crashHandlerFactory;
        this.anrDetectorFactory = anrDetectorFactory;
        this.remoteTelemetryFactory = remoteTelemetryFactory;
        this.platformProviderFactory = platformProviderFactory;
        this.loggerFactory = loggerFactory;
        this.lock = new Object();
        this.platformProvider$delegate = AbstractC0521b.x(new h());
        this.logger$delegate = AbstractC0521b.x(new C0047g());
    }

    private final void applyAction(com.onesignal.internal.e eVar, com.onesignal.internal.d dVar) {
        if (eVar instanceof e.b) {
            i2.c logLevel = dVar.getLogLevel();
            if (logLevel == null) {
                logLevel = i2.c.ERROR;
            }
            enableFeatures(logLevel);
        } else if (eVar instanceof e.a) {
            disableFeatures();
        } else if (eVar instanceof e.d) {
            updateLogLevel(((e.d) eVar).getNewLevel());
        } else if (eVar instanceof e.c) {
            com.onesignal.debug.internal.logging.b.debug$default("OneSignal: Otel config unchanged, no action needed", null, 2, null);
        }
        this.currentConfig = dVar;
    }

    private final void disableFeatures() {
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Disabling Otel features", null, 2, null);
        try {
            InterfaceC0368a interfaceC0368a = this.anrDetector;
            if (interfaceC0368a != null) {
                interfaceC0368a.stop();
            }
            this.anrDetector = null;
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Error stopping ANR detector: " + th.getMessage(), th);
        }
        try {
            InterfaceC0281a interfaceC0281a = this.crashHandler;
            if (interfaceC0281a != null) {
                C0370c c0370c = (C0370c) interfaceC0281a;
                if (c0370c.f4207e) {
                    c0370c.f4204b.info("OtelCrashHandler: Unregistering — restoring previous exception handler");
                    Thread.setDefaultUncaughtExceptionHandler(c0370c.f4205c);
                    c0370c.f4205c = null;
                    c0370c.f4207e = false;
                } else {
                    c0370c.f4204b.debug("OtelCrashHandler: Not initialized, nothing to unregister");
                }
            }
            this.crashHandler = null;
        } catch (Throwable th2) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Error unregistering crash handler: " + th2.getMessage(), th2);
        }
        try {
            com.onesignal.debug.internal.logging.b.INSTANCE.setOtelTelemetry(null, f.INSTANCE);
            Object obj = this.remoteTelemetry;
            if (obj != null) {
                c3.j jVar = (c3.j) obj;
                synchronized (jVar.f3792c) {
                    try {
                        N4.d dVar = jVar.f3793d;
                        if (dVar != null) {
                            dVar.shutdown();
                        }
                    } catch (Throwable unused) {
                    }
                    jVar.f3793d = null;
                }
            }
            this.remoteTelemetry = null;
        } catch (Throwable th3) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Error disabling Otel logging: " + th3.getMessage(), th3);
        }
    }

    private final void enableFeatures(i2.c cVar) {
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Enabling Otel features at level " + cVar, null, 2, null);
        try {
            startCrashHandler();
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to start crash handler: " + th.getMessage(), th);
        }
        try {
            startAnrDetector();
        } catch (Throwable th2) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to start ANR detector: " + th2.getMessage(), th2);
        }
        try {
            startOtelLogging(cVar);
        } catch (Throwable th3) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to start Otel logging: " + th3.getMessage(), th3);
        }
    }

    private final c3.c getLogger() {
        return (c3.c) this.logger$delegate.getValue();
    }

    private final com.onesignal.debug.internal.logging.otel.android.c getPlatformProvider() {
        return (com.onesignal.debug.internal.logging.otel.android.c) this.platformProvider$delegate.getValue();
    }

    private final com.onesignal.internal.d readCurrentCachedConfig() {
        return new com.onesignal.internal.d(getPlatformProvider().isRemoteLoggingEnabled(), i2.c.Companion.fromString(getPlatformProvider().getRemoteLogLevel()));
    }

    private final void startAnrDetector() {
        if (this.anrDetector != null) {
            return;
        }
        InterfaceC0368a interfaceC0368a = (InterfaceC0368a) this.anrDetectorFactory.invoke(getPlatformProvider(), getLogger(), 5000L, 2000L);
        interfaceC0368a.start();
        this.anrDetector = interfaceC0368a;
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: ANR detector started", null, 2, null);
    }

    private final void startCrashHandler() {
        if (this.crashHandler != null) {
            return;
        }
        InterfaceC0281a interfaceC0281a = (InterfaceC0281a) this.crashHandlerFactory.invoke(this.context, getLogger(), this.featureManagerProvider);
        C0370c c0370c = (C0370c) interfaceC0281a;
        if (c0370c.f4207e) {
            c0370c.f4204b.warn("OtelCrashHandler already initialized, skipping");
        } else {
            c0370c.f4204b.info("OtelCrashHandler: Setting up uncaught exception handler...");
            c0370c.f4205c = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(c0370c);
            c0370c.f4207e = true;
            c0370c.f4204b.info("OtelCrashHandler: ✅ Successfully initialized and registered as default uncaught exception handler");
        }
        this.crashHandler = interfaceC0281a;
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Crash handler initialized — logs at: " + getPlatformProvider().getCrashStoragePath(), null, 2, null);
    }

    private final void startOtelLogging(i2.c cVar) {
        Object obj = this.remoteTelemetry;
        if (obj != null) {
            c3.j jVar = (c3.j) obj;
            synchronized (jVar.f3792c) {
                try {
                    N4.d dVar = jVar.f3793d;
                    if (dVar != null) {
                        dVar.shutdown();
                    }
                } catch (Throwable unused) {
                }
                jVar.f3793d = null;
            }
        }
        c3.e eVar = (c3.e) this.remoteTelemetryFactory.invoke(getPlatformProvider());
        this.remoteTelemetry = eVar;
        com.onesignal.debug.internal.logging.b.INSTANCE.setOtelTelemetry(eVar, new i(cVar));
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Otel logging active at level " + cVar, null, 2, null);
    }

    private final void updateLogLevel(i2.c cVar) {
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Updating Otel log level to " + cVar, null, 2, null);
        try {
            startOtelLogging(cVar);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to update Otel log level: " + th.getMessage(), th);
        }
    }

    public final void initializeFromCachedConfig() {
        if (!r.INSTANCE.isSupported()) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignal: Device SDK < 26, Otel not supported — skipping all Otel features", null, 2, null);
            return;
        }
        try {
            com.onesignal.internal.d readCurrentCachedConfig = readCurrentCachedConfig();
            synchronized (this.lock) {
                applyAction(com.onesignal.internal.f.INSTANCE.evaluate(this.currentConfig, readCurrentCachedConfig), readCurrentCachedConfig);
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to initialize Otel from cached config: " + th.getMessage(), th);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        kotlin.jvm.internal.i.e(args, "args");
        kotlin.jvm.internal.i.e(tag, "tag");
    }

    public final void subscribeToConfigStore(com.onesignal.core.internal.config.c configModelStore) {
        kotlin.jvm.internal.i.e(configModelStore, "configModelStore");
        configModelStore.subscribe((com.onesignal.common.modeling.g) this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        kotlin.jvm.internal.i.e(model, "model");
        kotlin.jvm.internal.i.e(tag, "tag");
        if (tag.equals("HYDRATE") && r.INSTANCE.isSupported()) {
            try {
                com.onesignal.internal.d dVar = new com.onesignal.internal.d(model.getRemoteLoggingParams().isEnabled(), model.getRemoteLoggingParams().getLogLevel());
                synchronized (this.lock) {
                    applyAction(com.onesignal.internal.f.INSTANCE.evaluate(this.currentConfig, dVar), dVar);
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to refresh Otel from remote config: " + th.getMessage(), th);
            }
        }
    }

    public /* synthetic */ g(Context context, InterfaceC0732a interfaceC0732a, InterfaceC0748q interfaceC0748q, InterfaceC0749r interfaceC0749r, InterfaceC0743l interfaceC0743l, InterfaceC0747p interfaceC0747p, InterfaceC0732a interfaceC0732a2, int i7, kotlin.jvm.internal.e eVar) {
        this(context, interfaceC0732a, (i7 & 4) != 0 ? a.INSTANCE : interfaceC0748q, (i7 & 8) != 0 ? b.INSTANCE : interfaceC0749r, (i7 & 16) != 0 ? c.INSTANCE : interfaceC0743l, (i7 & 32) != 0 ? d.INSTANCE : interfaceC0747p, (i7 & 64) != 0 ? e.INSTANCE : interfaceC0732a2);
    }
}
