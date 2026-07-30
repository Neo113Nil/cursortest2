package com.onesignal.internal;

import B5.j;
import B5.m;
import E7.l;
import E7.p;
import E7.q;
import E7.r;
import android.content.Context;
import com.onesignal.internal.e;
import g1.C4523c;
import g1.C4524d;
import q7.InterfaceC4936e;

/* loaded from: classes2.dex */
public final class g implements com.onesignal.common.modeling.g {
    private E5.a anrDetector;
    private final r anrDetectorFactory;
    private final Context context;
    private B5.a crashHandler;
    private final q crashHandlerFactory;
    private com.onesignal.internal.d currentConfig;
    private final E7.a featureManagerProvider;
    private final Object lock;
    private final InterfaceC4936e logger$delegate;
    private final E7.a loggerFactory;
    private final InterfaceC4936e platformProvider$delegate;
    private final p platformProviderFactory;
    private B5.e remoteTelemetry;
    private final l remoteTelemetryFactory;

    public static final class a extends kotlin.jvm.internal.i implements q {
        public static final a INSTANCE = new a();

        public a() {
            super(3);
        }

        @Override // E7.q
        public final B5.a invoke(Context ctx, B5.c log, E7.a fm) {
            kotlin.jvm.internal.h.e(ctx, "ctx");
            kotlin.jvm.internal.h.e(log, "log");
            kotlin.jvm.internal.h.e(fm, "fm");
            return com.onesignal.debug.internal.crash.a.INSTANCE.createCrashHandler(ctx, log, fm);
        }
    }

    public static final class b extends kotlin.jvm.internal.i implements r {
        public static final b INSTANCE = new b();

        public b() {
            super(4);
        }

        public final E5.a invoke(B5.f pp, B5.c log, long j9, long j10) {
            kotlin.jvm.internal.h.e(pp, "pp");
            kotlin.jvm.internal.h.e(log, "log");
            return com.onesignal.debug.internal.crash.e.createAnrDetector(pp, log, j9, j10);
        }

