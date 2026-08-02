package com.squareup.protos.cash.composer.app;

import app.cash.trifle.delegates.EndEntity$Factory;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement extends EndEntity$Factory {
    public final CardTabNullStateSwipeConfig.VisualElement value;

    public CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement(CardTabNullStateSwipeConfig.VisualElement visualElement) {
        visualElement.getClass();
        this.value = visualElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement) && Intrinsics.areEqual(this.value, ((CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VisualElement(value=" + this.value + ")";
    }
}
