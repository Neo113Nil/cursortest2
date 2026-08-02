package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.squareup.protos.cash.messagingplatformcommon.ondemand.Variable;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Variable$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Variable.Type.Companion.getClass();
        if (i == 1) {
            return Variable.Type.STRING;
        }
        if (i == 2) {
            return Variable.Type.LOCALIZABLE_STRING;
        }
        if (i != 3) {
            return null;
        }
        return Variable.Type.MONEY;
    }
}
