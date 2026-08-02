package com.squareup.lending.sync_values;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardsEntryPointData$EntryPoint$ToggleEntryPointData {
    public final ToggleEntryPointData value;

    public CardsEntryPointData$EntryPoint$ToggleEntryPointData(ToggleEntryPointData toggleEntryPointData) {
        toggleEntryPointData.getClass();
        this.value = toggleEntryPointData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardsEntryPointData$EntryPoint$ToggleEntryPointData) && Intrinsics.areEqual(this.value, ((CardsEntryPointData$EntryPoint$ToggleEntryPointData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ToggleEntryPointData(value=" + this.value + ")";
    }
}
