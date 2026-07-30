package com.onesignal.internal;

import E3.j;
import E3.m;
import R5.InterfaceC0168h;
import android.content.Context;
import com.onesignal.internal.e;
import e6.n;
import e6.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class g implements com.onesignal.common.modeling.g {
    private H3.a anrDetector;
    private final o anrDetectorFactory;
    private final Context context;
    private E3.a crashHandler;
    private final n crashHandlerFactory;
    private com.onesignal.internal.d currentConfig;
    private final Function0<B2.e> featureManagerProvider;
    private final Object lock;
    private final InterfaceC0168h logger$delegate;
    private final Function0<E3.c> loggerFactory;
    private final InterfaceC0168h platformProvider$delegate;
    private final Function2<Context, Function0<? extends B2.e>, com.onesignal.debug.internal.logging.otel.android.c> platformProviderFactory;
    private E3.e remoteTelemetry;
    private final Function1<E3.f, E3.e> remoteTelemetryFactory;

    public static final class a extends p implements n {
        public static final a INSTANCE = new a();

        public a() {
            super(3);
        }

        @Override // e6.n
        public final E3.a invoke(Context ctx, E3.c log, Function0<? extends B2.e> fm) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(log, "log");
            Intrinsics.checkNotNullParameter(fm, "fm");
            return com.onesignal.debug.internal.crash.a.INSTANCE.createCrashHandler(ctx, log, fm);
        }
    }

    public static final class b extends p implements o {
        public static final b INSTANCE = new b();

        public b() {
            super(4);
        }

        public final H3.a invoke(E3.f pp, E3.c log, long j, long j7) {
            Intrinsics.checkNotNullParameter(pp, "pp");
            Intrinsics.checkNotNullParameter(log, "log");
            return com.onesignal.debug.internal.crash.e.createAnrDetector(pp, log, j, j7);
        }

        @Override // e6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((E3.f) obj, (E3.c) obj2, ((Number) obj3).longValue(), ((Number) obj4).longValue());
        }
    }

    public static final class c extends p implements Function1 {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final E3.e invoke(E3.f platformProvider) {
            Intrinsics.checkNotNullParameter(platformProvider, "pp");
            Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
            return new m(platformProvider, new B.f(platformProvider), new l2.c(platformProvider));
        }
    }

    public static final class d extends p implements Function2 {
        public static final d INSTANCE = new d();

        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final com.onesignal.debug.internal.logging.otel.android.c invoke(Context ctx, Function0<? extends B2.e> fm) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(fm, "fm");
            return com.onesignal.debug.internal.logging.otel.android.e.createAndroidOtelPlatformProvider(ctx, fm);
        }
    }

    public static final class e extends p implements Function0 {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.onesignal.debug.internal.logging.otel.android.a invoke() {
            return new com.onesignal.debug.internal.logging.otel.android.a();
        }
    }

    public static final class f extends p implements Function1 {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(K2.c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.onesignal.internal.g$g, reason: collision with other inner class name */
    public static final class C0047g extends p implements Function0 {
        public C0047g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final E3.c invoke() {
            return (E3.c) g.this.loggerFactory.invoke();
        }
    }

    public static final class h extends p implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.onesignal.debug.internal.logging.otel.android.c invoke() {
            return (com.onesignal.debug.internal.logging.otel.android.c) g.this.platformProviderFactory.invoke(g.this.context, g.this.featureManagerProvider);
        }
    }

    public static final class i extends p implements Function1 {
        final /* synthetic */ K2.c $logLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(K2.c cVar) {
            super(1);
            this.$logLevel = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(K2.c level) {
            Intrinsics.checkNotNullParameter(level, "level");
            K2.c cVar = this.$logLevel;
            return Boolean.valueOf(cVar != K2.c.NONE && level.compareTo(cVar) <= 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(Context context, Function0<? extends B2.e> featureManagerProvider, n crashHandlerFactory, o anrDetectorFactory, Function1<? super E3.f, ? extends E3.e> remoteTelemetryFactory, Function2<? super Context, ? super Function0<? extends B2.e>, com.onesignal.debug.internal.logging.otel.android.c> platformProviderFactory, Function0<? extends E3.c> loggerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureManagerProvider, "featureManagerProvider");
        Intrinsics.checkNotNullParameter(crashHandlerFactory, "crashHandlerFactory");
        Intrinsics.checkNotNullParameter(anrDetectorFactory, "anrDetectorFactory");
        Intrinsics.checkNotNullParameter(remoteTelemetryFactory, "remoteTelemetryFactory");
        Intrinsics.checkNotNullParameter(platformProviderFactory, "platformProviderFactory");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.context = context;
        this.featureManagerProvider = featureManagerProvider;
        this.crashHandlerFactory = crashHandlerFactory;
        this.anrDetectorFactory = anrDetectorFactory;
        this.remoteTelemetryFactory = remoteTelemetryFactory;
        this.platformProviderFactory = platformProviderFactory;
        this.loggerFactory = loggerFactory;
        this.lock = new Object();
        this.platformProvider$delegate = R5.i.b(new h());
        this.logger$delegate = R5.i.b(new C0047g());
    }

    private final void applyAction(com.onesignal.internal.e eVar, com.onesignal.internal.d dVar) {
        if (eVar instanceof e.b) {
            K2.c logLevel = dVar.getLogLevel();
            if (logLevel == null) {
                logLevel = K2.c.ERROR;
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
            H3.a aVar = this.anrDetector;
            if (aVar != null) {
                aVar.stop();
            }
            this.anrDetector = null;
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Error stopping ANR detector: " + th.getMessage(), th);
        }
        try {
            E3.a aVar2 = this.crashHandler;
            if (aVar2 != null) {
                H3.c cVar = (H3.c) aVar2;
                if (cVar.f966e) {
                    cVar.f963b.info("OtelCrashHandler: Unregistering — restoring previous exception handler");
                    Thread.setDefaultUncaughtExceptionHandler(cVar.f964c);
                    cVar.f964c = null;
                    cVar.f966e = false;
                } else {
                    cVar.f963b.debug("OtelCrashHandler: Not initialized, nothing to unregister");
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
                synchronized (jVar.f685c) {
                    try {
                        u5.d dVar = jVar.f686d;
                        if (dVar != null) {
                            dVar.shutdown();
                        }
                    } catch (Throwable unused) {
                    }
                    jVar.f686d = null;
                    Unit unit = Unit.f6114a;
                }
            }
            this.remoteTelemetry = null;
        } catch (Throwable th3) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Error disabling Otel logging: " + th3.getMessage(), th3);
        }
    }

    private final void enableFeatures(K2.c cVar) {
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

    private final E3.c getLogger() {
        return (E3.c) this.logger$delegate.getValue();
    }

    private final com.onesignal.debug.internal.logging.otel.android.c getPlatformProvider() {
        return (com.onesignal.debug.internal.logging.otel.android.c) this.platformProvider$delegate.getValue();
    }

    private final com.onesignal.internal.d readCurrentCachedConfig() {
        return new com.onesignal.internal.d(getPlatformProvider().isRemoteLoggingEnabled(), K2.c.Companion.fromString(getPlatformProvider().getRemoteLogLevel()));
    }

    private final void startAnrDetector() {
        if (this.anrDetector != null) {
            return;
        }
        H3.a aVar = (H3.a) this.anrDetectorFactory.invoke(getPlatformProvider(), getLogger(), 5000L, 2000L);
        aVar.start();
        this.anrDetector = aVar;
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: ANR detector started", null, 2, null);
    }

    private final void startCrashHandler() {
        if (this.crashHandler != null) {
            return;
        }
        E3.a aVar = (E3.a) this.crashHandlerFactory.invoke(this.context, getLogger(), this.featureManagerProvider);
        H3.c cVar = (H3.c) aVar;
        if (cVar.f966e) {
            cVar.f963b.warn("OtelCrashHandler already initialized, skipping");
        } else {
            cVar.f963b.info("OtelCrashHandler: Setting up uncaught exception handler...");
            cVar.f964c = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(cVar);
            cVar.f966e = true;
            cVar.f963b.info("OtelCrashHandler: ✅ Successfully initialized and registered as default uncaught exception handler");
        }
        this.crashHandler = aVar;
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Crash handler initialized — logs at: " + getPlatformProvider().getCrashStoragePath(), null, 2, null);
    }

    private final void startOtelLogging(K2.c cVar) {
        Object obj = this.remoteTelemetry;
        if (obj != null) {
            j jVar = (j) obj;
            synchronized (jVar.f685c) {
                try {
                    u5.d dVar = jVar.f686d;
                    if (dVar != null) {
                        dVar.shutdown();
                    }
                } catch (Throwable unused) {
                }
                jVar.f686d = null;
                Unit unit = Unit.f6114a;
            }
        }
        E3.e eVar = (E3.e) this.remoteTelemetryFactory.invoke(getPlatformProvider());
        this.remoteTelemetry = eVar;
        com.onesignal.debug.internal.logging.b.INSTANCE.setOtelTelemetry(eVar, new i(cVar));
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Otel logging active at level " + cVar, null, 2, null);
    }

    private final void updateLogLevel(K2.c cVar) {
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
                Unit unit = Unit.f6114a;
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to initialize Otel from cached config: " + th.getMessage(), th);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    public final void subscribeToConfigStore(com.onesignal.core.internal.config.c configModelStore) {
        Intrinsics.checkNotNullParameter(configModelStore, "configModelStore");
        configModelStore.subscribe((com.onesignal.common.modeling.g) this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "HYDRATE") && com.onesignal.debug.internal.crash.f.INSTANCE.isSupported()) {
            try {
                com.onesignal.internal.d dVar = new com.onesignal.internal.d(model.getRemoteLoggingParams().isEnabled(), model.getRemoteLoggingParams().getLogLevel());
                synchronized (this.lock) {
                    applyAction(com.onesignal.internal.f.INSTANCE.evaluate(this.currentConfig, dVar), dVar);
                    Unit unit = Unit.f6114a;
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to refresh Otel from remote config: " + th.getMessage(), th);
            }
        }
    }

    public /* synthetic */ g(Context context, Function0 function0, n nVar, o oVar, Function1 function1, Function2 function2, Function0 function02, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, function0, (i2 & 4) != 0 ? a.INSTANCE : nVar, (i2 & 8) != 0 ? b.INSTANCE : oVar, (i2 & 16) != 0 ? c.INSTANCE : function1, (i2 & 32) != 0 ? d.INSTANCE : function2, (i2 & 64) != 0 ? e.INSTANCE : function02);
    }
}
