package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult {
    public final ValidateTapToPayPolicyResponse.V1EvaluationResult value;

    public ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult(ValidateTapToPayPolicyResponse.V1EvaluationResult v1EvaluationResult) {
        v1EvaluationResult.getClass();
        this.value = v1EvaluationResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult) && Intrinsics.areEqual(this.value, ((ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "V1EvaluationResult(value=" + this.value + ")";
    }
}
