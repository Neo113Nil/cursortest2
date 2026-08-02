package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhz;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetBuyerInfoResponse$Response$BuyerInfo extends zzhz {
    public final GetBuyerInfoResponse.BuyerInfo value;

    public GetBuyerInfoResponse$Response$BuyerInfo(GetBuyerInfoResponse.BuyerInfo buyerInfo) {
        buyerInfo.getClass();
        this.value = buyerInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBuyerInfoResponse$Response$BuyerInfo) && Intrinsics.areEqual(this.value, ((GetBuyerInfoResponse$Response$BuyerInfo) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BuyerInfo(value=" + this.value + ")";
    }
}
