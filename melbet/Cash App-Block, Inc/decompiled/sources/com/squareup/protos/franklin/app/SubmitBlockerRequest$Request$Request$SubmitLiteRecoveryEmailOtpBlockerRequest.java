package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SubmitLiteRecoveryEmailOtpBlockerRequest extends zzdh {
    public final SubmitLiteRecoveryEmailOtpBlockerRequest value;

    public SubmitBlockerRequest$Request$Request$SubmitLiteRecoveryEmailOtpBlockerRequest(SubmitLiteRecoveryEmailOtpBlockerRequest submitLiteRecoveryEmailOtpBlockerRequest) {
        submitLiteRecoveryEmailOtpBlockerRequest.getClass();
        this.value = submitLiteRecoveryEmailOtpBlockerRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SubmitLiteRecoveryEmailOtpBlockerRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SubmitLiteRecoveryEmailOtpBlockerRequest) obj).value);
    }

    public final SubmitLiteRecoveryEmailOtpBlockerRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubmitLiteRecoveryEmailOtpBlockerRequest(value=" + this.value + ")";
    }
}
