package io.appmetrica.analytics.coreapi.internal.model;

import B0.o;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class AppVersionInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f6174a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6175b;

    public AppVersionInfo(String str, String str2) {
        this.f6174a = str;
        this.f6175b = str2;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appVersionInfo.f6174a;
        }
        if ((i2 & 2) != 0) {
            str2 = appVersionInfo.f6175b;
        }
        return appVersionInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f6174a;
    }

    public final String component2() {
        return this.f6175b;
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
        return i.a(this.f6174a, appVersionInfo.f6174a) && i.a(this.f6175b, appVersionInfo.f6175b);
    }

    public final String getAppBuildNumber() {
        return this.f6175b;
    }

    public final String getAppVersionName() {
        return this.f6174a;
    }

    public int hashCode() {
        return this.f6175b.hashCode() + (this.f6174a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppVersionInfo(appVersionName=");
        sb.append(this.f6174a);
        sb.append(", appBuildNumber=");
        return o.l(sb, this.f6175b, ')');
    }
}
