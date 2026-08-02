package com.squareup.protos.rewardly.ui;

import com.squareup.cash.clientroutes.UriValidator;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class UiRewardProgramDetails$DetailRow$RowAction_$OpenUrl extends UriValidator {
    public final UiRewardProgramDetails.DetailRow.OpenUrl value;

    public UiRewardProgramDetails$DetailRow$RowAction_$OpenUrl(UiRewardProgramDetails.DetailRow.OpenUrl openUrl) {
        openUrl.getClass();
        this.value = openUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UiRewardProgramDetails$DetailRow$RowAction_$OpenUrl) && Intrinsics.areEqual(this.value, ((UiRewardProgramDetails$DetailRow$RowAction_$OpenUrl) obj).value);
    }

    public final UiRewardProgramDetails.DetailRow.OpenUrl getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OpenUrl(value=" + this.value + ")";
    }
}
