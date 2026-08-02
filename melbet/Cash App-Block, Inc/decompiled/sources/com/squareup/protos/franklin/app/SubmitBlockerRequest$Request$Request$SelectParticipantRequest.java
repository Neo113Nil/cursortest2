package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SelectParticipantRequest extends zzdh {
    public final SelectParticipantRequest value;

    public SubmitBlockerRequest$Request$Request$SelectParticipantRequest(SelectParticipantRequest selectParticipantRequest) {
        selectParticipantRequest.getClass();
        this.value = selectParticipantRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SelectParticipantRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SelectParticipantRequest) obj).value);
    }

    public final SelectParticipantRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectParticipantRequest(value=" + this.value + ")";
    }
}
