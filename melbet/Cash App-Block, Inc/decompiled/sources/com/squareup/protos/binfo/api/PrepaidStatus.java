package com.squareup.protos.binfo.api;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PrepaidStatus implements WireEnum {
    DEFAULT_CATEGORY_DO_NOT_USE(1),
    NOT_PREPAID(2),
    PREPAID(3);

    public final int value;
    public static final Error.Code.Companion Companion = new Error.Code.Companion(15);
    public static final PrepaidStatus$Companion$ADAPTER$1 ADAPTER = new PrepaidStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PrepaidStatus.class), Syntax.PROTO_2, null);

    PrepaidStatus(int i) {
        this.value = i;
    }

    public static final PrepaidStatus fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return DEFAULT_CATEGORY_DO_NOT_USE;
        }
        if (i == 2) {
            return NOT_PREPAID;
        }
        if (i != 3) {
            return null;
        }
        return PREPAID;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
