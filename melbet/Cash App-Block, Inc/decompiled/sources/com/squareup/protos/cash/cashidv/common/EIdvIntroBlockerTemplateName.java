package com.squareup.protos.cash.cashidv.common;

import com.squareup.cash.notifications.Op;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum EIdvIntroBlockerTemplateName implements WireEnum {
    EIDV_INTRO_UNSPECIFIED(0),
    EIDV_INTRO_DEFAULT(1),
    EIDV_INTRO_TEEN_GRADUATION(2),
    EIDV_INTRO_CONTACT_ALIAS(3);

    public static final EIdvIntroBlockerTemplateName$Companion$ADAPTER$1 ADAPTER;
    public static final Op.Companion Companion;
    public final int value;

    static {
        EIdvIntroBlockerTemplateName eIdvIntroBlockerTemplateName = EIDV_INTRO_UNSPECIFIED;
        Companion = new Op.Companion();
        ADAPTER = new EIdvIntroBlockerTemplateName$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EIdvIntroBlockerTemplateName.class), Syntax.PROTO_2, eIdvIntroBlockerTemplateName);
    }

    EIdvIntroBlockerTemplateName(int i) {
        this.value = i;
    }

    public static final EIdvIntroBlockerTemplateName fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return EIDV_INTRO_UNSPECIFIED;
        }
        if (i == 1) {
            return EIDV_INTRO_DEFAULT;
        }
        if (i == 2) {
            return EIDV_INTRO_TEEN_GRADUATION;
        }
        if (i != 3) {
            return null;
        }
        return EIDV_INTRO_CONTACT_ALIAS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
