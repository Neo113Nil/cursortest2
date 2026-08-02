package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.messagingplatformcommon.app.DetailsPageView;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DetailsPageView$TextPlacement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DetailsPageView.TextPlacement.Companion.getClass();
        return FeeType.Companion.m3911fromValue(i);
    }
}
