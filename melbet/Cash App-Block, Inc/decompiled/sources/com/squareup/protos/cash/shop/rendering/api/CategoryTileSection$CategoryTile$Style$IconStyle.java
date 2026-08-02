package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CategoryTileSection$CategoryTile$Style$IconStyle extends zzkq {
    public final CategoryTileSection.CategoryTile.IconStyle value;

    public CategoryTileSection$CategoryTile$Style$IconStyle(CategoryTileSection.CategoryTile.IconStyle iconStyle) {
        iconStyle.getClass();
        this.value = iconStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoryTileSection$CategoryTile$Style$IconStyle) && Intrinsics.areEqual(this.value, ((CategoryTileSection$CategoryTile$Style$IconStyle) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "IconStyle(value=" + this.value + ")";
    }
}
