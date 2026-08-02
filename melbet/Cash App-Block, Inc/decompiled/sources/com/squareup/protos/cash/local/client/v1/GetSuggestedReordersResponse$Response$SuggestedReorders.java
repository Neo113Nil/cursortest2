package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzij;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetSuggestedReordersResponse$Response$SuggestedReorders extends zzij {
    public final GetSuggestedReordersResponse.SuggestedReorders value;

    public GetSuggestedReordersResponse$Response$SuggestedReorders(GetSuggestedReordersResponse.SuggestedReorders suggestedReorders) {
        suggestedReorders.getClass();
        this.value = suggestedReorders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetSuggestedReordersResponse$Response$SuggestedReorders) && Intrinsics.areEqual(this.value, ((GetSuggestedReordersResponse$Response$SuggestedReorders) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SuggestedReorders(value=" + this.value + ")";
    }
}
