package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdx;
import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PaymentPlanEligibilityRenderData$UiStateData$EligibilityUiData extends zzdx {
    public final PaymentPlanEligibilityRenderData.EligibilityUiData value;

    public PaymentPlanEligibilityRenderData$UiStateData$EligibilityUiData(PaymentPlanEligibilityRenderData.EligibilityUiData eligibilityUiData) {
        eligibilityUiData.getClass();
        this.value = eligibilityUiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentPlanEligibilityRenderData$UiStateData$EligibilityUiData) && Intrinsics.areEqual(this.value, ((PaymentPlanEligibilityRenderData$UiStateData$EligibilityUiData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EligibilityUiData(value=" + this.value + ")";
    }
}
