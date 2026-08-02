package com.squareup.lending.sync_values;

import app.cash.local.presenters.internal.LoyaltyKt;
import com.squareup.protos.lending.Toggle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ToggleEntryPointData$Action$PerformToggle extends LoyaltyKt {
    public final Toggle value;

    public ToggleEntryPointData$Action$PerformToggle(Toggle toggle) {
        toggle.getClass();
        this.value = toggle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToggleEntryPointData$Action$PerformToggle) && Intrinsics.areEqual(this.value, ((ToggleEntryPointData$Action$PerformToggle) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PerformToggle(value=" + this.value + ")";
    }
}
