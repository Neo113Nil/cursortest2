package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$ColumnedRow extends TransformationsKt {
    public final TwoColumnComponent value;

    public ComponentElement$Element$ColumnedRow(TwoColumnComponent twoColumnComponent) {
        twoColumnComponent.getClass();
        this.value = twoColumnComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$ColumnedRow) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$ColumnedRow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ColumnedRow(value=" + this.value + ")";
    }
}
