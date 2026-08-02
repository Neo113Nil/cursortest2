package com.squareup.protos.franklin.ui;

import com.google.android.gms.internal.mlkit_vision_face.zzee;
import com.squareup.protos.franklin.ui.RewardSelection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RewardSelection$States$Active extends zzee {
    public final RewardSelection.Active value;

    public RewardSelection$States$Active(RewardSelection.Active active) {
        active.getClass();
        this.value = active;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardSelection$States$Active) && Intrinsics.areEqual(this.value, ((RewardSelection$States$Active) obj).value);
    }

    public final RewardSelection.Active getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Active(value=" + this.value + ")";
    }
}
