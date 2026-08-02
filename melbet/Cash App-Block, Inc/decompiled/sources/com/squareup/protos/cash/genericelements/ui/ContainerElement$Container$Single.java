package com.squareup.protos.cash.genericelements.ui;

import coil3.util.BitmapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContainerElement$Container$Single extends BitmapsKt {
    public final ComponentElement value;

    public ContainerElement$Container$Single(ComponentElement componentElement) {
        componentElement.getClass();
        this.value = componentElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContainerElement$Container$Single) && Intrinsics.areEqual(this.value, ((ContainerElement$Container$Single) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Single(value=" + this.value + ")";
    }
}
