package com.squareup.protos.cash.blockly.api;

import com.squareup.protos.cash.blockly.api.ReportAbuseResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ReportAbuseResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ReportAbuseResponse.Status.Companion.getClass();
        if (i == 0) {
            return ReportAbuseResponse.Status.SUCCESS;
        }
        if (i != 1) {
            return null;
        }
        return ReportAbuseResponse.Status.FAILURE;
    }
}
