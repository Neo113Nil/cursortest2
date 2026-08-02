package com.squareup.protos.cash.api;

import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ResponseMetadata$UpsertResult$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ResponseMetadata.UpsertResult.Companion.getClass();
        if (i == 1) {
            return ResponseMetadata.UpsertResult.UPSERT_CREATE;
        }
        if (i != 2) {
            return null;
        }
        return ResponseMetadata.UpsertResult.UPSERT_UPDATE;
    }
}
