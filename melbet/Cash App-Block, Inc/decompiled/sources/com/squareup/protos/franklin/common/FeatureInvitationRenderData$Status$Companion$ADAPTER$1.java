package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.FeatureInvitationRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class FeatureInvitationRenderData$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FeatureInvitationRenderData.Status.Companion.getClass();
        switch (i) {
            case 0:
                return FeatureInvitationRenderData.Status.PENDING;
            case 1:
                return FeatureInvitationRenderData.Status.LINKED;
            case 2:
                return FeatureInvitationRenderData.Status.ACCEPTED;
            case 3:
                return FeatureInvitationRenderData.Status.DECLINED;
            case 4:
                return FeatureInvitationRenderData.Status.EXPIRED;
            case 5:
                return FeatureInvitationRenderData.Status.CANCELED;
            case 6:
                return FeatureInvitationRenderData.Status.ABANDONED;
            default:
                return null;
        }
    }
}
