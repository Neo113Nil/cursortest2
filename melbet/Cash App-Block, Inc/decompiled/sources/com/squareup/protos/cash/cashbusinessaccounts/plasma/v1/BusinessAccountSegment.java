package com.squareup.protos.cash.cashbusinessaccounts.plasma.v1;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum BusinessAccountSegment implements WireEnum {
    X_SMALL(0),
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    public static final BusinessAccountSegment$Companion$ADAPTER$1 ADAPTER;
    public static final WorkCookieJar Companion;
    public final int value;

    static {
        BusinessAccountSegment businessAccountSegment = X_SMALL;
        Companion = new WorkCookieJar(22);
        ADAPTER = new BusinessAccountSegment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BusinessAccountSegment.class), Syntax.PROTO_2, businessAccountSegment);
    }

    BusinessAccountSegment(int i) {
        this.value = i;
    }

    public static final BusinessAccountSegment fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return X_SMALL;
        }
        if (i == 1) {
            return SMALL;
        }
        if (i == 2) {
            return MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return LARGE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
