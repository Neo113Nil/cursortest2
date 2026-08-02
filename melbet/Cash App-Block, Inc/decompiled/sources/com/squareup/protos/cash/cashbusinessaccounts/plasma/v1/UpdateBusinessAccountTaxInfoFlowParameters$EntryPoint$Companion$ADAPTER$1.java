package com.squareup.protos.cash.cashbusinessaccounts.plasma.v1;

import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.UpdateBusinessAccountTaxInfoFlowParameters;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class UpdateBusinessAccountTaxInfoFlowParameters$EntryPoint$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.Companion.getClass();
        switch (i) {
            case 1:
                return UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_EMAIL;
            case 2:
                return UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_SMS;
            case 3:
                return UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_PUSH;
            case 4:
                return UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_IAM_INLINE;
            case 5:
                return UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_IAM_POPUP;
            case 6:
                return UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.IN_APP_BUSINESS_INFO_SECTION;
            case 7:
                return UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION_TAX_CHANGES_INFO;
            default:
                return null;
        }
    }
}
