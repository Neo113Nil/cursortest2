package com.onesignal.debug.internal.logging.otel.android;

import R5.InterfaceC0168h;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.onesignal.common.h;
import com.onesignal.common.i;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.A;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class c implements E3.f {
    private final String apiBaseUrl;
    private final InterfaceC0168h appId$delegate;
    private final String appPackageId;
    private final String appVersion;
    private final Context context;
    private final InterfaceC0168h crashStoragePath$delegate;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final Function0<B2.e> featureManagerProvider;
    private final Function0<Boolean> getIsInForeground;
    private final com.onesignal.debug.internal.logging.otel.android.b idResolver;
    private final boolean isOtelExporterLoggingEnabled;
    private final InterfaceC0168h isRemoteLoggingEnabled$delegate;
    private final long minFileAgeForReadMillis;
    private final InterfaceC0168h onesignalId$delegate;
    private final String osBuildId;
    private final String osName;
    private final String osVersion;
    private final InterfaceC0168h pushSubscriptionId$delegate;
    private final InterfaceC0168h remoteLogLevel$delegate;
    private final String sdkBase;
    private final String sdkBaseVersion;
    private final String sdkWrapper;
    private final String sdkWrapperVersion;

    public static final class a extends p implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return c.this.idResolver.resolveAppId();
        }
    }

    public static final class b extends p implements Function0 {
        final /* synthetic */ com.onesignal.debug.internal.logging.otel.android.d $config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.debug.internal.logging.otel.android.d dVar) {
            super(0);
            this.$config = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String crashStoragePath = this.$config.getCrashStoragePath();
            com.onesignal.debug.internal.logging.b.info$default("OneSignal: Crash logs stored at: " + crashStoragePath, null, 2, null);
            return crashStoragePath;
        }
    }

    /* renamed from: com.onesignal.debug.internal.logging.otel.android.c$c, reason: collision with other inner class name */
    public static final class C0029c extends p implements Function0 {
        public C0029c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(c.this.idResolver.resolveRemoteLoggingEnabled());
        }
    }

    public static final class d extends p implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return c.this.idResolver.resolveOnesignalId();
        }
    }

    public static final class e extends p implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return c.this.idResolver.resolvePushSubscriptionId();
        }
    }

    public static final class f extends p implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            try {
                K2.c resolveRemoteLogLevel = c.this.idResolver.resolveRemoteLogLevel();
                if (resolveRemoteLogLevel != null) {
                    return resolveRemoteLogLevel.name();
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(com.onesignal.debug.internal.logging.otel.android.d config, Function0<? extends B2.e> featureManagerProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(featureManagerProvider, "featureManagerProvider");
        this.featureManagerProvider = featureManagerProvider;
        this.appPackageId = config.getAppPackageId();
        this.appVersion = config.getAppVersion();
        Context context = config.getContext();
        this.context = context;
        this.getIsInForeground = config.getGetIsInForeground();
        this.idResolver = new com.onesignal.debug.internal.logging.otel.android.b(context);
        this.sdkBase = com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID;
        this.sdkBaseVersion = h.INSTANCE.getSdkVersion();
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
        this.sdkWrapper = i.getSdkType();
        this.sdkWrapperVersion = i.getSdkVersion();
        this.appId$delegate = R5.i.b(new a());
        this.onesignalId$delegate = R5.i.b(new d());
        this.pushSubscriptionId$delegate = R5.i.b(new e());
        this.crashStoragePath$delegate = R5.i.b(new b(config));
        this.minFileAgeForReadMillis = 5000L;
        this.isRemoteLoggingEnabled$delegate = R5.i.b(new C0029c());
        this.remoteLogLevel$delegate = R5.i.b(new f());
        this.apiBaseUrl = "https://api.onesignal.com/";
    }

    public static /* synthetic */ void getEnabledFeatureFlags$annotations() {
    }

    public static /* synthetic */ void getRemoteLogLevel$annotations() {
    }

    @Override // E3.f
    public String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    @Override // E3.f
    public String getAppId() {
        return (String) this.appId$delegate.getValue();
    }

    @Override // E3.f
    public String getAppIdForHeaders() {
        String appId = getAppId();
        return appId == null ? "" : appId;
    }

    @Override // E3.f
    public String getAppPackageId() {
        return this.appPackageId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r5.intValue() == 200) goto L42;
     */
    @Override // E3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getAppState() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        Object obj;
        Boolean bool;
        try {
            Function0<Boolean> function0 = this.getIsInForeground;
            String str = "background";
            if (function0 == null || (bool = (Boolean) function0.invoke()) == null) {
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
                    return "foreground";
                }
            } else if (bool.booleanValue()) {
                str = "foreground";
            }
            return str;
        } catch (Exception unused) {
            return "unknown";
        }
    }

    @Override // E3.f
    public String getAppVersion() {
        return this.appVersion;
    }

    @Override // E3.f
    public String getCrashStoragePath() {
        return (String) this.crashStoragePath$delegate.getValue();
    }

    @Override // E3.f
    public String getCurrentThreadName() {
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // E3.f
    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @Override // E3.f
    public String getDeviceModel() {
        return this.deviceModel;
    }

    @Override // E3.f
    public List<String> getEnabledFeatureFlags() {
        try {
            return ((B2.e) this.featureManagerProvider.invoke()).enabledFeatureKeys();
        } catch (Throwable unused) {
            return A.f6115d;
        }
    }

    @Override // E3.f
    public Object getInstallId(V5.b bVar) {
        return this.idResolver.resolveInstallId();
    }

    @Override // E3.f
    public long getMinFileAgeForReadMillis() {
        return this.minFileAgeForReadMillis;
    }

    @Override // E3.f
    public String getOnesignalId() {
        return (String) this.onesignalId$delegate.getValue();
    }

    @Override // E3.f
    public String getOsBuildId() {
        return this.osBuildId;
    }

    @Override // E3.f
    public String getOsName() {
        return this.osName;
    }

    @Override // E3.f
    public String getOsVersion() {
        return this.osVersion;
    }

    @Override // E3.f
    public long getProcessUptime() {
        return SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
    }

    @Override // E3.f
    public String getPushSubscriptionId() {
        return (String) this.pushSubscriptionId$delegate.getValue();
    }

    @Override // E3.f
    public String getRemoteLogLevel() {
        return (String) this.remoteLogLevel$delegate.getValue();
    }

    @Override // E3.f
    public String getSdkBase() {
        return this.sdkBase;
    }

    @Override // E3.f
    public String getSdkBaseVersion() {
        return this.sdkBaseVersion;
    }

    @Override // E3.f
    public String getSdkWrapper() {
        return this.sdkWrapper;
    }

    @Override // E3.f
    public String getSdkWrapperVersion() {
        return this.sdkWrapperVersion;
    }

    @Override // E3.f
    public boolean isOtelExporterLoggingEnabled() {
        return this.isOtelExporterLoggingEnabled;
    }

    public boolean isRemoteLoggingEnabled() {
        return ((Boolean) this.isRemoteLoggingEnabled$delegate.getValue()).booleanValue();
    }
}
