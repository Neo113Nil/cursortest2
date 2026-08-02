package com.squareup.protos.cash.cashliteflow.api.v1;

import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Row$RowAction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Row.RowAction.Companion.getClass();
        if (i == 0) {
            return Row.RowAction.ROW_ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return Row.RowAction.ROW_ACTION_NONE;
        }
        if (i != 2) {
            return null;
        }
        return Row.RowAction.ROW_ACTION_COPY;
    }
}
