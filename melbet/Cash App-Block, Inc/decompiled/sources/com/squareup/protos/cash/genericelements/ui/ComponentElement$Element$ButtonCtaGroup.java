package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$ButtonCtaGroup extends TransformationsKt {
    public final ButtonCtaGroupComponent value;

    public ComponentElement$Element$ButtonCtaGroup(ButtonCtaGroupComponent buttonCtaGroupComponent) {
        buttonCtaGroupComponent.getClass();
        this.value = buttonCtaGroupComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$ButtonCtaGroup) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$ButtonCtaGroup) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ButtonCtaGroup(value=" + this.value + ")";
    }
}
