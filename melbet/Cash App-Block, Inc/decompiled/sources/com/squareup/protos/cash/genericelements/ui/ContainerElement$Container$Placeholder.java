package com.squareup.protos.cash.genericelements.ui;

import coil3.util.BitmapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContainerElement$Container$Placeholder extends BitmapsKt {
    public final PlaceholderContainer value;

    public ContainerElement$Container$Placeholder(PlaceholderContainer placeholderContainer) {
        placeholderContainer.getClass();
        this.value = placeholderContainer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContainerElement$Container$Placeholder) && Intrinsics.areEqual(this.value, ((ContainerElement$Container$Placeholder) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Placeholder(value=" + this.value + ")";
    }
}
