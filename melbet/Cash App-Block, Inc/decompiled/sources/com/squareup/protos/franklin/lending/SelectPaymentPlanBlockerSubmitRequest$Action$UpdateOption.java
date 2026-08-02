package com.squareup.protos.franklin.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzec;
import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption extends zzec {
    public final SelectPaymentPlanBlockerSubmitRequest.UpdateOption value;

    public SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption(SelectPaymentPlanBlockerSubmitRequest.UpdateOption updateOption) {
        updateOption.getClass();
        this.value = updateOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption) && Intrinsics.areEqual(this.value, ((SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UpdateOption(value=" + this.value + ")";
    }
}
