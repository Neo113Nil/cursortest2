package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$CopyCode extends ViewTargetRequestManagerKt {
    public final CopyCodeElement value;

    public BaseElement$Element$CopyCode(CopyCodeElement copyCodeElement) {
        copyCodeElement.getClass();
        this.value = copyCodeElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$CopyCode) && Intrinsics.areEqual(this.value, ((BaseElement$Element$CopyCode) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CopyCode(value=" + this.value + ")";
    }
}
