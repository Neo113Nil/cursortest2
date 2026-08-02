package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class SdkIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final String f5406a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5407b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5408c;

    public SdkIdentifiers(String str, String str2, String str3) {
        this.f5406a = str;
        this.f5407b = str2;
        this.f5408c = str3;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sdkIdentifiers.f5406a;
        }
        if ((i3 & 2) != 0) {
            str2 = sdkIdentifiers.f5407b;
        }
        if ((i3 & 4) != 0) {
            str3 = sdkIdentifiers.f5408c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f5406a;
    }

    public final String component2() {
        return this.f5407b;
    }

    public final String component3() {
        return this.f5408c;
    }

    public final SdkIdentifiers copy(String str, String str2, String str3) {
        return new SdkIdentifiers(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkIdentifiers)) {
            return false;
        }
        SdkIdentifiers sdkIdentifiers = (SdkIdentifiers) obj;
        return j.a(this.f5406a, sdkIdentifiers.f5406a) && j.a(this.f5407b, sdkIdentifiers.f5407b) && j.a(this.f5408c, sdkIdentifiers.f5408c);
    }

    public final String getDeviceId() {
        return this.f5407b;
    }

    public final String getDeviceIdHash() {
        return this.f5408c;
    }

    public final String getUuid() {
        return this.f5406a;
    }

    public int hashCode() {
        String str = this.f5406a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5407b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5408c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SdkIdentifiers(uuid=" + this.f5406a + ", deviceId=" + this.f5407b + ", deviceIdHash=" + this.f5408c + ')';
    }
}
