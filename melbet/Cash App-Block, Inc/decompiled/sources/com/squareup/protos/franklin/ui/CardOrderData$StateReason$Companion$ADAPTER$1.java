package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.CardOrderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CardOrderData$StateReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardOrderData.StateReason.Companion.getClass();
        return LinkResult.Companion.m3961fromValue(i);
    }
}
