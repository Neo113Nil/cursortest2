package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.GetShortlinkRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetShortlinkRequest$InvocationContext$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetShortlinkRequest.InvocationContext.Companion.getClass();
        if (i == 0) {
            return GetShortlinkRequest.InvocationContext.INVOCATION_CONTEXT_UNSPECIFIED;
        }
        if (i == 1) {
            return GetShortlinkRequest.InvocationContext.INVOCATION_CONTEXT_INTERACTION;
        }
        if (i != 2) {
            return null;
        }
        return GetShortlinkRequest.InvocationContext.INVOCATION_CONTEXT_AUTO_DISPLAY;
    }
}
