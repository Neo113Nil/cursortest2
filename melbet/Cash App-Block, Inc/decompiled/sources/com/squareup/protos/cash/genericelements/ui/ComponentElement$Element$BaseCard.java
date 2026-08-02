package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$BaseCard extends TransformationsKt {
    public final BaseCardComponent value;

    public ComponentElement$Element$BaseCard(BaseCardComponent baseCardComponent) {
        baseCardComponent.getClass();
        this.value = baseCardComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$BaseCard) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$BaseCard) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BaseCard(value=" + this.value + ")";
    }
}
