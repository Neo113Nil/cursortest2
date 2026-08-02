package com.squareup.protos.cash.cashidv.common;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum SsnCollectionBlockerTemplateName implements WireEnum {
    SSN_COLLECTION_UNSPECIFIED(0),
    SSN_COLLECTION_DEFAULT(1),
    SSN_COLLECTION_OPTIONAL_ONBOARDING(2);

    public static final SsnCollectionBlockerTemplateName$Companion$ADAPTER$1 ADAPTER;
    public static final CardProduct.Companion Companion;
    public final int value;

    static {
        SsnCollectionBlockerTemplateName ssnCollectionBlockerTemplateName = SSN_COLLECTION_UNSPECIFIED;
        Companion = new CardProduct.Companion(29);
        ADAPTER = new SsnCollectionBlockerTemplateName$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SsnCollectionBlockerTemplateName.class), Syntax.PROTO_2, ssnCollectionBlockerTemplateName);
    }

    SsnCollectionBlockerTemplateName(int i) {
        this.value = i;
    }

    public static final SsnCollectionBlockerTemplateName fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return SSN_COLLECTION_UNSPECIFIED;
        }
        if (i == 1) {
            return SSN_COLLECTION_DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return SSN_COLLECTION_OPTIONAL_ONBOARDING;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
