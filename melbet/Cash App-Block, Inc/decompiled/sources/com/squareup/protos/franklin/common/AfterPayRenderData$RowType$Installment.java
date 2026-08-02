package com.squareup.protos.franklin.common;

import com.datadog.android.rum.model.ResourceEvent;
import com.squareup.protos.franklin.common.AfterPayRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AfterPayRenderData$RowType$Installment extends ResourceEvent.Companion {
    public final AfterPayRenderData.Installment value;

    public AfterPayRenderData$RowType$Installment(AfterPayRenderData.Installment installment) {
        installment.getClass();
        this.value = installment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterPayRenderData$RowType$Installment) && Intrinsics.areEqual(this.value, ((AfterPayRenderData$RowType$Installment) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Installment(value=" + this.value + ")";
    }
}
