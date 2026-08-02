package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.UpdateCartResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class UpdateCartResponse$Response$Error extends ActionEvent.Dd.Companion {
    public final UpdateCartResponse.Error value;

    public UpdateCartResponse$Response$Error(UpdateCartResponse.Error error) {
        error.getClass();
        this.value = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateCartResponse$Response$Error) && Intrinsics.areEqual(this.value, ((UpdateCartResponse$Response$Error) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Error(value=" + this.value + ")";
    }
}
