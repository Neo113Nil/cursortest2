package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalCashActivity$Row$Source$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalCashActivity.Row.Source.Companion.getClass();
        if (i == 0) {
            return LocalCashActivity.Row.Source.SOURCE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return LocalCashActivity.Row.Source.SOURCE_BUYER_ENROLLED;
    }
}
