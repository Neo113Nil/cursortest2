package com.squareup.protos.franklin.ui;

import com.google.android.gms.internal.mlkit_vision_face.zzee;
import com.squareup.protos.franklin.ui.RewardSelection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RewardSelection$States$UnlockInProgress extends zzee {
    public final RewardSelection.UnlockInProgress value;

    public RewardSelection$States$UnlockInProgress(RewardSelection.UnlockInProgress unlockInProgress) {
        unlockInProgress.getClass();
        this.value = unlockInProgress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardSelection$States$UnlockInProgress) && Intrinsics.areEqual(this.value, ((RewardSelection$States$UnlockInProgress) obj).value);
    }

    public final RewardSelection.UnlockInProgress getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UnlockInProgress(value=" + this.value + ")";
    }
}
