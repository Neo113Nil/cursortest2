package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SyncInvestmentEntity$ReleaseStage$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncInvestmentEntity.ReleaseStage.Companion.getClass();
        if (i == 0) {
            return SyncInvestmentEntity.ReleaseStage.DO_NOT_USE_RELEASE_STAGE;
        }
        if (i == 1) {
            return SyncInvestmentEntity.ReleaseStage.PREVIEW_FOR_IPO;
        }
        if (i != 2) {
            return null;
        }
        return SyncInvestmentEntity.ReleaseStage.RELEASED;
    }
}
