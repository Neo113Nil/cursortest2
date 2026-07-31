package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ox {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30218a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final px f30219b;

    public ox(@NotNull String sdkVersion, @NotNull px sdkIntegrationStatusData) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkIntegrationStatusData, "sdkIntegrationStatusData");
        this.f30218a = sdkVersion;
        this.f30219b = sdkIntegrationStatusData;
    }

    @NotNull
    public final px a() {
        return this.f30219b;
    }

    @NotNull
    public final String b() {
        return this.f30218a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox)) {
            return false;
        }
        ox oxVar = (ox) obj;
        return Intrinsics.areEqual(this.f30218a, oxVar.f30218a) && Intrinsics.areEqual(this.f30219b, oxVar.f30219b);
    }

    public final int hashCode() {
        return this.f30219b.hashCode() + (this.f30218a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelSdkIntegrationData(sdkVersion=" + this.f30218a + ", sdkIntegrationStatusData=" + this.f30219b + ")";
    }
}
