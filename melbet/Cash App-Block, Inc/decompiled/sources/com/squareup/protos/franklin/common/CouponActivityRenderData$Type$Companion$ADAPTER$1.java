package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CouponActivityRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CouponActivityRenderData$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CouponActivityRenderData.Type.Companion.getClass();
        if (i == 1) {
            return CouponActivityRenderData.Type.COUPON_CREATED;
        }
        if (i == 2) {
            return CouponActivityRenderData.Type.COUPON_EXPIRED;
        }
        if (i != 3) {
            return null;
        }
        return CouponActivityRenderData.Type.COUPON_REDEEMED;
    }
}
