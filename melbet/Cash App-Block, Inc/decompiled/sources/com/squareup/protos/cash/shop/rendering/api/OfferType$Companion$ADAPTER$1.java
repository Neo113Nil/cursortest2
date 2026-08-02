package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class OfferType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OfferType.Companion.getClass();
        switch (i) {
            case 1:
                return OfferType.PAY_LESS_CLO;
            case 2:
                return OfferType.PAY_LESS_AFFILIATE;
            case 3:
                return OfferType.PAY_LESS_CAP;
            case 4:
                return OfferType.PAY_LATER_AFTERPAY;
            case 5:
                return OfferType.PAY_LATER_SUP;
            case 6:
                return OfferType.PAY_LATER_INN;
            case 7:
                return OfferType.PAY_LATER_OON;
            default:
                return null;
        }
    }
}
