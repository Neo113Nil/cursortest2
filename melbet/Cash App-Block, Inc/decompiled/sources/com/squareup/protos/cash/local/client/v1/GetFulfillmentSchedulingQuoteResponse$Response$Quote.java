package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.utils.RumTagsUtilsKt;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetFulfillmentSchedulingQuoteResponse$Response$Quote extends RumTagsUtilsKt {
    public final GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote value;

    public GetFulfillmentSchedulingQuoteResponse$Response$Quote(GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote fulfillmentSchedulingQuote) {
        fulfillmentSchedulingQuote.getClass();
        this.value = fulfillmentSchedulingQuote;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetFulfillmentSchedulingQuoteResponse$Response$Quote) && Intrinsics.areEqual(this.value, ((GetFulfillmentSchedulingQuoteResponse$Response$Quote) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Quote(value=" + this.value + ")";
    }
}
