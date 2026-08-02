package com.squareup.protos.franklin.ui;

import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum RequestRefundReason implements WireEnum {
    OTHER(1),
    SENDER_NOT_AUTHORIZED(2),
    WRONG_RECIPIENT(3),
    PURCHASE_CANCELLED(4),
    PURCHASE_RETURNED(5),
    DID_NOT_RECEIVE(6),
    NOT_AS_DESCRIBED(7),
    SCAM_REPORT(8),
    WRONG_AMOUNT(9),
    PURCHASE_RETURNED_OR_CANCELLED(10),
    SOMETHING_ELSE(11);

    public final int value;
    public static final KeyScope.Companion Companion = new KeyScope.Companion();
    public static final RequestRefundReason$Companion$ADAPTER$1 ADAPTER = new RequestRefundReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RequestRefundReason.class), Syntax.PROTO_2, null);

    RequestRefundReason(int i) {
        this.value = i;
    }

    public static final RequestRefundReason fromValue(int i) {
        Companion.getClass();
        return KeyScope.Companion.m3973fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
