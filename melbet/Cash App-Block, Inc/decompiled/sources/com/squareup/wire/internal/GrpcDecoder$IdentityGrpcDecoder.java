package com.squareup.wire.internal;

import androidx.room.Room;
import okio.Buffer;
import okio.Source;

/* loaded from: classes.dex */
public final class GrpcDecoder$IdentityGrpcDecoder extends Room {
    public static final GrpcDecoder$IdentityGrpcDecoder INSTANCE = new GrpcDecoder$IdentityGrpcDecoder();

    @Override // androidx.room.Room
    public final Source decode(Buffer buffer) {
        return buffer;
    }
}
