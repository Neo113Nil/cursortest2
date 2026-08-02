package com.squareup.protos.cash.cashidv.common;

import com.squareup.cropview.Edge;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum NotVerifiedBlockerTemplateName implements WireEnum {
    NOT_VERIFIED_UNSPECIFIED(0),
    NOT_VERIFIED_DEFAULT(1),
    NOT_VERIFIED_OPTIONAL_ONBOARDING(2),
    NOT_VERIFIED_LOGGED_OUT(3),
    NOT_VERIFIED_DENYLIST_APPEAL(4);

    public static final NotVerifiedBlockerTemplateName$Companion$ADAPTER$1 ADAPTER;
    public static final Edge.Companion Companion;
    public final int value;

    static {
        NotVerifiedBlockerTemplateName notVerifiedBlockerTemplateName = NOT_VERIFIED_UNSPECIFIED;
        Companion = new Edge.Companion(28);
        ADAPTER = new NotVerifiedBlockerTemplateName$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NotVerifiedBlockerTemplateName.class), Syntax.PROTO_2, notVerifiedBlockerTemplateName);
    }

    NotVerifiedBlockerTemplateName(int i) {
        this.value = i;
    }

    public static final NotVerifiedBlockerTemplateName fromValue(int i) {
        Companion.getClass();
        return Edge.Companion.m3829fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
