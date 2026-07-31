package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class SdkInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f36969a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36970b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36971c;

    public SdkInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f36969a = str;
        this.f36970b = str2;
        this.f36971c = str3;
    }

    public static /* synthetic */ SdkInfo copy$default(SdkInfo sdkInfo, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = sdkInfo.f36969a;
        }
        if ((i4 & 2) != 0) {
            str2 = sdkInfo.f36970b;
        }
        if ((i4 & 4) != 0) {
            str3 = sdkInfo.f36971c;
        }
        return sdkInfo.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.f36969a;
    }

    @NotNull
    public final String component2() {
        return this.f36970b;
    }

    @NotNull
    public final String component3() {
        return this.f36971c;
    }

    @NotNull
    public final SdkInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return new SdkInfo(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkInfo)) {
            return false;
        }
        SdkInfo sdkInfo = (SdkInfo) obj;
        return Intrinsics.areEqual(this.f36969a, sdkInfo.f36969a) && Intrinsics.areEqual(this.f36970b, sdkInfo.f36970b) && Intrinsics.areEqual(this.f36971c, sdkInfo.f36971c);
    }

    @NotNull
    public final String getSdkBuildNumber() {
        return this.f36970b;
    }

    @NotNull
    public final String getSdkBuildType() {
        return this.f36971c;
    }

    @NotNull
    public final String getSdkVersionName() {
        return this.f36969a;
    }

    public int hashCode() {
        return this.f36971c.hashCode() + ((this.f36970b.hashCode() + (this.f36969a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SdkInfo(sdkVersionName=" + this.f36969a + ", sdkBuildNumber=" + this.f36970b + ", sdkBuildType=" + this.f36971c + ')';
    }
}
