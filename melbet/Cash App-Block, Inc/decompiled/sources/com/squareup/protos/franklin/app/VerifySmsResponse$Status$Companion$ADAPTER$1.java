package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.VerifySmsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.Path;

/* loaded from: classes.dex */
public final class VerifySmsResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        VerifySmsResponse.Status.Companion.getClass();
        return Path.Companion.m4348fromValue(i);
    }
}
