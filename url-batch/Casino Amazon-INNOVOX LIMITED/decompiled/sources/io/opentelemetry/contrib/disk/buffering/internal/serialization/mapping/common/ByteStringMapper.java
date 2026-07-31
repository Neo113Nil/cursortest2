package io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common;

import okio.ByteString;

/* loaded from: classes3.dex */
public final class ByteStringMapper {
    private static final ByteStringMapper INSTANCE = new ByteStringMapper();

    public static ByteStringMapper getInstance() {
        return INSTANCE;
    }

    public ByteString stringToProto(String str) {
        return ByteString.decodeHex(str);
    }

    public String protoToString(ByteString byteString) {
        return byteString.hex();
    }
}
