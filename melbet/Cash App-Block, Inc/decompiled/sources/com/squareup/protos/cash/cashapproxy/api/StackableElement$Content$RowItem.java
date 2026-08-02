package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.MarketingMessageDataKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StackableElement$Content$RowItem extends MarketingMessageDataKt {
    public final RowItem value;

    public StackableElement$Content$RowItem(RowItem rowItem) {
        rowItem.getClass();
        this.value = rowItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StackableElement$Content$RowItem) && Intrinsics.areEqual(this.value, ((StackableElement$Content$RowItem) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RowItem(value=" + this.value + ")";
    }
}
