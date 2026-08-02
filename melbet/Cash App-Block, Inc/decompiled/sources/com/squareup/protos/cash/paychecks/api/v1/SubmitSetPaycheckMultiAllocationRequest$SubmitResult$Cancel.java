package com.squareup.protos.cash.paychecks.api.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel extends zzkf {
    public final SubmitSetPaycheckMultiAllocationRequest.Cancel value;

    public SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel(SubmitSetPaycheckMultiAllocationRequest.Cancel cancel) {
        cancel.getClass();
        this.value = cancel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel) && Intrinsics.areEqual(this.value, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Cancel(value=" + this.value + ")";
    }
}
