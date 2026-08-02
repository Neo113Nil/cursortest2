package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.Image_androidKt;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EmbeddedImageSection$Image$Picture extends Image_androidKt {
    public final Image value;

    public EmbeddedImageSection$Image$Picture(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmbeddedImageSection$Image$Picture) && Intrinsics.areEqual(this.value, ((EmbeddedImageSection$Image$Picture) obj).value);
    }

    public final Image getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Picture(value=", ")");
    }
}
