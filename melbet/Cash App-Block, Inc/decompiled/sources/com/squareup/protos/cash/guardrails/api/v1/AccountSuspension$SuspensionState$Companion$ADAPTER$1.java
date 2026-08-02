package com.squareup.protos.cash.guardrails.api.v1;

import com.squareup.protos.cash.guardrails.api.v1.AccountSuspension;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AccountSuspension$SuspensionState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AccountSuspension.SuspensionState.Companion.getClass();
        if (i == 0) {
            return AccountSuspension.SuspensionState.STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return AccountSuspension.SuspensionState.INFO;
        }
        if (i == 2) {
            return AccountSuspension.SuspensionState.WARNING;
        }
        if (i != 3) {
            return null;
        }
        return AccountSuspension.SuspensionState.SUCCESS;
    }
}
