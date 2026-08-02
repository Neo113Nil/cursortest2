package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DetailsPageListVariant$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DetailsPageListVariant.Companion.getClass();
        if (i == 0) {
            return DetailsPageListVariant.DETAILS_PAGE_LIST_VARIANT_UNSPECIFIED;
        }
        if (i == 1) {
            return DetailsPageListVariant.DETAILS_PAGE_LIST_VARIANT_STANDARD;
        }
        if (i == 2) {
            return DetailsPageListVariant.DETAILS_PAGE_LIST_VARIANT_SUBTLE;
        }
        if (i != 3) {
            return null;
        }
        return DetailsPageListVariant.DETAILS_PAGE_LIST_VARIANT_GREEN;
    }
}
