package com.onesignal.debug.internal.logging.otel.android;

import B0.o;
import android.content.Context;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OtelPlatformProviderConfig {
    private final String appPackageId;
    private final String appVersion;
    private final Context context;
    private final String crashStoragePath;
    private final InterfaceC1430a getIsInForeground;

    public OtelPlatformProviderConfig(String crashStoragePath, String appPackageId, String appVersion, Context context, InterfaceC1430a interfaceC1430a) {
        i.e(crashStoragePath, "crashStoragePath");
        i.e(appPackageId, "appPackageId");
        i.e(appVersion, "appVersion");
        this.crashStoragePath = crashStoragePath;
        this.appPackageId = appPackageId;
        this.appVersion = appVersion;
        this.context = context;
        this.getIsInForeground = interfaceC1430a;
    }

    public static /* synthetic */ OtelPlatformProviderConfig copy$default(OtelPlatformProviderConfig otelPlatformProviderConfig, String str, String str2, String str3, Context context, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = otelPlatformProviderConfig.crashStoragePath;
        }
        if ((i2 & 2) != 0) {
            str2 = otelPlatformProviderConfig.appPackageId;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = otelPlatformProviderConfig.appVersion;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            context = otelPlatformProviderConfig.context;
        }
        Context context2 = context;
        if ((i2 & 16) != 0) {
            interfaceC1430a = otelPlatformProviderConfig.getIsInForeground;
        }
        return otelPlatformProviderConfig.copy(str, str4, str5, context2, interfaceC1430a);
    }

    public final String component1() {
        return this.crashStoragePath;
    }

    public final String component2() {
        return this.appPackageId;
    }

    public final String component3() {
        return this.appVersion;
    }

    public final Context component4() {
        return this.context;
    }

    public final InterfaceC1430a component5() {
        return this.getIsInForeground;
    }

    public final OtelPlatformProviderConfig copy(String crashStoragePath, String appPackageId, String appVersion, Context context, InterfaceC1430a interfaceC1430a) {
        i.e(crashStoragePath, "crashStoragePath");
        i.e(appPackageId, "appPackageId");
        i.e(appVersion, "appVersion");
        return new OtelPlatformProviderConfig(crashStoragePath, appPackageId, appVersion, context, interfaceC1430a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtelPlatformProviderConfig)) {
            return false;
        }
        OtelPlatformProviderConfig otelPlatformProviderConfig = (OtelPlatformProviderConfig) obj;
        return i.a(this.crashStoragePath, otelPlatformProviderConfig.crashStoragePath) && i.a(this.appPackageId, otelPlatformProviderConfig.appPackageId) && i.a(this.appVersion, otelPlatformProviderConfig.appVersion) && i.a(this.context, otelPlatformProviderConfig.context) && i.a(this.getIsInForeground, otelPlatformProviderConfig.getIsInForeground);
    }

    public final String getAppPackageId() {
        return this.appPackageId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCrashStoragePath() {
        return this.crashStoragePath;
    }

    public final InterfaceC1430a getGetIsInForeground() {
        return this.getIsInForeground;
    }

    public int hashCode() {
        int f3 = o.f(this.appVersion, o.f(this.appPackageId, this.crashStoragePath.hashCode() * 31, 31), 31);
        Context context = this.context;
        int hashCode = (f3 + (context == null ? 0 : context.hashCode())) * 31;
        InterfaceC1430a interfaceC1430a = this.getIsInForeground;
        return hashCode + (interfaceC1430a != null ? interfaceC1430a.hashCode() : 0);
    }

    public String toString() {
        return "OtelPlatformProviderConfig(crashStoragePath=" + this.crashStoragePath + ", appPackageId=" + this.appPackageId + ", appVersion=" + this.appVersion + ", context=" + this.context + ", getIsInForeground=" + this.getIsInForeground + ')';
    }

    public /* synthetic */ OtelPlatformProviderConfig(String str, String str2, String str3, Context context, InterfaceC1430a interfaceC1430a, int i2, e eVar) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : context, (i2 & 16) != 0 ? null : interfaceC1430a);
    }
}
