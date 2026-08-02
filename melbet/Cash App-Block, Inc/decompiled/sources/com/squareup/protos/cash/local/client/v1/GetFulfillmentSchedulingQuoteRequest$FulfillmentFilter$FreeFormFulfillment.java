package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.monitor.StorageEvent;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$FreeFormFulfillment extends StorageEvent {
    public final GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter value;

    public GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$FreeFormFulfillment(GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter freeFormFulfillmentFilter) {
        freeFormFulfillmentFilter.getClass();
        this.value = freeFormFulfillmentFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$FreeFormFulfillment) && Intrinsics.areEqual(this.value, ((GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$FreeFormFulfillment) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FreeFormFulfillment(value=" + this.value + ")";
    }
}
