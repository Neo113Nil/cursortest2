package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum BitcoinState implements WireEnum {
    SUBMITTED(1),
    PROCESSING(2),
    COMPLETE(3),
    REVIEWING(4),
    REVIEW_APPROVED(5),
    REVIEW_DECLINED(6),
    INCOMPLETE(7),
    REVIEW_FROZEN(8),
    INCOMPLETE_DECLINED(9),
    INCOMPLETE_FROZEN(10),
    CANCELED(11),
    SALE_COMPLETE(12),
    RISK_REVIEWING(13);

    public final int value;
    public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
    public static final BitcoinState$Companion$ADAPTER$1 ADAPTER = new BitcoinState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BitcoinState.class), Syntax.PROTO_2, null);

    BitcoinState(int i) {
        this.value = i;
    }

    public static final BitcoinState fromValue(int i) {
        Companion.getClass();
        return UiControl.Type.Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
