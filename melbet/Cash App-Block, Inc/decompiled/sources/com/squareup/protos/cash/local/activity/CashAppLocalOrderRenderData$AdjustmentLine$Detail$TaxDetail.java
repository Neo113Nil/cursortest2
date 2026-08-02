package com.squareup.protos.cash.local.activity;

import com.bumptech.glide.module.ManifestParser;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$AdjustmentLine$Detail$TaxDetail extends ManifestParser {
    public final CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail value;

    public CashAppLocalOrderRenderData$AdjustmentLine$Detail$TaxDetail(CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail taxDetail) {
        taxDetail.getClass();
        this.value = taxDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$TaxDetail) && Intrinsics.areEqual(this.value, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$TaxDetail) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TaxDetail(value=" + this.value + ")";
    }
}
