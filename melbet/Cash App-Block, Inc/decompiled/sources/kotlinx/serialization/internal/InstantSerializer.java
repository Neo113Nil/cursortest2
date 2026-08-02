package kotlinx.serialization.internal;

import kotlin.time.Instant;
import kotlin.time.InstantKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class InstantSerializer implements KSerializer {
    public static final InstantSerializer INSTANCE = new InstantSerializer();
    public static final PrimitiveSerialDescriptor descriptor = new PrimitiveSerialDescriptor("kotlin.time.Instant", PrimitiveKind$INT.INSTANCE$8);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Instant.Companion companion = Instant.Companion;
        String decodeString = decoder.decodeString();
        decodeString.getClass();
        return InstantKt.access$parseIso(decodeString).toInstant();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Instant instant = (Instant) obj;
        instant.getClass();
        encoder.encodeString(InstantKt.access$formatIso(instant));
    }
}
