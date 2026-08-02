package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$IconTextElement extends ViewTargetRequestManagerKt {
    public final IconTextDetailElement value;

    public BaseElement$Element$IconTextElement(IconTextDetailElement iconTextDetailElement) {
        iconTextDetailElement.getClass();
        this.value = iconTextDetailElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$IconTextElement) && Intrinsics.areEqual(this.value, ((BaseElement$Element$IconTextElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "IconTextElement(value=" + this.value + ")";
    }
}
