package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Action.OAuth.Metadata.Type.Companion.getClass();
        if (i == 1) {
            return Action.OAuth.Metadata.Type.FINANCIAL_DATA_SHARING;
        }
        if (i != 2) {
            return null;
        }
        return Action.OAuth.Metadata.Type.AGENT_CONNECTION;
    }
}
