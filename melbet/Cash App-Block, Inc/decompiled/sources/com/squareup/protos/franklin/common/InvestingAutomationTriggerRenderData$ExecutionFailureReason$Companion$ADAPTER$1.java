package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.InvestingAutomationTriggerRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class InvestingAutomationTriggerRenderData$ExecutionFailureReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InvestingAutomationTriggerRenderData.ExecutionFailureReason.Companion.getClass();
        if (i == 1) {
            return InvestingAutomationTriggerRenderData.ExecutionFailureReason.GENERIC;
        }
        if (i != 2) {
            return null;
        }
        return InvestingAutomationTriggerRenderData.ExecutionFailureReason.INSUFFICIENT_FUNDS;
    }
}
