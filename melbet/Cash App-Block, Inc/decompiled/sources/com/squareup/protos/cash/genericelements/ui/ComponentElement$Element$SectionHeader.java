package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$SectionHeader extends TransformationsKt {
    public final SectionHeaderComponent value;

    public ComponentElement$Element$SectionHeader(SectionHeaderComponent sectionHeaderComponent) {
        sectionHeaderComponent.getClass();
        this.value = sectionHeaderComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$SectionHeader) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$SectionHeader) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SectionHeader(value=" + this.value + ")";
    }
}
