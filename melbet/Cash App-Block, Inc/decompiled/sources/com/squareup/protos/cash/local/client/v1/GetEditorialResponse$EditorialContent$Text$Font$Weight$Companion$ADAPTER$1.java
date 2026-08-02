package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$Text$Font$Weight$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetEditorialResponse.EditorialContent.Text.Font.Weight.Companion.getClass();
        return RetailerType.Companion.m3903fromValue(i);
    }
}
