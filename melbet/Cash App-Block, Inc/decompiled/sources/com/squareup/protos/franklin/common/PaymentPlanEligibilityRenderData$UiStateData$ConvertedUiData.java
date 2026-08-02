package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdx;
import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PaymentPlanEligibilityRenderData$UiStateData$ConvertedUiData extends zzdx {
    public final PaymentPlanEligibilityRenderData.ConvertedUiData value;

    public PaymentPlanEligibilityRenderData$UiStateData$ConvertedUiData(PaymentPlanEligibilityRenderData.ConvertedUiData convertedUiData) {
        convertedUiData.getClass();
        this.value = convertedUiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentPlanEligibilityRenderData$UiStateData$ConvertedUiData) && Intrinsics.areEqual(this.value, ((PaymentPlanEligibilityRenderData$UiStateData$ConvertedUiData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ConvertedUiData(value=" + this.value + ")";
    }
}
