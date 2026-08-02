package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.VerifyEmailResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.Path;

/* loaded from: classes.dex */
public final class VerifyEmailResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        VerifyEmailResponse.Status.Companion.getClass();
        return Path.Companion.m4347fromValue(i);
    }
}
