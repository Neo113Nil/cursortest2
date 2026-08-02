package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SponsoredAccountRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SponsoredAccountRenderData$Parent$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SponsoredAccountRenderData.Parent.Type.Companion.getClass();
        if (i == 1) {
            return SponsoredAccountRenderData.Parent.Type.PENDING;
        }
        if (i == 2) {
            return SponsoredAccountRenderData.Parent.Type.APPROVED;
        }
        if (i == 3) {
            return SponsoredAccountRenderData.Parent.Type.DECLINED;
        }
        if (i != 4) {
            return null;
        }
        return SponsoredAccountRenderData.Parent.Type.CANCELED;
    }
}
