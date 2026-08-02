package com.squareup.protos.teamapp.ui;

import com.squareup.protos.teamapp.ui.Number;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Number$Format$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Number.Format.Companion.getClass();
        if (i == 0) {
            return Number.Format.NONE;
        }
        if (i == 1) {
            return Number.Format.DECIMAL;
        }
        if (i != 2) {
            return null;
        }
        return Number.Format.PERCENT;
    }
}
