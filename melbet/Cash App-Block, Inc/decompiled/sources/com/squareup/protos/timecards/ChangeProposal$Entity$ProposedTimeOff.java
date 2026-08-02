package com.squareup.protos.timecards;

import com.squareup.cash.clientrouting.UtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChangeProposal$Entity$ProposedTimeOff extends UtilsKt {
    public final ProposedTimeOff value;

    public ChangeProposal$Entity$ProposedTimeOff(ProposedTimeOff proposedTimeOff) {
        proposedTimeOff.getClass();
        this.value = proposedTimeOff;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChangeProposal$Entity$ProposedTimeOff) && Intrinsics.areEqual(this.value, ((ChangeProposal$Entity$ProposedTimeOff) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ProposedTimeOff(value=" + this.value + ")";
    }
}
