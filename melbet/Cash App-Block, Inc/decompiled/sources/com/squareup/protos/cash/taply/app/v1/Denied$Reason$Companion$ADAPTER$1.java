package com.squareup.protos.cash.taply.app.v1;

import com.squareup.protos.cash.taply.app.v1.Denied;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Denied$Reason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Denied.Reason.Companion.getClass();
        if (i == 0) {
            return Denied.Reason.REASON_UNSPECIFIED;
        }
        if (i == 1) {
            return Denied.Reason.REASON_DENYLISTED;
        }
        if (i == 2) {
            return Denied.Reason.REASON_NOT_ORDERED_BY_CUSTOMER;
        }
        if (i != 3) {
            return null;
        }
        return Denied.Reason.REASON_ALREADY_PROVISIONED;
    }
}
