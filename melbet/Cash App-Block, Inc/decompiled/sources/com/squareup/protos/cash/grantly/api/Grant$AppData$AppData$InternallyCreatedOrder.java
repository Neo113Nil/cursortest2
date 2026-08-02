package com.squareup.protos.cash.grantly.api;

import com.android.volley.toolbox.NetworkUtility;
import com.squareup.protos.cash.orderly.app_data.InternallyCreatedOrder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Grant$AppData$AppData$InternallyCreatedOrder extends NetworkUtility {
    public final InternallyCreatedOrder value;

    public Grant$AppData$AppData$InternallyCreatedOrder(InternallyCreatedOrder internallyCreatedOrder) {
        internallyCreatedOrder.getClass();
        this.value = internallyCreatedOrder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Grant$AppData$AppData$InternallyCreatedOrder) && Intrinsics.areEqual(this.value, ((Grant$AppData$AppData$InternallyCreatedOrder) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InternallyCreatedOrder(value=" + this.value + ")";
    }
}
