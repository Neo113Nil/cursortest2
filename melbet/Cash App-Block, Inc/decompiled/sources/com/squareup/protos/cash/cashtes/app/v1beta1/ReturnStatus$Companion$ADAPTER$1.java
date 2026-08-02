package com.squareup.protos.cash.cashtes.app.v1beta1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ReturnStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ReturnStatus.Companion.getClass();
        switch (i) {
            case 0:
                return ReturnStatus.RETURN_STATUS_UNSPECIFIED;
            case 1:
                return ReturnStatus.RETURN_STATUS_NOT_STARTED;
            case 2:
                return ReturnStatus.RETURN_STATUS_INCOME_AND_EXPENSES;
            case 3:
                return ReturnStatus.RETURN_STATUS_REVIEW_AND_FILE;
            case 4:
                return ReturnStatus.RETURN_STATUS_SUBMITTED;
            case 5:
                return ReturnStatus.RETURN_STATUS_REJECTED;
            case 6:
                return ReturnStatus.RETURN_STATUS_ACCEPTED;
            default:
                return null;
        }
    }
}
