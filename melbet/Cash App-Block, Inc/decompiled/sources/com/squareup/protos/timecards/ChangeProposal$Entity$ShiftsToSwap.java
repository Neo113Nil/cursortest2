package com.squareup.protos.timecards;

import com.squareup.cash.clientrouting.UtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChangeProposal$Entity$ShiftsToSwap extends UtilsKt {
    public final ShiftsToSwap value;

    public ChangeProposal$Entity$ShiftsToSwap(ShiftsToSwap shiftsToSwap) {
        shiftsToSwap.getClass();
        this.value = shiftsToSwap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChangeProposal$Entity$ShiftsToSwap) && Intrinsics.areEqual(this.value, ((ChangeProposal$Entity$ShiftsToSwap) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ShiftsToSwap(value=" + this.value + ")";
    }
}
