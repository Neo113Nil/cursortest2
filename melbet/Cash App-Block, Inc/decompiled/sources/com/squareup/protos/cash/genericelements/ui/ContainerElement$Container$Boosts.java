package com.squareup.protos.cash.genericelements.ui;

import coil3.util.BitmapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContainerElement$Container$Boosts extends BitmapsKt {
    public final BoostCarouselContainer value;

    public ContainerElement$Container$Boosts(BoostCarouselContainer boostCarouselContainer) {
        boostCarouselContainer.getClass();
        this.value = boostCarouselContainer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContainerElement$Container$Boosts) && Intrinsics.areEqual(this.value, ((ContainerElement$Container$Boosts) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Boosts(value=" + this.value + ")";
    }
}
