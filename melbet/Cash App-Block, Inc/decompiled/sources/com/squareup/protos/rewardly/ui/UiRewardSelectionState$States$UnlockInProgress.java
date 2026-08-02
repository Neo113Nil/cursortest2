package com.squareup.protos.rewardly.ui;

import com.google.android.gms.internal.mlkit_vision_face.zzjr;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class UiRewardSelectionState$States$UnlockInProgress extends zzjr {
    public final UiRewardSelectionState.UnlockInProgress value;

    public UiRewardSelectionState$States$UnlockInProgress(UiRewardSelectionState.UnlockInProgress unlockInProgress) {
        unlockInProgress.getClass();
        this.value = unlockInProgress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UiRewardSelectionState$States$UnlockInProgress) && Intrinsics.areEqual(this.value, ((UiRewardSelectionState$States$UnlockInProgress) obj).value);
    }

    public final UiRewardSelectionState.UnlockInProgress getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UnlockInProgress(value=" + this.value + ")";
    }
}
