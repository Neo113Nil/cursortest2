package com.squareup.protos.cash.cashface.api;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ContactsStatus implements WireEnum {
    IN_CONTACTS(1),
    NOT_IN_CONTACTS(2),
    CONTACTS_DISABLED(3);

    public final int value;
    public static final CardProduct.Companion Companion = new CardProduct.Companion(25);
    public static final ContactsStatus$Companion$ADAPTER$1 ADAPTER = new ContactsStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ContactsStatus.class), Syntax.PROTO_2, null);

    ContactsStatus(int i) {
        this.value = i;
    }

    public static final ContactsStatus fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return IN_CONTACTS;
        }
        if (i == 2) {
            return NOT_IN_CONTACTS;
        }
        if (i != 3) {
            return null;
        }
        return CONTACTS_DISABLED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
