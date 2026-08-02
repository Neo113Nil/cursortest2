package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.WithinSectionSpacer;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class WithinSectionSpacer$Size$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        WithinSectionSpacer.Size.Companion.getClass();
        if (i == 1) {
            return WithinSectionSpacer.Size.SMALL;
        }
        if (i != 2) {
            return null;
        }
        return WithinSectionSpacer.Size.MEDIUM;
    }
}
