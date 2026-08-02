package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$PillTextElement extends ViewTargetRequestManagerKt {
    public final PillTextElement value;

    public BaseElement$Element$PillTextElement(PillTextElement pillTextElement) {
        pillTextElement.getClass();
        this.value = pillTextElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$PillTextElement) && Intrinsics.areEqual(this.value, ((BaseElement$Element$PillTextElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PillTextElement(value=" + this.value + ")";
    }
}
