package com.squareup.protos.cash.genericelements.ui;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import coil3.svg.internal.Utils_androidKt;

/* loaded from: classes7.dex */
public final class CellDefaultComponent$AccessoryType$Push extends Utils_androidKt {
    public final boolean value;

    public CellDefaultComponent$AccessoryType$Push(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CellDefaultComponent$AccessoryType$Push) && this.value == ((CellDefaultComponent$AccessoryType$Push) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("Push(value=", ")", this.value);
    }
}
