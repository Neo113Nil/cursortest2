package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BalanceData$Dialog$Button$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BalanceData.Dialog.Button.Action.Companion.getClass();
        if (i == 1) {
            return BalanceData.Dialog.Button.Action.DO_CLIENT_SCENARIO;
        }
        if (i != 2) {
            return null;
        }
        return BalanceData.Dialog.Button.Action.DISMISS;
    }
}
