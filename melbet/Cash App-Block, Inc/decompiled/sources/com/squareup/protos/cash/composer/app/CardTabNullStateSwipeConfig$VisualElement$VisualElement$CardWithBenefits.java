package com.squareup.protos.cash.composer.app;

import app.cash.versioned.VersionedKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits extends VersionedKt {
    public final CardWithBenefits value;

    public CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits(CardWithBenefits cardWithBenefits) {
        cardWithBenefits.getClass();
        this.value = cardWithBenefits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits) && Intrinsics.areEqual(this.value, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CardWithBenefits(value=" + this.value + ")";
    }
}
