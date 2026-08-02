package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$BlankDivider extends ViewTargetRequestManagerKt {
    public final BlankDividerElement value;

    public BaseElement$Element$BlankDivider(BlankDividerElement blankDividerElement) {
        blankDividerElement.getClass();
        this.value = blankDividerElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$BlankDivider) && Intrinsics.areEqual(this.value, ((BaseElement$Element$BlankDivider) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BlankDivider(value=" + this.value + ")";
    }
}
