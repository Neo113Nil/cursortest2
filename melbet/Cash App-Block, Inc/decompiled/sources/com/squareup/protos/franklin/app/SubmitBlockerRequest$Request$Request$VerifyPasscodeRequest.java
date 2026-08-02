package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$VerifyPasscodeRequest extends zzdh {
    public final VerifyPasscodeRequest value;

    public SubmitBlockerRequest$Request$Request$VerifyPasscodeRequest(VerifyPasscodeRequest verifyPasscodeRequest) {
        verifyPasscodeRequest.getClass();
        this.value = verifyPasscodeRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$VerifyPasscodeRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$VerifyPasscodeRequest) obj).value);
    }

    public final VerifyPasscodeRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VerifyPasscodeRequest(value=" + this.value + ")";
    }
}
