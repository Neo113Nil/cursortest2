package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzld;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SearchSection$Content$TileSection extends zzld {
    public final CategoryTileSection value;

    public SearchSection$Content$TileSection(CategoryTileSection categoryTileSection) {
        categoryTileSection.getClass();
        this.value = categoryTileSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSection$Content$TileSection) && Intrinsics.areEqual(this.value, ((SearchSection$Content$TileSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TileSection(value=" + this.value + ")";
    }
}
