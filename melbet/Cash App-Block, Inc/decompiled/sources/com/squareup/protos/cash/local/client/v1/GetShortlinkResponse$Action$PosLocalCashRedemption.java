package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetShortlinkResponse$Action$PosLocalCashRedemption extends ViewUtilsKt {
    public final POSLocalCashRedemption value;

    public GetShortlinkResponse$Action$PosLocalCashRedemption(POSLocalCashRedemption pOSLocalCashRedemption) {
        pOSLocalCashRedemption.getClass();
        this.value = pOSLocalCashRedemption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetShortlinkResponse$Action$PosLocalCashRedemption) && Intrinsics.areEqual(this.value, ((GetShortlinkResponse$Action$PosLocalCashRedemption) obj).value);
    }

    public final POSLocalCashRedemption getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PosLocalCashRedemption(value=" + this.value + ")";
    }
}
