package com.squareup.protos.cash.cashidv.common;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum EIdvIntroScreenOption implements WireEnum {
    SHOW_WHEN_LEGAL_NAME_ALREADY_COLLECTED(0),
    ALWAYS_SUPPRESS(1),
    ALWAYS_SHOW(2);

    public static final EIdvIntroScreenOption$Companion$ADAPTER$1 ADAPTER;
    public static final CardProduct.Companion Companion;
    public final int value;

    static {
        EIdvIntroScreenOption eIdvIntroScreenOption = SHOW_WHEN_LEGAL_NAME_ALREADY_COLLECTED;
        Companion = new CardProduct.Companion(28);
        ADAPTER = new EIdvIntroScreenOption$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EIdvIntroScreenOption.class), Syntax.PROTO_2, eIdvIntroScreenOption);
    }

    EIdvIntroScreenOption(int i) {
        this.value = i;
    }

    public static final EIdvIntroScreenOption fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return SHOW_WHEN_LEGAL_NAME_ALREADY_COLLECTED;
        }
        if (i == 1) {
            return ALWAYS_SUPPRESS;
        }
        if (i != 2) {
            return null;
        }
        return ALWAYS_SHOW;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
