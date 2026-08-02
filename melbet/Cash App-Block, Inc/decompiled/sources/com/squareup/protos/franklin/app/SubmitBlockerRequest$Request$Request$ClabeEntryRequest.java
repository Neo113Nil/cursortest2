package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$ClabeEntryRequest extends zzdh {
    public final ClabeEntryRequest value;

    public SubmitBlockerRequest$Request$Request$ClabeEntryRequest(ClabeEntryRequest clabeEntryRequest) {
        clabeEntryRequest.getClass();
        this.value = clabeEntryRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$ClabeEntryRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$ClabeEntryRequest) obj).value);
    }

    public final ClabeEntryRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ClabeEntryRequest(value=" + this.value + ")";
    }
}
