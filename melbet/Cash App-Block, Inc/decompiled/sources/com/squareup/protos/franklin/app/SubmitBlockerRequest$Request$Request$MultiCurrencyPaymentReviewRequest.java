package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$MultiCurrencyPaymentReviewRequest extends zzdh {
    public final MultiCurrencyPaymentReviewRequest value;

    public SubmitBlockerRequest$Request$Request$MultiCurrencyPaymentReviewRequest(MultiCurrencyPaymentReviewRequest multiCurrencyPaymentReviewRequest) {
        multiCurrencyPaymentReviewRequest.getClass();
        this.value = multiCurrencyPaymentReviewRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$MultiCurrencyPaymentReviewRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$MultiCurrencyPaymentReviewRequest) obj).value);
    }

    public final MultiCurrencyPaymentReviewRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MultiCurrencyPaymentReviewRequest(value=" + this.value + ")";
    }
}
