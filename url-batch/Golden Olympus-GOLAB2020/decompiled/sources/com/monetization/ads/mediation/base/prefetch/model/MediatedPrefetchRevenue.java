package com.monetization.ads.mediation.base.prefetch.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class MediatedPrefetchRevenue {

    /* renamed from: a, reason: collision with root package name */
    private final double f20769a;

    public MediatedPrefetchRevenue(double d4) {
        this.f20769a = d4;
    }

    public static /* synthetic */ MediatedPrefetchRevenue copy$default(MediatedPrefetchRevenue mediatedPrefetchRevenue, double d4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            d4 = mediatedPrefetchRevenue.f20769a;
        }
        return mediatedPrefetchRevenue.copy(d4);
    }

    public final double component1() {
        return this.f20769a;
    }

    @NotNull
    public final MediatedPrefetchRevenue copy(double d4) {
        return new MediatedPrefetchRevenue(d4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MediatedPrefetchRevenue) && Double.compare(this.f20769a, ((MediatedPrefetchRevenue) obj).f20769a) == 0;
    }

    public final double getValue() {
        return this.f20769a;
    }

    public int hashCode() {
        return Double.hashCode(this.f20769a);
    }

    @NotNull
    public String toString() {
        return "MediatedPrefetchRevenue(value=" + this.f20769a + ")";
    }
}
