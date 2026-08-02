package com.squareup.protos.cash.local.client.app.v1;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum MarketingMessageSubjectType implements WireEnum {
    MARKETING_MESSAGE_SUBJECT_TYPE_UNSPECIFIED(0),
    MARKETING_MESSAGE_SUBJECT_TYPE_BRAND(1),
    MARKETING_MESSAGE_SUBJECT_TYPE_LOCATION(2);

    public static final MarketingMessageSubjectType$Companion$ADAPTER$1 ADAPTER;
    public static final RetailerType.Companion Companion;
    public final int value;

    static {
        MarketingMessageSubjectType marketingMessageSubjectType = MARKETING_MESSAGE_SUBJECT_TYPE_UNSPECIFIED;
        Companion = new RetailerType.Companion();
        ADAPTER = new MarketingMessageSubjectType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MarketingMessageSubjectType.class), Syntax.PROTO_2, marketingMessageSubjectType);
    }

    MarketingMessageSubjectType(int i) {
        this.value = i;
    }

    public static final MarketingMessageSubjectType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return MARKETING_MESSAGE_SUBJECT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return MARKETING_MESSAGE_SUBJECT_TYPE_BRAND;
        }
        if (i != 2) {
            return null;
        }
        return MARKETING_MESSAGE_SUBJECT_TYPE_LOCATION;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
