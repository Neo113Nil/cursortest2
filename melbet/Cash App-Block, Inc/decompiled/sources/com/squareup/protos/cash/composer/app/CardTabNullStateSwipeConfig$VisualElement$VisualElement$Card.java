package com.squareup.protos.cash.composer.app;

import app.cash.versioned.VersionedKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card extends VersionedKt {
    public final Card value;

    public CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card(Card card) {
        card.getClass();
        this.value = card;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card) && Intrinsics.areEqual(this.value, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Card(value=" + this.value + ")";
    }
}
