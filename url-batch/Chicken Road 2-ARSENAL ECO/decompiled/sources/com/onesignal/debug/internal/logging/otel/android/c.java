package com.onesignal.debug.internal.logging.otel.android;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.onesignal.common.h;
import java.util.Iterator;
import java.util.List;
import k5.InterfaceC0475e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l5.C0512p;
import m1.AbstractC0521b;
import o5.InterfaceC0564d;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class c implements c3.f {
    private final String apiBaseUrl;
    private final InterfaceC0475e appId$delegate;
    private final String appPackageId;
    private final String appVersion;
    private final Context context;
    private final InterfaceC0475e crashStoragePath$delegate;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final InterfaceC0732a featureManagerProvider;
    private final InterfaceC0732a getIsInForeground;
    private final com.onesignal.debug.internal.logging.otel.android.b idResolver;
    private final boolean isOtelExporterLoggingEnabled;
    private final InterfaceC0475e isRemoteLoggingEnabled$delegate;
    private final long minFileAgeForReadMillis;
    private final InterfaceC0475e onesignalId$delegate;
    private final String osBuildId;
    private final String osName;
    private final String osVersion;
    private final InterfaceC0475e pushSubscriptionId$delegate;
    private final InterfaceC0475e remoteLogLevel$delegate;
    private final String sdkBase;
    private final String sdkBaseVersion;
    private final String sdkWrapper;
    private final String sdkWrapperVersion;

    public static final class a extends j implements InterfaceC0732a {
        public a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final String invoke() {
            return c.this.idResolver.resolveAppId();
        }
    }

    public static final class b extends j implements InterfaceC0732a {
        final /* synthetic */ com.onesignal.debug.internal.logging.otel.android.d $config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.debug.internal.logging.otel.android.d dVar) {
            super(0);
            this.$config = dVar;
        }

        @Override // x5.InterfaceC0732a
        public final String invoke() {
            String crashStoragePath = this.$config.getCrashStoragePath();
            com.onesignal.debug.internal.logging.b.info$default("OneSignal: Crash logs stored at: " + crashStoragePath, null, 2, null);
            return crashStoragePath;
        }
    }

    /* renamed from: com.onesignal.debug.internal.logging.otel.android.c$c, reason: collision with other inner class name */
    public static final class C0029c extends j implements InterfaceC0732a {
        public C0029c() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.valueOf(c.this.idResolver.resolveRemoteLoggingEnabled());
        }
    }

    public static final class d extends j implements InterfaceC0732a {
        public d() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final String invoke() {
            return c.this.idResolver.resolveOnesignalId();
        }
    }

    public static final class e extends j implements InterfaceC0732a {
        public e() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final String invoke() {
            return c.this.idResolver.resolvePushSubscriptionId();
        }
    }

    public static final class f extends j implements InterfaceC0732a {
        public f() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final String invoke() {
            try {
                i2.c resolveRemoteLogLevel = c.this.idResolver.resolveRemoteLogLevel();
                if (resolveRemoteLogLevel != null) {
                    return resolveRemoteLogLevel.name();
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public c(com.onesignal.debug.internal.logging.otel.android.d config, InterfaceC0732a featureManagerProvider) {
        i.e(config, "config");
        i.e(featureManagerProvider, "featureManagerProvider");
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
        i.d(MANUFACTURER, "MANUFACTURER");
        this.deviceManufacturer = MANUFACTURER;
        String MODEL = Build.MODEL;
        i.d(MODEL, "MODEL");
        this.deviceModel = MODEL;
        this.osName = "Android";
        String RELEASE = Build.VERSION.RELEASE;
        i.d(RELEASE, "RELEASE");
        this.osVersion = RELEASE;
        String ID = Build.ID;
        i.d(ID, "ID");
        this.osBuildId = ID;
        this.sdkWrapper = com.onesignal.common.i.getSdkType();
        this.sdkWrapperVersion = com.onesignal.common.i.getSdkVersion();
        this.appId$delegate = AbstractC0521b.x(new a());
        this.onesignalId$delegate = AbstractC0521b.x(new d());
        this.pushSubscriptionId$delegate = AbstractC0521b.x(new e());
        this.crashStoragePath$delegate = AbstractC0521b.x(new b(config));
        this.minFileAgeForReadMillis = 5000L;
        this.isRemoteLoggingEnabled$delegate = AbstractC0521b.x(new C0029c());
        this.remoteLogLevel$delegate = AbstractC0521b.x(new f());
        this.apiBaseUrl = "https://api.onesignal.com/";
    }

    public static /* synthetic */ void getEnabledFeatureFlags$annotations() {
    }

    public static /* synthetic */ void getRemoteLogLevel$annotations() {
    }

    @Override // c3.f
    public String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    @Override // c3.f
    public String getAppId() {
        return (String) this.appId$delegate.getValue();
    }

    @Override // c3.f
    public String getAppIdForHeaders() {
        String appId = getAppId();
        return appId == null ? "" : appId;
    }

    @Override // c3.f
    public String getAppPackageId() {
        return this.appPackageId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r5.intValue() == 200) goto L42;
     */
    @Override // c3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getAppState() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        Object obj;
        Boolean bool;
        try {
            InterfaceC0732a interfaceC0732a = this.getIsInForeground;
            String str = "background";
            if (interfaceC0732a == null || (bool = (Boolean) interfaceC0732a.invoke()) == null) {
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

    @Override // c3.f
    public String getAppVersion() {
        return this.appVersion;
    }

    @Override // c3.f
    public String getCrashStoragePath() {
        return (String) this.crashStoragePath$delegate.getValue();
    }

    @Override // c3.f
    public String getCurrentThreadName() {
        String name = Thread.currentThread().getName();
        i.d(name, "getName(...)");
        return name;
    }

    @Override // c3.f
    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @Override // c3.f
    public String getDeviceModel() {
        return this.deviceModel;
    }

    @Override // c3.f
    public List<String> getEnabledFeatureFlags() {
        try {
            return ((Z1.e) this.featureManagerProvider.invoke()).enabledFeatureKeys();
        } catch (Throwable unused) {
            return C0512p.f5303f;
        }
    }

    @Override // c3.f
    public Object getInstallId(InterfaceC0564d interfaceC0564d) {
        return this.idResolver.resolveInstallId();
    }

    @Override // c3.f
    public long getMinFileAgeForReadMillis() {
        return this.minFileAgeForReadMillis;
    }

    @Override // c3.f
    public String getOnesignalId() {
        return (String) this.onesignalId$delegate.getValue();
    }

    @Override // c3.f
    public String getOsBuildId() {
        return this.osBuildId;
    }

    @Override // c3.f
    public String getOsName() {
        return this.osName;
    }

    @Override // c3.f
    public String getOsVersion() {
        return this.osVersion;
    }

    @Override // c3.f
    public long getProcessUptime() {
        return SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
    }

    @Override // c3.f
    public String getPushSubscriptionId() {
        return (String) this.pushSubscriptionId$delegate.getValue();
    }

    @Override // c3.f
    public String getRemoteLogLevel() {
        return (String) this.remoteLogLevel$delegate.getValue();
    }

    @Override // c3.f
    public String getSdkBase() {
        return this.sdkBase;
    }

    @Override // c3.f
    public String getSdkBaseVersion() {
        return this.sdkBaseVersion;
    }

    @Override // c3.f
    public String getSdkWrapper() {
        return this.sdkWrapper;
    }

    @Override // c3.f
    public String getSdkWrapperVersion() {
        return this.sdkWrapperVersion;
    }

    @Override // c3.f
    public boolean isOtelExporterLoggingEnabled() {
        return this.isOtelExporterLoggingEnabled;
    }

    public boolean isRemoteLoggingEnabled() {
        return ((Boolean) this.isRemoteLoggingEnabled$delegate.getValue()).booleanValue();
    }
}
