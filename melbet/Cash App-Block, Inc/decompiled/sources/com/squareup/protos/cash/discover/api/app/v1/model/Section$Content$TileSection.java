package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.Uri_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Section$Content$TileSection extends Uri_androidKt {
    public final TileSection value;

    public Section$Content$TileSection(TileSection tileSection) {
        tileSection.getClass();
        this.value = tileSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Section$Content$TileSection) && Intrinsics.areEqual(this.value, ((Section$Content$TileSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TileSection(value=" + this.value + ")";
    }
}
