package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ResolveBNoticeSubmissionStatus implements WireEnum {
    RESOLVE_B_NOTICE_SUBMISSION_STATUS_DEFAULT_UNSPECIFIED(0),
    RESOLVE_B_NOTICE_SUBMISSION_STATUS_SUBMISSION_NOT_NEEDED(1),
    RESOLVE_B_NOTICE_SUBMISSION_STATUS_AWAITING_SUBMISSION(2),
    RESOLVE_B_NOTICE_SUBMISSION_STATUS_SUBMITTED(3);

    public static final ResolveBNoticeSubmissionStatus$Companion$ADAPTER$1 ADAPTER;
    public static final PoolVisibility.Companion Companion;
    public final int value;

    static {
        ResolveBNoticeSubmissionStatus resolveBNoticeSubmissionStatus = RESOLVE_B_NOTICE_SUBMISSION_STATUS_DEFAULT_UNSPECIFIED;
        Companion = new PoolVisibility.Companion();
        ADAPTER = new ResolveBNoticeSubmissionStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ResolveBNoticeSubmissionStatus.class), Syntax.PROTO_2, resolveBNoticeSubmissionStatus);
    }

    ResolveBNoticeSubmissionStatus(int i) {
        this.value = i;
    }

    public static final ResolveBNoticeSubmissionStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return RESOLVE_B_NOTICE_SUBMISSION_STATUS_DEFAULT_UNSPECIFIED;
        }
        if (i == 1) {
            return RESOLVE_B_NOTICE_SUBMISSION_STATUS_SUBMISSION_NOT_NEEDED;
        }
        if (i == 2) {
            return RESOLVE_B_NOTICE_SUBMISSION_STATUS_AWAITING_SUBMISSION;
        }
        if (i != 3) {
            return null;
        }
        return RESOLVE_B_NOTICE_SUBMISSION_STATUS_SUBMITTED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
