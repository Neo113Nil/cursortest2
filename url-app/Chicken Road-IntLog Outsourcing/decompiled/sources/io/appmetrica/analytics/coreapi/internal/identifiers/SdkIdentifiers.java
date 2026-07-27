package io.appmetrica.analytics.coreapi.internal.identifiers;

import B0.o;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SdkIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final String f6170a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6171b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6172c;

    public SdkIdentifiers(String str, String str2, String str3) {
        this.f6170a = str;
        this.f6171b = str2;
        this.f6172c = str3;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sdkIdentifiers.f6170a;
        }
        if ((i2 & 2) != 0) {
            str2 = sdkIdentifiers.f6171b;
        }
        if ((i2 & 4) != 0) {
            str3 = sdkIdentifiers.f6172c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f6170a;
    }

    public final String component2() {
        return this.f6171b;
    }

    public final String component3() {
        return this.f6172c;
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
        return i.a(this.f6170a, sdkIdentifiers.f6170a) && i.a(this.f6171b, sdkIdentifiers.f6171b) && i.a(this.f6172c, sdkIdentifiers.f6172c);
    }

    public final String getDeviceId() {
        return this.f6171b;
    }

    public final String getDeviceIdHash() {
        return this.f6172c;
    }

    public final String getUuid() {
        return this.f6170a;
    }

    public int hashCode() {
        String str = this.f6170a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6171b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6172c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkIdentifiers(uuid=");
        sb.append(this.f6170a);
        sb.append(", deviceId=");
        sb.append(this.f6171b);
        sb.append(", deviceIdHash=");
        return o.l(sb, this.f6172c, ')');
    }
}
