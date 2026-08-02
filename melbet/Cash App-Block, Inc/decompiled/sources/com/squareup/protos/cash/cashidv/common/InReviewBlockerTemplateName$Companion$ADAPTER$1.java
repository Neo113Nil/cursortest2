package com.squareup.protos.cash.cashidv.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class InReviewBlockerTemplateName$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InReviewBlockerTemplateName.Companion.getClass();
        if (i == 0) {
            return InReviewBlockerTemplateName.IN_REVIEW_UNSPECIFIED;
        }
        if (i == 1) {
            return InReviewBlockerTemplateName.IN_REVIEW_DEFAULT;
        }
        if (i == 2) {
            return InReviewBlockerTemplateName.IN_REVIEW_OPTIONAL_ONBOARDING;
        }
        if (i != 3) {
            return null;
        }
        return InReviewBlockerTemplateName.IN_REVIEW_DENYLIST_APPEAL;
    }
}
