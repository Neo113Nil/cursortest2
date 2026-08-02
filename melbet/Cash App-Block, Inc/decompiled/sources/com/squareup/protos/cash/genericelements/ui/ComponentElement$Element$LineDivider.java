package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$LineDivider extends TransformationsKt {
    public final LineDividerComponent value;

    public ComponentElement$Element$LineDivider(LineDividerComponent lineDividerComponent) {
        lineDividerComponent.getClass();
        this.value = lineDividerComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$LineDivider) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$LineDivider) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LineDivider(value=" + this.value + ")";
    }
}
