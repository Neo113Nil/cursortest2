package com.squareup.protos.cash.cashface.ui;

import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ButtonElement$Style$Tertiary {
    public final GenericProfileElement.ButtonElement.TertiaryStyle value;

    public GenericProfileElement$ButtonElement$Style$Tertiary(GenericProfileElement.ButtonElement.TertiaryStyle tertiaryStyle) {
        tertiaryStyle.getClass();
        this.value = tertiaryStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$ButtonElement$Style$Tertiary) && Intrinsics.areEqual(this.value, ((GenericProfileElement$ButtonElement$Style$Tertiary) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Tertiary(value=" + this.value + ")";
    }
}
