package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SyncInvestmentFilterGroup$SubfilterOption$OptionGlyph$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncInvestmentFilterGroup.SubfilterOption.OptionGlyph.Companion.getClass();
        if (i == 0) {
            return SyncInvestmentFilterGroup.SubfilterOption.OptionGlyph.DO_NOT_USE_OPTION_GLYPH;
        }
        if (i == 1) {
            return SyncInvestmentFilterGroup.SubfilterOption.OptionGlyph.UP_ARROW;
        }
        if (i != 2) {
            return null;
        }
        return SyncInvestmentFilterGroup.SubfilterOption.OptionGlyph.DOWN_ARROW;
    }
}
