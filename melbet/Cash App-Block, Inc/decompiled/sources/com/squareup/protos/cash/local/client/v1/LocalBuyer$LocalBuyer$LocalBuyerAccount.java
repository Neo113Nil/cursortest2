package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzis;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalBuyer$LocalBuyer$LocalBuyerAccount extends zzis {
    public final LocalBuyer.LocalBuyerAccount value;

    public LocalBuyer$LocalBuyer$LocalBuyerAccount(LocalBuyer.LocalBuyerAccount localBuyerAccount) {
        localBuyerAccount.getClass();
        this.value = localBuyerAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalBuyer$LocalBuyer$LocalBuyerAccount) && Intrinsics.areEqual(this.value, ((LocalBuyer$LocalBuyer$LocalBuyerAccount) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalBuyerAccount(value=" + this.value + ")";
    }
}
