package com.squareup.protos.invest.ui;

import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Section$Row$Value$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Section.Row.Value.Icon.Companion.getClass();
        if (i == 1) {
            return Section.Row.Value.Icon.ARROW_UP;
        }
        if (i != 2) {
            return null;
        }
        return Section.Row.Value.Icon.ARROW_DOWN;
    }
}
