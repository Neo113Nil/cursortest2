package com.squareup.protos.cash.cashbusinessaccounts.plasma.v1;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum EntryPointType implements WireEnum {
    REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION(1),
    IN_APP(2);

    public final int value;
    public static final CardProduct.Companion Companion = new CardProduct.Companion(23);
    public static final EntryPointType$Companion$ADAPTER$1 ADAPTER = new EntryPointType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EntryPointType.class), Syntax.PROTO_2, null);

    EntryPointType(int i) {
        this.value = i;
    }

    public static final EntryPointType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION;
        }
        if (i != 2) {
            return null;
        }
        return IN_APP;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
