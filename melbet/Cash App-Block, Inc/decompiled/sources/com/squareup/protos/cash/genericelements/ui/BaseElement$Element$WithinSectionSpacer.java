package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$WithinSectionSpacer extends ViewTargetRequestManagerKt {
    public final WithinSectionSpacer value;

    public BaseElement$Element$WithinSectionSpacer(WithinSectionSpacer withinSectionSpacer) {
        withinSectionSpacer.getClass();
        this.value = withinSectionSpacer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$WithinSectionSpacer) && Intrinsics.areEqual(this.value, ((BaseElement$Element$WithinSectionSpacer) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "WithinSectionSpacer(value=" + this.value + ")";
    }
}
