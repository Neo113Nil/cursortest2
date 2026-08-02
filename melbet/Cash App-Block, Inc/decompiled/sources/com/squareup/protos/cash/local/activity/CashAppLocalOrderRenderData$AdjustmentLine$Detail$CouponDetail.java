package com.squareup.protos.cash.local.activity;

import com.bumptech.glide.module.ManifestParser;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$AdjustmentLine$Detail$CouponDetail extends ManifestParser {
    public final CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail value;

    public CashAppLocalOrderRenderData$AdjustmentLine$Detail$CouponDetail(CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail couponDetail) {
        couponDetail.getClass();
        this.value = couponDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$CouponDetail) && Intrinsics.areEqual(this.value, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$CouponDetail) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CouponDetail(value=" + this.value + ")";
    }
}
