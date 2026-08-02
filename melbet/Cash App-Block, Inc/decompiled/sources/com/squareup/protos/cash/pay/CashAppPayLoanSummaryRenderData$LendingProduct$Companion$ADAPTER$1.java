package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayLoanSummaryRenderData$LendingProduct$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayLoanSummaryRenderData.LendingProduct.Companion.getClass();
        if (i == 0) {
            return CashAppPayLoanSummaryRenderData.LendingProduct.LENDING_PRODUCT_UNKNOWN;
        }
        if (i == 1) {
            return CashAppPayLoanSummaryRenderData.LendingProduct.LENDING_PRODUCT_AFTERPAY;
        }
        if (i == 2) {
            return CashAppPayLoanSummaryRenderData.LendingProduct.LENDING_PRODUCT_SINGLE_USE_PAYMENT;
        }
        if (i != 3) {
            return null;
        }
        return CashAppPayLoanSummaryRenderData.LendingProduct.LENDING_PRODUCT_CF_BNPL;
    }
}
