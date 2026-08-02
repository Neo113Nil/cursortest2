package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$Progress extends ViewTargetRequestManagerKt {
    public final ProgressMeterElement value;

    public BaseElement$Element$Progress(ProgressMeterElement progressMeterElement) {
        progressMeterElement.getClass();
        this.value = progressMeterElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$Progress) && Intrinsics.areEqual(this.value, ((BaseElement$Element$Progress) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Progress(value=" + this.value + ")";
    }
}
