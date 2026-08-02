package com.squareup.protos.cash.local.client.app.v1.card;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalCard$TypeDetails$BrandCardDetails {
    public final BrandCardDetails value;

    public LocalCard$TypeDetails$BrandCardDetails(BrandCardDetails brandCardDetails) {
        brandCardDetails.getClass();
        this.value = brandCardDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalCard$TypeDetails$BrandCardDetails) && Intrinsics.areEqual(this.value, ((LocalCard$TypeDetails$BrandCardDetails) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BrandCardDetails(value=" + this.value + ")";
    }
}
