package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.MultiCurrencyPaymentReviewRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class MultiCurrencyPaymentReviewRequest$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        MultiCurrencyPaymentReviewRequest.Action.Companion.getClass();
        switch (i) {
            case 1:
                return MultiCurrencyPaymentReviewRequest.Action.EDIT_AMOUNT;
            case 2:
                return MultiCurrencyPaymentReviewRequest.Action.EDIT_RECIPIENT_INFO;
            case 3:
                return MultiCurrencyPaymentReviewRequest.Action.EDIT_DELIVERY_METHOD;
            case 4:
                return MultiCurrencyPaymentReviewRequest.Action.ACCEPT;
            case 5:
                return MultiCurrencyPaymentReviewRequest.Action.DRAWER_PRIMARY;
            case 6:
                return MultiCurrencyPaymentReviewRequest.Action.DRAWER_SECONDARY;
            case 7:
                return MultiCurrencyPaymentReviewRequest.Action.EDIT_SCHEDULE;
            default:
                return null;
        }
    }
}
