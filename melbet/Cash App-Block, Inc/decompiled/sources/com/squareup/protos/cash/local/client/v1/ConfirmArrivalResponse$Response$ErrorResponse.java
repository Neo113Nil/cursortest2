package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ConfirmArrivalResponse$Response$ErrorResponse extends ByteArrayExtKt {
    public final LocalErrorResponse value;

    public ConfirmArrivalResponse$Response$ErrorResponse(LocalErrorResponse localErrorResponse) {
        localErrorResponse.getClass();
        this.value = localErrorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfirmArrivalResponse$Response$ErrorResponse) && Intrinsics.areEqual(this.value, ((ConfirmArrivalResponse$Response$ErrorResponse) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SizeMode$EnumUnboxingLocalUtility.m("ErrorResponse(value=", this.value, ")");
    }
}
