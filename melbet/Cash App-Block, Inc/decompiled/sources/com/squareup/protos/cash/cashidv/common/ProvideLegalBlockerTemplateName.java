package com.squareup.protos.cash.cashidv.common;

import com.squareup.cash.notifications.Op;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum ProvideLegalBlockerTemplateName implements WireEnum {
    PROVIDE_LEGAL_NAME_UNSPECIFIED(0),
    PROVIDE_LEGAL_NAME_DEFAULT(1),
    PROVIDE_LEGAL_NAME_CONFIRM_IDENTITY_FLOW(3),
    PROVIDE_LEGAL_NAME_P2P(4),
    PROVIDE_LEGAL_NAME_IDV_ONBOARDING(5),
    PROVIDE_LEGAL_NAME_DEFAULT_2(6),
    PROVIDE_LEGAL_NAME_CONFIRM_TEEN_ACCOUNT(7),
    PROVIDE_LEGAL_NAME_CONFIRM_KID_ACCOUNT(8),
    PROVIDE_LEGAL_NAME_REQUEST_SPONSORSHIP(9),
    PROVIDE_LEGAL_NAME_REQUEST_SPONSORSHIP_SPONSOR_LED(10),
    PROVIDE_LEGAL_NAME_ONBOARDING(11),
    PROVIDE_LEGAL_NAME_RE_IDV(12),
    PROVIDE_LEGAL_NAME_PHONE_PLAN(13);

    public static final ProvideLegalBlockerTemplateName$Companion$ADAPTER$1 ADAPTER;
    public static final Op.Companion Companion;
    public final int value;

    static {
        ProvideLegalBlockerTemplateName provideLegalBlockerTemplateName = PROVIDE_LEGAL_NAME_UNSPECIFIED;
        Companion = new Op.Companion();
        ADAPTER = new ProvideLegalBlockerTemplateName$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ProvideLegalBlockerTemplateName.class), Syntax.PROTO_2, provideLegalBlockerTemplateName);
    }

    ProvideLegalBlockerTemplateName(int i) {
        this.value = i;
    }

    public static final ProvideLegalBlockerTemplateName fromValue(int i) {
        Companion.getClass();
        return Op.Companion.m3675fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
