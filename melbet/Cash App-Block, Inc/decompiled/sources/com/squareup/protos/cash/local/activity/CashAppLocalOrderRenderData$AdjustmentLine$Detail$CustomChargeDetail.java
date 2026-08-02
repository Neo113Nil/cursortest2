package com.squareup.protos.cash.local.activity;

import com.bumptech.glide.module.ManifestParser;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$AdjustmentLine$Detail$CustomChargeDetail extends ManifestParser {
    public final CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail value;

    public CashAppLocalOrderRenderData$AdjustmentLine$Detail$CustomChargeDetail(CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail customChargeDetail) {
        customChargeDetail.getClass();
        this.value = customChargeDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$CustomChargeDetail) && Intrinsics.areEqual(this.value, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$CustomChargeDetail) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CustomChargeDetail(value=" + this.value + ")";
    }
}
