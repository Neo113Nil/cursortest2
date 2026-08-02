package com.squareup.protos.timecards;

import com.squareup.cash.clientrouting.UtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChangeProposal$Entity$OpenShiftToClaim extends UtilsKt {
    public final OpenShiftToClaim value;

    public ChangeProposal$Entity$OpenShiftToClaim(OpenShiftToClaim openShiftToClaim) {
        openShiftToClaim.getClass();
        this.value = openShiftToClaim;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChangeProposal$Entity$OpenShiftToClaim) && Intrinsics.areEqual(this.value, ((ChangeProposal$Entity$OpenShiftToClaim) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OpenShiftToClaim(value=" + this.value + ")";
    }
}
