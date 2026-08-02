package com.squareup.cash.ui.widget.amount;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class ComputedLayout {
    public final ArrayList digits;
    public final float scale;

    public ComputedLayout(ArrayList arrayList, float f) {
        this.digits = arrayList;
        this.scale = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComputedLayout)) {
            return false;
        }
        ComputedLayout computedLayout = (ComputedLayout) obj;
        return this.digits.equals(computedLayout.digits) && Float.compare(this.scale, computedLayout.scale) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.scale) + (this.digits.hashCode() * 31);
    }

    public final String toString() {
        return "ComputedLayout(digits=" + this.digits + ", scale=" + this.scale + ")";
    }
}
