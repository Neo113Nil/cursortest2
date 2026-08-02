package com.squareup.protos.cash.genericelements.ui;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import coil3.size.ViewSizeResolverKt;

/* loaded from: classes7.dex */
public final class CellActivityComponent$AccessoryType$Push extends ViewSizeResolverKt {
    public final boolean value;

    public CellActivityComponent$AccessoryType$Push(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CellActivityComponent$AccessoryType$Push) && this.value == ((CellActivityComponent$AccessoryType$Push) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("Push(value=", ")", this.value);
    }
}
