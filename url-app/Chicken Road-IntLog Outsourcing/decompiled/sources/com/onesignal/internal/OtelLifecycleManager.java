package com.onesignal.internal;

import a.AbstractC0169a;
import android.content.Context;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.crash.AnrConstants;
import com.onesignal.debug.internal.crash.OneSignalCrashHandlerFactory;
import com.onesignal.debug.internal.crash.OtelAnrDetectorKt;
import com.onesignal.debug.internal.crash.OtelSdkSupport;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.debug.internal.logging.otel.android.AndroidOtelLogger;
import com.onesignal.debug.internal.logging.otel.android.OtelPlatformProvider;
import com.onesignal.debug.internal.logging.otel.android.OtelPlatformProviderKt;
import com.onesignal.internal.OtelConfigAction;
import com.onesignal.otel.IOtelCrashHandler;
import com.onesignal.otel.IOtelLogger;
import com.onesignal.otel.IOtelOpenTelemetryRemote;
import com.onesignal.otel.IOtelPlatformProvider;
import com.onesignal.otel.OtelFactory;
import com.onesignal.otel.crash.IOtelAnrDetector;
import f4.InterfaceC0428e;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;
import t4.InterfaceC1446q;
import t4.InterfaceC1447r;

/* loaded from: classes.dex */
public final class OtelLifecycleManager implements ISingletonModelStoreChangeHandler<ConfigModel> {
    private IOtelAnrDetector anrDetector;
    private final InterfaceC1447r anrDetectorFactory;
    private final Context context;
    private IOtelCrashHandler crashHandler;
    private final InterfaceC1446q crashHandlerFactory;
    private OtelConfig currentConfig;
    private final InterfaceC1430a featureManagerProvider;
    private final Object lock;
    private final InterfaceC0428e logger$delegate;
    private final InterfaceC1430a loggerFactory;
    private final InterfaceC0428e platformProvider$delegate;
    private final InterfaceC1445p platformProviderFactory;
    private IOtelOpenTelemetryRemote remoteTelemetry;
    private final InterfaceC1441l remoteTelemetryFactory;

    /* renamed from: com.onesignal.internal.OtelLifecycleManager$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1446q {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(3);
        }

        @Override // t4.InterfaceC1446q
        public final IOtelCrashHandler invoke(Context ctx, IOtelLogger log, InterfaceC1430a fm) {
            i.e(ctx, "ctx");
            i.e(log, "log");
            i.e(fm, "fm");
            return OneSignalCrashHandlerFactory.INSTANCE.createCrashHandler(ctx, log, fm);
        }
    }

    /* renamed from: com.onesignal.internal.OtelLifecycleManager$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements InterfaceC1447r {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(4);
        }

        public final IOtelAnrDetector invoke(IOtelPlatformProvider pp, IOtelLogger log, long j2, long j6) {
            i.e(pp, "pp");
            i.e(log, "log");
            return OtelAnrDetectorKt.createAnrDetector(pp, log, j2, j6);
        }

        @Override // t4.InterfaceC1447r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((IOtelPlatformProvider) obj, (IOtelLogger) obj2, ((Number) obj3).longValue(), ((Number) obj4).longValue());
        }
    }

    /* renamed from: com.onesignal.internal.OtelLifecycleManager$3, reason: invalid class name */
    public static final class AnonymousClass3 extends j implements InterfaceC1441l {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // t4.InterfaceC1441l
        public final IOtelOpenTelemetryRemote invoke(IOtelPlatformProvider pp) {
            i.e(pp, "pp");
            return OtelFactory.INSTANCE.createRemoteTelemetry(pp);
        }
    }

    /* renamed from: com.onesignal.internal.OtelLifecycleManager$4, reason: invalid class name */
    public static final class AnonymousClass4 extends j implements InterfaceC1445p {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // t4.InterfaceC1445p
        public final OtelPlatformProvider invoke(Context ctx, InterfaceC1430a fm) {
            i.e(ctx, "ctx");
            i.e(fm, "fm");
            return OtelPlatformProviderKt.createAndroidOtelPlatformProvider(ctx, fm);
        }
    }

    /* renamed from: com.onesignal.internal.OtelLifecycleManager$5, reason: invalid class name */
    public static final class AnonymousClass5 extends j implements InterfaceC1430a {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // t4.InterfaceC1430a
        public final AndroidOtelLogger invoke() {
            return new AndroidOtelLogger();
        }
    }

