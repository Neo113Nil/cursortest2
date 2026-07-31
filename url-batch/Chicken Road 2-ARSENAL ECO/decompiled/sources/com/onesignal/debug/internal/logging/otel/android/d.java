package com.onesignal.debug.internal.logging.otel.android;

import android.content.Context;
import kotlin.jvm.internal.i;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class d {
    private final String appPackageId;
    private final String appVersion;
    private final Context context;
    private final String crashStoragePath;
    private final InterfaceC0732a getIsInForeground;

    public d(String crashStoragePath, String appPackageId, String appVersion, Context context, InterfaceC0732a interfaceC0732a) {
        i.e(crashStoragePath, "crashStoragePath");
        i.e(appPackageId, "appPackageId");
        i.e(appVersion, "appVersion");
        this.crashStoragePath = crashStoragePath;
        this.appPackageId = appPackageId;
        this.appVersion = appVersion;
        this.context = context;
        this.getIsInForeground = interfaceC0732a;
    }

    public static /* synthetic */ d copy$default(d dVar, String str, String str2, String str3, Context context, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = dVar.crashStoragePath;
        }
        if ((i7 & 2) != 0) {
            str2 = dVar.appPackageId;
        }
        if ((i7 & 4) != 0) {
            str3 = dVar.appVersion;
        }
        if ((i7 & 8) != 0) {
            context = dVar.context;
        }
        if ((i7 & 16) != 0) {
            interfaceC0732a = dVar.getIsInForeground;
        }
        InterfaceC0732a interfaceC0732a2 = interfaceC0732a;
        String str4 = str3;
        return dVar.copy(str, str2, str4, context, interfaceC0732a2);
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

    public final InterfaceC0732a component5() {
        return this.getIsInForeground;
    }

    public final d copy(String crashStoragePath, String appPackageId, String appVersion, Context context, InterfaceC0732a interfaceC0732a) {
        i.e(crashStoragePath, "crashStoragePath");
        i.e(appPackageId, "appPackageId");
        i.e(appVersion, "appVersion");
        return new d(crashStoragePath, appPackageId, appVersion, context, interfaceC0732a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.crashStoragePath, dVar.crashStoragePath) && i.a(this.appPackageId, dVar.appPackageId) && i.a(this.appVersion, dVar.appVersion) && i.a(this.context, dVar.context) && i.a(this.getIsInForeground, dVar.getIsInForeground);
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

    public final InterfaceC0732a getGetIsInForeground() {
        return this.getIsInForeground;
    }

    public int hashCode() {
        int hashCode = (this.appVersion.hashCode() + ((this.appPackageId.hashCode() + (this.crashStoragePath.hashCode() * 31)) * 31)) * 31;
        Context context = this.context;
        int hashCode2 = (hashCode + (context == null ? 0 : context.hashCode())) * 31;
        InterfaceC0732a interfaceC0732a = this.getIsInForeground;
        return hashCode2 + (interfaceC0732a != null ? interfaceC0732a.hashCode() : 0);
    }

    public String toString() {
        return "OtelPlatformProviderConfig(crashStoragePath=" + this.crashStoragePath + ", appPackageId=" + this.appPackageId + ", appVersion=" + this.appVersion + ", context=" + this.context + ", getIsInForeground=" + this.getIsInForeground + ')';
    }

    public /* synthetic */ d(String str, String str2, String str3, Context context, InterfaceC0732a interfaceC0732a, int i7, kotlin.jvm.internal.e eVar) {
        this(str, str2, str3, (i7 & 8) != 0 ? null : context, (i7 & 16) != 0 ? null : interfaceC0732a);
    }
}
