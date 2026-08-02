package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RewardSelection$UnlockInProgress$ProgressBar$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RewardSelection.UnlockInProgress.ProgressBar.Type.Companion.getClass();
        if (i == 1) {
            return RewardSelection.UnlockInProgress.ProgressBar.Type.DISCRETE;
        }
        if (i != 2) {
            return null;
        }
        return RewardSelection.UnlockInProgress.ProgressBar.Type.CONTINUOUS;
    }
}
