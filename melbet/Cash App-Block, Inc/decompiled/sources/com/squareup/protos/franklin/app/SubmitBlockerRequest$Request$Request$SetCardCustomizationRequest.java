package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SetCardCustomizationRequest extends zzdh {
    public final SetCardCustomizationRequest value;

    public SubmitBlockerRequest$Request$Request$SetCardCustomizationRequest(SetCardCustomizationRequest setCardCustomizationRequest) {
        setCardCustomizationRequest.getClass();
        this.value = setCardCustomizationRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SetCardCustomizationRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SetCardCustomizationRequest) obj).value);
    }

    public final SetCardCustomizationRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SetCardCustomizationRequest(value=" + this.value + ")";
    }
}
