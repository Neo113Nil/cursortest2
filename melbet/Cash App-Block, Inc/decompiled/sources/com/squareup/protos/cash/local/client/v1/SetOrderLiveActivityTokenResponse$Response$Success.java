package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzjc;
import com.squareup.protos.cash.local.client.v1.SetOrderLiveActivityTokenResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SetOrderLiveActivityTokenResponse$Response$Success extends zzjc {
    public final SetOrderLiveActivityTokenResponse.Success value;

    public SetOrderLiveActivityTokenResponse$Response$Success(SetOrderLiveActivityTokenResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetOrderLiveActivityTokenResponse$Response$Success) && Intrinsics.areEqual(this.value, ((SetOrderLiveActivityTokenResponse$Response$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
