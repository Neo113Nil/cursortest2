package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$FinancialDataSharing$DataSharingDuration$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Action.OAuth.Metadata.FinancialDataSharing.DataSharingDuration.Companion.getClass();
        if (i == 1) {
            return Action.OAuth.Metadata.FinancialDataSharing.DataSharingDuration.ONE_DAY;
        }
        if (i == 2) {
            return Action.OAuth.Metadata.FinancialDataSharing.DataSharingDuration.THIRTY_DAYS;
        }
        if (i == 3) {
            return Action.OAuth.Metadata.FinancialDataSharing.DataSharingDuration.THREE_MONTHS;
        }
        if (i != 4) {
            return null;
        }
        return Action.OAuth.Metadata.FinancialDataSharing.DataSharingDuration.ONE_YEAR;
    }
}
