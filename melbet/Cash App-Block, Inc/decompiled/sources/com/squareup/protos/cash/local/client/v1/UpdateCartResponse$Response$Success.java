package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.UpdateCartResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class UpdateCartResponse$Response$Success extends ActionEvent.Dd.Companion {
    public final UpdateCartResponse.Success value;

    public UpdateCartResponse$Response$Success(UpdateCartResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateCartResponse$Response$Success) && Intrinsics.areEqual(this.value, ((UpdateCartResponse$Response$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
