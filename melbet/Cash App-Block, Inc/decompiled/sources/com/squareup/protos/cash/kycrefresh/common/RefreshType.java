package com.squareup.protos.cash.kycrefresh.common;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum RefreshType implements WireEnum {
    REFRESH_TYPE_UNSPECIFIED(0),
    PERSONAL_INFO(1),
    DIDV(2),
    SOW_SOF(3);

    public static final RetailerType.Companion Companion;
    public final int value;

    static {
        RefreshType refreshType = REFRESH_TYPE_UNSPECIFIED;
        Companion = new RetailerType.Companion();
        new RefreshType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RefreshType.class), Syntax.PROTO_2, refreshType);
    }

    RefreshType(int i) {
        this.value = i;
    }

    public static final RefreshType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return REFRESH_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PERSONAL_INFO;
        }
        if (i == 2) {
            return DIDV;
        }
        if (i != 3) {
            return null;
        }
        return SOW_SOF;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
