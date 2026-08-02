package com.squareup.protos.cash.cashface.ui;

import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GenericProfileElement$TrustElement$Id$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GenericProfileElement.TrustElement.Id.Companion.getClass();
        if (i == 1) {
            return GenericProfileElement.TrustElement.Id.JOINED_AT;
        }
        if (i == 2) {
            return GenericProfileElement.TrustElement.Id.PAID_BY;
        }
        if (i == 3) {
            return GenericProfileElement.TrustElement.Id.CONTACTS;
        }
        if (i != 4) {
            return null;
        }
        return GenericProfileElement.TrustElement.Id.LAST_ACTIVE;
    }
}
