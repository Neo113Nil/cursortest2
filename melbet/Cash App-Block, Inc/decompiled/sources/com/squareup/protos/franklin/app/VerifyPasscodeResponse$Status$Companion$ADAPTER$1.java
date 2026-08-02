package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.VerifyPasscodeResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public final class VerifyPasscodeResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        VerifyPasscodeResponse.Status.Companion.getClass();
        return AsyncTimeout.Companion.m4328fromValue(i);
    }
}
