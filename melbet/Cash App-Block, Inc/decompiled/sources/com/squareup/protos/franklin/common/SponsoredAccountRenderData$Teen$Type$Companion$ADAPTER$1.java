package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SponsoredAccountRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SponsoredAccountRenderData$Teen$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SponsoredAccountRenderData.Teen.Type.Companion.getClass();
        switch (i) {
            case 1:
                return SponsoredAccountRenderData.Teen.Type.PENDING;
            case 2:
                return SponsoredAccountRenderData.Teen.Type.APPROVED;
            case 3:
                return SponsoredAccountRenderData.Teen.Type.DECLINED;
            case 4:
                return SponsoredAccountRenderData.Teen.Type.CANCELED;
            case 5:
                return SponsoredAccountRenderData.Teen.Type.GRADUATION_ELIGIBLE;
            case 6:
                return SponsoredAccountRenderData.Teen.Type.GRADUATION_PENDING;
            default:
                return null;
        }
    }
}
