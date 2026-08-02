package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.EducationalSheetButton;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class EducationalSheetButton$Style$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EducationalSheetButton.Style.Companion.getClass();
        if (i == 0) {
            return EducationalSheetButton.Style.STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return EducationalSheetButton.Style.STYLE_PRIMARY;
        }
        if (i != 2) {
            return null;
        }
        return EducationalSheetButton.Style.STYLE_SECONDARY;
    }
}
