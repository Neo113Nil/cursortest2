package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$TwoColumnRow extends TransformationsKt {
    public final TwoColumnRowComponent value;

    public ComponentElement$Element$TwoColumnRow(TwoColumnRowComponent twoColumnRowComponent) {
        twoColumnRowComponent.getClass();
        this.value = twoColumnRowComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$TwoColumnRow) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$TwoColumnRow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TwoColumnRow(value=" + this.value + ")";
    }
}
