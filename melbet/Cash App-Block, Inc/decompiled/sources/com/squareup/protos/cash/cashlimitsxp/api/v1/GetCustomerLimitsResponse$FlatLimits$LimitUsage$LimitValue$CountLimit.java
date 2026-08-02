package com.squareup.protos.cash.cashlimitsxp.api.v1;

import app.cash.local.viewmodels.MenuItemAvailability;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit extends MenuItemAvailability {
    public final GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit value;

    public GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit(GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit countLimit) {
        countLimit.getClass();
        this.value = countLimit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit) && Intrinsics.areEqual(this.value, ((GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CountLimit(value=" + this.value + ")";
    }
}
