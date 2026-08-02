package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SignInType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SignInType.Companion.getClass();
        if (i == 0) {
            return SignInType.UNKNOWN_SIGN_IN_TYPE;
        }
        if (i == 1) {
            return SignInType.SIGN_UP;
        }
        if (i != 2) {
            return null;
        }
        return SignInType.LOGIN;
    }
}
