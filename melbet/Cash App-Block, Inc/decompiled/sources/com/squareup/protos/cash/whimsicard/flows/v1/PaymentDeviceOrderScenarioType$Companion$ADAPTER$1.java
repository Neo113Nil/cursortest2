package com.squareup.protos.cash.whimsicard.flows.v1;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PaymentDeviceOrderScenarioType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentDeviceOrderScenarioType.Companion.getClass();
        return ActionType.Companion.m3935fromValue(i);
    }
}
