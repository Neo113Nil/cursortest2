package io.appmetrica.analytics.coreapi.internal.model;

import E.AbstractC0005f;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SdkInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f9675a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9676b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9677c;

    public SdkInfo(String str, String str2, String str3) {
        this.f9675a = str;
        this.f9676b = str2;
        this.f9677c = str3;
    }

    public static /* synthetic */ SdkInfo copy$default(SdkInfo sdkInfo, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = sdkInfo.f9675a;
        }
        if ((i4 & 2) != 0) {
            str2 = sdkInfo.f9676b;
        }
        if ((i4 & 4) != 0) {
            str3 = sdkInfo.f9677c;
        }
        return sdkInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f9675a;
    }

    public final String component2() {
        return this.f9676b;
    }

    public final String component3() {
        return this.f9677c;
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
        return i.a(this.f9675a, sdkInfo.f9675a) && i.a(this.f9676b, sdkInfo.f9676b) && i.a(this.f9677c, sdkInfo.f9677c);
    }

    public final String getSdkBuildNumber() {
        return this.f9676b;
    }

    public final String getSdkBuildType() {
        return this.f9677c;
    }

    public final String getSdkVersionName() {
        return this.f9675a;
    }

    public int hashCode() {
        return this.f9677c.hashCode() + AbstractC0005f.f(this.f9675a.hashCode() * 31, 31, this.f9676b);
    }

    public String toString() {
        return "SdkInfo(sdkVersionName=" + this.f9675a + ", sdkBuildNumber=" + this.f9676b + ", sdkBuildType=" + this.f9677c + ')';
    }
}
