package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DetailsPageSpacerSize$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DetailsPageSpacerSize.Companion.getClass();
        if (i == 0) {
            return DetailsPageSpacerSize.DETAILS_PAGE_SPACER_SIZE_UNSPECIFIED;
        }
        if (i == 1) {
            return DetailsPageSpacerSize.DETAILS_PAGE_SPACER_SIZE_MEDIUM;
        }
        if (i != 2) {
            return null;
        }
        return DetailsPageSpacerSize.DETAILS_PAGE_SPACER_SIZE_LARGE;
    }
}
