package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SyncInvestmentCategory$CategoryType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncInvestmentCategory.CategoryType.Companion.getClass();
        return UiAlias.Type.Companion.m3946fromValue(i);
    }
}
