package com.squareup.protos.cash.compass.api;

import com.squareup.protos.cash.compass.api.GpsDataContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GpsDataContext$Environment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GpsDataContext.Environment.Companion.getClass();
        if (i == 0) {
            return GpsDataContext.Environment.UNSPECIFIED;
        }
        if (i == 1) {
            return GpsDataContext.Environment.FOREGROUND;
        }
        if (i != 2) {
            return null;
        }
        return GpsDataContext.Environment.BACKGROUND;
    }
}
