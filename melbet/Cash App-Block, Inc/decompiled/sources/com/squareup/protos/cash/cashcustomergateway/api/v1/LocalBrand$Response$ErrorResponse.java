package com.squareup.protos.cash.cashcustomergateway.api.v1;

import app.cash.local.primitives.MenuHoursKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalBrand$Response$ErrorResponse extends MenuHoursKt {
    public final LocalErrorResponse value;

    public LocalBrand$Response$ErrorResponse(LocalErrorResponse localErrorResponse) {
        localErrorResponse.getClass();
        this.value = localErrorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalBrand$Response$ErrorResponse) && Intrinsics.areEqual(this.value, ((LocalBrand$Response$ErrorResponse) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SizeMode$EnumUnboxingLocalUtility.m("ErrorResponse(value=", this.value, ")");
    }
}
