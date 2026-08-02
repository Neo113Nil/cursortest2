package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$P2pInstrumentSelectionRequest extends zzdh {
    public final P2pInstrumentSelectionRequest value;

    public SubmitBlockerRequest$Request$Request$P2pInstrumentSelectionRequest(P2pInstrumentSelectionRequest p2pInstrumentSelectionRequest) {
        p2pInstrumentSelectionRequest.getClass();
        this.value = p2pInstrumentSelectionRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$P2pInstrumentSelectionRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$P2pInstrumentSelectionRequest) obj).value);
    }

    public final P2pInstrumentSelectionRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "P2pInstrumentSelectionRequest(value=" + this.value + ")";
    }
}
