package com.squareup.protos.cash.local.client.v1;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzhq;

/* loaded from: classes7.dex */
public final class CreateOrderRequest$Payment$UseCashBalance extends zzhq {
    public final boolean value;

    public CreateOrderRequest$Payment$UseCashBalance(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateOrderRequest$Payment$UseCashBalance) && this.value == ((CreateOrderRequest$Payment$UseCashBalance) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("UseCashBalance(value=", ")", this.value);
    }
}
