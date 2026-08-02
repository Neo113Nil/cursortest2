package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$ValueUnit extends TransformationsKt {
    public final ValueUnitComponent value;

    public ComponentElement$Element$ValueUnit(ValueUnitComponent valueUnitComponent) {
        valueUnitComponent.getClass();
        this.value = valueUnitComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$ValueUnit) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$ValueUnit) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ValueUnit(value=" + this.value + ")";
    }
}
