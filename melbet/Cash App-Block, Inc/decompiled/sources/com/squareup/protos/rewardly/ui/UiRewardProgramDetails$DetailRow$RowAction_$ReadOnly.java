package com.squareup.protos.rewardly.ui;

import com.squareup.cash.clientroutes.UriValidator;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class UiRewardProgramDetails$DetailRow$RowAction_$ReadOnly extends UriValidator {
    public final UiRewardProgramDetails.DetailRow.ReadOnly value;

    public UiRewardProgramDetails$DetailRow$RowAction_$ReadOnly(UiRewardProgramDetails.DetailRow.ReadOnly readOnly) {
        readOnly.getClass();
        this.value = readOnly;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UiRewardProgramDetails$DetailRow$RowAction_$ReadOnly) && Intrinsics.areEqual(this.value, ((UiRewardProgramDetails$DetailRow$RowAction_$ReadOnly) obj).value);
    }

    public final UiRewardProgramDetails.DetailRow.ReadOnly getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ReadOnly(value=" + this.value + ")";
    }
}
