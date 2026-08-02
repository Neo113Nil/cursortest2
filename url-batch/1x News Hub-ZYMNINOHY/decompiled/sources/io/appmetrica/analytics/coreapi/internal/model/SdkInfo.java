package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class SdkInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f5421a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5422b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5423c;

    public SdkInfo(String str, String str2, String str3) {
        this.f5421a = str;
        this.f5422b = str2;
        this.f5423c = str3;
    }

    public static /* synthetic */ SdkInfo copy$default(SdkInfo sdkInfo, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sdkInfo.f5421a;
        }
        if ((i3 & 2) != 0) {
            str2 = sdkInfo.f5422b;
        }
        if ((i3 & 4) != 0) {
            str3 = sdkInfo.f5423c;
        }
        return sdkInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f5421a;
    }

    public final String component2() {
        return this.f5422b;
    }

    public final String component3() {
        return this.f5423c;
    }

    public final SdkInfo copy(String str, String str2, String str3) {
        return new SdkInfo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkInfo)) {
            return false;
        }
        SdkInfo sdkInfo = (SdkInfo) obj;
        return j.a(this.f5421a, sdkInfo.f5421a) && j.a(this.f5422b, sdkInfo.f5422b) && j.a(this.f5423c, sdkInfo.f5423c);
    }

    public final String getSdkBuildNumber() {
        return this.f5422b;
    }

    public final String getSdkBuildType() {
        return this.f5423c;
    }

    public final String getSdkVersionName() {
        return this.f5421a;
    }

    public int hashCode() {
        return this.f5423c.hashCode() + ((this.f5422b.hashCode() + (this.f5421a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "SdkInfo(sdkVersionName=" + this.f5421a + ", sdkBuildNumber=" + this.f5422b + ", sdkBuildType=" + this.f5423c + ')';
    }
}
