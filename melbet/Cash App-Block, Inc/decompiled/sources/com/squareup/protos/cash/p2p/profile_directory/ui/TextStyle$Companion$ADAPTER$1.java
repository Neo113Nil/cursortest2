package com.squareup.protos.cash.p2p.profile_directory.ui;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TextStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TextStyle.Companion.getClass();
        return RetailerType.Companion.m3906fromValue(i);
    }
}
