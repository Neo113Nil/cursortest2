package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class DigitalWalletToken$Issuer$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DigitalWalletToken$Issuer.Companion.getClass();
        if (i == 1) {
            return DigitalWalletToken$Issuer.APPLE_PAY;
        }
        if (i == 2) {
            return DigitalWalletToken$Issuer.ANDROID_PAY;
        }
        if (i != 3) {
            return null;
        }
        return DigitalWalletToken$Issuer.UNKNOWN_ISSUER;
    }
}
