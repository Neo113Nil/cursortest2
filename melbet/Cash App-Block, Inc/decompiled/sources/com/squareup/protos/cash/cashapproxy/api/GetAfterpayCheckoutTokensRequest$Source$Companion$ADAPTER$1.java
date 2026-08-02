package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.protos.cash.cashapproxy.api.GetAfterpayCheckoutTokensRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetAfterpayCheckoutTokensRequest$Source$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetAfterpayCheckoutTokensRequest.Source.Companion.getClass();
        if (i == 0) {
            return GetAfterpayCheckoutTokensRequest.Source.SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return GetAfterpayCheckoutTokensRequest.Source.SOURCE_CODE_GREEN;
        }
        if (i != 2) {
            return null;
        }
        return GetAfterpayCheckoutTokensRequest.Source.SOURCE_AP_APPLET;
    }
}
