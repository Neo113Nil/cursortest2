package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdx;
import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PaymentPlanEligibilityRenderData$UiStateData$EligibleUiData extends zzdx {
    public final PaymentPlanEligibilityRenderData.EligibleUiData value;

    public PaymentPlanEligibilityRenderData$UiStateData$EligibleUiData(PaymentPlanEligibilityRenderData.EligibleUiData eligibleUiData) {
        eligibleUiData.getClass();
        this.value = eligibleUiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentPlanEligibilityRenderData$UiStateData$EligibleUiData) && Intrinsics.areEqual(this.value, ((PaymentPlanEligibilityRenderData$UiStateData$EligibleUiData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EligibleUiData(value=" + this.value + ")";
    }
}
