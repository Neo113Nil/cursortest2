package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.internal.metrics.RemovalReason;
import com.squareup.protos.cash.local.client.v1.AddRoundToTabResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AddRoundToTabResponse$Response$Success extends RemovalReason {
    public final AddRoundToTabResponse.Success value;

    public AddRoundToTabResponse$Response$Success(AddRoundToTabResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddRoundToTabResponse$Response$Success) && Intrinsics.areEqual(this.value, ((AddRoundToTabResponse$Response$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
