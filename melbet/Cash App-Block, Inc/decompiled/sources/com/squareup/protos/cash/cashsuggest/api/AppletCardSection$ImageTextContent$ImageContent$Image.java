package com.squareup.protos.cash.cashsuggest.api;

import com.google.android.gms.internal.mlkit_vision_barcode.zzux;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppletCardSection$ImageTextContent$ImageContent$Image extends zzux {
    public final Image value;

    public AppletCardSection$ImageTextContent$ImageContent$Image(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppletCardSection$ImageTextContent$ImageContent$Image) && Intrinsics.areEqual(this.value, ((AppletCardSection$ImageTextContent$ImageContent$Image) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Image(value=", ")");
    }
}
