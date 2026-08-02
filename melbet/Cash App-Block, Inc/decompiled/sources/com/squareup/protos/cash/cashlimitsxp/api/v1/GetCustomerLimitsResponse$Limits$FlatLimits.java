package com.squareup.protos.cash.cashlimitsxp.api.v1;

import app.cash.local.viewmodels.OrderBuilderModel;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$Limits$FlatLimits extends OrderBuilderModel.OrderType {
    public final GetCustomerLimitsResponse.FlatLimits value;

    public GetCustomerLimitsResponse$Limits$FlatLimits(GetCustomerLimitsResponse.FlatLimits flatLimits) {
        flatLimits.getClass();
        this.value = flatLimits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetCustomerLimitsResponse$Limits$FlatLimits) && Intrinsics.areEqual(this.value, ((GetCustomerLimitsResponse$Limits$FlatLimits) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FlatLimits(value=" + this.value + ")";
    }
}