    public OtelLifecycleManager(Context context, InterfaceC1430a featureManagerProvider, InterfaceC1446q crashHandlerFactory, InterfaceC1447r anrDetectorFactory, InterfaceC1441l remoteTelemetryFactory, InterfaceC1445p platformProviderFactory, InterfaceC1430a loggerFactory) {
        i.e(context, "context");
        i.e(featureManagerProvider, "featureManagerProvider");
        i.e(crashHandlerFactory, "crashHandlerFactory");
        i.e(anrDetectorFactory, "anrDetectorFactory");
        i.e(remoteTelemetryFactory, "remoteTelemetryFactory");
        i.e(platformProviderFactory, "platformProviderFactory");
        i.e(loggerFactory, "loggerFactory");
        this.context = context;
        this.featureManagerProvider = featureManagerProvider;
        this.crashHandlerFactory = crashHandlerFactory;
        this.anrDetectorFactory = anrDetectorFactory;
        this.remoteTelemetryFactory = remoteTelemetryFactory;
        this.platformProviderFactory = platformProviderFactory;
        this.loggerFactory = loggerFactory;
        this.lock = new Object();
        this.platformProvider$delegate = AbstractC0169a.A(new OtelLifecycleManager$platformProvider$2(this));
        this.logger$delegate = AbstractC0169a.A(new OtelLifecycleManager$logger$2(this));
    }

    private final void applyAction(OtelConfigAction otelConfigAction, OtelConfig otelConfig) {
        if (otelConfigAction instanceof OtelConfigAction.Enable) {
            LogLevel logLevel = otelConfig.getLogLevel();
            if (logLevel == null) {
                logLevel = LogLevel.ERROR;
            }
            enableFeatures(logLevel);
        } else if (otelConfigAction instanceof OtelConfigAction.Disable) {
            disableFeatures();
        } else if (otelConfigAction instanceof OtelConfigAction.UpdateLogLevel) {
            updateLogLevel(((OtelConfigAction.UpdateLogLevel) otelConfigAction).getNewLevel());
        } else if (otelConfigAction instanceof OtelConfigAction.NoChange) {
            Logging.debug$default("OneSignal: Otel config unchanged, no action needed", null, 2, null);
        }
        this.currentConfig = otelConfig;
    }

    private final void disableFeatures() {
        Logging.info$default("OneSignal: Disabling Otel features", null, 2, null);
        try {
            IOtelAnrDetector iOtelAnrDetector = this.anrDetector;
            if (iOtelAnrDetector != null) {
                iOtelAnrDetector.stop();
            }
            this.anrDetector = null;
        } catch (Throwable th) {
            Logging.warn("OneSignal: Error stopping ANR detector: " + th.getMessage(), th);
        }
        try {
            IOtelCrashHandler iOtelCrashHandler = this.crashHandler;
            if (iOtelCrashHandler != null) {
                iOtelCrashHandler.unregister();
            }
            this.crashHandler = null;
        } catch (Throwable th2) {
            Logging.warn("OneSignal: Error unregistering crash handler: " + th2.getMessage(), th2);
        }
        try {
            Logging.INSTANCE.setOtelTelemetry(null, OtelLifecycleManager$disableFeatures$1.INSTANCE);
            IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote = this.remoteTelemetry;
            if (iOtelOpenTelemetryRemote != null) {
                iOtelOpenTelemetryRemote.shutdown();
            }
            this.remoteTelemetry = null;
        } catch (Throwable th3) {
            Logging.warn("OneSignal: Error disabling Otel logging: " + th3.getMessage(), th3);
        }
    }

    private final void enableFeatures(LogLevel logLevel) {
        Logging.info$default("OneSignal: Enabling Otel features at level " + logLevel, null, 2, null);
        try {
            startCrashHandler();
        } catch (Throwable th) {
            Logging.warn("OneSignal: Failed to start crash handler: " + th.getMessage(), th);
        }
        try {
            startAnrDetector();
        } catch (Throwable th2) {
            Logging.warn("OneSignal: Failed to start ANR detector: " + th2.getMessage(), th2);
        }
        try {
            startOtelLogging(logLevel);
        } catch (Throwable th3) {
            Logging.warn("OneSignal: Failed to start Otel logging: " + th3.getMessage(), th3);
        }
    }

    private final IOtelLogger getLogger() {
        return (IOtelLogger) this.logger$delegate.getValue();
    }

    private final OtelPlatformProvider getPlatformProvider() {
        return (OtelPlatformProvider) this.platformProvider$delegate.getValue();
    }

    private final OtelConfig readCurrentCachedConfig() {
        return new OtelConfig(getPlatformProvider().isRemoteLoggingEnabled(), LogLevel.Companion.fromString(getPlatformProvider().getRemoteLogLevel()));
    }

