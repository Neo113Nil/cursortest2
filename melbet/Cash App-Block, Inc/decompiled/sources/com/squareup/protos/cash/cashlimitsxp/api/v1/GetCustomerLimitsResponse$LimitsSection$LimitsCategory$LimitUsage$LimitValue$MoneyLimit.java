package com.squareup.protos.cash.cashlimitsxp.api.v1;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuh;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit extends zzuh {
    public final GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit value;

    public GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit(GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit moneyLimit) {
        moneyLimit.getClass();
        this.value = moneyLimit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit) && Intrinsics.areEqual(this.value, ((GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MoneyLimit(value=" + this.value + ")";
    }
}
