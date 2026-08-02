package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.protos.cash.security.SetPasswordRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitBlockerRequest$Request$Request$SetPasswordRequest extends zzdh {
    public final SetPasswordRequest value;

    public SubmitBlockerRequest$Request$Request$SetPasswordRequest(SetPasswordRequest setPasswordRequest) {
        setPasswordRequest.getClass();
        this.value = setPasswordRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SetPasswordRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SetPasswordRequest) obj).value);
    }

    public final SetPasswordRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SetPasswordRequest(value=" + this.value + ")";
    }
}
