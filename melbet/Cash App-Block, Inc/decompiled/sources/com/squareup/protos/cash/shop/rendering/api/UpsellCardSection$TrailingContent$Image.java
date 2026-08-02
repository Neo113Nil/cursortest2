package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class UpsellCardSection$TrailingContent$Image extends zzlg {
    public final Image value;

    public UpsellCardSection$TrailingContent$Image(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpsellCardSection$TrailingContent$Image) && Intrinsics.areEqual(this.value, ((UpsellCardSection$TrailingContent$Image) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Image(value=", ")");
    }
}
