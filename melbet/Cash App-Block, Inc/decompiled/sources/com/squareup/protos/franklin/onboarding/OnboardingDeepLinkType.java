package com.squareup.protos.franklin.onboarding;

import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum OnboardingDeepLinkType implements WireEnum {
    UNKNOWN(0),
    LOYALTY(1),
    TAXES(2),
    CASH_APP_PAY(3),
    INVITATION(4),
    WEB_ENFORCE_ONBOARDING(5),
    ACCOUNT_SWITCH(6),
    CASH_LOCAL(7),
    OON_P2P(8),
    GRANT_FLOW(9),
    STAFF_INVITATION(10),
    UNAUTHED_CARD_STUDIO(11),
    CASH_FOR_WORK_GRADUATION(12);

    public static final OnboardingDeepLinkType$Companion$ADAPTER$1 ADAPTER;
    public static final KeyScope.Companion Companion;
    public final int value;

    static {
        OnboardingDeepLinkType onboardingDeepLinkType = UNKNOWN;
        Companion = new KeyScope.Companion();
        ADAPTER = new OnboardingDeepLinkType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OnboardingDeepLinkType.class), Syntax.PROTO_2, onboardingDeepLinkType);
    }

    OnboardingDeepLinkType(int i) {
        this.value = i;
    }

    public static final OnboardingDeepLinkType fromValue(int i) {
        Companion.getClass();
        return KeyScope.Companion.m3972fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
