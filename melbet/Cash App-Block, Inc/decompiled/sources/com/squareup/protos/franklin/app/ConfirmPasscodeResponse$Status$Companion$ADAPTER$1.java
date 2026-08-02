package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.ConfirmPasscodeResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public final class ConfirmPasscodeResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ConfirmPasscodeResponse.Status.Companion.getClass();
        return ResourceFileSystem.Companion.m4353fromValue(i);
    }
}
