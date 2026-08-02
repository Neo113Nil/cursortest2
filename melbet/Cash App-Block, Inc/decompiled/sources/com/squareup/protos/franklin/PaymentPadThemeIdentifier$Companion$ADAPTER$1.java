package com.squareup.protos.franklin;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PaymentPadThemeIdentifier$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentPadThemeIdentifier.Companion.getClass();
        if (i == 1) {
            return PaymentPadThemeIdentifier.PINK;
        }
        return null;
    }
}
