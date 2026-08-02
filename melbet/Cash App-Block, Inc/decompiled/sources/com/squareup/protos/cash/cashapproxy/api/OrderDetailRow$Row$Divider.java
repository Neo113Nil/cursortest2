package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.LocalMoneyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class OrderDetailRow$Row$Divider extends LocalMoneyKt {
    public final Divider value;

    public OrderDetailRow$Row$Divider(Divider divider) {
        divider.getClass();
        this.value = divider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderDetailRow$Row$Divider) && Intrinsics.areEqual(this.value, ((OrderDetailRow$Row$Divider) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Divider(value=" + this.value + ")";
    }
}
