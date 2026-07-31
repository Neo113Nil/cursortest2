package com.onesignal.internal;

import android.content.Context;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.features.IFeatureManager;
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
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelLifecycleManager.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012&\b\u0002\u0010\b\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u000b0\t\u0012&\b\u0002\u0010\f\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\u0012\u0012 \b\u0002\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0002\u0010\u0018J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001cH\u0002J\b\u0010.\u001a\u00020*H\u0002J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0002J\u0006\u00102\u001a\u00020*J\u0018\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u000206H\u0016J\u0018\u00107\u001a\u00020*2\u0006\u00108\u001a\u0002092\u0006\u00105\u001a\u000206H\u0016J\b\u0010:\u001a\u00020\u001cH\u0002J\b\u0010;\u001a\u00020*H\u0002J\b\u0010<\u001a\u00020*H\u0002J\u0010\u0010=\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0002J\u000e\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020@J\u0010\u0010A\u001a\u00020*2\u0006\u0010B\u001a\u000201H\u0002R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\f\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\b\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b%\u0010&R&\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/onesignal/internal/OtelLifecycleManager;", "Lcom/onesignal/common/modeling/ISingletonModelStoreChangeHandler;", "Lcom/onesignal/core/internal/config/ConfigModel;", "context", "Landroid/content/Context;", "featureManagerProvider", "Lkotlin/Function0;", "Lcom/onesignal/core/internal/features/IFeatureManager;", "crashHandlerFactory", "Lkotlin/Function3;", "Lcom/onesignal/otel/IOtelLogger;", "Lcom/onesignal/otel/IOtelCrashHandler;", "anrDetectorFactory", "Lkotlin/Function4;", "Lcom/onesignal/otel/IOtelPlatformProvider;", "", "Lcom/onesignal/otel/crash/IOtelAnrDetector;", "remoteTelemetryFactory", "Lkotlin/Function1;", "Lcom/onesignal/otel/IOtelOpenTelemetryRemote;", "platformProviderFactory", "Lkotlin/Function2;", "Lcom/onesignal/debug/internal/logging/otel/android/OtelPlatformProvider;", "loggerFactory", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "anrDetector", "crashHandler", "currentConfig", "Lcom/onesignal/internal/OtelConfig;", "lock", "", "logger", "getLogger", "()Lcom/onesignal/otel/IOtelLogger;", "logger$delegate", "Lkotlin/Lazy;", "platformProvider", "getPlatformProvider", "()Lcom/onesignal/debug/internal/logging/otel/android/OtelPlatformProvider;", "platformProvider$delegate", "remoteTelemetry", "applyAction", "", "action", "Lcom/onesignal/internal/OtelConfigAction;", "newConfig", "disableFeatures", "enableFeatures", "logLevel", "Lcom/onesignal/debug/LogLevel;", "initializeFromCachedConfig", "onModelReplaced", CommonUrlParts.MODEL, "tag", "", "onModelUpdated", "args", "Lcom/onesignal/common/modeling/ModelChangedArgs;", "readCurrentCachedConfig", "startAnrDetector", "startCrashHandler", "startOtelLogging", "subscribeToConfigStore", "configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "updateLogLevel", "newLevel", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelLifecycleManager implements ISingletonModelStoreChangeHandler<ConfigModel> {
    private IOtelAnrDetector anrDetector;
    private final Function4<IOtelPlatformProvider, IOtelLogger, Long, Long, IOtelAnrDetector> anrDetectorFactory;
    private final Context context;
    private IOtelCrashHandler crashHandler;
    private final Function3<Context, IOtelLogger, Function0<? extends IFeatureManager>, IOtelCrashHandler> crashHandlerFactory;
    private OtelConfig currentConfig;
    private final Function0<IFeatureManager> featureManagerProvider;
    private final Object lock;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    private final Lazy logger;
    private final Function0<IOtelLogger> loggerFactory;

    /* renamed from: platformProvider$delegate, reason: from kotlin metadata */
    private final Lazy platformProvider;
    private final Function2<Context, Function0<? extends IFeatureManager>, OtelPlatformProvider> platformProviderFactory;
    private IOtelOpenTelemetryRemote remoteTelemetry;
    private final Function1<IOtelPlatformProvider, IOtelOpenTelemetryRemote> remoteTelemetryFactory;

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OtelLifecycleManager(Context context, Function0<? extends IFeatureManager> featureManagerProvider, Function3<? super Context, ? super IOtelLogger, ? super Function0<? extends IFeatureManager>, ? extends IOtelCrashHandler> crashHandlerFactory, Function4<? super IOtelPlatformProvider, ? super IOtelLogger, ? super Long, ? super Long, ? extends IOtelAnrDetector> anrDetectorFactory, Function1<? super IOtelPlatformProvider, ? extends IOtelOpenTelemetryRemote> remoteTelemetryFactory, Function2<? super Context, ? super Function0<? extends IFeatureManager>, OtelPlatformProvider> platformProviderFactory, Function0<? extends IOtelLogger> loggerFactory) {
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
        this.platformProvider = LazyKt.lazy(new Function0<OtelPlatformProvider>() { // from class: com.onesignal.internal.OtelLifecycleManager$platformProvider$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final OtelPlatformProvider invoke() {
                Function2 function2;
                Context context2;
                Function0 function0;
                function2 = OtelLifecycleManager.this.platformProviderFactory;
                context2 = OtelLifecycleManager.this.context;
                function0 = OtelLifecycleManager.this.featureManagerProvider;
                return (OtelPlatformProvider) function2.invoke(context2, function0);
            }
        });
        this.logger = LazyKt.lazy(new Function0<IOtelLogger>() { // from class: com.onesignal.internal.OtelLifecycleManager$logger$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final IOtelLogger invoke() {
                Function0 function0;
                function0 = OtelLifecycleManager.this.loggerFactory;
                return (IOtelLogger) function0.invoke();
            }
        });
    }

    public /* synthetic */ OtelLifecycleManager(Context context, Function0 function0, AnonymousClass1 anonymousClass1, AnonymousClass2 anonymousClass2, AnonymousClass3 anonymousClass3, AnonymousClass4 anonymousClass4, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, function0, (i & 4) != 0 ? new Function3<Context, IOtelLogger, Function0<? extends IFeatureManager>, IOtelCrashHandler>() { // from class: com.onesignal.internal.OtelLifecycleManager.1
            @Override // kotlin.jvm.functions.Function3
            public final IOtelCrashHandler invoke(Context ctx, IOtelLogger log, Function0<? extends IFeatureManager> fm) {
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                Intrinsics.checkNotNullParameter(log, "log");
                Intrinsics.checkNotNullParameter(fm, "fm");
                return OneSignalCrashHandlerFactory.INSTANCE.createCrashHandler(ctx, log, fm);
            }
        } : anonymousClass1, (i & 8) != 0 ? new Function4<IOtelPlatformProvider, IOtelLogger, Long, Long, IOtelAnrDetector>() { // from class: com.onesignal.internal.OtelLifecycleManager.2
            public final IOtelAnrDetector invoke(IOtelPlatformProvider pp, IOtelLogger log, long j, long j2) {
                IOtelAnrDetector createAnrDetector;
                Intrinsics.checkNotNullParameter(pp, "pp");
                Intrinsics.checkNotNullParameter(log, "log");
                createAnrDetector = OtelAnrDetectorKt.createAnrDetector(pp, log, (r14 & 4) != 0 ? 5000L : j, (r14 & 8) != 0 ? AnrConstants.DEFAULT_CHECK_INTERVAL_MS : j2, (r14 & 16) != 0 ? 10000L : 0L);
                return createAnrDetector;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ IOtelAnrDetector invoke(IOtelPlatformProvider iOtelPlatformProvider, IOtelLogger iOtelLogger, Long l, Long l2) {
                return invoke(iOtelPlatformProvider, iOtelLogger, l.longValue(), l2.longValue());
            }
        } : anonymousClass2, (i & 16) != 0 ? new Function1<IOtelPlatformProvider, IOtelOpenTelemetryRemote>() { // from class: com.onesignal.internal.OtelLifecycleManager.3
            @Override // kotlin.jvm.functions.Function1
            public final IOtelOpenTelemetryRemote invoke(IOtelPlatformProvider pp) {
                Intrinsics.checkNotNullParameter(pp, "pp");
                return OtelFactory.INSTANCE.createRemoteTelemetry(pp);
            }
        } : anonymousClass3, (i & 32) != 0 ? new Function2<Context, Function0<? extends IFeatureManager>, OtelPlatformProvider>() { // from class: com.onesignal.internal.OtelLifecycleManager.4
            @Override // kotlin.jvm.functions.Function2
            public final OtelPlatformProvider invoke(Context ctx, Function0<? extends IFeatureManager> fm) {
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                Intrinsics.checkNotNullParameter(fm, "fm");
                return OtelPlatformProviderKt.createAndroidOtelPlatformProvider(ctx, fm);
            }
        } : anonymousClass4, (i & 64) != 0 ? new Function0<AndroidOtelLogger>() { // from class: com.onesignal.internal.OtelLifecycleManager.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AndroidOtelLogger invoke() {
                return new AndroidOtelLogger();
            }
        } : function02);
    }

    private final OtelPlatformProvider getPlatformProvider() {
        return (OtelPlatformProvider) this.platformProvider.getValue();
    }

    private final IOtelLogger getLogger() {
        return (IOtelLogger) this.logger.getValue();
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
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable th) {
            Logging.warn("OneSignal: Failed to initialize Otel from cached config: " + th.getMessage(), th);
        }
    }

    public final void subscribeToConfigStore(ConfigModelStore configModelStore) {
        Intrinsics.checkNotNullParameter(configModelStore, "configModelStore");
        configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.areEqual(tag, ModelChangeTags.HYDRATE) && OtelSdkSupport.INSTANCE.isSupported()) {
            try {
                OtelConfig otelConfig = new OtelConfig(model.getRemoteLoggingParams().isEnabled(), model.getRemoteLoggingParams().getLogLevel());
                synchronized (this.lock) {
                    applyAction(OtelConfigEvaluator.INSTANCE.evaluate(this.currentConfig, otelConfig), otelConfig);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                Logging.warn("OneSignal: Failed to refresh Otel from remote config: " + th.getMessage(), th);
            }
        }
    }

    private final OtelConfig readCurrentCachedConfig() {
        return new OtelConfig(getPlatformProvider().isRemoteLoggingEnabled(), LogLevel.INSTANCE.fromString(getPlatformProvider().getRemoteLogLevel()));
    }

    private final void applyAction(OtelConfigAction action, OtelConfig newConfig) {
        if (action instanceof OtelConfigAction.Enable) {
            LogLevel logLevel = newConfig.getLogLevel();
            if (logLevel == null) {
                logLevel = LogLevel.ERROR;
            }
            enableFeatures(logLevel);
        } else if (action instanceof OtelConfigAction.Disable) {
            disableFeatures();
        } else if (action instanceof OtelConfigAction.UpdateLogLevel) {
            updateLogLevel(((OtelConfigAction.UpdateLogLevel) action).getNewLevel());
        } else if (action instanceof OtelConfigAction.NoChange) {
            Logging.debug$default("OneSignal: Otel config unchanged, no action needed", null, 2, null);
        }
        this.currentConfig = newConfig;
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
            Logging.INSTANCE.setOtelTelemetry(null, new Function1<LogLevel, Boolean>() { // from class: com.onesignal.internal.OtelLifecycleManager$disableFeatures$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(LogLevel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return false;
                }
            });
            IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote = this.remoteTelemetry;
            if (iOtelOpenTelemetryRemote != null) {
                iOtelOpenTelemetryRemote.shutdown();
            }
            this.remoteTelemetry = null;
        } catch (Throwable th3) {
            Logging.warn("OneSignal: Error disabling Otel logging: " + th3.getMessage(), th3);
        }
    }

    private final void updateLogLevel(LogLevel newLevel) {
        Logging.info$default("OneSignal: Updating Otel log level to " + newLevel, null, 2, null);
        try {
            startOtelLogging(newLevel);
        } catch (Throwable th) {
            Logging.warn("OneSignal: Failed to update Otel log level: " + th.getMessage(), th);
        }
    }

    private final void startCrashHandler() {
        if (this.crashHandler != null) {
            return;
        }
        IOtelCrashHandler invoke = this.crashHandlerFactory.invoke(this.context, getLogger(), this.featureManagerProvider);
        invoke.initialize();
        this.crashHandler = invoke;
        Logging.info$default("OneSignal: Crash handler initialized — logs at: " + getPlatformProvider().getCrashStoragePath(), null, 2, null);
    }

    private final void startAnrDetector() {
        if (this.anrDetector != null) {
            return;
        }
        IOtelAnrDetector invoke = this.anrDetectorFactory.invoke(getPlatformProvider(), getLogger(), 5000L, Long.valueOf(AnrConstants.DEFAULT_CHECK_INTERVAL_MS));
        invoke.start();
        this.anrDetector = invoke;
        Logging.info$default("OneSignal: ANR detector started", null, 2, null);
    }

    private final void startOtelLogging(final LogLevel logLevel) {
        IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote = this.remoteTelemetry;
        if (iOtelOpenTelemetryRemote != null) {
            iOtelOpenTelemetryRemote.shutdown();
        }
        IOtelOpenTelemetryRemote invoke = this.remoteTelemetryFactory.invoke(getPlatformProvider());
        this.remoteTelemetry = invoke;
        Logging.INSTANCE.setOtelTelemetry(invoke, new Function1<LogLevel, Boolean>() { // from class: com.onesignal.internal.OtelLifecycleManager$startOtelLogging$shouldSend$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(LogLevel level) {
                Intrinsics.checkNotNullParameter(level, "level");
                return Boolean.valueOf(LogLevel.this != LogLevel.NONE && level.compareTo(LogLevel.this) <= 0);
            }
        });
        Logging.info$default("OneSignal: Otel logging active at level " + logLevel, null, 2, null);
    }
}
