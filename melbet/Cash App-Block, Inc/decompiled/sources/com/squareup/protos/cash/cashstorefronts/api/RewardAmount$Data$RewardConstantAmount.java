package com.squareup.protos.cash.cashstorefronts.api;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RewardAmount$Data$RewardConstantAmount extends zzuk {
    public final RewardConstantAmount value;

    public RewardAmount$Data$RewardConstantAmount(RewardConstantAmount rewardConstantAmount) {
        rewardConstantAmount.getClass();
        this.value = rewardConstantAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardAmount$Data$RewardConstantAmount) && Intrinsics.areEqual(this.value, ((RewardAmount$Data$RewardConstantAmount) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RewardConstantAmount(value=" + this.value + ")";
    }
}
