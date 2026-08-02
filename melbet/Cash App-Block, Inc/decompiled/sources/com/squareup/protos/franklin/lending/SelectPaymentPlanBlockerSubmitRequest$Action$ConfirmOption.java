package com.squareup.protos.franklin.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzec;
import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption extends zzec {
    public final SelectPaymentPlanBlockerSubmitRequest.ConfirmOption value;

    public SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption(SelectPaymentPlanBlockerSubmitRequest.ConfirmOption confirmOption) {
        confirmOption.getClass();
        this.value = confirmOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption) && Intrinsics.areEqual(this.value, ((SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ConfirmOption(value=" + this.value + ")";
    }
}
