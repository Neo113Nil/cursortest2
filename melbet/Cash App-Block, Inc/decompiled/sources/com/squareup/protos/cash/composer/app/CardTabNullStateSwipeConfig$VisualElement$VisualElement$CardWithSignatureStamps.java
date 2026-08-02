package com.squareup.protos.cash.composer.app;

import app.cash.versioned.VersionedKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps extends VersionedKt {
    public final CardWithSignatureStamps value;

    public CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps(CardWithSignatureStamps cardWithSignatureStamps) {
        cardWithSignatureStamps.getClass();
        this.value = cardWithSignatureStamps;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps) && Intrinsics.areEqual(this.value, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CardWithSignatureStamps(value=" + this.value + ")";
    }
}
