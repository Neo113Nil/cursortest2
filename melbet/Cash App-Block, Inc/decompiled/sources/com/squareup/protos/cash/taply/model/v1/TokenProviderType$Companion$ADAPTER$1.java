package com.squareup.protos.cash.taply.model.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class TokenProviderType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TokenProviderType.Companion.getClass();
        if (i == 0) {
            return TokenProviderType.TOKEN_PROVIDER_TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return TokenProviderType.TOKEN_PROVIDER_TYPE_FIDESMO;
    }
}
