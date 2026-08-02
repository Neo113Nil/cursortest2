package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.MapboxConfiguration;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class MapboxConfiguration$UsageOptions$Context$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        MapboxConfiguration.UsageOptions.Context.Companion.getClass();
        if (i == 0) {
            return MapboxConfiguration.UsageOptions.Context.CONTEXT_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return MapboxConfiguration.UsageOptions.Context.CONTEXT_NEIGHBORHOODS_TAB;
    }
}
