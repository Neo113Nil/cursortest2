package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.protos.cash.moneta.api.v1_0.SelectInstrumentRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitBlockerRequest$Request$Request$SelectInstrumentRequest extends zzdh {
    public final SelectInstrumentRequest value;

    public SubmitBlockerRequest$Request$Request$SelectInstrumentRequest(SelectInstrumentRequest selectInstrumentRequest) {
        selectInstrumentRequest.getClass();
        this.value = selectInstrumentRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SelectInstrumentRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SelectInstrumentRequest) obj).value);
    }

    public final SelectInstrumentRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectInstrumentRequest(value=" + this.value + ")";
    }
}
