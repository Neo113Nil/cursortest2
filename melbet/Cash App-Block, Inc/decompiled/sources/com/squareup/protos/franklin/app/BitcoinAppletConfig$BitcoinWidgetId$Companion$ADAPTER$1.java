package com.squareup.protos.franklin.app;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.franklin.app.BitcoinAppletConfig;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BitcoinAppletConfig$BitcoinWidgetId$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BitcoinAppletConfig.BitcoinWidgetId.Companion.getClass();
        return ActionType.Companion.m3937fromValue(i);
    }
}
