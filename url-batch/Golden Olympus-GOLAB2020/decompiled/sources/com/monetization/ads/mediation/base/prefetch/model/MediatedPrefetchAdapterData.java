package com.monetization.ads.mediation.base.prefetch.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class MediatedPrefetchAdapterData {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MediatedPrefetchNetworkWinner f20764a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final MediatedPrefetchRevenue f20765b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f20766c;

    public MediatedPrefetchAdapterData(@NotNull MediatedPrefetchNetworkWinner networkWinner, @NotNull MediatedPrefetchRevenue revenue, @NotNull String networkAdInfo) {
        Intrinsics.checkNotNullParameter(networkWinner, "networkWinner");
        Intrinsics.checkNotNullParameter(revenue, "revenue");
        Intrinsics.checkNotNullParameter(networkAdInfo, "networkAdInfo");
        this.f20764a = networkWinner;
        this.f20765b = revenue;
        this.f20766c = networkAdInfo;
    }

    public static /* synthetic */ MediatedPrefetchAdapterData copy$default(MediatedPrefetchAdapterData mediatedPrefetchAdapterData, MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner, MediatedPrefetchRevenue mediatedPrefetchRevenue, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            mediatedPrefetchNetworkWinner = mediatedPrefetchAdapterData.f20764a;
        }
        if ((i4 & 2) != 0) {
            mediatedPrefetchRevenue = mediatedPrefetchAdapterData.f20765b;
        }
        if ((i4 & 4) != 0) {
            str = mediatedPrefetchAdapterData.f20766c;
        }
        return mediatedPrefetchAdapterData.copy(mediatedPrefetchNetworkWinner, mediatedPrefetchRevenue, str);
    }

    @NotNull
    public final MediatedPrefetchNetworkWinner component1() {
        return this.f20764a;
    }

    @NotNull
    public final MediatedPrefetchRevenue component2() {
        return this.f20765b;
    }

    @NotNull
    public final String component3() {
        return this.f20766c;
    }

    @NotNull
    public final MediatedPrefetchAdapterData copy(@NotNull MediatedPrefetchNetworkWinner networkWinner, @NotNull MediatedPrefetchRevenue revenue, @NotNull String networkAdInfo) {
        Intrinsics.checkNotNullParameter(networkWinner, "networkWinner");
        Intrinsics.checkNotNullParameter(revenue, "revenue");
        Intrinsics.checkNotNullParameter(networkAdInfo, "networkAdInfo");
        return new MediatedPrefetchAdapterData(networkWinner, revenue, networkAdInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediatedPrefetchAdapterData)) {
            return false;
        }
        MediatedPrefetchAdapterData mediatedPrefetchAdapterData = (MediatedPrefetchAdapterData) obj;
        return Intrinsics.areEqual(this.f20764a, mediatedPrefetchAdapterData.f20764a) && Intrinsics.areEqual(this.f20765b, mediatedPrefetchAdapterData.f20765b) && Intrinsics.areEqual(this.f20766c, mediatedPrefetchAdapterData.f20766c);
    }

    @NotNull
    public final String getNetworkAdInfo() {
        return this.f20766c;
    }

    @NotNull
    public final MediatedPrefetchNetworkWinner getNetworkWinner() {
        return this.f20764a;
    }

    @NotNull
    public final MediatedPrefetchRevenue getRevenue() {
        return this.f20765b;
    }

    public int hashCode() {
        return this.f20766c.hashCode() + ((this.f20765b.hashCode() + (this.f20764a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "MediatedPrefetchAdapterData(networkWinner=" + this.f20764a + ", revenue=" + this.f20765b + ", networkAdInfo=" + this.f20766c + ")";
    }
}
