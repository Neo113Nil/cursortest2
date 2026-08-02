package com.squareup.protos.cash.cashtes.app.v1beta1;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ReturnStatus implements WireEnum {
    RETURN_STATUS_UNSPECIFIED(0),
    RETURN_STATUS_NOT_STARTED(1),
    RETURN_STATUS_INCOME_AND_EXPENSES(2),
    RETURN_STATUS_REVIEW_AND_FILE(3),
    RETURN_STATUS_SUBMITTED(4),
    RETURN_STATUS_REJECTED(5),
    RETURN_STATUS_ACCEPTED(6);

    public static final ReturnStatus$Companion$ADAPTER$1 ADAPTER;
    public static final ImageLayout.Companion Companion;
    public final int value;

    static {
        ReturnStatus returnStatus = RETURN_STATUS_UNSPECIFIED;
        Companion = new ImageLayout.Companion();
        ADAPTER = new ReturnStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ReturnStatus.class), Syntax.PROTO_2, returnStatus);
    }

    ReturnStatus(int i) {
        this.value = i;
    }

    public static final ReturnStatus fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return RETURN_STATUS_UNSPECIFIED;
            case 1:
                return RETURN_STATUS_NOT_STARTED;
            case 2:
                return RETURN_STATUS_INCOME_AND_EXPENSES;
            case 3:
                return RETURN_STATUS_REVIEW_AND_FILE;
            case 4:
                return RETURN_STATUS_SUBMITTED;
            case 5:
                return RETURN_STATUS_REJECTED;
            case 6:
                return RETURN_STATUS_ACCEPTED;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
