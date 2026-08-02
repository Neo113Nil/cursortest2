package com.squareup.protos.franklin.common;

import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum FieldName implements WireEnum {
    CARD_NUMBER(1),
    CARD_EXPIRATION(2),
    CARD_POSTAL_CODE(3),
    PASSWORD(5),
    SMS_NUMBER(6),
    SMS_VERIFICATION_CODE(7),
    BANK_ROUTING_NUMBER(8),
    BANK_ACCOUNT_NUMBER(9),
    CARD_CVV(10),
    EMAIL_VERIFICATION_CODE(11);

    public final int value;
    public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
    public static final FieldName$Companion$ADAPTER$1 ADAPTER = new FieldName$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FieldName.class), Syntax.PROTO_2, null);

    FieldName(int i) {
        this.value = i;
    }

    public static final FieldName fromValue(int i) {
        Companion.getClass();
        return ClientDriven.Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
