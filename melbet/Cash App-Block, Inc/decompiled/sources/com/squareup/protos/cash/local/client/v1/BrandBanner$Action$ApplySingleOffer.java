package com.squareup.protos.cash.local.client.v1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BrandBanner$Action$ApplySingleOffer {
    public final Offer value;

    public BrandBanner$Action$ApplySingleOffer(Offer offer) {
        offer.getClass();
        this.value = offer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrandBanner$Action$ApplySingleOffer) && Intrinsics.areEqual(this.value, ((BrandBanner$Action$ApplySingleOffer) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ApplySingleOffer(value=" + this.value + ")";
    }
}
