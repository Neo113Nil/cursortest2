package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ValidateTapToPayPolicyResponse$V1EvaluationResult$V1EvaluationFailureReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.Companion.getClass();
        if (i == 0) {
            return ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.V1_EVALUATION_FAILURE_REASON_UNSPECIFIED;
        }
        if (i == 1) {
            return ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.V1_EVALUATION_FAILURE_REASON_PLAY_PROTECT_TURNED_OFF;
        }
        if (i == 2) {
            return ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.V1_EVALUATION_FAILURE_REASON_OS_PLATFORM_LEVEL_OUTDATED;
        }
        if (i != 3) {
            return null;
        }
        return ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.V1_EVALUATION_FAILURE_REASON_SCREEN_RECORDING_ON;
    }
}
