package com.squareup.protos.rewardly.ui;

import com.google.android.gms.internal.mlkit_vision_face.zzjr;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class UiRewardSelectionState$States$Unlocked extends zzjr {
    public final UiRewardSelectionState.Unlocked value;

    public UiRewardSelectionState$States$Unlocked(UiRewardSelectionState.Unlocked unlocked) {
        unlocked.getClass();
        this.value = unlocked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UiRewardSelectionState$States$Unlocked) && Intrinsics.areEqual(this.value, ((UiRewardSelectionState$States$Unlocked) obj).value);
    }

    public final UiRewardSelectionState.Unlocked getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Unlocked(value=" + this.value + ")";
    }
}