    private final void startAnrDetector() {
        if (this.anrDetector != null) {
            return;
        }
        IOtelAnrDetector iOtelAnrDetector = (IOtelAnrDetector) this.anrDetectorFactory.invoke(getPlatformProvider(), getLogger(), Long.valueOf(AnrConstants.DEFAULT_ANR_THRESHOLD_MS), Long.valueOf(AnrConstants.DEFAULT_CHECK_INTERVAL_MS));
        iOtelAnrDetector.start();
        this.anrDetector = iOtelAnrDetector;
        Logging.info$default("OneSignal: ANR detector started", null, 2, null);
    }

    private final void startCrashHandler() {
        if (this.crashHandler != null) {
            return;
        }
        IOtelCrashHandler iOtelCrashHandler = (IOtelCrashHandler) this.crashHandlerFactory.invoke(this.context, getLogger(), this.featureManagerProvider);
        iOtelCrashHandler.initialize();
        this.crashHandler = iOtelCrashHandler;
        Logging.info$default("OneSignal: Crash handler initialized — logs at: " + getPlatformProvider().getCrashStoragePath(), null, 2, null);
    }

    private final void startOtelLogging(LogLevel logLevel) {
        IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote = this.remoteTelemetry;
        if (iOtelOpenTelemetryRemote != null) {
            iOtelOpenTelemetryRemote.shutdown();
        }
        IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote2 = (IOtelOpenTelemetryRemote) this.remoteTelemetryFactory.invoke(getPlatformProvider());
        this.remoteTelemetry = iOtelOpenTelemetryRemote2;
        Logging.INSTANCE.setOtelTelemetry(iOtelOpenTelemetryRemote2, new OtelLifecycleManager$startOtelLogging$shouldSend$1(logLevel));
        Logging.info$default("OneSignal: Otel logging active at level " + logLevel, null, 2, null);
    }

    private final void updateLogLevel(LogLevel logLevel) {
        Logging.info$default("OneSignal: Updating Otel log level to " + logLevel, null, 2, null);
        try {
            startOtelLogging(logLevel);
        } catch (Throwable th) {
            Logging.warn("OneSignal: Failed to update Otel log level: " + th.getMessage(), th);
        }
    }

    public final void initializeFromCachedConfig() {
        if (!OtelSdkSupport.INSTANCE.isSupported()) {
            Logging.info$default("OneSignal: Device SDK < 26, Otel not supported — skipping all Otel features", null, 2, null);
            return;
        }
        try {
            OtelConfig readCurrentCachedConfig = readCurrentCachedConfig();
            synchronized (this.lock) {
                applyAction(OtelConfigEvaluator.INSTANCE.evaluate(this.currentConfig, readCurrentCachedConfig), readCurrentCachedConfig);
            }
        } catch (Throwable th) {
            Logging.warn("OneSignal: Failed to initialize Otel from cached config: " + th.getMessage(), th);
        }
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
    }

    public final void subscribeToConfigStore(ConfigModelStore configModelStore) {
        i.e(configModelStore, "configModelStore");
        configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        if (tag.equals(ModelChangeTags.HYDRATE) && OtelSdkSupport.INSTANCE.isSupported()) {
            try {
                OtelConfig otelConfig = new OtelConfig(model.getRemoteLoggingParams().isEnabled(), model.getRemoteLoggingParams().getLogLevel());
                synchronized (this.lock) {
                    applyAction(OtelConfigEvaluator.INSTANCE.evaluate(this.currentConfig, otelConfig), otelConfig);
                }
            } catch (Throwable th) {
                Logging.warn("OneSignal: Failed to refresh Otel from remote config: " + th.getMessage(), th);
            }
        }
    }

    public /* synthetic */ OtelLifecycleManager(Context context, InterfaceC1430a interfaceC1430a, InterfaceC1446q interfaceC1446q, InterfaceC1447r interfaceC1447r, InterfaceC1441l interfaceC1441l, InterfaceC1445p interfaceC1445p, InterfaceC1430a interfaceC1430a2, int i2, e eVar) {
        this(context, interfaceC1430a, (i2 & 4) != 0 ? AnonymousClass1.INSTANCE : interfaceC1446q, (i2 & 8) != 0 ? AnonymousClass2.INSTANCE : interfaceC1447r, (i2 & 16) != 0 ? AnonymousClass3.INSTANCE : interfaceC1441l, (i2 & 32) != 0 ? AnonymousClass4.INSTANCE : interfaceC1445p, (i2 & 64) != 0 ? AnonymousClass5.INSTANCE : interfaceC1430a2);
    }
}
