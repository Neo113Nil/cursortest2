package com.squareup.protos.cash.local.client.app.v1;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public enum MarketingMessageType implements WireEnum {
    MARKETING_MESSAGE_TYPE_UNSPECIFIED(0),
    MARKETING_MESSAGE_TYPE_GENERAL(1),
    MARKETING_MESSAGE_TYPE_PROMOTIONAL(2),
    MARKETING_MESSAGE_TYPE_COUPON(3),
    MARKETING_MESSAGE_TYPE_COUPON_WITH_ITEM(4);

    public static final MarketingMessageType$Companion$ADAPTER$1 ADAPTER;
    public static final UiAlias.Type.Companion Companion;
    public final int value;

    static {
        MarketingMessageType marketingMessageType = MARKETING_MESSAGE_TYPE_UNSPECIFIED;
        Companion = new UiAlias.Type.Companion();
        ADAPTER = new MarketingMessageType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MarketingMessageType.class), Syntax.PROTO_2, marketingMessageType);
    }

    MarketingMessageType(int i) {
        this.value = i;
    }

    public static final MarketingMessageType fromValue(int i) {
        Companion.getClass();
        return UiAlias.Type.Companion.m3941fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
