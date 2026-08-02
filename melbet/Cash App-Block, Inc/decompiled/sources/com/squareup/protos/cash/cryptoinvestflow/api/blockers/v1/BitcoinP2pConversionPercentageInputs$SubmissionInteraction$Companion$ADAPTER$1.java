package com.squareup.protos.cash.cryptoinvestflow.api.blockers.v1;

import com.squareup.protos.cash.cryptoinvestflow.api.blockers.v1.BitcoinP2pConversionPercentageInputs;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class BitcoinP2pConversionPercentageInputs$SubmissionInteraction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BitcoinP2pConversionPercentageInputs.SubmissionInteraction.Companion.getClass();
        if (i == 0) {
            return BitcoinP2pConversionPercentageInputs.SubmissionInteraction.SUBMISSION_INTERACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return BitcoinP2pConversionPercentageInputs.SubmissionInteraction.SUBMISSION_INTERACTION_CANCEL;
        }
        if (i == 2) {
            return BitcoinP2pConversionPercentageInputs.SubmissionInteraction.SUBMISSION_INTERACTION_CONFIRM;
        }
        if (i != 3) {
            return null;
        }
        return BitcoinP2pConversionPercentageInputs.SubmissionInteraction.SUBMISSION_INTERACTION_DISABLE;
    }
}
