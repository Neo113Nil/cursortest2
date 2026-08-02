package com.squareup.protos.cash.paychecks.api.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable extends zzkf {
    public final SubmitSetPaycheckMultiAllocationRequest.Disable value;

    public SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable(SubmitSetPaycheckMultiAllocationRequest.Disable disable) {
        disable.getClass();
        this.value = disable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable) && Intrinsics.areEqual(this.value, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Disable(value=" + this.value + ")";
    }
}
