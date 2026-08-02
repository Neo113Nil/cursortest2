package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.LocalMoneyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class OrderDetailRow$Row$OrderDetailRow extends LocalMoneyKt {
    public final RowItem value;

    public OrderDetailRow$Row$OrderDetailRow(RowItem rowItem) {
        rowItem.getClass();
        this.value = rowItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderDetailRow$Row$OrderDetailRow) && Intrinsics.areEqual(this.value, ((OrderDetailRow$Row$OrderDetailRow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OrderDetailRow(value=" + this.value + ")";
    }
}
