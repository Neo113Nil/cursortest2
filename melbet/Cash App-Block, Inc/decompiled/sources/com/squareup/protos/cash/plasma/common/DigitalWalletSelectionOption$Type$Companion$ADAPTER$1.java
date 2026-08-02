package com.squareup.protos.cash.plasma.common;

import com.squareup.protos.cash.plasma.common.DigitalWalletSelectionOption;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DigitalWalletSelectionOption$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DigitalWalletSelectionOption.Type.Companion.getClass();
        if (i == 1) {
            return DigitalWalletSelectionOption.Type.APPLE_PAY;
        }
        if (i != 2) {
            return null;
        }
        return DigitalWalletSelectionOption.Type.GOOGLE_PAY;
    }
}
