package com.squareup.protos.cash.cashidv.common;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum InReviewBlockerTemplateName implements WireEnum {
    IN_REVIEW_UNSPECIFIED(0),
    IN_REVIEW_DEFAULT(1),
    IN_REVIEW_OPTIONAL_ONBOARDING(2),
    IN_REVIEW_DENYLIST_APPEAL(3);

    public static final InReviewBlockerTemplateName$Companion$ADAPTER$1 ADAPTER;
    public static final WorkCookieJar Companion;
    public final int value;

    static {
        InReviewBlockerTemplateName inReviewBlockerTemplateName = IN_REVIEW_UNSPECIFIED;
        Companion = new WorkCookieJar(28);
        ADAPTER = new InReviewBlockerTemplateName$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InReviewBlockerTemplateName.class), Syntax.PROTO_2, inReviewBlockerTemplateName);
    }

    InReviewBlockerTemplateName(int i) {
        this.value = i;
    }

    public static final InReviewBlockerTemplateName fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return IN_REVIEW_UNSPECIFIED;
        }
        if (i == 1) {
            return IN_REVIEW_DEFAULT;
        }
        if (i == 2) {
            return IN_REVIEW_OPTIONAL_ONBOARDING;
        }
        if (i != 3) {
            return null;
        }
        return IN_REVIEW_DENYLIST_APPEAL;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
