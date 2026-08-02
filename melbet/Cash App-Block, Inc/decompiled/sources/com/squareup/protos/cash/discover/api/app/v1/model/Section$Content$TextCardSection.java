package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.Uri_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Section$Content$TextCardSection extends Uri_androidKt {
    public final TextCardSection value;

    public Section$Content$TextCardSection(TextCardSection textCardSection) {
        textCardSection.getClass();
        this.value = textCardSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Section$Content$TextCardSection) && Intrinsics.areEqual(this.value, ((Section$Content$TextCardSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextCardSection(value=" + this.value + ")";
    }
}
