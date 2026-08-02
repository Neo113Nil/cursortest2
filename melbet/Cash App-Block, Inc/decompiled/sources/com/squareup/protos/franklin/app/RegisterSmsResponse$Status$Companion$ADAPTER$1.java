package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.RegisterSmsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class RegisterSmsResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RegisterSmsResponse.Status.Companion.getClass();
        return UiAlias.Type.Companion.m3943fromValue(i);
    }
}
