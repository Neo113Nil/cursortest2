package com.squareup.protos.cash.cashface.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ReportState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ReportState.Companion.getClass();
        if (i == 1) {
            return ReportState.REPORTED;
        }
        if (i == 2) {
            return ReportState.NOT_REPORTED;
        }
        if (i != 3) {
            return null;
        }
        return ReportState.NOT_APPLICABLE;
    }
}
