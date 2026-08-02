package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$BlankDivider extends TransformationsKt {
    public final BlankDividerComponent value;

    public ComponentElement$Element$BlankDivider(BlankDividerComponent blankDividerComponent) {
        blankDividerComponent.getClass();
        this.value = blankDividerComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$BlankDivider) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$BlankDivider) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BlankDivider(value=" + this.value + ")";
    }
}
