package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class OfferSheet$Sheet$MultiSheet extends zzkw {
    public final MultiOffersSheet value;

    public OfferSheet$Sheet$MultiSheet(MultiOffersSheet multiOffersSheet) {
        multiOffersSheet.getClass();
        this.value = multiOffersSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OfferSheet$Sheet$MultiSheet) && Intrinsics.areEqual(this.value, ((OfferSheet$Sheet$MultiSheet) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MultiSheet(value=" + this.value + ")";
    }
}
