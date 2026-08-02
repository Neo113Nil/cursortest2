package com.squareup.protos.lending.sync_values;

import com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint {
    public final AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData value;

    public AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint(AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData toggleEntrypointData) {
        toggleEntrypointData.getClass();
        this.value = toggleEntrypointData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint) && Intrinsics.areEqual(this.value, ((AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ToggleEntryPoint(value=" + this.value + ")";
    }
}
