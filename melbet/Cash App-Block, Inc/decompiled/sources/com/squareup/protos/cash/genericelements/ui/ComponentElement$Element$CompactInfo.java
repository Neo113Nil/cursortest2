package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$CompactInfo extends TransformationsKt {
    public final CompactInfoComponent value;

    public ComponentElement$Element$CompactInfo(CompactInfoComponent compactInfoComponent) {
        compactInfoComponent.getClass();
        this.value = compactInfoComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$CompactInfo) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$CompactInfo) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CompactInfo(value=" + this.value + ")";
    }
}
