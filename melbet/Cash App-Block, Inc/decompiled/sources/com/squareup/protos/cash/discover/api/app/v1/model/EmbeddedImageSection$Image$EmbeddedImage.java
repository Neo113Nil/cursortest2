package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.Image_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EmbeddedImageSection$Image$EmbeddedImage extends Image_androidKt {
    public final EmbeddedImage value;

    public EmbeddedImageSection$Image$EmbeddedImage(EmbeddedImage embeddedImage) {
        embeddedImage.getClass();
        this.value = embeddedImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmbeddedImageSection$Image$EmbeddedImage) && Intrinsics.areEqual(this.value, ((EmbeddedImageSection$Image$EmbeddedImage) obj).value);
    }

    public final EmbeddedImage getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EmbeddedImage(value=" + this.value + ")";
    }
}
