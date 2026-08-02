package com.squareup.protos.banklin.card_activation;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CardActivationRiskResult$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardActivationRiskResult.Companion.getClass();
        if (i == 1) {
            return CardActivationRiskResult.SUCCESS;
        }
        if (i == 2) {
            return CardActivationRiskResult.SUSPECTED_FRAUD;
        }
        if (i == 3) {
            return CardActivationRiskResult.RESTRICTED_CARD;
        }
        if (i != 4) {
            return null;
        }
        return CardActivationRiskResult.NO_VERIFIED_ADDRESS;
    }
}
