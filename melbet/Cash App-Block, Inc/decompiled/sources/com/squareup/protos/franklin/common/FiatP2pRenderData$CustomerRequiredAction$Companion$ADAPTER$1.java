package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.FiatP2pRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class FiatP2pRenderData$CustomerRequiredAction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FiatP2pRenderData.CustomerRequiredAction.Companion.getClass();
        switch (i) {
            case 1:
                return FiatP2pRenderData.CustomerRequiredAction.IDV;
            case 2:
                return FiatP2pRenderData.CustomerRequiredAction.CONFIRM;
            case 3:
                return FiatP2pRenderData.CustomerRequiredAction.KNOW_YOUR_CUSTOMER_REFRESH;
            case 4:
                return FiatP2pRenderData.CustomerRequiredAction.SOURCE_OF_FUNDS_REFRESH;
            case 5:
                return FiatP2pRenderData.CustomerRequiredAction.PROVIDE_LEGAL_NAME;
            case 6:
                return FiatP2pRenderData.CustomerRequiredAction.PASSCODE_AUTHENTICATION;
            case 7:
                return FiatP2pRenderData.CustomerRequiredAction.GENERIC_ACTION_REQUIRED;
            default:
                return null;
        }
    }
}
