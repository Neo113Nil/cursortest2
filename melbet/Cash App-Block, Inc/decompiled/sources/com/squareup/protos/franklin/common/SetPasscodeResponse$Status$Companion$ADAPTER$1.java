package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SetPasscodeResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public final class SetPasscodeResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetPasscodeResponse.Status.Companion.getClass();
        return AsyncTimeout.Companion.m4330fromValue(i);
    }
}
