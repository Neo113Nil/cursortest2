package com.squareup.protos.cash.cashsuggest.api;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppletCardSection$Content$TileCarousel extends zzuv {
    public final AppletCardSection.TileCarousel value;

    public AppletCardSection$Content$TileCarousel(AppletCardSection.TileCarousel tileCarousel) {
        tileCarousel.getClass();
        this.value = tileCarousel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppletCardSection$Content$TileCarousel) && Intrinsics.areEqual(this.value, ((AppletCardSection$Content$TileCarousel) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TileCarousel(value=" + this.value + ")";
    }
}
