package com.squareup.protos.cash.cashface.api;

import app.cash.local.primitives.math.LocalMoneysKt;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetProfileDetailsResponse$EntityData$CustomerData extends LocalMoneysKt {
    public final GetProfileDetailsResponse.CustomerData value;

    public GetProfileDetailsResponse$EntityData$CustomerData(GetProfileDetailsResponse.CustomerData customerData) {
        customerData.getClass();
        this.value = customerData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetProfileDetailsResponse$EntityData$CustomerData) && Intrinsics.areEqual(this.value, ((GetProfileDetailsResponse$EntityData$CustomerData) obj).value);
    }

    public final GetProfileDetailsResponse.CustomerData getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CustomerData(value=" + this.value + ")";
    }
}
