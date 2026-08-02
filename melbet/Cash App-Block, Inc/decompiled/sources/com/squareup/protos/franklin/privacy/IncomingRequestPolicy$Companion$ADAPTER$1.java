package com.squareup.protos.franklin.privacy;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class IncomingRequestPolicy$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        IncomingRequestPolicy.Companion.getClass();
        if (i == 1) {
            return IncomingRequestPolicy.ALLOW_ALL;
        }
        if (i == 2) {
            return IncomingRequestPolicy.ALLOW_CONTACTS;
        }
        if (i != 3) {
            return null;
        }
        return IncomingRequestPolicy.DENY_ALL;
    }
}
