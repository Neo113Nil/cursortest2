package com.squareup.protos.timecards;

import com.squareup.cash.clientrouting.UtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChangeProposal$Entity$ShiftCover extends UtilsKt {
    public final ShiftToCover value;

    public ChangeProposal$Entity$ShiftCover(ShiftToCover shiftToCover) {
        shiftToCover.getClass();
        this.value = shiftToCover;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChangeProposal$Entity$ShiftCover) && Intrinsics.areEqual(this.value, ((ChangeProposal$Entity$ShiftCover) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ShiftCover(value=" + this.value + ")";
    }
}
