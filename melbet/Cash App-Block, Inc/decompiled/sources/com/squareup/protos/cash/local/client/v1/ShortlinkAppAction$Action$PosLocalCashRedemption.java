package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzje;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShortlinkAppAction$Action$PosLocalCashRedemption extends zzje {
    public final POSLocalCashRedemption value;

    public ShortlinkAppAction$Action$PosLocalCashRedemption(POSLocalCashRedemption pOSLocalCashRedemption) {
        pOSLocalCashRedemption.getClass();
        this.value = pOSLocalCashRedemption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortlinkAppAction$Action$PosLocalCashRedemption) && Intrinsics.areEqual(this.value, ((ShortlinkAppAction$Action$PosLocalCashRedemption) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PosLocalCashRedemption(value=" + this.value + ")";
    }
}
