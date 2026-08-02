package com.squareup.protos.cash.cashface.api;

import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Trust$Id$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Trust.Id.Companion.getClass();
        if (i == 1) {
            return Trust.Id.JOINED_AT;
        }
        if (i == 2) {
            return Trust.Id.PAID_BY;
        }
        if (i != 3) {
            return null;
        }
        return Trust.Id.CONTACTS;
    }
}
