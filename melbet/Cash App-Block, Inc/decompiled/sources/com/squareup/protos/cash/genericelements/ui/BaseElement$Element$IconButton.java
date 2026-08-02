package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$IconButton extends ViewTargetRequestManagerKt {
    public final Button$IconButtonElement value;

    public BaseElement$Element$IconButton(Button$IconButtonElement button$IconButtonElement) {
        button$IconButtonElement.getClass();
        this.value = button$IconButtonElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$IconButton) && Intrinsics.areEqual(this.value, ((BaseElement$Element$IconButton) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "IconButton(value=" + this.value + ")";
    }
}
