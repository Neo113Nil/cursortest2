package com.squareup.protos.cash.woodrow.model.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class AssetAcquisition$AcquisitionType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AssetAcquisition$AcquisitionType.Companion.getClass();
        if (i == 0) {
            return AssetAcquisition$AcquisitionType.TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return AssetAcquisition$AcquisitionType.TRADE;
        }
        if (i == 2) {
            return AssetAcquisition$AcquisitionType.DEPOSIT;
        }
        if (i != 3) {
            return null;
        }
        return AssetAcquisition$AcquisitionType.TRANSFER;
    }
}
