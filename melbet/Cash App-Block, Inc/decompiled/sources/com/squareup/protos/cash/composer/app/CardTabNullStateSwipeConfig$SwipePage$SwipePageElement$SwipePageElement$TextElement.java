package com.squareup.protos.cash.composer.app;

import app.cash.trifle.delegates.EndEntity$Factory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement extends EndEntity$Factory {
    public final TextElement value;

    public CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement(TextElement textElement) {
        textElement.getClass();
        this.value = textElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement) && Intrinsics.areEqual(this.value, ((CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextElement(value=" + this.value + ")";
    }
}
