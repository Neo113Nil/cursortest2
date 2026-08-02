package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.BillPayRenderData;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BillPayRenderData$BillCategory$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BillPayRenderData.BillCategory.Companion.getClass();
        return Trigger.Companion.fromValue(i);
    }
}
