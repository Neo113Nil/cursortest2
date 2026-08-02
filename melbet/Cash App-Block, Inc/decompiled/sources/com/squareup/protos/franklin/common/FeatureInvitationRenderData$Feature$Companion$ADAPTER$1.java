package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.FeatureInvitationRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class FeatureInvitationRenderData$Feature$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FeatureInvitationRenderData.Feature.Companion.getClass();
        if (i == 0) {
            return FeatureInvitationRenderData.Feature.TEEN_SPONSORSHIP_REQUEST;
        }
        if (i != 1) {
            return null;
        }
        return FeatureInvitationRenderData.Feature.SPONSOR_SPONSORSHIP_REQUEST;
    }
}
