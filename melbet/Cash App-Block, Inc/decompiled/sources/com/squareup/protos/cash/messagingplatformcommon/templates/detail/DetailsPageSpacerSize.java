package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum DetailsPageSpacerSize implements WireEnum {
    DETAILS_PAGE_SPACER_SIZE_UNSPECIFIED(0),
    DETAILS_PAGE_SPACER_SIZE_MEDIUM(1),
    DETAILS_PAGE_SPACER_SIZE_LARGE(2);

    public static final DetailsPageSpacerSize$Companion$ADAPTER$1 ADAPTER;
    public static final SliceStatus.Companion Companion;
    public final int value;

    static {
        DetailsPageSpacerSize detailsPageSpacerSize = DETAILS_PAGE_SPACER_SIZE_UNSPECIFIED;
        Companion = new SliceStatus.Companion();
        ADAPTER = new DetailsPageSpacerSize$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DetailsPageSpacerSize.class), Syntax.PROTO_2, detailsPageSpacerSize);
    }

    DetailsPageSpacerSize(int i) {
        this.value = i;
    }

    public static final DetailsPageSpacerSize fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return DETAILS_PAGE_SPACER_SIZE_UNSPECIFIED;
        }
        if (i == 1) {
            return DETAILS_PAGE_SPACER_SIZE_MEDIUM;
        }
        if (i != 2) {
            return null;
        }
        return DETAILS_PAGE_SPACER_SIZE_LARGE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