        @Override // E7.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((B5.f) obj, (B5.c) obj2, ((Number) obj3).longValue(), ((Number) obj4).longValue());
        }
    }

    public static final class c extends kotlin.jvm.internal.i implements l {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // E7.l
        public final B5.e invoke(B5.f pp) {
            kotlin.jvm.internal.h.e(pp, "pp");
            return new m(pp, new C4524d(4, pp), new C4523c(3, pp));
        }
    }

    public static final class d extends kotlin.jvm.internal.i implements p {
        public static final d INSTANCE = new d();

        public d() {
            super(2);
        }

        @Override // E7.p
        public final com.onesignal.debug.internal.logging.otel.android.c invoke(Context ctx, E7.a fm) {
            kotlin.jvm.internal.h.e(ctx, "ctx");
            kotlin.jvm.internal.h.e(fm, "fm");
            return com.onesignal.debug.internal.logging.otel.android.e.createAndroidOtelPlatformProvider(ctx, fm);
        }
    }

    public static final class e extends kotlin.jvm.internal.i implements E7.a {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // E7.a
        public final com.onesignal.debug.internal.logging.otel.android.a invoke() {
            return new com.onesignal.debug.internal.logging.otel.android.a();
        }
    }

    public static final class f extends kotlin.jvm.internal.i implements l {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // E7.l
        public final Boolean invoke(I4.c it) {
            kotlin.jvm.internal.h.e(it, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.onesignal.internal.g$g, reason: collision with other inner class name */
    public static final class C0216g extends kotlin.jvm.internal.i implements E7.a {
        public C0216g() {
            super(0);
        }

        @Override // E7.a
        public final B5.c invoke() {
            return (B5.c) g.this.loggerFactory.invoke();
        }
    }

    public static final class h extends kotlin.jvm.internal.i implements E7.a {
        public h() {
            super(0);
        }

        @Override // E7.a
        public final com.onesignal.debug.internal.logging.otel.android.c invoke() {
            return (com.onesignal.debug.internal.logging.otel.android.c) g.this.platformProviderFactory.invoke(g.this.context, g.this.featureManagerProvider);
        }
    }

    public static final class i extends kotlin.jvm.internal.i implements l {
        final /* synthetic */ I4.c $logLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(I4.c cVar) {
            super(1);
            this.$logLevel = cVar;
        }

        @Override // E7.l
        public final Boolean invoke(I4.c level) {
            kotlin.jvm.internal.h.e(level, "level");
            I4.c cVar = this.$logLevel;
            return Boolean.valueOf(cVar != I4.c.NONE && level.compareTo(cVar) <= 0);
        }
    }

    public g(Context context, E7.a featureManagerProvider, q crashHandlerFactory, r anrDetectorFactory, l remoteTelemetryFactory, p platformProviderFactory, E7.a loggerFactory) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(featureManagerProvider, "featureManagerProvider");
        kotlin.jvm.internal.h.e(crashHandlerFactory, "crashHandlerFactory");
        kotlin.jvm.internal.h.e(anrDetectorFactory, "anrDetectorFactory");
        kotlin.jvm.internal.h.e(remoteTelemetryFactory, "remoteTelemetryFactory");
        kotlin.jvm.internal.h.e(platformProviderFactory, "platformProviderFactory");
        kotlin.jvm.internal.h.e(loggerFactory, "loggerFactory");
        this.context = context;
        this.featureManagerProvider = featureManagerProvider;
        this.crashHandlerFactory = crashHandlerFactory;
        this.anrDetectorFactory = anrDetectorFactory;
        this.remoteTelemetryFactory = remoteTelemetryFactory;
        this.platformProviderFactory = platformProviderFactory;
        this.loggerFactory = loggerFactory;
        this.lock = new Object();
        this.platformProvider$delegate = com.bumptech.glide.e.q(new h());
        this.logger$delegate = com.bumptech.glide.e.q(new C0216g());
    }

    private final void applyAction(com.onesignal.internal.e eVar, com.onesignal.internal.d dVar) {
        if (eVar instanceof e.b) {
            I4.c logLevel = dVar.getLogLevel();
            if (logLevel == null) {
                logLevel = I4.c.ERROR;
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
            E5.a aVar = this.anrDetector;
            if (aVar != null) {
                aVar.stop();
            }
            this.anrDetector = null;
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Error stopping ANR detector: " + th.getMessage(), th);
        }
        try {
            B5.a aVar2 = this.crashHandler;
            if (aVar2 != null) {
                E5.c cVar = (E5.c) aVar2;
                if (cVar.f833e) {
                    cVar.f830b.info("OtelCrashHandler: Unregistering — restoring previous exception handler");
                    Thread.setDefaultUncaughtExceptionHandler(cVar.f831c);
                    cVar.f831c = null;
                    cVar.f833e = false;
                } else {
                    cVar.f830b.debug("OtelCrashHandler: Not initialized, nothing to unregister");
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
                j jVar = (j) obj;
                synchronized (jVar.f348c) {
                    try {
                        T6.d dVar = jVar.f349d;
                        if (dVar != null) {
                            dVar.shutdown();
                        }
                    } catch (Throwable unused) {
                    }
                    jVar.f349d = null;
                }
            }
            this.remoteTelemetry = null;
        } catch (Throwable th3) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Error disabling Otel logging: " + th3.getMessage(), th3);
        }
    }

    private final void enableFeatures(I4.c cVar) {
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

    private final B5.c getLogger() {
        return (B5.c) this.logger$delegate.getValue();
    }

    private final com.onesignal.debug.internal.logging.otel.android.c getPlatformProvider() {
        return (com.onesignal.debug.internal.logging.otel.android.c) this.platformProvider$delegate.getValue();
    }

    private final com.onesignal.internal.d readCurrentCachedConfig() {
        return new com.onesignal.internal.d(getPlatformProvider().isRemoteLoggingEnabled(), I4.c.Companion.fromString(getPlatformProvider().getRemoteLogLevel()));
    }

    private final void startAnrDetector() {
        if (this.anrDetector != null) {
            return;
        }
        E5.a aVar = (E5.a) this.anrDetectorFactory.invoke(getPlatformProvider(), getLogger(), Long.valueOf(com.anythink.basead.exoplayer.f.f7344a), Long.valueOf(com.anythink.basead.exoplayer.i.a.f8040f));
        aVar.start();
        this.anrDetector = aVar;
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: ANR detector started", null, 2, null);
    }

    private final void startCrashHandler() {
        if (this.crashHandler != null) {
            return;
        }
        B5.a aVar = (B5.a) this.crashHandlerFactory.invoke(this.context, getLogger(), this.featureManagerProvider);
        E5.c cVar = (E5.c) aVar;
        if (cVar.f833e) {
            cVar.f830b.warn("OtelCrashHandler already initialized, skipping");
        } else {
            cVar.f830b.info("OtelCrashHandler: Setting up uncaught exception handler...");
            cVar.f831c = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(cVar);
            cVar.f833e = true;
            cVar.f830b.info("OtelCrashHandler: ✅ Successfully initialized and registered as default uncaught exception handler");
        }
        this.crashHandler = aVar;
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Crash handler initialized — logs at: " + getPlatformProvider().getCrashStoragePath(), null, 2, null);
    }

    private final void startOtelLogging(I4.c cVar) {
        Object obj = this.remoteTelemetry;
        if (obj != null) {
            j jVar = (j) obj;
            synchronized (jVar.f348c) {
                try {
                    T6.d dVar = jVar.f349d;
                    if (dVar != null) {
                        dVar.shutdown();
                    }
                } catch (Throwable unused) {
                }
                jVar.f349d = null;
            }
        }
        B5.e eVar = (B5.e) this.remoteTelemetryFactory.invoke(getPlatformProvider());
        this.remoteTelemetry = eVar;
        com.onesignal.debug.internal.logging.b.INSTANCE.setOtelTelemetry(eVar, new i(cVar));
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Otel logging active at level " + cVar, null, 2, null);
    }

    private final void updateLogLevel(I4.c cVar) {
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Updating Otel log level to " + cVar, null, 2, null);
        try {
            startOtelLogging(cVar);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to update Otel log level: " + th.getMessage(), th);
        }
    }

    public final void initializeFromCachedConfig() {
        if (!com.onesignal.debug.internal.crash.f.INSTANCE.isSupported()) {
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
        kotlin.jvm.internal.h.e(args, "args");
        kotlin.jvm.internal.h.e(tag, "tag");
    }

    public final void subscribeToConfigStore(com.onesignal.core.internal.config.c configModelStore) {
        kotlin.jvm.internal.h.e(configModelStore, "configModelStore");
        configModelStore.subscribe((com.onesignal.common.modeling.g) this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(tag, "tag");
        if (tag.equals("HYDRATE") && com.onesignal.debug.internal.crash.f.INSTANCE.isSupported()) {
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

    public /* synthetic */ g(Context context, E7.a aVar, q qVar, r rVar, l lVar, p pVar, E7.a aVar2, int i4, kotlin.jvm.internal.e eVar) {
        this(context, aVar, (i4 & 4) != 0 ? a.INSTANCE : qVar, (i4 & 8) != 0 ? b.INSTANCE : rVar, (i4 & 16) != 0 ? c.INSTANCE : lVar, (i4 & 32) != 0 ? d.INSTANCE : pVar, (i4 & 64) != 0 ? e.INSTANCE : aVar2);
    }
}
