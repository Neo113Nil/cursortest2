package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.VerifyIdentityResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public final class VerifyIdentityResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        VerifyIdentityResponse.Status.Companion.getClass();
        return ResourceFileSystem.Companion.m4356fromValue(i);
    }
}
