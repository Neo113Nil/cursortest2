package com.squareup.protos.cash.genericelements.ui;

import coil3.transform.TransformationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComponentElement$Element$ListUnordered extends TransformationsKt {
    public final ListUnorderedComponent value;

    public ComponentElement$Element$ListUnordered(ListUnorderedComponent listUnorderedComponent) {
        listUnorderedComponent.getClass();
        this.value = listUnorderedComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentElement$Element$ListUnordered) && Intrinsics.areEqual(this.value, ((ComponentElement$Element$ListUnordered) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ListUnordered(value=" + this.value + ")";
    }
}
