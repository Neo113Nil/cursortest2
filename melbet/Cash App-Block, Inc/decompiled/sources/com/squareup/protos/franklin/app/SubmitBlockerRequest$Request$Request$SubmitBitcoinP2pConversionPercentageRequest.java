package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest extends zzdh {
    public final SubmitBitcoinP2pConversionPercentageRequest value;

    public SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest(SubmitBitcoinP2pConversionPercentageRequest submitBitcoinP2pConversionPercentageRequest) {
        submitBitcoinP2pConversionPercentageRequest.getClass();
        this.value = submitBitcoinP2pConversionPercentageRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest) obj).value);
    }

    public final SubmitBitcoinP2pConversionPercentageRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubmitBitcoinP2pConversionPercentageRequest(value=" + this.value + ")";
    }
}
