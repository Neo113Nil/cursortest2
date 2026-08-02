package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class KybUseCase$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        KybUseCase.Companion.getClass();
        if (i == 0) {
            return KybUseCase.KYB_USE_CASE_UNSPECIFIED;
        }
        if (i == 1) {
            return KybUseCase.KYB_USE_CASE_BUSINESS_ACCOUNT_CREATION;
        }
        if (i == 2) {
            return KybUseCase.KYB_USE_CASE_UPGRADE_TO_BUSINESS;
        }
        if (i != 3) {
            return null;
        }
        return KybUseCase.KYB_USE_CASE_REMEDIATION;
    }
}
