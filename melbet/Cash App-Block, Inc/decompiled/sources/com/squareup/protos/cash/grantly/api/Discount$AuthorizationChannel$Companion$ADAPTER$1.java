package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Discount;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Discount$AuthorizationChannel$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Discount.AuthorizationChannel.Companion.getClass();
        if (i == 1) {
            return Discount.AuthorizationChannel.IN_PERSON;
        }
        if (i == 2) {
            return Discount.AuthorizationChannel.ONLINE;
        }
        if (i != 3) {
            return null;
        }
        return Discount.AuthorizationChannel.IN_APP;
    }
}
