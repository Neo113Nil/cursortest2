package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$ConfirmPaymentRequest extends zzdh {
    public final ConfirmPaymentRequest value;

    public SubmitBlockerRequest$Request$Request$ConfirmPaymentRequest(ConfirmPaymentRequest confirmPaymentRequest) {
        confirmPaymentRequest.getClass();
        this.value = confirmPaymentRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$ConfirmPaymentRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$ConfirmPaymentRequest) obj).value);
    }

    public final ConfirmPaymentRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ConfirmPaymentRequest(value=" + this.value + ")";
    }
}
