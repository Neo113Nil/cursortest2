package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$OverflowOptionPickerRequest extends zzdh {
    public final OverflowOptionPickerRequest value;

    public SubmitBlockerRequest$Request$Request$OverflowOptionPickerRequest(OverflowOptionPickerRequest overflowOptionPickerRequest) {
        overflowOptionPickerRequest.getClass();
        this.value = overflowOptionPickerRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$OverflowOptionPickerRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$OverflowOptionPickerRequest) obj).value);
    }

    public final OverflowOptionPickerRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OverflowOptionPickerRequest(value=" + this.value + ")";
    }
}
