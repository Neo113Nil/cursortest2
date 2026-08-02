package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SupportPhoneStatusResponse$ActiveStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SupportPhoneStatusResponse.ActiveStatus.Companion.getClass();
        return TaxEnvironment.Companion.m3928fromValue(i);
    }
}
