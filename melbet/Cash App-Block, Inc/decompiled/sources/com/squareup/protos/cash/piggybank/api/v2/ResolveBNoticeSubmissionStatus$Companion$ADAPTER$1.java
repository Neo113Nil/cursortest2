package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ResolveBNoticeSubmissionStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ResolveBNoticeSubmissionStatus.Companion.getClass();
        if (i == 0) {
            return ResolveBNoticeSubmissionStatus.RESOLVE_B_NOTICE_SUBMISSION_STATUS_DEFAULT_UNSPECIFIED;
        }
        if (i == 1) {
            return ResolveBNoticeSubmissionStatus.RESOLVE_B_NOTICE_SUBMISSION_STATUS_SUBMISSION_NOT_NEEDED;
        }
        if (i == 2) {
            return ResolveBNoticeSubmissionStatus.RESOLVE_B_NOTICE_SUBMISSION_STATUS_AWAITING_SUBMISSION;
        }
        if (i != 3) {
            return null;
        }
        return ResolveBNoticeSubmissionStatus.RESOLVE_B_NOTICE_SUBMISSION_STATUS_SUBMITTED;
    }
}
