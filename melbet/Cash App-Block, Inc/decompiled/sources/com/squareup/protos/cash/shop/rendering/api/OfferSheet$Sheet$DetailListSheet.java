package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class OfferSheet$Sheet$DetailListSheet extends zzkw {
    public final OfferDetailListSheet value;

    public OfferSheet$Sheet$DetailListSheet(OfferDetailListSheet offerDetailListSheet) {
        offerDetailListSheet.getClass();
        this.value = offerDetailListSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OfferSheet$Sheet$DetailListSheet) && Intrinsics.areEqual(this.value, ((OfferSheet$Sheet$DetailListSheet) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DetailListSheet(value=" + this.value + ")";
    }
}
