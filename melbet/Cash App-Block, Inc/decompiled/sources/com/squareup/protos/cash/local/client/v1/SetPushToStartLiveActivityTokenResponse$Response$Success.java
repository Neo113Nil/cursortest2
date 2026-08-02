package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzjd;
import com.squareup.protos.cash.local.client.v1.SetPushToStartLiveActivityTokenResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SetPushToStartLiveActivityTokenResponse$Response$Success extends zzjd {
    public final SetPushToStartLiveActivityTokenResponse.Success value;

    public SetPushToStartLiveActivityTokenResponse$Response$Success(SetPushToStartLiveActivityTokenResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetPushToStartLiveActivityTokenResponse$Response$Success) && Intrinsics.areEqual(this.value, ((SetPushToStartLiveActivityTokenResponse$Response$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
