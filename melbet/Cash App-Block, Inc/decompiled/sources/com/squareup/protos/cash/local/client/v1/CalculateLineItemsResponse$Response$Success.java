package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.internal.thread.ThreadExtKt;
import com.squareup.protos.cash.local.client.v1.CalculateLineItemsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CalculateLineItemsResponse$Response$Success extends ThreadExtKt {
    public final CalculateLineItemsResponse.Success value;

    public CalculateLineItemsResponse$Response$Success(CalculateLineItemsResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CalculateLineItemsResponse$Response$Success) && Intrinsics.areEqual(this.value, ((CalculateLineItemsResponse$Response$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
