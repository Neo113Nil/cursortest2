package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$CellActivity extends TransformationsKt {
    public final CellActivityComponent value;

    public ComponentElement$Element$CellActivity(CellActivityComponent cellActivityComponent) {
        cellActivityComponent.getClass();
        this.value = cellActivityComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$CellActivity) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$CellActivity) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CellActivity(value=" + this.value + ")";
    }
}
