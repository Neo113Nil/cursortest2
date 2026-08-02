package com.squareup.protos.cash.whimsicard.syncentity;

import com.squareup.protos.cash.whimsicard.syncentity.Timeline;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Timeline$Step$StepStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Timeline.Step.StepStyle.Companion.getClass();
        if (i == 0) {
            return Timeline.Step.StepStyle.STEP_STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return Timeline.Step.StepStyle.COMPLETED;
        }
        if (i == 2) {
            return Timeline.Step.StepStyle.IN_PROGRESS;
        }
        if (i != 3) {
            return null;
        }
        return Timeline.Step.StepStyle.UPCOMING;
    }
}
