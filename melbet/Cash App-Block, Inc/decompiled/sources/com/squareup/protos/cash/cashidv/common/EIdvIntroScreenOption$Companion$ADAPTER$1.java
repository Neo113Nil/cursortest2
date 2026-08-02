package com.squareup.protos.cash.cashidv.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class EIdvIntroScreenOption$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EIdvIntroScreenOption.Companion.getClass();
        if (i == 0) {
            return EIdvIntroScreenOption.SHOW_WHEN_LEGAL_NAME_ALREADY_COLLECTED;
        }
        if (i == 1) {
            return EIdvIntroScreenOption.ALWAYS_SUPPRESS;
        }
        if (i != 2) {
            return null;
        }
        return EIdvIntroScreenOption.ALWAYS_SHOW;
    }
}
