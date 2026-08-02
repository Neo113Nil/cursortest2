package com.squareup.protos.cash.genericelements.ui;

import coil3.util.BitmapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContainerElement$Container$Series extends BitmapsKt {
    public final SeriesContainer value;

    public ContainerElement$Container$Series(SeriesContainer seriesContainer) {
        seriesContainer.getClass();
        this.value = seriesContainer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContainerElement$Container$Series) && Intrinsics.areEqual(this.value, ((ContainerElement$Container$Series) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Series(value=" + this.value + ")";
    }
}
