package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.internal.SignaturePayloadKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Filter$Option$PriceRange extends SignaturePayloadKt {
    public final PriceRange value;

    public Filter$Option$PriceRange(PriceRange priceRange) {
        priceRange.getClass();
        this.value = priceRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Filter$Option$PriceRange) && Intrinsics.areEqual(this.value, ((Filter$Option$PriceRange) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PriceRange(value=" + this.value + ")";
    }
}
