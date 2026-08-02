package com.squareup.cash.treehouse.platform;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import okhttp3.internal.Tags;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ByteStringSerializer implements KSerializer {
    public static final ByteStringSerializer INSTANCE = new ByteStringSerializer();
    public static final PrimitiveSerialDescriptor descriptor = Tags.PrimitiveSerialDescriptor("ByteString", PrimitiveKind$INT.INSTANCE$8);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        ByteString.Companion companion = ByteString.Companion;
        return ByteString.Companion.decodeHex(decoder.decodeString());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ByteString byteString = (ByteString) obj;
        byteString.getClass();
        encoder.encodeString(byteString.hex());
    }
}
