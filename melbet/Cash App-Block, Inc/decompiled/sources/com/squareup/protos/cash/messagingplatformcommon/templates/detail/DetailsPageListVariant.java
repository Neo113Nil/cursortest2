package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum DetailsPageListVariant implements WireEnum {
    DETAILS_PAGE_LIST_VARIANT_UNSPECIFIED(0),
    DETAILS_PAGE_LIST_VARIANT_STANDARD(1),
    DETAILS_PAGE_LIST_VARIANT_SUBTLE(2),
    DETAILS_PAGE_LIST_VARIANT_GREEN(3);

    public static final DetailsPageListVariant$Companion$ADAPTER$1 ADAPTER;
    public static final Origin.Companion Companion;
    public final int value;

    static {
        DetailsPageListVariant detailsPageListVariant = DETAILS_PAGE_LIST_VARIANT_UNSPECIFIED;
        Companion = new Origin.Companion();
        ADAPTER = new DetailsPageListVariant$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DetailsPageListVariant.class), Syntax.PROTO_2, detailsPageListVariant);
    }

    DetailsPageListVariant(int i) {
        this.value = i;
    }

    public static final DetailsPageListVariant fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return DETAILS_PAGE_LIST_VARIANT_UNSPECIFIED;
        }
        if (i == 1) {
            return DETAILS_PAGE_LIST_VARIANT_STANDARD;
        }
        if (i == 2) {
            return DETAILS_PAGE_LIST_VARIANT_SUBTLE;
        }
        if (i != 3) {
            return null;
        }
        return DETAILS_PAGE_LIST_VARIANT_GREEN;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
