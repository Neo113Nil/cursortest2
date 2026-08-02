package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SetAddressRequest extends zzdh {
    public final SetAddressRequest value;

    public SubmitBlockerRequest$Request$Request$SetAddressRequest(SetAddressRequest setAddressRequest) {
        setAddressRequest.getClass();
        this.value = setAddressRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SetAddressRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SetAddressRequest) obj).value);
    }

    public final SetAddressRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SetAddressRequest(value=" + this.value + ")";
    }
}
