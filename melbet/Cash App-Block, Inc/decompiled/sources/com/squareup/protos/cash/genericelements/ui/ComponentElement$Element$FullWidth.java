package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$FullWidth extends TransformationsKt {
    public final FullWidthComponent value;

    public ComponentElement$Element$FullWidth(FullWidthComponent fullWidthComponent) {
        fullWidthComponent.getClass();
        this.value = fullWidthComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$FullWidth) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$FullWidth) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FullWidth(value=" + this.value + ")";
    }
}
