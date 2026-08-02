package com.squareup.protos.cash.cashidv.common;

import com.squareup.protos.cash.cashidv.common.Button;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Button$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Button.Action.Companion.getClass();
        if (i == 0) {
            return Button.Action.ACTION_SUBMIT;
        }
        if (i == 1) {
            return Button.Action.ACTION_SIGN_OUT;
        }
        if (i != 2) {
            return null;
        }
        return Button.Action.ACTION_END_FLOW;
    }
}
