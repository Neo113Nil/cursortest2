package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$ConfirmDisclosureRequest extends zzdh {
    public final ConfirmDisclosureRequest value;

    public SubmitBlockerRequest$Request$Request$ConfirmDisclosureRequest(ConfirmDisclosureRequest confirmDisclosureRequest) {
        confirmDisclosureRequest.getClass();
        this.value = confirmDisclosureRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$ConfirmDisclosureRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$ConfirmDisclosureRequest) obj).value);
    }

    public final ConfirmDisclosureRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ConfirmDisclosureRequest(value=" + this.value + ")";
    }
}
