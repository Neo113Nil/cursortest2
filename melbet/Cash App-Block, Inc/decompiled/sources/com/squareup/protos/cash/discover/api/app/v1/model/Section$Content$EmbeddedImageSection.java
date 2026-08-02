package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.Uri_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Section$Content$EmbeddedImageSection extends Uri_androidKt {
    public final EmbeddedImageSection value;

    public Section$Content$EmbeddedImageSection(EmbeddedImageSection embeddedImageSection) {
        embeddedImageSection.getClass();
        this.value = embeddedImageSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Section$Content$EmbeddedImageSection) && Intrinsics.areEqual(this.value, ((Section$Content$EmbeddedImageSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EmbeddedImageSection(value=" + this.value + ")";
    }
}
