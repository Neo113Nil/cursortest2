package com.squareup.protos.cash.cashface.api;

import app.cash.local.primitives.math.LocalMoneysKt;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetProfileDetailsResponse$EntityData$MerchantData extends LocalMoneysKt {
    public final GetProfileDetailsResponse.MerchantData value;

    public GetProfileDetailsResponse$EntityData$MerchantData(GetProfileDetailsResponse.MerchantData merchantData) {
        merchantData.getClass();
        this.value = merchantData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetProfileDetailsResponse$EntityData$MerchantData) && Intrinsics.areEqual(this.value, ((GetProfileDetailsResponse$EntityData$MerchantData) obj).value);
    }

    public final GetProfileDetailsResponse.MerchantData getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MerchantData(value=" + this.value + ")";
    }
}
