package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$ArcadeText extends ViewTargetRequestManagerKt {
    public final ArcadeTextElement value;

    public BaseElement$Element$ArcadeText(ArcadeTextElement arcadeTextElement) {
        arcadeTextElement.getClass();
        this.value = arcadeTextElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$ArcadeText) && Intrinsics.areEqual(this.value, ((BaseElement$Element$ArcadeText) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ArcadeText(value=" + this.value + ")";
    }
}
