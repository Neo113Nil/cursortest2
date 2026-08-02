package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest extends zzdh {
    public final ResolvePersonaDidvBlockerRequest value;

    public SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest(ResolvePersonaDidvBlockerRequest resolvePersonaDidvBlockerRequest) {
        resolvePersonaDidvBlockerRequest.getClass();
        this.value = resolvePersonaDidvBlockerRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest) obj).value);
    }

    public final ResolvePersonaDidvBlockerRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ResolvePersonaDidvBlockerRequest(value=" + this.value + ")";
    }
}
