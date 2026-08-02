package com.squareup.protos.cash.cashlimitsxp.api.v1;

import app.cash.local.viewmodels.OrderBuilderModel;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$Limits$GroupedLimits extends OrderBuilderModel.OrderType {
    public final GetCustomerLimitsResponse.GroupedLimits value;

    public GetCustomerLimitsResponse$Limits$GroupedLimits(GetCustomerLimitsResponse.GroupedLimits groupedLimits) {
        groupedLimits.getClass();
        this.value = groupedLimits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetCustomerLimitsResponse$Limits$GroupedLimits) && Intrinsics.areEqual(this.value, ((GetCustomerLimitsResponse$Limits$GroupedLimits) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "GroupedLimits(value=" + this.value + ")";
    }
}
