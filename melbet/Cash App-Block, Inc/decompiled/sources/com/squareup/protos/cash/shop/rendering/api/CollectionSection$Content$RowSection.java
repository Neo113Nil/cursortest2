package com.squareup.protos.cash.shop.rendering.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CollectionSection$Content$RowSection {
    public final RowSection value;

    public CollectionSection$Content$RowSection(RowSection rowSection) {
        rowSection.getClass();
        this.value = rowSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectionSection$Content$RowSection) && Intrinsics.areEqual(this.value, ((CollectionSection$Content$RowSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RowSection(value=" + this.value + ")";
    }
}
