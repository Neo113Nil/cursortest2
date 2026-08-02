package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$Image extends ViewTargetRequestManagerKt {
    public final ImageElement value;

    public BaseElement$Element$Image(ImageElement imageElement) {
        imageElement.getClass();
        this.value = imageElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$Image) && Intrinsics.areEqual(this.value, ((BaseElement$Element$Image) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.value + ")";
    }
}
