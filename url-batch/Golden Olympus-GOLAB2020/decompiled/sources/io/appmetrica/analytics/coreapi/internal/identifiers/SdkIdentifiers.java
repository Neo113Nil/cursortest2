package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class SdkIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final String f36953a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36954b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36955c;

    public SdkIdentifiers(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f36953a = str;
        this.f36954b = str2;
        this.f36955c = str3;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = sdkIdentifiers.f36953a;
        }
        if ((i4 & 2) != 0) {
            str2 = sdkIdentifiers.f36954b;
        }
        if ((i4 & 4) != 0) {
            str3 = sdkIdentifiers.f36955c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.f36953a;
    }

    @Nullable
    public final String component2() {
        return this.f36954b;
    }

    @Nullable
    public final String component3() {
        return this.f36955c;
    }

    @NotNull
    public final SdkIdentifiers copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new SdkIdentifiers(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkIdentifiers)) {
            return false;
        }
        SdkIdentifiers sdkIdentifiers = (SdkIdentifiers) obj;
        return Intrinsics.areEqual(this.f36953a, sdkIdentifiers.f36953a) && Intrinsics.areEqual(this.f36954b, sdkIdentifiers.f36954b) && Intrinsics.areEqual(this.f36955c, sdkIdentifiers.f36955c);
    }

    @Nullable
    public final String getDeviceId() {
        return this.f36954b;
    }

    @Nullable
    public final String getDeviceIdHash() {
        return this.f36955c;
    }

    @Nullable
    public final String getUuid() {
        return this.f36953a;
    }

    public int hashCode() {
        String str = this.f36953a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f36954b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f36955c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SdkIdentifiers(uuid=" + this.f36953a + ", deviceId=" + this.f36954b + ", deviceIdHash=" + this.f36955c + ')';
    }
}
