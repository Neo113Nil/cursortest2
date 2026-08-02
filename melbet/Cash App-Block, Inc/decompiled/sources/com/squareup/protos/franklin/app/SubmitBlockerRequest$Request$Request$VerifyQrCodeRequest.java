package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$VerifyQrCodeRequest extends zzdh {
    public final VerifyQrCodeRequest value;

    public SubmitBlockerRequest$Request$Request$VerifyQrCodeRequest(VerifyQrCodeRequest verifyQrCodeRequest) {
        verifyQrCodeRequest.getClass();
        this.value = verifyQrCodeRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$VerifyQrCodeRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$VerifyQrCodeRequest) obj).value);
    }

    public final VerifyQrCodeRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VerifyQrCodeRequest(value=" + this.value + ")";
    }
}
