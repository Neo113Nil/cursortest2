package com.squareup.protos.cash.cashidv.common;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum EidvFailedBlockerTemplateName implements WireEnum {
    EIDV_FAILED_UNSPECIFIED(0),
    EIDV_FAILED_DEFAULT(1),
    EIDV_FAILED_OPTIONAL_ONBOARDING(2);

    public static final EidvFailedBlockerTemplateName$Companion$ADAPTER$1 ADAPTER;
    public static final Error.Code.Companion Companion;
    public final int value;

    static {
        EidvFailedBlockerTemplateName eidvFailedBlockerTemplateName = EIDV_FAILED_UNSPECIFIED;
        Companion = new Error.Code.Companion(28);
        ADAPTER = new EidvFailedBlockerTemplateName$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EidvFailedBlockerTemplateName.class), Syntax.PROTO_2, eidvFailedBlockerTemplateName);
    }

    EidvFailedBlockerTemplateName(int i) {
        this.value = i;
    }

    public static final EidvFailedBlockerTemplateName fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return EIDV_FAILED_UNSPECIFIED;
        }
        if (i == 1) {
            return EIDV_FAILED_DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return EIDV_FAILED_OPTIONAL_ONBOARDING;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
