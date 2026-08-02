package com.squareup.protos.cash.composer.app;

import app.cash.versioned.VersionedKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts extends VersionedKt {
    public final CardWithBoosts value;

    public CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts(CardWithBoosts cardWithBoosts) {
        cardWithBoosts.getClass();
        this.value = cardWithBoosts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts) && Intrinsics.areEqual(this.value, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CardWithBoosts(value=" + this.value + ")";
    }
}
