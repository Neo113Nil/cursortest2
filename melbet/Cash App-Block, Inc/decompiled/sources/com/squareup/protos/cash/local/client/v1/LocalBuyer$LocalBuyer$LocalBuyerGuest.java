package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzis;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalBuyer$LocalBuyer$LocalBuyerGuest extends zzis {
    public final LocalBuyer.LocalBuyerGuest value;

    public LocalBuyer$LocalBuyer$LocalBuyerGuest(LocalBuyer.LocalBuyerGuest localBuyerGuest) {
        localBuyerGuest.getClass();
        this.value = localBuyerGuest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalBuyer$LocalBuyer$LocalBuyerGuest) && Intrinsics.areEqual(this.value, ((LocalBuyer$LocalBuyer$LocalBuyerGuest) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalBuyerGuest(value=" + this.value + ")";
    }
}
