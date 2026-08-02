package com.squareup.protos.cash.cashlimitsxp.api.v1;

import app.cash.local.viewmodels.MenuItemAvailability;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit extends MenuItemAvailability {
    public final GetCustomerLimitsResponse.FlatLimits.LimitUsage.MoneyLimit value;

    public GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit(GetCustomerLimitsResponse.FlatLimits.LimitUsage.MoneyLimit moneyLimit) {
        moneyLimit.getClass();
        this.value = moneyLimit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit) && Intrinsics.areEqual(this.value, ((GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MoneyLimit(value=" + this.value + ")";
    }
}
