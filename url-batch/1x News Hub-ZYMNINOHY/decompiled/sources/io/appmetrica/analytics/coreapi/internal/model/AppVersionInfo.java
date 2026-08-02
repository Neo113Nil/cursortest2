package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class AppVersionInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f5410a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5411b;

    public AppVersionInfo(String str, String str2) {
        this.f5410a = str;
        this.f5411b = str2;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = appVersionInfo.f5410a;
        }
        if ((i3 & 2) != 0) {
            str2 = appVersionInfo.f5411b;
        }
        return appVersionInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f5410a;
    }

    public final String component2() {
        return this.f5411b;
    }

    public final AppVersionInfo copy(String str, String str2) {
        return new AppVersionInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersionInfo)) {
            return false;
        }
        AppVersionInfo appVersionInfo = (AppVersionInfo) obj;
        return j.a(this.f5410a, appVersionInfo.f5410a) && j.a(this.f5411b, appVersionInfo.f5411b);
    }

    public final String getAppBuildNumber() {
        return this.f5411b;
    }

    public final String getAppVersionName() {
        return this.f5410a;
    }

    public int hashCode() {
        return this.f5411b.hashCode() + (this.f5410a.hashCode() * 31);
    }

    public String toString() {
        return "AppVersionInfo(appVersionName=" + this.f5410a + ", appBuildNumber=" + this.f5411b + ')';
    }
}
