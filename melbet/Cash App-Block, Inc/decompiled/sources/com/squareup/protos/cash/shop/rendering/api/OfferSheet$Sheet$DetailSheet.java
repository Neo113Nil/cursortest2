package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class OfferSheet$Sheet$DetailSheet extends zzkw {
    public final OfferDetailSheet value;

    public OfferSheet$Sheet$DetailSheet(OfferDetailSheet offerDetailSheet) {
        offerDetailSheet.getClass();
        this.value = offerDetailSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OfferSheet$Sheet$DetailSheet) && Intrinsics.areEqual(this.value, ((OfferSheet$Sheet$DetailSheet) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DetailSheet(value=" + this.value + ")";
    }
}
