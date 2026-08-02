package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class HalfSheetMessage$OverlayColorTreatment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        HalfSheetMessage.OverlayColorTreatment.Companion.getClass();
        if (i == 1) {
            return HalfSheetMessage.OverlayColorTreatment.GRADIENT;
        }
        if (i != 2) {
            return null;
        }
        return HalfSheetMessage.OverlayColorTreatment.SOLID;
    }
}
