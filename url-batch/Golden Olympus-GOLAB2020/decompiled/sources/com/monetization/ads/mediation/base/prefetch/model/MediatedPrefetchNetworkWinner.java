package com.monetization.ads.mediation.base.prefetch.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class MediatedPrefetchNetworkWinner {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f20767a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f20768b;

    public MediatedPrefetchNetworkWinner(@NotNull String networkName, @NotNull String networkAdUnit) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(networkAdUnit, "networkAdUnit");
        this.f20767a = networkName;
        this.f20768b = networkAdUnit;
    }

    public static /* synthetic */ MediatedPrefetchNetworkWinner copy$default(MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = mediatedPrefetchNetworkWinner.f20767a;
        }
        if ((i4 & 2) != 0) {
            str2 = mediatedPrefetchNetworkWinner.f20768b;
        }
        return mediatedPrefetchNetworkWinner.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f20767a;
    }

    @NotNull
    public final String component2() {
        return this.f20768b;
    }

    @NotNull
    public final MediatedPrefetchNetworkWinner copy(@NotNull String networkName, @NotNull String networkAdUnit) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(networkAdUnit, "networkAdUnit");
        return new MediatedPrefetchNetworkWinner(networkName, networkAdUnit);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediatedPrefetchNetworkWinner)) {
            return false;
        }
        MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner = (MediatedPrefetchNetworkWinner) obj;
        return Intrinsics.areEqual(this.f20767a, mediatedPrefetchNetworkWinner.f20767a) && Intrinsics.areEqual(this.f20768b, mediatedPrefetchNetworkWinner.f20768b);
    }

    @NotNull
    public final String getNetworkAdUnit() {
        return this.f20768b;
    }

    @NotNull
    public final String getNetworkName() {
        return this.f20767a;
    }

    public int hashCode() {
        return this.f20768b.hashCode() + (this.f20767a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MediatedPrefetchNetworkWinner(networkName=" + this.f20767a + ", networkAdUnit=" + this.f20768b + ")";
    }
}
