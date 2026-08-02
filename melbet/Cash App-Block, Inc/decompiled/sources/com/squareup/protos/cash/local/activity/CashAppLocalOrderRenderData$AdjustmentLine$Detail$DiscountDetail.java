package com.squareup.protos.cash.local.activity;

import com.bumptech.glide.module.ManifestParser;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$AdjustmentLine$Detail$DiscountDetail extends ManifestParser {
    public final CashAppLocalOrderRenderData.AdjustmentLine.DiscountDetail value;

    public CashAppLocalOrderRenderData$AdjustmentLine$Detail$DiscountDetail(CashAppLocalOrderRenderData.AdjustmentLine.DiscountDetail discountDetail) {
        discountDetail.getClass();
        this.value = discountDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$DiscountDetail) && Intrinsics.areEqual(this.value, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$DiscountDetail) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DiscountDetail(value=" + this.value + ")";
    }
}
