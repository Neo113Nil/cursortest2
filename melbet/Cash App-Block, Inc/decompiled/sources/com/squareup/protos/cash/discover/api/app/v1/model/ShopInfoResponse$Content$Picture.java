package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.decode.ImageSourceKt;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShopInfoResponse$Content$Picture extends ImageSourceKt {
    public final Image value;

    public ShopInfoResponse$Content$Picture(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopInfoResponse$Content$Picture) && Intrinsics.areEqual(this.value, ((ShopInfoResponse$Content$Picture) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Picture(value=", ")");
    }
}
