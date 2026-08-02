package com.squareup.protos.rewardly.ui;

import com.google.android.gms.internal.mlkit_vision_face.zzjr;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class UiRewardSelectionState$States$Locked extends zzjr {
    public final UiRewardSelectionState.Locked value;

    public UiRewardSelectionState$States$Locked(UiRewardSelectionState.Locked locked) {
        locked.getClass();
        this.value = locked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UiRewardSelectionState$States$Locked) && Intrinsics.areEqual(this.value, ((UiRewardSelectionState$States$Locked) obj).value);
    }

    public final UiRewardSelectionState.Locked getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Locked(value=" + this.value + ")";
    }
}
