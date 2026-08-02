package com.squareup.protos.cash.cashstorefronts.api;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RewardAmount$Data$RewardRelativeAmount extends zzuk {
    public final RewardRelativeAmount value;

    public RewardAmount$Data$RewardRelativeAmount(RewardRelativeAmount rewardRelativeAmount) {
        rewardRelativeAmount.getClass();
        this.value = rewardRelativeAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardAmount$Data$RewardRelativeAmount) && Intrinsics.areEqual(this.value, ((RewardAmount$Data$RewardRelativeAmount) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RewardRelativeAmount(value=" + this.value + ")";
    }
}
