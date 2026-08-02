package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.Uri_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Section$Content$PlaceholderSection extends Uri_androidKt {
    public final PlaceholderSection value;

    public Section$Content$PlaceholderSection(PlaceholderSection placeholderSection) {
        placeholderSection.getClass();
        this.value = placeholderSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Section$Content$PlaceholderSection) && Intrinsics.areEqual(this.value, ((Section$Content$PlaceholderSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PlaceholderSection(value=" + this.value + ")";
    }
}
