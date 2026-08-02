package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.internal.metrics.RemovalReason;
import com.squareup.protos.cash.local.client.v1.AddRoundToTabResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AddRoundToTabResponse$Response$Error extends RemovalReason {
    public final AddRoundToTabResponse.Error value;

    public AddRoundToTabResponse$Response$Error(AddRoundToTabResponse.Error error) {
        error.getClass();
        this.value = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddRoundToTabResponse$Response$Error) && Intrinsics.areEqual(this.value, ((AddRoundToTabResponse$Response$Error) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Error(value=" + this.value + ")";
    }
}
