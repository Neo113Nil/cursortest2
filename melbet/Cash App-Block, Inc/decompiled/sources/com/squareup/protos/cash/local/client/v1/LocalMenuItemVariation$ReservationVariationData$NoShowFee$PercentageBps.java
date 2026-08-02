package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zziu;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class LocalMenuItemVariation$ReservationVariationData$NoShowFee$PercentageBps extends zziu {
    public final int value;

    public LocalMenuItemVariation$ReservationVariationData$NoShowFee$PercentageBps(int i) {
        this.value = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalMenuItemVariation$ReservationVariationData$NoShowFee$PercentageBps) && this.value == ((LocalMenuItemVariation$ReservationVariationData$NoShowFee$PercentageBps) obj).value;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value, "PercentageBps(value=", ")");
    }
}
