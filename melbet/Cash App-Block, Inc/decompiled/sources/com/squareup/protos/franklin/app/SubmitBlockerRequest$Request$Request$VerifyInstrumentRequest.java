package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$VerifyInstrumentRequest extends zzdh {
    public final VerifyInstrumentRequest value;

    public SubmitBlockerRequest$Request$Request$VerifyInstrumentRequest(VerifyInstrumentRequest verifyInstrumentRequest) {
        verifyInstrumentRequest.getClass();
        this.value = verifyInstrumentRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$VerifyInstrumentRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$VerifyInstrumentRequest) obj).value);
    }

    public final VerifyInstrumentRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VerifyInstrumentRequest(value=" + this.value + ")";
    }
}
