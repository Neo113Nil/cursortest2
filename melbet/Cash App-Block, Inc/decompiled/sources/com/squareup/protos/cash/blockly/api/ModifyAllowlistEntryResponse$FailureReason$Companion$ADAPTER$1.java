package com.squareup.protos.cash.blockly.api;

import com.squareup.protos.cash.blockly.api.ModifyAllowlistEntryResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ModifyAllowlistEntryResponse$FailureReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ModifyAllowlistEntryResponse.FailureReason.Companion.getClass();
        if (i == 1) {
            return ModifyAllowlistEntryResponse.FailureReason.ALLOWLIST_LIMIT_REACHED;
        }
        return null;
    }
}
