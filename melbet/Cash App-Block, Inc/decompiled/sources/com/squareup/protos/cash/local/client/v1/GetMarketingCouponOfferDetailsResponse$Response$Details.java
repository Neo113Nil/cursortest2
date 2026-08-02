package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.squareup.protos.cash.local.client.v1.GetMarketingCouponOfferDetailsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetMarketingCouponOfferDetailsResponse$Response$Details extends RuntimeUtilsKt {
    public final GetMarketingCouponOfferDetailsResponse.CouponOfferDetails value;

    public GetMarketingCouponOfferDetailsResponse$Response$Details(GetMarketingCouponOfferDetailsResponse.CouponOfferDetails couponOfferDetails) {
        couponOfferDetails.getClass();
        this.value = couponOfferDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetMarketingCouponOfferDetailsResponse$Response$Details) && Intrinsics.areEqual(this.value, ((GetMarketingCouponOfferDetailsResponse$Response$Details) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Details(value=" + this.value + ")";
    }
}
