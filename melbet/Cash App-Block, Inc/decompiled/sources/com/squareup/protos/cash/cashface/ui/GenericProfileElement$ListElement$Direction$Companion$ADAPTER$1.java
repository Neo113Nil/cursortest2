package com.squareup.protos.cash.cashface.ui;

import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ListElement$Direction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GenericProfileElement.ListElement.Direction.Companion.getClass();
        if (i == 1) {
            return GenericProfileElement.ListElement.Direction.VERTICAL;
        }
        if (i != 2) {
            return null;
        }
        return GenericProfileElement.ListElement.Direction.HORIZONTAL;
    }
}
