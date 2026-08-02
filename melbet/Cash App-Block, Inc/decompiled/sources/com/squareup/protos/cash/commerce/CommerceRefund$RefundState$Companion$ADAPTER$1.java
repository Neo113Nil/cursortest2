package com.squareup.protos.cash.commerce;

import com.squareup.protos.cash.commerce.CommerceRefund;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CommerceRefund$RefundState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CommerceRefund.RefundState.Companion.getClass();
        return Action.Type.Companion.fromValue(i);
    }
}
