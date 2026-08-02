package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzia;
import com.squareup.protos.cash.local.client.v1.GetDeliveryQuoteResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetDeliveryQuoteResponse$Response$DeliveryQuote extends zzia {
    public final GetDeliveryQuoteResponse.DeliveryQuote value;

    public GetDeliveryQuoteResponse$Response$DeliveryQuote(GetDeliveryQuoteResponse.DeliveryQuote deliveryQuote) {
        deliveryQuote.getClass();
        this.value = deliveryQuote;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetDeliveryQuoteResponse$Response$DeliveryQuote) && Intrinsics.areEqual(this.value, ((GetDeliveryQuoteResponse$Response$DeliveryQuote) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DeliveryQuote(value=" + this.value + ")";
    }
}
