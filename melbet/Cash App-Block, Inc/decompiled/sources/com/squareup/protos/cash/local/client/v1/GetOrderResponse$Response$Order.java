package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetOrderResponse$Response$Order extends SdkCoreExtKt {
    public final LocalOrder value;

    public GetOrderResponse$Response$Order(LocalOrder localOrder) {
        localOrder.getClass();
        this.value = localOrder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetOrderResponse$Response$Order) && Intrinsics.areEqual(this.value, ((GetOrderResponse$Response$Order) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Order(value=" + this.value + ")";
    }
}
