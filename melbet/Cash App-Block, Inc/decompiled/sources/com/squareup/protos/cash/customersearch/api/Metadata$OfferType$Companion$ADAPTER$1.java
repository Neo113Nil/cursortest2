package com.squareup.protos.cash.customersearch.api;

import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Metadata$OfferType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Metadata.OfferType.Companion.getClass();
        switch (i) {
            case 0:
                return Metadata.OfferType.UNKNOWN_OFFER_TYPE;
            case 1:
                return Metadata.OfferType.CASH_APP_PAY;
            case 2:
                return Metadata.OfferType.BOOST;
            case 3:
                return Metadata.OfferType.BNPL;
            case 4:
                return Metadata.OfferType.SQ_LOYALTY;
            case 5:
                return Metadata.OfferType.SQ_COUPON;
            case 6:
                return Metadata.OfferType.CASH_AP_INN;
            case 7:
                return Metadata.OfferType.CASH_AP_OON;
            default:
                return null;
        }
    }
}
