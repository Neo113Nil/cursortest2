package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjf;
import com.squareup.protos.lending.Toggle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$ToggleAction extends zzjf {
    public final Toggle value;

    public AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$ToggleAction(Toggle toggle) {
        toggle.getClass();
        this.value = toggle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$ToggleAction) && Intrinsics.areEqual(this.value, ((AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$ToggleAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ToggleAction(value=" + this.value + ")";
    }
}
