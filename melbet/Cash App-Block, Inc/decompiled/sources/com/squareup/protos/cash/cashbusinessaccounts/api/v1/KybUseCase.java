package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum KybUseCase implements WireEnum {
    KYB_USE_CASE_UNSPECIFIED(0),
    KYB_USE_CASE_BUSINESS_ACCOUNT_CREATION(1),
    KYB_USE_CASE_UPGRADE_TO_BUSINESS(2),
    KYB_USE_CASE_REMEDIATION(3);

    public static final KybUseCase$Companion$ADAPTER$1 ADAPTER;
    public static final CardProduct.Companion Companion;
    public final int value;

    static {
        KybUseCase kybUseCase = KYB_USE_CASE_UNSPECIFIED;
        Companion = new CardProduct.Companion(22);
        ADAPTER = new KybUseCase$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(KybUseCase.class), Syntax.PROTO_2, kybUseCase);
    }

    KybUseCase(int i) {
        this.value = i;
    }

    public static final KybUseCase fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return KYB_USE_CASE_UNSPECIFIED;
        }
        if (i == 1) {
            return KYB_USE_CASE_BUSINESS_ACCOUNT_CREATION;
        }
        if (i == 2) {
            return KYB_USE_CASE_UPGRADE_TO_BUSINESS;
        }
        if (i != 3) {
            return null;
        }
        return KYB_USE_CASE_REMEDIATION;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
