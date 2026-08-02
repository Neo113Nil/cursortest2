package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzji;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class UpdateUserIntentResponse$Response$Success extends zzji {
    public final UpdateUserIntentResponse.Success value;

    public UpdateUserIntentResponse$Response$Success(UpdateUserIntentResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateUserIntentResponse$Response$Success) && Intrinsics.areEqual(this.value, ((UpdateUserIntentResponse$Response$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
