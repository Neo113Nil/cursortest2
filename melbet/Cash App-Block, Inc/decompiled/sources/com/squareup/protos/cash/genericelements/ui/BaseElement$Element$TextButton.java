package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$TextButton extends ViewTargetRequestManagerKt {
    public final Button$TextButtonElement value;

    public BaseElement$Element$TextButton(Button$TextButtonElement button$TextButtonElement) {
        button$TextButtonElement.getClass();
        this.value = button$TextButtonElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$TextButton) && Intrinsics.areEqual(this.value, ((BaseElement$Element$TextButton) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextButton(value=" + this.value + ")";
    }
}
