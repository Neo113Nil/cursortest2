package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class OfferSheet$Sheet$TimelineSheet extends zzkw {
    public final OfferTimelineSheet value;

    public OfferSheet$Sheet$TimelineSheet(OfferTimelineSheet offerTimelineSheet) {
        offerTimelineSheet.getClass();
        this.value = offerTimelineSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OfferSheet$Sheet$TimelineSheet) && Intrinsics.areEqual(this.value, ((OfferSheet$Sheet$TimelineSheet) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TimelineSheet(value=" + this.value + ")";
    }
}
