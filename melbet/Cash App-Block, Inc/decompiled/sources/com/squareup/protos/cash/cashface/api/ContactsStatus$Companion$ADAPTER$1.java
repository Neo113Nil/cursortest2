package com.squareup.protos.cash.cashface.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ContactsStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ContactsStatus.Companion.getClass();
        if (i == 1) {
            return ContactsStatus.IN_CONTACTS;
        }
        if (i == 2) {
            return ContactsStatus.NOT_IN_CONTACTS;
        }
        if (i != 3) {
            return null;
        }
        return ContactsStatus.CONTACTS_DISABLED;
    }
}
