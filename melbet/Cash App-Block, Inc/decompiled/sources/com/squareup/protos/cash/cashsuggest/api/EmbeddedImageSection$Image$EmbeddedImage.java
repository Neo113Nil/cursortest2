package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.treehouse.EventListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EmbeddedImageSection$Image$EmbeddedImage extends EventListener {
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

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EmbeddedImage(value=" + this.value + ")";
    }
}
