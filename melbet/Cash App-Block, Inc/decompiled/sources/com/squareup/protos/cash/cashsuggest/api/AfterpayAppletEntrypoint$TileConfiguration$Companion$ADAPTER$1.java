package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$TileConfiguration$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AfterpayAppletEntrypoint.TileConfiguration.Companion.getClass();
        if (i == 0) {
            return AfterpayAppletEntrypoint.TileConfiguration.INSTALLED;
        }
        if (i != 1) {
            return null;
        }
        return AfterpayAppletEntrypoint.TileConfiguration.UNINSTALLED;
    }
}
