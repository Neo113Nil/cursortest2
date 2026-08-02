package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class AppVersionInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f9663a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9664b;

    public AppVersionInfo(String str, String str2) {
        this.f9663a = str;
        this.f9664b = str2;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = appVersionInfo.f9663a;
        }
        if ((i4 & 2) != 0) {
            str2 = appVersionInfo.f9664b;
        }
        return appVersionInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f9663a;
    }

    public final String component2() {
        return this.f9664b;
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
        return i.a(this.f9663a, appVersionInfo.f9663a) && i.a(this.f9664b, appVersionInfo.f9664b);
    }

    public final String getAppBuildNumber() {
        return this.f9664b;
    }

    public final String getAppVersionName() {
        return this.f9663a;
    }

    public int hashCode() {
        return this.f9664b.hashCode() + (this.f9663a.hashCode() * 31);
    }

    public String toString() {
        return "AppVersionInfo(appVersionName=" + this.f9663a + ", appBuildNumber=" + this.f9664b + ')';
    }
}
