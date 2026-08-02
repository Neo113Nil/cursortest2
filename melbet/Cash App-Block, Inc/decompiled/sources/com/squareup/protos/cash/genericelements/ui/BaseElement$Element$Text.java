package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$Text extends ViewTargetRequestManagerKt {
    public final TextElement value;

    public BaseElement$Element$Text(TextElement textElement) {
        textElement.getClass();
        this.value = textElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$Text) && Intrinsics.areEqual(this.value, ((BaseElement$Element$Text) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Text(value=" + this.value + ")";
    }
}
