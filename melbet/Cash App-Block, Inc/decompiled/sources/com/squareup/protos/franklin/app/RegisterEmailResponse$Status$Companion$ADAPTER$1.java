package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.RegisterEmailResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public final class RegisterEmailResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RegisterEmailResponse.Status.Companion.getClass();
        return ResourceFileSystem.Companion.m4355fromValue(i);
    }
}
