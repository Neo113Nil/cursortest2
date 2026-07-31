package com.onesignal.debug.internal.logging.otel.android;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.OneSignalWrapper;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModelStoreKt;
import com.onesignal.core.internal.features.IFeatureManager;
import com.onesignal.core.internal.http.OneSignalService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.otel.IOtelPlatformProvider;
import io.appmetrica.analytics.impl.C0249ia;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelPlatformProvider.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010O\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010PR\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000bR\u0014\u0010\u001f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000bR\u0014\u0010!\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\t0$8VX\u0096\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020*X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001b\u0010/\u001a\u00020*8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u000f\u001a\u0004\b/\u0010.R\u0014\u00101\u001a\u000202X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001d\u00105\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u000f\u001a\u0004\b6\u0010\u000bR\u0014\u00108\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u000bR\u0014\u0010:\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u000bR\u0014\u0010<\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u000bR\u0014\u0010>\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00104R\u001d\u0010@\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u000f\u001a\u0004\bA\u0010\u000bR#\u0010C\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bF\u0010\u000f\u0012\u0004\bD\u0010&\u001a\u0004\bE\u0010\u000bR\u0014\u0010G\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u000bR\u0014\u0010I\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u000bR\u0016\u0010K\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\u000bR\u0016\u0010M\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\u000b¨\u0006Q"}, d2 = {"Lcom/onesignal/debug/internal/logging/otel/android/OtelPlatformProvider;", "Lcom/onesignal/otel/IOtelPlatformProvider;", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Lcom/onesignal/debug/internal/logging/otel/android/OtelPlatformProviderConfig;", "featureManagerProvider", "Lkotlin/Function0;", "Lcom/onesignal/core/internal/features/IFeatureManager;", "(Lcom/onesignal/debug/internal/logging/otel/android/OtelPlatformProviderConfig;Lkotlin/jvm/functions/Function0;)V", "apiBaseUrl", "", "getApiBaseUrl", "()Ljava/lang/String;", "appId", "getAppId", "appId$delegate", "Lkotlin/Lazy;", "appIdForHeaders", "getAppIdForHeaders", "appPackageId", "getAppPackageId", "appState", "getAppState", "appVersion", "getAppVersion", "context", "Landroid/content/Context;", "crashStoragePath", "getCrashStoragePath", "crashStoragePath$delegate", "currentThreadName", "getCurrentThreadName", "deviceManufacturer", "getDeviceManufacturer", "deviceModel", "getDeviceModel", "enabledFeatureFlags", "", "getEnabledFeatureFlags$annotations", "()V", "getEnabledFeatureFlags", "()Ljava/util/List;", "getIsInForeground", "", "idResolver", "Lcom/onesignal/debug/internal/logging/otel/android/OtelIdResolver;", "isOtelExporterLoggingEnabled", "()Z", "isRemoteLoggingEnabled", "isRemoteLoggingEnabled$delegate", "minFileAgeForReadMillis", "", "getMinFileAgeForReadMillis", "()J", "onesignalId", "getOnesignalId", "onesignalId$delegate", "osBuildId", "getOsBuildId", "osName", "getOsName", "osVersion", "getOsVersion", "processUptime", "getProcessUptime", "pushSubscriptionId", "getPushSubscriptionId", "pushSubscriptionId$delegate", "remoteLogLevel", "getRemoteLogLevel$annotations", "getRemoteLogLevel", "remoteLogLevel$delegate", "sdkBase", "getSdkBase", "sdkBaseVersion", "getSdkBaseVersion", "sdkWrapper", "getSdkWrapper", "sdkWrapperVersion", "getSdkWrapperVersion", "getInstallId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelPlatformProvider implements IOtelPlatformProvider {
    private final String apiBaseUrl;

    /* renamed from: appId$delegate, reason: from kotlin metadata */
    private final Lazy appId;
    private final String appPackageId;
    private final String appVersion;
    private final Context context;

    /* renamed from: crashStoragePath$delegate, reason: from kotlin metadata */
    private final Lazy crashStoragePath;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final Function0<IFeatureManager> featureManagerProvider;
    private final Function0<Boolean> getIsInForeground;
    private final OtelIdResolver idResolver;
    private final boolean isOtelExporterLoggingEnabled;

    /* renamed from: isRemoteLoggingEnabled$delegate, reason: from kotlin metadata */
    private final Lazy isRemoteLoggingEnabled;
    private final long minFileAgeForReadMillis;

    /* renamed from: onesignalId$delegate, reason: from kotlin metadata */
    private final Lazy onesignalId;
    private final String osBuildId;
    private final String osName;
    private final String osVersion;

    /* renamed from: pushSubscriptionId$delegate, reason: from kotlin metadata */
    private final Lazy pushSubscriptionId;

    /* renamed from: remoteLogLevel$delegate, reason: from kotlin metadata */
    private final Lazy remoteLogLevel;
    private final String sdkBase;
    private final String sdkBaseVersion;
    private final String sdkWrapper;
    private final String sdkWrapperVersion;

    public static /* synthetic */ void getEnabledFeatureFlags$annotations() {
    }

    public static /* synthetic */ void getRemoteLogLevel$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OtelPlatformProvider(final OtelPlatformProviderConfig config, Function0<? extends IFeatureManager> featureManagerProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(featureManagerProvider, "featureManagerProvider");
        this.featureManagerProvider = featureManagerProvider;
        this.appPackageId = config.getAppPackageId();
        this.appVersion = config.getAppVersion();
        Context context = config.getContext();
        this.context = context;
        this.getIsInForeground = config.getGetIsInForeground();
        this.idResolver = new OtelIdResolver(context);
        this.sdkBase = "android";
        this.sdkBaseVersion = OneSignalUtils.INSTANCE.getSdkVersion();
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        this.deviceManufacturer = MANUFACTURER;
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        this.deviceModel = MODEL;
        this.osName = "Android";
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        this.osVersion = RELEASE;
        String ID = Build.ID;
        Intrinsics.checkNotNullExpressionValue(ID, "ID");
        this.osBuildId = ID;
        this.sdkWrapper = OneSignalWrapper.getSdkType();
        this.sdkWrapperVersion = OneSignalWrapper.getSdkVersion();
        this.appId = LazyKt.lazy(new Function0<String>() { // from class: com.onesignal.debug.internal.logging.otel.android.OtelPlatformProvider$appId$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                OtelIdResolver otelIdResolver;
                otelIdResolver = OtelPlatformProvider.this.idResolver;
                return otelIdResolver.resolveAppId();
            }
        });
        this.onesignalId = LazyKt.lazy(new Function0<String>() { // from class: com.onesignal.debug.internal.logging.otel.android.OtelPlatformProvider$onesignalId$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                OtelIdResolver otelIdResolver;
                otelIdResolver = OtelPlatformProvider.this.idResolver;
                return otelIdResolver.resolveOnesignalId();
            }
        });
        this.pushSubscriptionId = LazyKt.lazy(new Function0<String>() { // from class: com.onesignal.debug.internal.logging.otel.android.OtelPlatformProvider$pushSubscriptionId$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                OtelIdResolver otelIdResolver;
                otelIdResolver = OtelPlatformProvider.this.idResolver;
                return otelIdResolver.resolvePushSubscriptionId();
            }
        });
        this.crashStoragePath = LazyKt.lazy(new Function0<String>() { // from class: com.onesignal.debug.internal.logging.otel.android.OtelPlatformProvider$crashStoragePath$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String crashStoragePath = OtelPlatformProviderConfig.this.getCrashStoragePath();
                Logging.info$default("OneSignal: Crash logs stored at: " + crashStoragePath, null, 2, null);
                return crashStoragePath;
            }
        });
        this.minFileAgeForReadMillis = 5000L;
        this.isRemoteLoggingEnabled = LazyKt.lazy(new Function0<Boolean>() { // from class: com.onesignal.debug.internal.logging.otel.android.OtelPlatformProvider$isRemoteLoggingEnabled$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                OtelIdResolver otelIdResolver;
                otelIdResolver = OtelPlatformProvider.this.idResolver;
                return Boolean.valueOf(otelIdResolver.resolveRemoteLoggingEnabled());
            }
        });
        this.remoteLogLevel = LazyKt.lazy(new Function0<String>() { // from class: com.onesignal.debug.internal.logging.otel.android.OtelPlatformProvider$remoteLogLevel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                OtelIdResolver otelIdResolver;
                try {
                    otelIdResolver = OtelPlatformProvider.this.idResolver;
                    LogLevel resolveRemoteLogLevel = otelIdResolver.resolveRemoteLogLevel();
                    if (resolveRemoteLogLevel != null) {
                        return resolveRemoteLogLevel.name();
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
        this.apiBaseUrl = OneSignalService.ONESIGNAL_API_BASE_URL;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getAppPackageId() {
        return this.appPackageId;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getAppVersion() {
        return this.appVersion;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public Object getInstallId(Continuation<? super String> continuation) {
        return this.idResolver.resolveInstallId();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getSdkBase() {
        return this.sdkBase;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getSdkBaseVersion() {
        return this.sdkBaseVersion;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getDeviceModel() {
        return this.deviceModel;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getOsName() {
        return this.osName;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getOsVersion() {
        return this.osVersion;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getOsBuildId() {
        return this.osBuildId;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getSdkWrapper() {
        return this.sdkWrapper;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getSdkWrapperVersion() {
        return this.sdkWrapperVersion;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public List<String> getEnabledFeatureFlags() {
        try {
            return this.featureManagerProvider.invoke().enabledFeatureKeys();
        } catch (Throwable unused) {
            return CollectionsKt.emptyList();
        }
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getAppId() {
        return (String) this.appId.getValue();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getOnesignalId() {
        return (String) this.onesignalId.getValue();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getPushSubscriptionId() {
        return (String) this.pushSubscriptionId.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        if (r5.intValue() == 200) goto L44;
     */
    @Override // com.onesignal.otel.IOtelPlatformProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getAppState() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        Object obj;
        Boolean invoke;
        try {
            Function0<Boolean> function0 = this.getIsInForeground;
            String str = C0249ia.g;
            if (function0 == null || (invoke = function0.invoke()) == null) {
                OtelPlatformProvider otelPlatformProvider = this;
                Context context = this.context;
                if (context == null) {
                    return "unknown";
                }
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) obj).pid == Process.myPid()) {
                            break;
                        }
                    }
                    runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                } else {
                    runningAppProcessInfo = null;
                }
                Integer valueOf = runningAppProcessInfo != null ? Integer.valueOf(runningAppProcessInfo.importance) : null;
                if (valueOf != null && valueOf.intValue() == 100) {
                }
            } else {
                if (invoke.booleanValue()) {
                }
                str = "background";
            }
            return str;
        } catch (Exception unused) {
            return "unknown";
        }
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public long getProcessUptime() {
        return SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getCurrentThreadName() {
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getCrashStoragePath() {
        return (String) this.crashStoragePath.getValue();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public long getMinFileAgeForReadMillis() {
        return this.minFileAgeForReadMillis;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public boolean isRemoteLoggingEnabled() {
        return ((Boolean) this.isRemoteLoggingEnabled.getValue()).booleanValue();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getRemoteLogLevel() {
        return (String) this.remoteLogLevel.getValue();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    /* renamed from: isOtelExporterLoggingEnabled, reason: from getter */
    public boolean getIsOtelExporterLoggingEnabled() {
        return this.isOtelExporterLoggingEnabled;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getAppIdForHeaders() {
        String appId = getAppId();
        return appId == null ? "" : appId;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getApiBaseUrl() {
        return this.apiBaseUrl;
    }
}
