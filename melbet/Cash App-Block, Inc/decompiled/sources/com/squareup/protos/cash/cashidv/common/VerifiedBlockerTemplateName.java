package com.squareup.protos.cash.cashidv.common;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum VerifiedBlockerTemplateName implements WireEnum {
    VERIFIED_BLOCKER_UNSPECIFIED(0),
    VERIFIED_BLOCKER_DEFAULT(1),
    VERIFIED_BLOCKER_CONTACT_ALIAS(2);

    public static final VerifiedBlockerTemplateName$Companion$ADAPTER$1 ADAPTER;
    public static final Error.Code.Companion Companion;
    public final int value;

    static {
        VerifiedBlockerTemplateName verifiedBlockerTemplateName = VERIFIED_BLOCKER_UNSPECIFIED;
        Companion = new Error.Code.Companion(29);
        ADAPTER = new VerifiedBlockerTemplateName$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(VerifiedBlockerTemplateName.class), Syntax.PROTO_2, verifiedBlockerTemplateName);
    }

    VerifiedBlockerTemplateName(int i) {
        this.value = i;
    }

    public static final VerifiedBlockerTemplateName fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return VERIFIED_BLOCKER_UNSPECIFIED;
        }
        if (i == 1) {
            return VERIFIED_BLOCKER_DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return VERIFIED_BLOCKER_CONTACT_ALIAS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
