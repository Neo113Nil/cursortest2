package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.GenericNonPaymentRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class GenericNonPaymentRenderData$HelpCenterLinkType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GenericNonPaymentRenderData.HelpCenterLinkType.Companion.getClass();
        if (i == 1) {
            return GenericNonPaymentRenderData.HelpCenterLinkType.DEFAULT;
        }
        if (i == 2) {
            return GenericNonPaymentRenderData.HelpCenterLinkType.LOGIN;
        }
        if (i == 3) {
            return GenericNonPaymentRenderData.HelpCenterLinkType.REFUND_FAILED;
        }
        if (i != 4) {
            return null;
        }
        return GenericNonPaymentRenderData.HelpCenterLinkType.SPONSORED_ACCOUNT;
    }
}
