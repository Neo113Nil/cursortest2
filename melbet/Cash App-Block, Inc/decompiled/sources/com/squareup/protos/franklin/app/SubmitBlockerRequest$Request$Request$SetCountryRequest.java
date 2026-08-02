package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SetCountryRequest extends zzdh {
    public final SetCountryRequest value;

    public SubmitBlockerRequest$Request$Request$SetCountryRequest(SetCountryRequest setCountryRequest) {
        setCountryRequest.getClass();
        this.value = setCountryRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SetCountryRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SetCountryRequest) obj).value);
    }

    public final SetCountryRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SetCountryRequest(value=" + this.value + ")";
    }
}
