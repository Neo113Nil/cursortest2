package com.squareup.protos.cash.genericelements.ui;

import coil3.util.BitmapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContainerElement$Container$Card extends BitmapsKt {
    public final CardSeriesContainer value;

    public ContainerElement$Container$Card(CardSeriesContainer cardSeriesContainer) {
        cardSeriesContainer.getClass();
        this.value = cardSeriesContainer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContainerElement$Container$Card) && Intrinsics.areEqual(this.value, ((ContainerElement$Container$Card) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Card(value=" + this.value + ")";
    }
}
