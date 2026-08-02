package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$HumanConfirmationRequest extends zzdh {
    public final HumanConfirmationRequest value;

    public SubmitBlockerRequest$Request$Request$HumanConfirmationRequest(HumanConfirmationRequest humanConfirmationRequest) {
        humanConfirmationRequest.getClass();
        this.value = humanConfirmationRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$HumanConfirmationRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$HumanConfirmationRequest) obj).value);
    }

    public final HumanConfirmationRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HumanConfirmationRequest(value=" + this.value + ")";
    }
}
