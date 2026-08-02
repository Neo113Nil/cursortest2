package com.squareup.protos.cash.shop.rendering.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RowSection$AvatarRow$Cta$Btn {
    public final Button value;

    public RowSection$AvatarRow$Cta$Btn(Button button) {
        button.getClass();
        this.value = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RowSection$AvatarRow$Cta$Btn) && Intrinsics.areEqual(this.value, ((RowSection$AvatarRow$Cta$Btn) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Btn(value=" + this.value + ")";
    }
}
