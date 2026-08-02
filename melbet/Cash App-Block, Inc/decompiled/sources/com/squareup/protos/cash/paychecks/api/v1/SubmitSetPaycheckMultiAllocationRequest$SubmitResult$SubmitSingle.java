package com.squareup.protos.cash.paychecks.api.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle extends zzkf {
    public final SubmitSetPaycheckMultiAllocationRequest.SubmitSingle value;

    public SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle(SubmitSetPaycheckMultiAllocationRequest.SubmitSingle submitSingle) {
        submitSingle.getClass();
        this.value = submitSingle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle) && Intrinsics.areEqual(this.value, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubmitSingle(value=" + this.value + ")";
    }
}
