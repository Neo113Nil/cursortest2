package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$VerifyContactsRequest extends zzdh {
    public final VerifyContactsRequest value;

    public SubmitBlockerRequest$Request$Request$VerifyContactsRequest(VerifyContactsRequest verifyContactsRequest) {
        verifyContactsRequest.getClass();
        this.value = verifyContactsRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$VerifyContactsRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$VerifyContactsRequest) obj).value);
    }

    public final VerifyContactsRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VerifyContactsRequest(value=" + this.value + ")";
    }
}
