package com.squareup.protos.cash.cashlimitsxp.api.v1;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuh;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit extends zzuh {
    public final GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.CountLimit value;

    public GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit(GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.CountLimit countLimit) {
        countLimit.getClass();
        this.value = countLimit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit) && Intrinsics.areEqual(this.value, ((GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CountLimit(value=" + this.value + ")";
    }
}
