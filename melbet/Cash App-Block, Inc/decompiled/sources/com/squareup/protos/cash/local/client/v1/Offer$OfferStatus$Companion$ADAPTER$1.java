package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.Offer;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Offer$OfferStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Offer.OfferStatus.Companion.getClass();
        if (i == 0) {
            return Offer.OfferStatus.OFFER_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return Offer.OfferStatus.OFFER_STATUS_ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return Offer.OfferStatus.OFFER_STATUS_REDEEMED;
    }
}
