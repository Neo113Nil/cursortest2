package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BalanceSnapshot$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BalanceSnapshot.Type.Companion.getClass();
        if (i == 1) {
            return BalanceSnapshot.Type.PRIMARY;
        }
        if (i != 2) {
            return null;
        }
        return BalanceSnapshot.Type.SECONDARY;
    }
}
