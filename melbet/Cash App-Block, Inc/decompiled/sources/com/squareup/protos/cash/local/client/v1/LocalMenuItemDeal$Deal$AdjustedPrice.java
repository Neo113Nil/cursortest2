package com.squareup.protos.cash.local.client.v1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalMenuItemDeal$Deal$AdjustedPrice {
    public final LocalMenuItemDealAdjustedPrice value;

    public LocalMenuItemDeal$Deal$AdjustedPrice(LocalMenuItemDealAdjustedPrice localMenuItemDealAdjustedPrice) {
        localMenuItemDealAdjustedPrice.getClass();
        this.value = localMenuItemDealAdjustedPrice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalMenuItemDeal$Deal$AdjustedPrice) && Intrinsics.areEqual(this.value, ((LocalMenuItemDeal$Deal$AdjustedPrice) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AdjustedPrice(value=" + this.value + ")";
    }
}
