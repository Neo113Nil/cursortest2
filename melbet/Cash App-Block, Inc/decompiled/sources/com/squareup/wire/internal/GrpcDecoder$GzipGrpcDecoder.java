package com.squareup.wire.internal;

import androidx.room.Room;
import okio.Buffer;
import okio.GzipSource;
import okio.Source;

/* loaded from: classes9.dex */
public final class GrpcDecoder$GzipGrpcDecoder extends Room {
    public static final GrpcDecoder$GzipGrpcDecoder INSTANCE = new GrpcDecoder$GzipGrpcDecoder();

    @Override // androidx.room.Room
    public final Source decode(Buffer buffer) {
        return new GzipSource(buffer);
    }
}
