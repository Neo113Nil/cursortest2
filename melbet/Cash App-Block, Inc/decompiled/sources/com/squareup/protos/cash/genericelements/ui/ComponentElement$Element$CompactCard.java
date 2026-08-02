package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$CompactCard extends TransformationsKt {
    public final CompactCardComponent value;

    public ComponentElement$Element$CompactCard(CompactCardComponent compactCardComponent) {
        compactCardComponent.getClass();
        this.value = compactCardComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$CompactCard) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$CompactCard) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CompactCard(value=" + this.value + ")";
    }
}
