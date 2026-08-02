package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.CreateCFPBSettlementCaseResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CreateCFPBSettlementCaseResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreateCFPBSettlementCaseResponse.Status.Companion.getClass();
        if (i == 0) {
            return CreateCFPBSettlementCaseResponse.Status.STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return CreateCFPBSettlementCaseResponse.Status.STATUS_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return CreateCFPBSettlementCaseResponse.Status.STATUS_FAILURE;
    }
}
