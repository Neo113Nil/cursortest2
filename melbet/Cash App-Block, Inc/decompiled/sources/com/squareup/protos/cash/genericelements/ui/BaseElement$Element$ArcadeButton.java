package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$ArcadeButton extends ViewTargetRequestManagerKt {
    public final ArcadeButtonElement value;

    public BaseElement$Element$ArcadeButton(ArcadeButtonElement arcadeButtonElement) {
        arcadeButtonElement.getClass();
        this.value = arcadeButtonElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$ArcadeButton) && Intrinsics.areEqual(this.value, ((BaseElement$Element$ArcadeButton) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ArcadeButton(value=" + this.value + ")";
    }
}
