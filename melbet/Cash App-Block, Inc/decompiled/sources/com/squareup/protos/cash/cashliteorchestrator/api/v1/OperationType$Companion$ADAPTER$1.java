package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class OperationType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OperationType.Companion.getClass();
        return Alignment.Companion.fromValue(i);
    }
}
