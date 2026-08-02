package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class StatusResultButton$ButtonAction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        StatusResultButton.ButtonAction.Companion.getClass();
        return ClientDriven.Companion.m3976fromValue(i);
    }
}
