package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$VerifyPasscodeAndExpirationRequest extends zzdh {
    public final VerifyPasscodeAndExpirationRequest value;

    public SubmitBlockerRequest$Request$Request$VerifyPasscodeAndExpirationRequest(VerifyPasscodeAndExpirationRequest verifyPasscodeAndExpirationRequest) {
        verifyPasscodeAndExpirationRequest.getClass();
        this.value = verifyPasscodeAndExpirationRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$VerifyPasscodeAndExpirationRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$VerifyPasscodeAndExpirationRequest) obj).value);
    }

    public final VerifyPasscodeAndExpirationRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VerifyPasscodeAndExpirationRequest(value=" + this.value + ")";
    }
}
