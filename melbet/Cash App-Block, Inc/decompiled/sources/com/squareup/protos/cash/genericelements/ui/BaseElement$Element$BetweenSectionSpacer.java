package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$BetweenSectionSpacer extends ViewTargetRequestManagerKt {
    public final BetweenSectionSpacer value;

    public BaseElement$Element$BetweenSectionSpacer(BetweenSectionSpacer betweenSectionSpacer) {
        betweenSectionSpacer.getClass();
        this.value = betweenSectionSpacer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$BetweenSectionSpacer) && Intrinsics.areEqual(this.value, ((BaseElement$Element$BetweenSectionSpacer) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BetweenSectionSpacer(value=" + this.value + ")";
    }
}
