package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CardModule$DeliveryStatusElement$Prominence$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardModule.DeliveryStatusElement.Prominence.Companion.getClass();
        if (i == 0) {
            return CardModule.DeliveryStatusElement.Prominence.PROMINENCE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CardModule.DeliveryStatusElement.Prominence.PROMINENT;
        }
        if (i != 2) {
            return null;
        }
        return CardModule.DeliveryStatusElement.Prominence.SUBTLE;
    }
}
