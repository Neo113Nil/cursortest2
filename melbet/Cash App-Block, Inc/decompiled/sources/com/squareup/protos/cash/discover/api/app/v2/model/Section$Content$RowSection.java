package com.squareup.protos.cash.discover.api.app.v2.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Section$Content$RowSection {
    public final RowSection value;

    public Section$Content$RowSection(RowSection rowSection) {
        rowSection.getClass();
        this.value = rowSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Section$Content$RowSection) && Intrinsics.areEqual(this.value, ((Section$Content$RowSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RowSection(value=" + this.value + ")";
    }
}
