package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SelectTransferOptionRequest extends zzdh {
    public final SelectTransferOptionRequest value;

    public SubmitBlockerRequest$Request$Request$SelectTransferOptionRequest(SelectTransferOptionRequest selectTransferOptionRequest) {
        selectTransferOptionRequest.getClass();
        this.value = selectTransferOptionRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SelectTransferOptionRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SelectTransferOptionRequest) obj).value);
    }

    public final SelectTransferOptionRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectTransferOptionRequest(value=" + this.value + ")";
    }
}
