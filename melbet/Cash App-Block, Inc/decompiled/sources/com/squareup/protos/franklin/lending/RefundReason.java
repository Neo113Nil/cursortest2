package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum RefundReason implements WireEnum {
    CAPTURE_WINDOW_EXPIRED(1),
    ITEM_RETURN(2),
    SINGLE_USE_PAYMENT_DOWN_PAYMENT_DISPUTE_WIN(3),
    SINGLE_USE_PAYMENT_ORDER_BUFFER(4),
    CARD_TRANSACTION_REFUNDED(5),
    CARD_TRANSACTION_DECLINED(6),
    EARLY_REPAYMENT_FEE_REFUND(7),
    CARD_TRANSACTION_DISPUTE_WRITE_OFF_RECEIVED(8),
    BANKRUPTCY_REPORTED(9),
    ACCOUNT_TAKEOVER_REPORTED(10),
    ADMIN_INITIATED_VOID(11),
    DECEASED_REPORTED(12),
    CARD_TRANSACTION_DISPUTE_PARTIAL_WRITE_OFF(13);

    public final int value;
    public static final LinkResult.Companion Companion = new LinkResult.Companion();
    public static final RefundReason$Companion$ADAPTER$1 ADAPTER = new RefundReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RefundReason.class), Syntax.PROTO_2, null);

    RefundReason(int i) {
        this.value = i;
    }

    public static final RefundReason fromValue(int i) {
        Companion.getClass();
        return LinkResult.Companion.m3960fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
