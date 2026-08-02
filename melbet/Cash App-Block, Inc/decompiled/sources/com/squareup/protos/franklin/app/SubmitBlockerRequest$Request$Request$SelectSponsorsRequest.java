package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SelectSponsorsRequest extends zzdh {
    public final SelectSponsorsRequest value;

    public SubmitBlockerRequest$Request$Request$SelectSponsorsRequest(SelectSponsorsRequest selectSponsorsRequest) {
        selectSponsorsRequest.getClass();
        this.value = selectSponsorsRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SelectSponsorsRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SelectSponsorsRequest) obj).value);
    }

    public final SelectSponsorsRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectSponsorsRequest(value=" + this.value + ")";
    }
}
