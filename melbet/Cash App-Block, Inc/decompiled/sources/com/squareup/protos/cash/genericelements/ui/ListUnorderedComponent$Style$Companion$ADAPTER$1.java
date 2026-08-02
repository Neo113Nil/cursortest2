package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.ListUnorderedComponent;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ListUnorderedComponent$Style$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ListUnorderedComponent.Style.Companion.getClass();
        if (i == 1) {
            return ListUnorderedComponent.Style.STANDARD;
        }
        if (i != 2) {
            return null;
        }
        return ListUnorderedComponent.Style.SUBTLE;
    }
}
