package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.monitor.StorageEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment extends StorageEvent {
    public final LocalFulfillment value;

    public GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment(LocalFulfillment localFulfillment) {
        localFulfillment.getClass();
        this.value = localFulfillment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment) && Intrinsics.areEqual(this.value, ((GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CartFulfillment(value=" + this.value + ")";
    }
}
