package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zziu;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalMenuItemVariation$ReservationVariationData$NoShowFee$Amount extends zziu {
    public final LocalMoney value;

    public LocalMenuItemVariation$ReservationVariationData$NoShowFee$Amount(LocalMoney localMoney) {
        localMoney.getClass();
        this.value = localMoney;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalMenuItemVariation$ReservationVariationData$NoShowFee$Amount) && Intrinsics.areEqual(this.value, ((LocalMenuItemVariation$ReservationVariationData$NoShowFee$Amount) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Amount(value=" + this.value + ")";
    }
}
