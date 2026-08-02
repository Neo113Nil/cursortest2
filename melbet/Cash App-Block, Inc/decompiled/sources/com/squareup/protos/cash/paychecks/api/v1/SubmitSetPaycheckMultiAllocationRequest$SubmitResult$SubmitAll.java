package com.squareup.protos.cash.paychecks.api.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll extends zzkf {
    public final SubmitSetPaycheckMultiAllocationRequest.SubmitAll value;

    public SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll(SubmitSetPaycheckMultiAllocationRequest.SubmitAll submitAll) {
        submitAll.getClass();
        this.value = submitAll;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll) && Intrinsics.areEqual(this.value, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubmitAll(value=" + this.value + ")";
    }
}
