package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RowSection$Row$Type$OfferRow extends zzlc {
    public final RowSection.OfferRow value;

    public RowSection$Row$Type$OfferRow(RowSection.OfferRow offerRow) {
        offerRow.getClass();
        this.value = offerRow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RowSection$Row$Type$OfferRow) && Intrinsics.areEqual(this.value, ((RowSection$Row$Type$OfferRow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OfferRow(value=" + this.value + ")";
    }
}
