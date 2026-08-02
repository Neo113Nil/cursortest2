package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$DetailedCard extends TransformationsKt {
    public final DetailedCardComponent value;

    public ComponentElement$Element$DetailedCard(DetailedCardComponent detailedCardComponent) {
        detailedCardComponent.getClass();
        this.value = detailedCardComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$DetailedCard) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$DetailedCard) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DetailedCard(value=" + this.value + ")";
    }
}
