package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhy;
import com.squareup.protos.cash.local.client.v1.GetBuyerAccountResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetBuyerAccountResponse$Response$Success extends zzhy {
    public final GetBuyerAccountResponse.Success value;

    public GetBuyerAccountResponse$Response$Success(GetBuyerAccountResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBuyerAccountResponse$Response$Success) && Intrinsics.areEqual(this.value, ((GetBuyerAccountResponse$Response$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
