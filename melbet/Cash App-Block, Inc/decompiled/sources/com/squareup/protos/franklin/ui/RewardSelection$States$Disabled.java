package com.squareup.protos.franklin.ui;

import com.google.android.gms.internal.mlkit_vision_face.zzee;
import com.squareup.protos.franklin.ui.RewardSelection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RewardSelection$States$Disabled extends zzee {
    public final RewardSelection.Disabled value;

    public RewardSelection$States$Disabled(RewardSelection.Disabled disabled) {
        disabled.getClass();
        this.value = disabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardSelection$States$Disabled) && Intrinsics.areEqual(this.value, ((RewardSelection$States$Disabled) obj).value);
    }

    public final RewardSelection.Disabled getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Disabled(value=" + this.value + ")";
    }
}
