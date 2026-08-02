package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.VerifyInstrumentResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class VerifyInstrumentResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        VerifyInstrumentResponse.Status.Companion.getClass();
        return UiAlias.Type.Companion.m3944fromValue(i);
    }
}
