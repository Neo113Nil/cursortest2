package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$CellDefault extends TransformationsKt {
    public final CellDefaultComponent value;

    public ComponentElement$Element$CellDefault(CellDefaultComponent cellDefaultComponent) {
        cellDefaultComponent.getClass();
        this.value = cellDefaultComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$CellDefault) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$CellDefault) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CellDefault(value=" + this.value + ")";
    }
}
