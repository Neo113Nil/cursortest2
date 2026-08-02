package com.squareup.protos.cash.local.activity;

import com.bumptech.glide.module.ManifestParser;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail extends ManifestParser {
    public final CashAppLocalOrderRenderData.AdjustmentLine.GiftCardDetail value;

    public CashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail(CashAppLocalOrderRenderData.AdjustmentLine.GiftCardDetail giftCardDetail) {
        giftCardDetail.getClass();
        this.value = giftCardDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail) && Intrinsics.areEqual(this.value, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "GiftCardDetail(value=" + this.value + ")";
    }
}
