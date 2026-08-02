package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum StablecoinRejectReason implements WireEnum {
    LIMITED_WEEKLY(1),
    CUSTOMER_NOT_ELIGIBLE(2),
    RISK_BLOCKED(3);

    public final int value;
    public static final LinkResult.Companion Companion = new LinkResult.Companion();
    public static final StablecoinRejectReason$Companion$ADAPTER$1 ADAPTER = new StablecoinRejectReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(StablecoinRejectReason.class), Syntax.PROTO_2, null);

    StablecoinRejectReason(int i) {
        this.value = i;
    }

    public static final StablecoinRejectReason fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return LIMITED_WEEKLY;
        }
        if (i == 2) {
            return CUSTOMER_NOT_ELIGIBLE;
        }
        if (i != 3) {
            return null;
        }
        return RISK_BLOCKED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
