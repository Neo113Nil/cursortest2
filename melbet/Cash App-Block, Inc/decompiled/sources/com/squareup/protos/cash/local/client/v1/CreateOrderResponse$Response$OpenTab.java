package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.persistence.SerializerKt;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$Response$OpenTab extends SerializerKt {
    public final CreateOrderResponse.OpenTab value;

    public CreateOrderResponse$Response$OpenTab(CreateOrderResponse.OpenTab openTab) {
        openTab.getClass();
        this.value = openTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateOrderResponse$Response$OpenTab) && Intrinsics.areEqual(this.value, ((CreateOrderResponse$Response$OpenTab) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OpenTab(value=" + this.value + ")";
    }
}
