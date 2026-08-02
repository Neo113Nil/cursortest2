package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.RewardSelection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar {
    public final RewardSelection.UnlockInProgress.ProgressBar value;

    public RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar(RewardSelection.UnlockInProgress.ProgressBar progressBar) {
        progressBar.getClass();
        this.value = progressBar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar) && Intrinsics.areEqual(this.value, ((RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ProgressBar(value=" + this.value + ")";
    }
}
