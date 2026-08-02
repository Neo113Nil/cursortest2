package com.squareup.protos.cash.weaver.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata {
    public final PromoterMessagingMetadata value;

    public GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata(PromoterMessagingMetadata promoterMessagingMetadata) {
        promoterMessagingMetadata.getClass();
        this.value = promoterMessagingMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata) && Intrinsics.areEqual(this.value, ((GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata) obj).value);
    }

    public final PromoterMessagingMetadata getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PromoterMessagingMetadata(value=" + this.value + ")";
    }
}
