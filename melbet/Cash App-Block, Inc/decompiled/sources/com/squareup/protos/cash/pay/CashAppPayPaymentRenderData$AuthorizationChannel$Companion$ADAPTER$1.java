package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayPaymentRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayPaymentRenderData$AuthorizationChannel$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayPaymentRenderData.AuthorizationChannel.Companion.getClass();
        if (i == 0) {
            return CashAppPayPaymentRenderData.AuthorizationChannel.UNKNOWN_AUTHORIZATION_CHANNEL;
        }
        if (i == 1) {
            return CashAppPayPaymentRenderData.AuthorizationChannel.IN_PERSON_AUTHORIZATION_CHANNEL;
        }
        if (i == 2) {
            return CashAppPayPaymentRenderData.AuthorizationChannel.ONLINE_AUTHORIZATION_CHANNEL;
        }
        if (i != 3) {
            return null;
        }
        return CashAppPayPaymentRenderData.AuthorizationChannel.IN_APP_AUTHORIZATION_CHANNEL;
    }
}
