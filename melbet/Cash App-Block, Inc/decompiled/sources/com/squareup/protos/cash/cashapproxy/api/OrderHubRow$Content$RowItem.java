package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.LocationMenuKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class OrderHubRow$Content$RowItem extends LocationMenuKt {
    public final AfterpayHubRowItem value;

    public OrderHubRow$Content$RowItem(AfterpayHubRowItem afterpayHubRowItem) {
        afterpayHubRowItem.getClass();
        this.value = afterpayHubRowItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderHubRow$Content$RowItem) && Intrinsics.areEqual(this.value, ((OrderHubRow$Content$RowItem) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RowItem(value=" + this.value + ")";
    }
}
