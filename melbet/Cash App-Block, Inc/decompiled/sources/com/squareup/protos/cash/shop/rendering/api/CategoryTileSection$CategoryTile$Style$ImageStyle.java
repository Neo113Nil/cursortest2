package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CategoryTileSection$CategoryTile$Style$ImageStyle extends zzkq {
    public final CategoryTileSection.CategoryTile.ImageStyle value;

    public CategoryTileSection$CategoryTile$Style$ImageStyle(CategoryTileSection.CategoryTile.ImageStyle imageStyle) {
        imageStyle.getClass();
        this.value = imageStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoryTileSection$CategoryTile$Style$ImageStyle) && Intrinsics.areEqual(this.value, ((CategoryTileSection$CategoryTile$Style$ImageStyle) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ImageStyle(value=" + this.value + ")";
    }
}
