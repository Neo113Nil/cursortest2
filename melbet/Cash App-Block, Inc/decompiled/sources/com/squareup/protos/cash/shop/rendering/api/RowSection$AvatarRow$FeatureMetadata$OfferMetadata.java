package com.squareup.protos.cash.shop.rendering.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RowSection$AvatarRow$FeatureMetadata$OfferMetadata {
    public final OfferMetadata value;

    public RowSection$AvatarRow$FeatureMetadata$OfferMetadata(OfferMetadata offerMetadata) {
        offerMetadata.getClass();
        this.value = offerMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RowSection$AvatarRow$FeatureMetadata$OfferMetadata) && Intrinsics.areEqual(this.value, ((RowSection$AvatarRow$FeatureMetadata$OfferMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OfferMetadata(value=" + this.value + ")";
    }
}
