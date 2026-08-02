package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhq;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreateOrderRequest$Payment$SquarePaymentToken extends zzhq {
    public final String value;

    public CreateOrderRequest$Payment$SquarePaymentToken(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateOrderRequest$Payment$SquarePaymentToken) && Intrinsics.areEqual(this.value, ((CreateOrderRequest$Payment$SquarePaymentToken) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SquarePaymentToken(value=", this.value, ")");
    }
}
