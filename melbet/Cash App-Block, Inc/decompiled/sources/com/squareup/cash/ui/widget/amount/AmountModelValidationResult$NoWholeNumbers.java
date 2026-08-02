package com.squareup.cash.ui.widget.amount;

import androidx.room.util.CursorUtil;

/* loaded from: classes7.dex */
public final class AmountModelValidationResult$NoWholeNumbers extends CursorUtil {
    public static final AmountModelValidationResult$NoWholeNumbers INSTANCE = new AmountModelValidationResult$NoWholeNumbers();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AmountModelValidationResult$NoWholeNumbers);
    }

    public final int hashCode() {
        return -868082993;
    }

    public final String toString() {
        return "NoWholeNumbers";
    }
}
