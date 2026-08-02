package kotlinx.serialization.internal;

import kotlin.uuid.Uuid;
import kotlin.uuid.UuidKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class UuidSerializer implements KSerializer {
    public static final UuidSerializer INSTANCE = new UuidSerializer();
    public static final PrimitiveSerialDescriptor descriptor = new PrimitiveSerialDescriptor("kotlin.uuid.Uuid", PrimitiveKind$INT.INSTANCE$8);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String decodeString = decoder.decodeString();
        decodeString.getClass();
        int length = decodeString.length();
        if (length == 32) {
            return UuidKt.uuidParseHex(decodeString);
        }
        if (length == 36) {
            return UuidKt.uuidParseHexDash(decodeString);
        }
        throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + UuidKt.access$truncateForErrorMessage(decodeString) + "\" of length " + decodeString.length());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Uuid uuid = (Uuid) obj;
        uuid.getClass();
        encoder.encodeString(uuid.toString());
    }
}
