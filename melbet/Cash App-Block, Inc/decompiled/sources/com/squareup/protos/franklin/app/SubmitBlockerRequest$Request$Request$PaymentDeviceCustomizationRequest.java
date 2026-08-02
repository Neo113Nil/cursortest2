package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest extends zzdh {
    public final PaymentDeviceCustomizationRequest value;

    public SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest(PaymentDeviceCustomizationRequest paymentDeviceCustomizationRequest) {
        paymentDeviceCustomizationRequest.getClass();
        this.value = paymentDeviceCustomizationRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest) obj).value);
    }

    public final PaymentDeviceCustomizationRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PaymentDeviceCustomizationRequest(value=" + this.value + ")";
    }
}
