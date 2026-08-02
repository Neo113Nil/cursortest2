package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import com.squareup.protos.cash.local.client.v1.ConfirmArrivalResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ConfirmArrivalResponse$Response$Success extends ByteArrayExtKt {
    public final ConfirmArrivalResponse.Success value;

    public ConfirmArrivalResponse$Response$Success(ConfirmArrivalResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfirmArrivalResponse$Response$Success) && Intrinsics.areEqual(this.value, ((ConfirmArrivalResponse$Response$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
