package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$TwoColumnCard extends TransformationsKt {
    public final TwoColumnCardComponent value;

    public ComponentElement$Element$TwoColumnCard(TwoColumnCardComponent twoColumnCardComponent) {
        twoColumnCardComponent.getClass();
        this.value = twoColumnCardComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$TwoColumnCard) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$TwoColumnCard) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TwoColumnCard(value=" + this.value + ")";
    }
}
