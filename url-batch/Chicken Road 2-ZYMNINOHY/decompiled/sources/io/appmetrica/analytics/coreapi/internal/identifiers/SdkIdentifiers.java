package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SdkIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final String f9659a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9660b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9661c;

    public SdkIdentifiers(String str, String str2, String str3) {
        this.f9659a = str;
        this.f9660b = str2;
        this.f9661c = str3;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = sdkIdentifiers.f9659a;
        }
        if ((i4 & 2) != 0) {
            str2 = sdkIdentifiers.f9660b;
        }
        if ((i4 & 4) != 0) {
            str3 = sdkIdentifiers.f9661c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f9659a;
    }

    public final String component2() {
        return this.f9660b;
    }

    public final String component3() {
        return this.f9661c;
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
        return i.a(this.f9659a, sdkIdentifiers.f9659a) && i.a(this.f9660b, sdkIdentifiers.f9660b) && i.a(this.f9661c, sdkIdentifiers.f9661c);
    }

    public final String getDeviceId() {
        return this.f9660b;
    }

    public final String getDeviceIdHash() {
        return this.f9661c;
    }

    public final String getUuid() {
        return this.f9659a;
    }

    public int hashCode() {
        String str = this.f9659a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9660b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9661c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SdkIdentifiers(uuid=" + this.f9659a + ", deviceId=" + this.f9660b + ", deviceIdHash=" + this.f9661c + ')';
    }
}
