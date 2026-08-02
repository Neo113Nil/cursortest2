package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BalanceData$Button$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BalanceData.Button.Action.Companion.getClass();
        if (i == 1) {
            return BalanceData.Button.Action.DO_CLIENT_SCENARIO;
        }
        if (i == 2) {
            return BalanceData.Button.Action.SHOW_DDA_COPY_AND_PASTE;
        }
        if (i != 3) {
            return null;
        }
        return BalanceData.Button.Action.SHOW_DIALOG;
    }
}
