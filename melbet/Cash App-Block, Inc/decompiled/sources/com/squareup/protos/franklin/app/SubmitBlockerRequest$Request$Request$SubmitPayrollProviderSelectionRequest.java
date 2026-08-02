package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SubmitPayrollProviderSelectionRequest extends zzdh {
    public final SubmitPayrollProviderSelectionRequest value;

    public SubmitBlockerRequest$Request$Request$SubmitPayrollProviderSelectionRequest(SubmitPayrollProviderSelectionRequest submitPayrollProviderSelectionRequest) {
        submitPayrollProviderSelectionRequest.getClass();
        this.value = submitPayrollProviderSelectionRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SubmitPayrollProviderSelectionRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SubmitPayrollProviderSelectionRequest) obj).value);
    }

    public final SubmitPayrollProviderSelectionRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubmitPayrollProviderSelectionRequest(value=" + this.value + ")";
    }
}
