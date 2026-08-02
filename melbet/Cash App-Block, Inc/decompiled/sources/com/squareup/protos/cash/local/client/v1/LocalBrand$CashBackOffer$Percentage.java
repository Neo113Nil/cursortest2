package com.squareup.protos.cash.local.client.v1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalBrand$CashBackOffer$Percentage {
    public final LocalCashBackOfferPercentage value;

    public LocalBrand$CashBackOffer$Percentage(LocalCashBackOfferPercentage localCashBackOfferPercentage) {
        localCashBackOfferPercentage.getClass();
        this.value = localCashBackOfferPercentage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalBrand$CashBackOffer$Percentage) && Intrinsics.areEqual(this.value, ((LocalBrand$CashBackOffer$Percentage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Percentage(value=" + this.value + ")";
    }
}
